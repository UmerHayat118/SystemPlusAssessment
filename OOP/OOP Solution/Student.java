public class Student extends User implements Student_Interface
{
    private int rollNumber;
    private String status;
    private String resource;
    private String assignment;
    private int marks;
    Course course;

    public Course getCourse() {
        return course;
    }

    public String getResource() {
        return resource;
    }

    public String getAssignment() {
        return assignment;
    }

    public int getMarks() {
        return marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void getProfile()
    {
        System.out.print(status);
    }

    @Override
    public void viewMarks() {
        getMarks();
    }

    @Override
    public void viewResources()
    {
        getResource();
    }

    @Override
    public void viewCourse()
    {
        getCourse();
    }

    @Override
    public void viewAssignments()
    {
        getAssignment();
    }
}
