package cn.itcast.mavenweb.dao;

import java.util.List;

import cn.itcast.mavenweb.domain.Dep;

/**
 * 部门Dao
 * @author Administrator
 *
 */
public interface DepDao {
	
	/**
	 * 全部列表
	 * @return
	 */
	public List<Dep> getList();

}
