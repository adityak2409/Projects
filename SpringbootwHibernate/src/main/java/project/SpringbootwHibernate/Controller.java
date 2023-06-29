package project.SpringbootwHibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
   @Autowired
   Service sm;
   
   @GetMapping("allstaffrecord")
   List<Staff> info() {
	  List<Staff>aa = sm.info();
	  return aa;
	  }
   
  
   @GetMapping("Staffid is 3")  
	  List<Staff> info1() {
	List<Staff>st	= sm.info1();
	   return st;
   }
   
  
   
   @PutMapping("update table")
    Staff info2() {
	  Staff ab = sm.info2();
	  return ab;
   }
   
   
   @GetMapping("Salary more than 20")
   List<Staff> info3() {
	  List<Staff>aj = sm.info3();
	  return aj;
   }
   @GetMapping("Experience bet 10 to 20")
   List<Staff> info4() {
	 List<Staff> ak = sm.info4();
	 return ak;
   }
   
   @PostMapping("profile trainer")
   List<Staff> check() {
	List<Staff>ys  = sm.check();
	return ys;
   }
   
//   @PutMapping("salary update staffid 4")
//    Staff check1() {
//	 Staff od  =sm.check1();
//	 return od;
//	}
   
   @PutMapping("salary update staffid 4")
   Staff check1() {
   Staff od=sm.check1();
   return od;
   }
   
   @GetMapping("min experience")
   List<Staff> exp() {
   List<Staff>ah = sm.exp();
   return ah;
   }
   
   @GetMapping("Not having profile as trainer")
   List<Staff> get() {
	List<Staff>ok  = sm.get();
	return ok;
   }
   
   @PostMapping("max salary")
   List<Staff> sal() {
   List<Staff>sa =sm.sal();
   return sa;
   }
   
   @DeleteMapping("DeleteFaculty")
   List<Staff> delete() {
   List<Staff>dl = sm.delete();
   return dl;
   }
   
   
   
}
