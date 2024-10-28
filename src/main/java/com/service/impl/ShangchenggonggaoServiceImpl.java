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


import com.dao.ShangchenggonggaoDao;
import com.entity.ShangchenggonggaoEntity;
import com.service.ShangchenggonggaoService;
import com.entity.vo.ShangchenggonggaoVO;
import com.entity.view.ShangchenggonggaoView;

@Service("shangchenggonggaoService")
public class ShangchenggonggaoServiceImpl extends ServiceImpl<ShangchenggonggaoDao, ShangchenggonggaoEntity> implements ShangchenggonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangchenggonggaoEntity> page = this.selectPage(
                new Query<ShangchenggonggaoEntity>(params).getPage(),
                new EntityWrapper<ShangchenggonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangchenggonggaoEntity> wrapper) {
		  Page<ShangchenggonggaoView> page =new Query<ShangchenggonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangchenggonggaoVO> selectListVO(Wrapper<ShangchenggonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangchenggonggaoVO selectVO(Wrapper<ShangchenggonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangchenggonggaoView> selectListView(Wrapper<ShangchenggonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangchenggonggaoView selectView(Wrapper<ShangchenggonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
