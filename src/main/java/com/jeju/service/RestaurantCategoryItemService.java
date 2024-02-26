package com.jeju.service;

import java.util.List;

import com.jeju.entity.RestaurantCategoryItem;

public interface RestaurantCategoryItemService {
	// 카테고리 아이템 추가
	public RestaurantCategoryItem insert(RestaurantCategoryItem restaurantCategoryItem);	
	
	// 카테고리 아이템 번호로 삭제
	public void deleteByNo(Long rciNo);
	
	// 카테고리 아이템 수정
	public RestaurantCategoryItem update(RestaurantCategoryItem restaurantCategoryItem);
	
	// 카테고리 아이템 전체 리스트
	public List<RestaurantCategoryItem> findAll();
	
	// 카테고리 아이템 번호로 찾기
	public RestaurantCategoryItem findByNo(Long rciNo);
	
	// 식당 번호로 카테고리 아이템 찾기
	public List<RestaurantCategoryItem> findByRestaurantRestaurantNo(Long restaurantNo);
}
