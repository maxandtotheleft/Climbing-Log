package SERVER.climbinglog.MODEL;

public class Climb2 {
    private int climbId;
    private String climbName;
    private String area;
    private int grade;

    public Climb2() {
    }

    public int getClimbId() {
        return climbId;
    }

    public void setClimbId(int climbId) {
        this.climbId = climbId;
    }

    public String getClimbName() {
        return climbName;
    }

    public void setClimbName(String climbName) {
        this.climbName = climbName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "{" +
                "climbName='" + climbName + '\'' +
                ", area='" + area + '\'' +
                ", grade=" + grade +
                '}';
    }
}
