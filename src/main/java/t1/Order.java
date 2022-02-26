package t1;

import java.math.BigDecimal;

/**
 * Project name(项目名称)：Spring基于XML实现事务管理
 * Package(包名): t1
 * Class(类名): Order
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/26
 * Time(创建时间)： 11:33
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public class Order
{
    //自增 id
    private Long id;
    //订单 id
    private String orderId;
    //用户 id
    private String userId;
    //商品 id
    private String productId;
    //订单商品数量
    private Integer count;
    //订单金额
    private BigDecimal money;
    //订单状态
    private Integer status;

    /**
     * Instantiates a new Order.
     */
    public Order()
    {

    }

    /**
     * Instantiates a new Order.
     *
     * @param id        the id
     * @param orderId   the order id
     * @param userId    the user id
     * @param productId the product id
     * @param count     the count
     * @param money     the money
     * @param status    the status
     */
    public Order(Long id, String orderId, String userId, String productId, Integer count, BigDecimal money, Integer status)
    {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.count = count;
        this.money = money;
        this.status = status;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId()
    {
        return orderId;
    }

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId()
    {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    /**
     * Gets product id.
     *
     * @return the product id
     */
    public String getProductId()
    {
        return productId;
    }

    /**
     * Sets product id.
     *
     * @param productId the product id
     */
    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public Integer getCount()
    {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Integer count)
    {
        this.count = count;
    }

    /**
     * Gets money.
     *
     * @return the money
     */
    public BigDecimal getMoney()
    {
        return money;
    }

    /**
     * Sets money.
     *
     * @param money the money
     */
    public void setMoney(BigDecimal money)
    {
        this.money = money;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Integer getStatus()
    {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Integer status)
    {
        this.status = status;
    }
}
