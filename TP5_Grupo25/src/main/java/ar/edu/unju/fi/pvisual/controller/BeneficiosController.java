package ar.edu.unju.fi.pvisual.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.pvisual.model.Beca;


@Controller
public class BeneficiosController {

	public List<Beca> getBeca(){
		List<Beca> listbeca=new ArrayList<>();
		
		listbeca.add(new Beca(123,"base de datos","23/3/22","/32706/22","activo"));
	
		return listbeca;
	}
	
	
	@RequestMapping("/Beca")
	public String getDocente(Model model) {
		
		model.addAttribute("beca",getBeca());
		return "beca";
	}  
}
