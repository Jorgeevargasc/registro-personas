package co.com.registropersonas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.com.registropersonas.model.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Integer>{
	
	

}
