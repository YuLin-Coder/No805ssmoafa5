package com.dao;

import com.entity.ShangchenggonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangchenggonggaoVO;
import com.entity.view.ShangchenggonggaoView;


/**
 * 商城公告
 * 
 * @author 
 * @email 
 * @date 2021-03-20 16:32:51
 */
public interface ShangchenggonggaoDao extends BaseMapper<ShangchenggonggaoEntity> {
	
	List<ShangchenggonggaoVO> selectListVO(@Param("ew") Wrapper<ShangchenggonggaoEntity> wrapper);
	
	ShangchenggonggaoVO selectVO(@Param("ew") Wrapper<ShangchenggonggaoEntity> wrapper);
	
	List<ShangchenggonggaoView> selectListView(@Param("ew") Wrapper<ShangchenggonggaoEntity> wrapper);

	List<ShangchenggonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShangchenggonggaoEntity> wrapper);
	
	ShangchenggonggaoView selectView(@Param("ew") Wrapper<ShangchenggonggaoEntity> wrapper);
	
}
