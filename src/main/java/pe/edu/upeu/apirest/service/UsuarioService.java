package pe.edu.upeu.apirest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.apirest.entity.Usuario;
import pe.edu.upeu.apirest.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> readAll(){
		List<Usuario> users = new ArrayList<>();
	    repository.findAll().forEach(users::add);
		return users;
	}
	public Usuario create(Usuario user) {
		return repository.save(user);
	}
	public void delete(Long id) {
		repository.deleteById(id);
	}
	public Usuario read(Long id) {
		return repository.findById(id).get();
	}
	public Usuario update(Usuario u) {
		return repository.save(u);
	}
}
