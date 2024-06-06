package com.sky.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SetmealDishMapper{
    /**
     * 根据菜品Id来查询套餐Id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}