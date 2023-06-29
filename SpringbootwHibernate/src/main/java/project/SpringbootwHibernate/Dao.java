package project.SpringbootwHibernate;

import java.util.List;

import javax.persistence.criteria.Order;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class Dao {
	@Autowired
	SessionFactory sf;


	public List<Staff> info() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);

		List<Staff>aa = criteria.list();
		session.close();
		return aa;
	}
	
	public List<Staff> info1() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.eq("staffid", 3));
		List<Staff>st = criteria.list();
		session.close();
		return st;
	}
	
	


	public Staff info2() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Staff s = new Staff();
		s.setStaffid(6);
		s.setName("Kiran");
		s.setProfile("Trainer");
		s.setSalary(90000);
		s.setExperience(15);
	    session.save(s);
		tr.commit();
		session.close();
		return s;
		
	}
	
	

	public List<Staff> info3() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.gt("salary",20000));
	    List<Staff>aj	= criteria.list();
		session.close();
		return aj;
	}
	
	


	public List<Staff> info4() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.between("experience", 10, 20));
		List<Staff>ak = criteria.list();
		session.close();
		return ak;
	}


	public List<Staff> check() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
	    criteria.add(Restrictions.eq("profile", "trainer"));
	    List<Staff>ys  =criteria.list();
		session.close();
		return ys;
	}


	public Staff check1() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Staff st = new Staff();
		st.setStaffid(4);
		st.setName("pankaj");
		st.setProfile("admin");
		st.setSalary(80000);
		st.setExperience(22);
		session.update(st);
		tr.commit();
		session.close();
		return st;
	}
	

	public List<Staff> exp() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria .addOrder(org.hibernate.criterion.Order.asc("experience"));
		criteria.setMaxResults(1);
		List<Staff>ah = criteria.list();
		String str = null;
		for(Staff staff : ah) {
			str=staff.getName();
		}
		session.close();
		return ah;
	}

	public List<Staff> get() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.neOrIsNotNull("profile", "trainer"));
		List<Staff>ok = criteria.list();
		session.close();
		return ok;
	}


	
	public List<Staff> sal() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.addOrder(org.hibernate.criterion.Order.desc("salary"));
		criteria.setMaxResults(1);
		List<Staff>sa = criteria.list();
		session.close();
		return sa;
		
	}


	


	

}
