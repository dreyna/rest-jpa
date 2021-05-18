package pe.edu.upeu.apirest;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.apirest.entity.Usuario;
import pe.edu.upeu.apirest.service.UsuarioService;

@SpringBootTest
class ApiRestApplicationTests {
	@Autowired
	UsuarioService userservice;
	@Test
	void contextLoads() {
		/*
		List<Usuario> lista = new ArrayList<>();
		lista = userservice.readAll();
		System.out.println(lista.get(0).getUsername());
		
		System.out.println(userservice.create(new Usuario("dreyna","123")).getUsername());
		*/
		userservice.delete(new Long(1));
	}

}
