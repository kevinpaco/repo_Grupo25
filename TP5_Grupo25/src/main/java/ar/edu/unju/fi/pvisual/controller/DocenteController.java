package ar.edu.unju.fi.pvisual.controller;

import java.util.ArrayList; 
import java.util.List;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.pvisual.model.Docente;


@Controller

public class DocenteController {
	
	
	
	public List<Docente> getDocente(){
		List<Docente> listadocente=new ArrayList<>();
		
		listadocente.add(new Docente(1234,"Raul", "Chato Padilla", "Raul45@gmail.com", 388563213));
        listadocente.add(new Docente(2345,"Ruben","Aguirre","Carlos43@gmail.com", 388232248));
        listadocente.add(new Docente(2343,"Juan","Parez","Perezjuan23@gmail.com", 388435217));
		return listadocente;
	}
	
	
	/*@RequestMapping("/Docente")
	public String getDocente(Model model) {
		
		model.addAttribute("docente",getDocente());
		return "docente";
	}*/
	
	@RequestMapping("/Docente")
	public ModelAndView listaDocente() {
		ModelAndView mav = new ModelAndView("redirect:/docente/listaDocente");
		return mav;
	}

}
