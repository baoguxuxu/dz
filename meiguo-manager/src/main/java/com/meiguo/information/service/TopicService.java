package com.meiguo.information.service;

import com.meiguo.information.domain.TopicDO;

import java.util.List;
import java.util.Map;

/**
 * 问卷题目表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2018-04-14 11:32:26
 */
public interface TopicService {
	
	TopicDO get(Integer id);
	
	List<TopicDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TopicDO topic);
	
	int update(TopicDO topic);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
