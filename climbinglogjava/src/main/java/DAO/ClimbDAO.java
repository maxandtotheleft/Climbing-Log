package DAO;


import MODEL.Climb2;

import java.util.List;

public interface ClimbDAO {

    List<Climb2> getClimbs();

    Climb2 getClimbByName(String climbName);

    boolean addClimb(Climb2 climb);
}

