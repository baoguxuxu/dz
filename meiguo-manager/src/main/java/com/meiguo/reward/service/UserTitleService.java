package com.meiguo.reward.service;

import com.meiguo.reward.domain.UserTitleDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2018-12-12 11:08:57
 */
public interface UserTitleService {
	
	UserTitleDO get(Integer id);
	
	List<UserTitleDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserTitleDO userTitle);
	
	int update(UserTitleDO userTitle);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
