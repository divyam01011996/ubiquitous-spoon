package com.example.hibernate.demo;

import com.example.hibernate.demo.entity.Customer;
import com.example.hibernate.demo.entity.Data;
import com.example.hibernate.demo.repo.AddressRepoc;
import com.example.hibernate.demo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	AddressRepoc ob;
	@Autowired
	CustomerRepository ob1;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		SessionFactory sf = HibernateUtil.getSessionFactory();
//		Session session = sf.getCurrentSession();
//		Transaction tr = session.beginTransaction();

		Customer customer = new Customer();

		Data data = new Data();


		customer.setEmail("arjun singh gmail");
		customer.setFirstName("arjun");
		customer.setLastName("singh");

		ob1.save(customer);
		data.setDept("ece");
		data.setSalary(314234L);
		customer.setData(data);

		ob.save(data);

		// session.save(data);
		//session.save(customer);
		//	tr.commit();
		//	session.close();

		System.out.println("Successfully inserted");

	}
}
