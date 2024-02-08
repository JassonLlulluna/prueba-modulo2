package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.LoginuserDAO;
import com.distribuida.entities.Loginuser;


public class Principalloginuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		LoginuserDAO loginuserDAO = context.getBean("loginuserDAOImpl",LoginuserDAO.class);
		
		
		List<Loginuser> user = loginuserDAO.findAll();
		
		//Impresion
		for(Loginuser item : user){
     		System.out.println(item.toString());
		}
		
		// findOne
		// Cliente cliente = clienteDAO.findOne(2);
		// System.out.println(cliente.toString());
		//vercion v3.0.9
		
		
		context.close();

	}

}
