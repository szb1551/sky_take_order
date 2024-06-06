package com.sky.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sky.dto.DishDTO;

public interface DishService {
    /**
     * 新增菜品和对应口味数据
     * @param dishDTO
     */
     public void saveWithFlavor(DishDTO dishDTO);
}
