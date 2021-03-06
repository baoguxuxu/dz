package com.meiguo.information.dao;

import com.meiguo.information.domain.NoticeDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 公告表
 * @author wjl
 * @email bushuo@163.com
 * @date 2018-04-13 13:10:58
 */
@Mapper
public interface NoticeDao {

	NoticeDO get(Integer id);
	
	List<NoticeDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(NoticeDO notice);
	
	int update(NoticeDO notice);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
	
	int noticeId();
}
