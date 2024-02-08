package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.SeccionDAO;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Seccion;

public class PrincipalSeccion {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		SeccionDAO seccionDAO = context.getBean("seccionDAOImpl",SeccionDAO.class);
	
		
		
		//CRUD
	
		Seccion seccion1 = new Seccion(0,"Seccion","Descripcion");
		seccionDAO.add(seccion1);
		System.out.println(seccionDAO.findOne(8));
		
		
		Seccion seccion3 = new Seccion(8,"Seccion11","Descripcion11");
		seccionDAO.up(seccion3);
		System.out.println(seccionDAO.findOne(8));
				
		try { seccionDAO.del(8); } catch (Exception e) {e.printStackTrace();	}
	
		
		for(Seccion seccion:seccionDAO.findAll()) {
			System.out.println(seccion.toString());
//			
		}
		
		
		
		
//		//ADD	
//		Seccion seccion1 = new Seccion(0,"Seccion","Descripcion");
//		seccionDAO.add(seccion1);
//		
//		//UP
////		Cliente cliente2 = new Cliente(39,"1566464","Paul","Llulluna","Tumbaco","2954445454","correo@gmail.com");
////		clienteDAO.up(cliente2);
//		
//		//DEL
////		Cliente cliente3 = new Cliente(39,"1566464","Paul","Llulluna","Tumbaco","2954445454","correo@gmail.com");
//		seccionDAO.del(39);
//		
//		//FIND ALL
//		
//		
////		List<Seccion> secciones = seccionDAO.findAll();
////
////	
////		
////		for(Seccion seccion :secciones) {
////			System.out.println(seccion.toString());
////			
////		}
////		//FIND ONE
////		Seccion seccion = seccionDAO.findOne(1);
//		
//		
////		System.out.println(cliente.toString());
////		 
//		
//		
//		
//		//System.out.println(clientes.toString());

		
		
		context.close();

		
	}
}
