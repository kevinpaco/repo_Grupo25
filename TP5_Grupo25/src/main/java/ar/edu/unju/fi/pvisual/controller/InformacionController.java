package ar.edu.unju.fi.pvisual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/informacion")
public class InformacionController {

	 @GetMapping("/index")
	 public String getindex(Model model) {
		 
		 return "index";
	 }
	 
	 @GetMapping("/agenda")
	 public String getAgenda(Model model) {
		 
		 return "agenda";
	 }
	 @GetMapping("/beneficios")
	 public String getBeneficios(Model model) {
		 
		 return "beneficios";
	 }
	 
	 @GetMapping("/contacto")
	 public String getContacto(Model model) {
		 
		 return "contacto";
	 }
}
