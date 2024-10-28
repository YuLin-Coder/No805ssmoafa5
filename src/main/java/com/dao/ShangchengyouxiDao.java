package com.dao;

import com.entity.ShangchengyouxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangchengyouxiVO;
import com.entity.view.ShangchengyouxiView;


/**
 * 商城游戏
 * 
 * @author 
 * @email 
 * @date 2021-03-20 16:32:51
 */
public interface ShangchengyouxiDao extends BaseMapper<ShangchengyouxiEntity> {
	
	List<ShangchengyouxiVO> selectListVO(@Param("ew") Wrapper<ShangchengyouxiEntity> wrapper);
	
	ShangchengyouxiVO selectVO(@Param("ew") Wrapper<ShangchengyouxiEntity> wrapper);
	
	List<ShangchengyouxiView> selectListView(@Param("ew") Wrapper<ShangchengyouxiEntity> wrapper);

	List<ShangchengyouxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangchengyouxiEntity> wrapper);
	
	ShangchengyouxiView selectView(@Param("ew") Wrapper<ShangchengyouxiEntity> wrapper);
	
}
