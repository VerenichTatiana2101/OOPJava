package seminar004.ex02;

public abstract class User {
    private String firstname;
    private String lastname;
    private int id;

    public User(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n " + this.getClass().getName()+
                " " + firstname + '\'' +
                " " + lastname + '\'' +
                ", id=" + id;
    }
}
