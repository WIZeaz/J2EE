package cn.edu.scut.ssm.dao;

import cn.edu.scut.ssm.entity.Category;

import java.util.List;

/**
 * @author: rain
 * @date: 2019-4-20 00:00
 * @description: ssm
 */
public interface CategoryDao {

    /**
     * 获取所有商品类别
     * @return
     */
    List<Category> selectCategoryList();
}
