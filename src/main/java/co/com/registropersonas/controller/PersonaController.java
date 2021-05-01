package co.com.registropersonas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.com.registropersonas.model.ListaPersonas;
import co.com.registropersonas.model.Persona;
import co.com.registropersonas.service.PersonaService;

@Controller
public class PersonaController {
	
	@Autowired
	PersonaService perService;
	
	@GetMapping("/consultar")
	public String consultarPersona(Model model) {
		ListaPersonas listaPersonas = new ListaPersonas();
		listaPersonas.setPersonas(perService.consultarPersonas());
		model.addAttribute("texto", "Consulta Personas");
		model.addAttribute("titulo", "Listado de Personas");
		model.addAttribute("form", listaPersonas);
		return "consultar";
	}
	
	@GetMapping("/registrar")
	public String fomarularioRegistro(Model model) {
		Persona persona = new Persona();		
		persona.setProcesado(false);
		model.addAttribute("persona", persona);
		model.addAttribute("titulo", "Registro de Personas");
		return "formulario1";
	}
	
	
	@PostMapping("/registrar")
	public String registrarPersona(Persona persona) {
		perService.registrarPersona(persona);
		return "redirect:consultar";
	}
	
	@PostMapping("/actualizar")
	public String actualizarPersonas(Model model, @ModelAttribute ListaPersonas listaPersonas) {
		perService.actualizarEstado(listaPersonas.getPersonas());		
		return "redirect:consultar";		
	}
}
