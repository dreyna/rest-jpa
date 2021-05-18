package pe.edu.upeu.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.apirest.entity.Usuario;
import pe.edu.upeu.apirest.service.UsuarioService;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService userservice;
	
	@GetMapping("/")
	public String mensaje(){
		return "REST";
	}
	@GetMapping("/user")
	public List<Usuario> getList(){
		return userservice.readAll();
	}
	@DeleteMapping("/user/delete/{id}")
	public String delete(@PathVariable Long id){
		userservice.delete(id);
		return "Usuario Eliminado";
	}
	@GetMapping("/user/{id}")
	public Usuario read(@PathVariable Long id){
		return userservice.read(id);
	}
	@PutMapping("/user/update/{id}")
	public String update(@PathVariable Long id, @RequestBody Usuario user){
		System.out.println(id);
		Usuario u = userservice.read(id);
		System.out.println(user.getUsername());
		u.setPassword(user.getPassword());
		u.setUsername(user.getUsername());
		userservice.update(u);
		return "Usuario Modificado";
	}
}
