package com.meiguo.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.meiguo.information.dao.MaintainTypeDao;
import com.meiguo.information.domain.MaintainTypeDO;
import com.meiguo.information.service.MaintainTypeService;



@Service
public class MaintainTypeServiceImpl implements MaintainTypeService {
	@Autowired
	private MaintainTypeDao maintainTypeDao;
	
	@Override
	public MaintainTypeDO get(Long id){
		return maintainTypeDao.get(id);
	}
	
	@Override
	public List<MaintainTypeDO> list(Map<String, Object> map){
		return maintainTypeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return maintainTypeDao.count(map);
	}
	
	@Override
	public int save(MaintainTypeDO maintainType){
		return maintainTypeDao.save(maintainType);
	}
	
	@Override
	public int update(MaintainTypeDO maintainType){
		return maintainTypeDao.update(maintainType);
	}
	
	@Override
	public int remove(Long id){
		return maintainTypeDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return maintainTypeDao.batchRemove(ids);
	}
	
}
