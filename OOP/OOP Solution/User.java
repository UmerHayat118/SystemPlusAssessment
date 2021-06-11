public class User implements User_Interface
{
    private String firstName, lastName, password ,userName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void getProfile()
    {

    }


    @Override
    public void login(String UserType)
    {
        if(UserType=="Student") {
            Student student = new Student();
        }
        if(UserType=="Instructor") {
            Instructor instructor = new Instructor();
        }
    }
}
