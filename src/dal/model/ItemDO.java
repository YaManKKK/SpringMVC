package dal.model;

import java.util.Date;

/**
 * @author xb41101
 * @version Id: ItemDO, v 0.1 2017/12/27 13:58 xb41101 Exp $
 */
public class ItemDO {

    private long id;

    private String name;

    private float price;

    private String pic;

    private Date createTime;

    private String detail;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public long getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>price</tt>.
     *
     * @return property value of price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Setter method for property <tt>price</tt>.
     *
     * @param price value to be assigned to property price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Getter method for property <tt>pic</tt>.
     *
     * @return property value of pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * Setter method for property <tt>pic</tt>.
     *
     * @param pic value to be assigned to property pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * Getter method for property <tt>createTime</tt>.
     *
     * @return property value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createTime</tt>.
     *
     * @param createTime value to be assigned to property createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter method for property <tt>detail</tt>.
     *
     * @return property value of detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Setter method for property <tt>detail</tt>.
     *
     * @param detail value to be assigned to property detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}
