
package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.Empresa_detallesDAO;
import com.distribuida.entities.Empresa_detalles;


import java.util.List;

public class PrincipalEmpresaDetalles {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Empresa_detallesDAO empresa_detallesDAO = context.getBean("empresa_detallesDAOImpl", Empresa_detallesDAO.class);

//        List<Empresa_detalles> empresa_detalles = empresa_detallesDAO.findAll();
//		
//		//Impresion
//		for(Empresa_detalles item : empresa_detalles){
//		  		System.out.println(item.toString());
//		}
//        
       // Define la cadena de búsqueda
       String busqueda = "10AM";

        // Usa el método findAll
        List<Empresa_detalles> resultados = empresa_detallesDAO.findCustom(busqueda);

        // Imprime los resultados
        for (Empresa_detalles perfil : resultados) {
            System.out.println(perfil);
        }

        context.close();
    }
}
