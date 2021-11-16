package cn.itcast.mavenweb.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import cn.itcast.mavenweb.dao.DepDao;
import cn.itcast.mavenweb.domain.Dep;
/**
 * 部门数据访问类
 * @author Administrator
 *
 */
public class DepDaoImpl extends HibernateDaoSupport implements DepDao {

	@Override
	public List<Dep> getList() {
		
		return (List<Dep>) getHibernateTemplate().find("from Dep");
	}

}
