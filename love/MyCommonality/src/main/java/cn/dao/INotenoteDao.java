package cn.dao;

import cn.pojo.Commodity;
import cn.pojo.Commodityprices;
import cn.pojo.Notenote;
import cn.pojo.NotenoteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INotenoteDao {
    int countByExample(NotenoteExample example);

    int deleteByExample(NotenoteExample example);

    int deleteByPrimaryKey(Integer ncid);

    int inserta(Notenote record);

    int insertSelective(Notenote record);

    List<Notenote> selectByExample(NotenoteExample example);

    Notenote selectByPrimaryKey(Integer ncid);

    int updateByExampleSelective(@Param("record") Notenote record, @Param("example") NotenoteExample example);

    int updateByExample(@Param("record") Notenote record, @Param("example") NotenoteExample example);

    int updateByPrimaryKeySelective(Notenote record);

    int updateByPrimaryKey(Notenote record);

    /**
     * 删除收藏
     * @param id
     * @return
     */
    int updatedel(Integer id);

    /**
     * 查询商品表信息
     * @return
     */
    Commodity selectbe(Integer commdityid,Integer id,Integer commid);

//    /**
//     * 查询用户信息
//     * @return
//     */
//    String selectus(Integer id);

    /**
     * 添加收藏物品
     * @param record
     * @return
     */
    int insert(@Param("re")Notenote record);

    /**
     * 所收藏的商品
     * @param userid
     * @return
     */
    List<Notenote> comid(Integer userid);

    /**
     * 商品价格
     * @return
     */
    Commodityprices sprices(Integer priceid,Integer compriceid ,Integer comid);

    /**
     * 查询商品价格id
     * @param commdityid,id
     * @return
     */
    Commodity coid(Integer commdityid,Integer id,Integer commid);
}