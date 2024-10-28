package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangchengyouxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangchengyouxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangchengyouxiView;


/**
 * 商城游戏
 *
 * @author 
 * @email 
 * @date 2021-03-20 16:32:51
 */
public interface ShangchengyouxiService extends IService<ShangchengyouxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangchengyouxiVO> selectListVO(Wrapper<ShangchengyouxiEntity> wrapper);
   	
   	ShangchengyouxiVO selectVO(@Param("ew") Wrapper<ShangchengyouxiEntity> wrapper);
   	
   	List<ShangchengyouxiView> selectListView(Wrapper<ShangchengyouxiEntity> wrapper);
   	
   	ShangchengyouxiView selectView(@Param("ew") Wrapper<ShangchengyouxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangchengyouxiEntity> wrapper);
   	
}

