package com.meiguo.goods.service;


import java.util.List;
import java.util.Map;

import com.meiguo.goods.domain.CategoryDO;
import com.meiguo.goods.domain.GoodsDO;
import com.meiguo.goods.domain.ImgDO;
import com.meiguo.goods.domain.ProductDO;
import com.meiguo.goods.domain.SpecDO;

/**
 * 货品表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2018-10-17 15:41:03
 */
public interface GoodsService {
	
	GoodsDO get(Long id);
	
	List<CategoryDO> listCategory(Map<String, Object> map);
	
	int countCategory(Map<String, Object> map);
	
	int save(GoodsDO goods);
	
	int update(GoodsDO goods);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);

	int saveImg(ImgDO imgDO);

	List<ImgDO> listimg(Integer id,Integer type);

	void deleteImg(Integer id);

	void removeImgByID(int parseInt);

	List<ProductDO> getProductByCategoryName(String name);

	List<GoodsDO> getProductByProductId(Integer id);

	List<GoodsDO> getGoodsByProductId(Long id);

	List<ImgDO> getGoodsImgByGoodsDO(Long id, int i);

	List<ImgDO> listGoodsimgAndDetailimg(Long id, int i);

	List<SpecDO> getGoodsSpec(Integer productId);

	List<GoodsDO> list(Map<String, Object> map);
}
