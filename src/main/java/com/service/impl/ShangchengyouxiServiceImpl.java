package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShangchengyouxiDao;
import com.entity.ShangchengyouxiEntity;
import com.service.ShangchengyouxiService;
import com.entity.vo.ShangchengyouxiVO;
import com.entity.view.ShangchengyouxiView;

@Service("shangchengyouxiService")
public class ShangchengyouxiServiceImpl extends ServiceImpl<ShangchengyouxiDao, ShangchengyouxiEntity> implements ShangchengyouxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangchengyouxiEntity> page = this.selectPage(
                new Query<ShangchengyouxiEntity>(params).getPage(),
                new EntityWrapper<ShangchengyouxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangchengyouxiEntity> wrapper) {
		  Page<ShangchengyouxiView> page =new Query<ShangchengyouxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangchengyouxiVO> selectListVO(Wrapper<ShangchengyouxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangchengyouxiVO selectVO(Wrapper<ShangchengyouxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangchengyouxiView> selectListView(Wrapper<ShangchengyouxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangchengyouxiView selectView(Wrapper<ShangchengyouxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
