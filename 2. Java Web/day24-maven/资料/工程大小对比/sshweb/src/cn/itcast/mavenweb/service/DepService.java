package cn.itcast.mavenweb.service;

import java.util.List;

import cn.itcast.mavenweb.domain.Dep;

/**
 * 部门业务层接口
 * @author Administrator
 *
 */
public interface DepService {

	/**
	 * 全部列表
	 * @return
	 */
	public List<Dep> getList();
}
