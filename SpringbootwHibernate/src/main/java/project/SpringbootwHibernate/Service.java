package project.SpringbootwHibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Dao d;

	public List<Staff> info() {
		 List<Staff>aa =  d.info();
		return aa;
	}

	public List<Staff> info1() {
	List<Staff>st =	d.info1();
	return st;
	}
	

	public Staff info2() {
	Staff ab =	d.info2();
		return ab;
	}

	public List<Staff> info3() {
	List<Staff>aj	= d.info3();
		return aj;
	}

	public List<Staff> info4() {
	List<Staff>ak	=d.info4();
	return ak;
	}

	public List<Staff> check() {
	List<Staff>ys = d.check();
	return ys;
	}

	public Staff check1() {
	Staff od = d.check1();
	return od;
	}

	public List<Staff> exp() {
	List<Staff>ah =d.exp();
	return ah;

	}

	public List<Staff> get() {
	List<Staff>ok = d.get();
	return ok;
	}

	public List<Staff> sal() {
	List<Staff>sa	=d.sal();
		return sa;
	}

	public List<Staff> delete() {
		return null;
	    
		
	}

	
}
