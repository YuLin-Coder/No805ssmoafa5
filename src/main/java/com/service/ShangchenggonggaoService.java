package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangchenggonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangchenggonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangchenggonggaoView;


/**
 * 商城公告
 *
 * @author 
 * @email 
 * @date 2021-03-20 16:32:51
 */
public interface ShangchenggonggaoService extends IService<ShangchenggonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangchenggonggaoVO> selectListVO(Wrapper<ShangchenggonggaoEntity> wrapper);
   	
   	ShangchenggonggaoVO selectVO(@Param("ew") Wrapper<ShangchenggonggaoEntity> wrapper);
   	
   	List<ShangchenggonggaoView> selectListView(Wrapper<ShangchenggonggaoEntity> wrapper);
   	
   	ShangchenggonggaoView selectView(@Param("ew") Wrapper<ShangchenggonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangchenggonggaoEntity> wrapper);
   	
}

