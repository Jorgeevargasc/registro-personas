package co.com.registropersonas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.registropersonas.model.Persona;
import co.com.registropersonas.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository repo;
	
	public List<Persona> consultarPersonas(){
		return repo.findAll();
	}
	
	public void registrarPersona(Persona persona) {
		repo.save(persona);
	}
	
	public void actualizarEstado(List<Persona> personas) {
		for(Persona persona : personas) {
			if(repo.existsById(persona.getId())) {
				repo.save(persona);
				if(persona.isProcesado()) {
					
				}
			}
		}
	}
}
