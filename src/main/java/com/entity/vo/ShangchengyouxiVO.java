package com.entity.vo;

import com.entity.ShangchengyouxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 商城游戏
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-20 16:32:51
 */
public class ShangchengyouxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 游戏分类
	 */
	
	private String youxifenlei;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 开发商
	 */
	
	private String kaifashang;
		
	/**
	 * 游戏简介
	 */
	
	private String youxijianjie;
		
	/**
	 * 上市日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangshiriqi;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：游戏分类
	 */
	 
	public void setYouxifenlei(String youxifenlei) {
		this.youxifenlei = youxifenlei;
	}
	
	/**
	 * 获取：游戏分类
	 */
	public String getYouxifenlei() {
		return youxifenlei;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：开发商
	 */
	 
	public void setKaifashang(String kaifashang) {
		this.kaifashang = kaifashang;
	}
	
	/**
	 * 获取：开发商
	 */
	public String getKaifashang() {
		return kaifashang;
	}
				
	
	/**
	 * 设置：游戏简介
	 */
	 
	public void setYouxijianjie(String youxijianjie) {
		this.youxijianjie = youxijianjie;
	}
	
	/**
	 * 获取：游戏简介
	 */
	public String getYouxijianjie() {
		return youxijianjie;
	}
				
	
	/**
	 * 设置：上市日期
	 */
	 
	public void setShangshiriqi(Date shangshiriqi) {
		this.shangshiriqi = shangshiriqi;
	}
	
	/**
	 * 获取：上市日期
	 */
	public Date getShangshiriqi() {
		return shangshiriqi;
	}
			
}
