package be.technocite.IoCReview;

import java.util.Date;

public class AssemblyLine {

    private int robotSpeed;
    private Date startDate;

    public AssemblyLine() {

    }

    public void startAssembly() {
        System.out.println("tchoutchou");
    }

    public void setRobotSpeed(int robotSpeed) {
        this.robotSpeed = robotSpeed;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
