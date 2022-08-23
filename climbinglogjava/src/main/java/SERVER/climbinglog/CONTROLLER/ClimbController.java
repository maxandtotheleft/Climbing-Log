package SERVER.climbinglog.CONTROLLER;


import SERVER.climbinglog.DAO.ClimbDAO;
import SERVER.climbinglog.MODEL.Climb2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ClimbController {

    @Autowired
    private ClimbDAO climbDAO;

    public ClimbController(ClimbDAO climbDAO) {
        this.climbDAO = climbDAO;
    }

    public ClimbController(){}


    @RequestMapping(path = "/climbs", method = RequestMethod.GET)
    public List<Climb2> getClimbs(){
        return climbDAO.getClimbs();
    }

    @RequestMapping(path = "/climbs/{climbName}", method = RequestMethod.GET)
    public Climb2 getClimbByName(@PathVariable String climbName){return climbDAO.getClimbByName(climbName);}

    @RequestMapping(path ="/addClimb", method = RequestMethod.POST)
    public boolean addClimb(@RequestBody Climb2 climb){return climbDAO.addClimb(climb);}

    @RequestMapping(path = "/{climbId}", method = RequestMethod.DELETE)
    public boolean deleteClimb (@PathVariable int climbId){return climbDAO.deleteClimb(climbId);}
}
