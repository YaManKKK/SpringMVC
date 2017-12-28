package dal.intl.dao;

import dal.intl.inter.IItemOperation;
import dal.model.ItemDO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xb41101
 * @version Id: ItemDAO, v 0.1 2017/12/27 16:21 xb41101 Exp $
 */
@Service
public class ItemDAO {
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

    public static List<ItemDO> getAllItems()
    {
        SqlSession session = sqlSessionFactory.openSession();
        List<ItemDO> itemDOList = new ArrayList<>();
        IItemOperation iItemOperation = session.getMapper(IItemOperation.class);
        itemDOList = iItemOperation.getAllItems();
        session.close();
        return itemDOList;
    }

    public static ItemDO getItemById(long id)
    {
        SqlSession session = sqlSessionFactory.openSession();
        IItemOperation iItemOperation = session.getMapper(IItemOperation.class);
        ItemDO itemDO = iItemOperation.getItemById(id);
        session.close();
        return itemDO;
    }

    public static void updateItem(ItemDO itemDO)
    {
        SqlSession session = sqlSessionFactory.openSession();
        IItemOperation iItemOperation = session.getMapper(IItemOperation.class);
        iItemOperation.updateItem(itemDO);
    }
}
