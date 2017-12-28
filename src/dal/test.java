package dal;

import dal.intl.inter.IUserOperation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * @author xb41101
 * @version Id: test, v 0.1 2017/12/27 13:36 xb41101 Exp $
 */
public class test {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static{
        try{
            reader    = Resources.getResourceAsReader("dal/Configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            IUserOperation userOperation = session.getMapper(IUserOperation.class);
//SqlSession实例来直接执行已映射的SQL语句
//            UserDAO user = (UserDAO) session.selectOne("dal.model.UserMapper.selectUserByID", 1);

//使用合理描述参数和SQL语句返回值的接口
//            UserDAO user = userOperation.selectUserByID(1);

//            System.out.println(user.getUserAddress());
//            System.out.println(user.getUserName());

//            List<UserDAO> userList = userOperation.selectUsers("summer");
//            userList.stream().map(u->u.getUserAge()).forEach(System.out::println);

//增
//            UserDAO userDAO = new UserDAO();
//            userDAO.setUserAddress("1111");
//            userDAO.setUserAge("12");
//            userDAO.setUserName("BB");
//            userOperation.addUser(userDAO);
//            session.commit();
//            System.out.print(userDAO.getId());

//改
//            UserDAO userDAO = new UserDAO();
//            userDAO.setId(2);
//            userDAO.setUserAddress("222");
//            userDAO.setUserAge("123");
//            userDAO.setUserName("BBA");
//            userOperation.updateUser(userDAO);
//            session.commit();

//删
            userOperation.deleteUser(3);
            session.commit();


        } finally {
            session.close();
        }
    }
}
