package tools;

public class User implements Comparable<User> {
    private int usreid;
    private String name;

    public User() {
    }

    public int getUsreid() {
        return usreid;
    }
    public User(int usreid, String name){
        this.usreid = usreid;
        this.name = name;
    }

    public void setUsreid(int usreid) {
        this.usreid = usreid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User u) {
        return this.getUsreid() - u.getUsreid();
    }
}
