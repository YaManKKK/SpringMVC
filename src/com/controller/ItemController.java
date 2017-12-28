package com.controller;

import com.model.Item;
import com.model.QueryItem;
import dal.intl.dao.ItemDAO;
import dal.model.ItemDO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xb41101
 * @version Id: ItemController, v 0.1 2017/12/26 14:15 xb41101 Exp $
 */
@Controller
public class ItemController {

    @RequestMapping(value = "/item/itemlist.action", method = RequestMethod.GET)
    public ModelAndView itemList() {
        ModelAndView mav = new ModelAndView();
        List<Item> itemList = new ArrayList<>();
        List<ItemDO> itemDOList = ItemDAO.getAllItems();
        for (ItemDO item : itemDOList
                ) {
            itemList.add(convert(item));
        }
        mav.addObject("itemList", itemList);
        mav.setViewName("/jsp/itemList");
        return mav;
    }

    @RequestMapping(value = "/itemEdit.action")
//    public ModelAndView toEdit(@RequestParam(value="id",required = false,defaultValue = "1") Integer idd , HttpServletRequest request, HttpServletResponse response)
    public ModelAndView toEdit(Long id, HttpServletRequest request, HttpServletResponse response) {
//        String id = request.getParameter("id");
//        Item item = new Item(Long.parseLong(id), "1234567", 5555, new Date(), "EEE");
//        Item item = new Item(id, "1234567", 5555, new Date(), "EEE");
        ModelAndView mav = new ModelAndView();

        Item item = convert(ItemDAO.getItemById(id));
        mav.addObject("item", item);
        mav.setViewName("/jsp/editItem");
        return mav;
    }

    @RequestMapping(value = "/updateitem.action")
//    public ModelAndView toSave(Item item)
    public ModelAndView toSave(QueryItem item) {
        ModelAndView mav = new ModelAndView();
        ItemDAO.updateItem(deConvert(item.getItems()));
        mav.addObject("item", item.getItems());
        mav.setViewName("/jsp/editItem");
        return mav;
    }

    private Item convert(ItemDO itemDO) {
        Item item = new Item();
        item.setId(itemDO.getId());
        item.setCreatetime(itemDO.getCreateTime());
        item.setDetail(itemDO.getDetail());
        item.setName(itemDO.getName());
        item.setPic(itemDO.getPic());
        item.setPrice(itemDO.getPrice());
        return item;
    }

    private ItemDO deConvert(Item item) {
        ItemDO itemDO = new ItemDO();
        itemDO.setId(itemDO.getId());
        itemDO.setCreateTime(itemDO.getCreateTime());
        itemDO.setDetail(itemDO.getDetail());
        itemDO.setName(itemDO.getName());
        itemDO.setPic(itemDO.getPic());
        itemDO.setPrice(itemDO.getPrice());
        return itemDO;
    }
}
