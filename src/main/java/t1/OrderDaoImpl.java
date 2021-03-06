package t1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Project name(项目名称)：Spring基于XML实现事务管理
 * Package(包名): t1
 * Class(类名): OrderDaoImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/26
 * Time(创建时间)： 11:53
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Repository
public class OrderDaoImpl implements OrderDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int createOrder(Order order)
    {
        String sql = "insert into `order` (order_id,user_id, product_id, `count`, money, status) values (?,?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, order.getOrderId(), order.getUserId(), order.getProductId(), order.getCount(), order.getMoney(), order.getStatus());
        return update;
    }

    @Override
    public void updateOrderStatus(String orderId, Integer status)
    {
        String sql = " update `order`  set status = 1 where order_id = ? and status = ?;";
        jdbcTemplate.update(sql, orderId, status);
    }
}
