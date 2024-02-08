package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.EmpresaService;
import com.distribuida.entities.Empresa;




public class PrincipalEmpresaDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		EmpresaService empresaService = context.getBean("empresaServiceImpl",EmpresaService.class);
		
		
		//findAll
				List<Empresa> empresa = empresaService.finAll();
				
				//Impresion
				for(Empresa item : empresa) {
					System.out.println(item.toString());
				}
				
				// findOne
				// Libro libro = libroService.findOne(4);
				// System.out.println(libro.toString());
				
				context.close();
	}

}
