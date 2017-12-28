package dal.model;

/**
 * @author xb41101
 * @version Id: UserDO, v 0.1 2017/12/27 11:35 xb41101 Exp $
 */
public class UserDO {
    private int id;
    private String userName;
    private String userAge;
    private String userAddress;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserAge() {
        return userAge;
    }
    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
