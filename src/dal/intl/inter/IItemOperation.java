package dal.intl.inter;

import dal.model.ItemDO;

import java.util.List;

/**
 * @author xb41101
 * @version Id: IItemOperation, v 0.1 2017/12/27 16:36 xb41101 Exp $
 */
public interface IItemOperation {

    List<ItemDO> getAllItems();

    ItemDO getItemById(long id);

    void updateItem(ItemDO item);
}
