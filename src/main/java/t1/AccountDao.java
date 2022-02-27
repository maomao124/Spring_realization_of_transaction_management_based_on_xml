package t1;

import java.math.BigDecimal;

/**
 * Project name(项目名称)：Spring基于XML实现事务管理
 * Package(包名): t1
 * Interface(接口名): AccountDao
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/26
 * Time(创建时间)： 11:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public interface AccountDao
{

    /**
     * 根据用户查询账户金额
     *
     * @param userId the user id
     * @return the account
     */
    Account selectByUserId(String userId);

    /**
     * 扣减账户金额
     *
     * @param userId the user id
     * @param money  the money
     * @return the int
     */
    int decrease(String userId, BigDecimal money);
}
