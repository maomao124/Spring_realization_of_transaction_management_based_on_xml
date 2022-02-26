package t1;

import java.math.BigDecimal;

/**
 * Project name(项目名称)：Spring基于XML实现事务管理
 * Package(包名): t1
 * Class(类名): Account
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/26
 * Time(创建时间)： 11:36
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public class Account
{
    //自增 id
    private Long id;
    //用户 id
    private String userId;
    //账户总金额
    private BigDecimal total;
    //已用账户金额
    private BigDecimal used;
    //剩余账户金额
    private BigDecimal residue;

    /**
     * Instantiates a new Account.
     */
    public Account()
    {

    }

    /**
     * Instantiates a new Account.
     *
     * @param id      the id
     * @param userId  the user id
     * @param total   the total
     * @param used    the used
     * @param residue the residue
     */
    public Account(Long id, String userId, BigDecimal total, BigDecimal used, BigDecimal residue)
    {
        this.id = id;
        this.userId = userId;
        this.total = total;
        this.used = used;
        this.residue = residue;
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
     * Gets total.
     *
     * @return the total
     */
    public BigDecimal getTotal()
    {
        return total;
    }

    /**
     * Sets total.
     *
     * @param total the total
     */
    public void setTotal(BigDecimal total)
    {
        this.total = total;
    }

    /**
     * Gets used.
     *
     * @return the used
     */
    public BigDecimal getUsed()
    {
        return used;
    }

    /**
     * Sets used.
     *
     * @param used the used
     */
    public void setUsed(BigDecimal used)
    {
        this.used = used;
    }

    /**
     * Gets residue.
     *
     * @return the residue
     */
    public BigDecimal getResidue()
    {
        return residue;
    }

    /**
     * Sets residue.
     *
     * @param residue the residue
     */
    public void setResidue(BigDecimal residue)
    {
        this.residue = residue;
    }
}
