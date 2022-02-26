package t1;

/**
 * Project name(项目名称)：Spring基于XML实现事务管理
 * Package(包名): t1
 * Interface(接口名): OrderDao
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/26
 * Time(创建时间)： 11:46
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public interface OrderDao
{

    /**
     * 创建订单
     *
     * @param order the order
     * @return the int
     */
    int createOrder(Order order);

    /**
     * 修改订单状态
     *
     * @param orderId the order id
     * @param status  the status
     */
    void updateOrderStatus(String orderId, Integer status);
}
