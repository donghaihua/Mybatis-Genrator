package com.tenmark.dao;

import com.tenmark.model.TblSaleItem;
import com.tenmark.model.TblSaleItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblSaleItemMapper {
    long countByExample(TblSaleItemExample example);

    int deleteByExample(TblSaleItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblSaleItem record);

    int insertSelective(TblSaleItem record);

    List<TblSaleItem> selectByExample(TblSaleItemExample example);

    TblSaleItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblSaleItem record, @Param("example") TblSaleItemExample example);

    int updateByExample(@Param("record") TblSaleItem record, @Param("example") TblSaleItemExample example);

    int updateByPrimaryKeySelective(TblSaleItem record);

    int updateByPrimaryKey(TblSaleItem record);
}