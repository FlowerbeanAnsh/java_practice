import java.util.Objects;

public class UserName {
    private String UserName;

    public UserName(String userName) {
        UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserName userName = (UserName) o;
        return Objects.equals(UserName, userName.UserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserName);
    }

    @Override
    public String toString() {
        return "UserName{" +
                "UserName='" + UserName + '\'' +
                '}';
    }
}
