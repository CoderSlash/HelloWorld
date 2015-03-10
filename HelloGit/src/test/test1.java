package test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Employee;

import util.HibernateUtil;

public class test1 {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction=session.beginTransaction();
		
		Employee employee=new Employee("zhangsan");
		session.save(employee);
		transaction.commit();
		HibernateUtil.getSessionFactory().close();
	}
}
