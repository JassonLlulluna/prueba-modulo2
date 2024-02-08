package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Empresa_detalles;

public class PrincipalCategoria {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl",CategoriaDAO.class);
	
		
		
		 String busqueda = "1";

	        // Usa el método findAll
	        List<Categoria> resultados = categoriaDAO.findCustom(busqueda);

	        // Imprime los resultados
	        for (Categoria perfil : resultados) {
	            System.out.println(perfil);
	        }
		
//		Categoria categoria1 = new Categoria(0,"Seccion","Descripcion");
//		categoriaDAO.add(categoria1);
//		Categoria categoria2 = categoriaDAO.findOne(11)
		//UP
//		Cliente cliente2 = new Cliente(39,"1566464","Paul","Llulluna","Tumbaco","2954445454","correo@gmail.com");
//		clienteDAO.up(cliente2);
		
		//DEL
//		Cliente cliente3 = new Cliente(39,"1566464","Paul","Llulluna","Tumbaco","2954445454","correo@gmail.com");
		//categoriaDAO.del(39);
		
		//FIND ALL
		
		
//		List<Seccion> secciones = seccionDAO.findAll();
//
//	
//		
//		for(Seccion seccion :secciones) {
//			System.out.println(seccion.toString());
////			
//	}
//		//FIND ONE
//		Seccion seccion = seccionDAO.findOne(1);
		
		
//		System.out.println(cliente.toString());
//		 
		
		
		
		//System.out.println(clientes.toString());

		
		
		context.close();

		
	}

}
