package cn.itcast.mavenweb.service.impl;

import java.util.List;

import cn.itcast.mavenweb.dao.DepDao;
import cn.itcast.mavenweb.domain.Dep;
import cn.itcast.mavenweb.service.DepService;
/**
 * 部门业务逻辑类
 * @author Administrator
 *
 */
public class DepServiceImpl implements DepService{

	private DepDao depDao;
	
	public void setDepDao(DepDao depDao) {
		this.depDao = depDao;
	}

	/**
	 * 全部列表
	 */
	public List<Dep> getList() {
		// TODO Auto-generated method stub
		return depDao.getList();
	}

	
	
}
