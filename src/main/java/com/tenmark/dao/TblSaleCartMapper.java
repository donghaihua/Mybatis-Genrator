package com.tenmark.dao;

import com.tenmark.model.TblSaleCart;
import com.tenmark.model.TblSaleCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblSaleCartMapper {
    long countByExample(TblSaleCartExample example);

    int deleteByExample(TblSaleCartExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblSaleCart record);

    int insertSelective(TblSaleCart record);

    List<TblSaleCart> selectByExample(TblSaleCartExample example);

    TblSaleCart selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblSaleCart record, @Param("example") TblSaleCartExample example);

    int updateByExample(@Param("record") TblSaleCart record, @Param("example") TblSaleCartExample example);

    int updateByPrimaryKeySelective(TblSaleCart record);

    int updateByPrimaryKey(TblSaleCart record);
}