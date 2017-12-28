package dal.intl.inter;

import dal.model.UserDO;

import java.util.List;

/**
 * @author xb41101
 * @version Id: IUserOperation, v 0.1 2017/12/27 14:20 xb41101 Exp $
 */
public interface IUserOperation {

    UserDO selectUserByID(int id);

    List<UserDO> selectUsers(String name);

    void addUser(UserDO user);

    void updateUser(UserDO user);

    void deleteUser(int id);
}
