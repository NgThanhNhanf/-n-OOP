public class User {
    private String userName;
    private String password;
    private String name;     
    User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    User(String userName, String password, String name) {
        this.userName = userName;
        this.password = password;
        this.name = name;
    }
}
