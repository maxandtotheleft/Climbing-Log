package DAO;

import MODEL.Climb2;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcClimbDAO implements ClimbDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcClimbDAO (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Climb2> getClimbs() {
        List<Climb2> climbs = new ArrayList<>();
        String sql = "SELECT climb_id, climb_name, area, grade FROM climb";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()){
            climbs.add(mapRowToClimb2(results));
        }
        return climbs;    }


    @Override
    public Climb2 getClimbByName(String climbName) {
        Climb2 climb = null;
        String sql = "SELECT climb_id, climb_name, grade, area " +
                "FROM climb " +
                "WHERE climb_name = ? ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, climbName);
        if (results.next()) {
            climb = mapRowToClimb2(results);
        }
        return climb;
    }

    @Override
    public boolean addClimb(Climb2 climb) {
        String sql = "INSERT INTO climb (climb_name, area, grade) VALUES (?, ?, ?) RETURNING climb_id";
        Integer climbId;
        try {
            climbId = jdbcTemplate.queryForObject(sql, Integer.class, climb.getClimbName(), climb.getArea(), climb.getGrade());
        } catch (DataAccessException e) {
            return false;
        }

        return true;
    }


    private Climb2 mapRowToClimb2(SqlRowSet rs) {
        Climb2 climb = new Climb2();
        climb.setClimbId(rs.getInt("climb_id"));
        climb.setClimbName(rs.getString("climb_name"));
        climb.setArea(rs.getString("area"));
        climb.setGrade(rs.getInt("grade"));
        return climb;
    }
}

