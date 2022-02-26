package t1;

/**
 * Project name(项目名称)：Spring基于XML实现事务管理
 * Package(包名): t1
 * Class(类名): Storage
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/26
 * Time(创建时间)： 11:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public class Storage
{
    //自增 id
    private Long id;
    //商品 id
    private String productId;
    //商品库存总数
    private Integer total;
    //已用商品数量
    private Integer used;
    //剩余商品数量
    private Integer residue;

    /**
     * Instantiates a new Storage.
     */
    public Storage()
    {

    }

    /**
     * Instantiates a new Storage.
     *
     * @param id        the id
     * @param productId the product id
     * @param total     the total
     * @param used      the used
     * @param residue   the residue
     */
    public Storage(Long id, String productId, Integer total, Integer used, Integer residue)
    {
        this.id = id;
        this.productId = productId;
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
     * Gets total.
     *
     * @return the total
     */
    public Integer getTotal()
    {
        return total;
    }

    /**
     * Sets total.
     *
     * @param total the total
     */
    public void setTotal(Integer total)
    {
        this.total = total;
    }

    /**
     * Gets used.
     *
     * @return the used
     */
    public Integer getUsed()
    {
        return used;
    }

    /**
     * Sets used.
     *
     * @param used the used
     */
    public void setUsed(Integer used)
    {
        this.used = used;
    }

    /**
     * Gets residue.
     *
     * @return the residue
     */
    public Integer getResidue()
    {
        return residue;
    }

    /**
     * Sets residue.
     *
     * @param residue the residue
     */
    public void setResidue(Integer residue)
    {
        this.residue = residue;
    }
}
