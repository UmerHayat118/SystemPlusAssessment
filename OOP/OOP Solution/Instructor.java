public class Instructor extends User implements Instructor_Interface
{
    private String designation;
    private String resource;
    private String assignment;
    private int marks;
    Course course;

    public Course getCourse() {
        return course;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    private String qualification;

    public void getProfile()
    {
        System.out.print(designation);
    }

    @Override
    public void addmarks(int marks)
    {
        setMarks(marks);
    }

    @Override
    public void viewMarks()
    {
        getMarks();
    }

    @Override
    public void addResources(String resource)
    {
        setResource(resource);
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
    public void AddAssignments(String assignment) {
    setAssignment(assignment);
    }

    @Override
    public void viewAssignments() {
        getAssignment();
    }
}
