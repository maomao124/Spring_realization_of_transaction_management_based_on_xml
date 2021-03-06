package t1;

/**
 * Project name(项目名称)：Spring基于XML实现事务管理
 * Package(包名): t1
 * Interface(接口名): StorageDao
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/26
 * Time(创建时间)： 11:50
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public interface StorageDao
{

    /**
     * 查询商品的库存
     *
     * @param productId the product id
     * @return the storage
     */
    Storage selectByProductId(String productId);

    /**
     * 扣减商品库存
     *
     * @param record the record
     * @return the int
     */
    int decrease(Storage record);
}
