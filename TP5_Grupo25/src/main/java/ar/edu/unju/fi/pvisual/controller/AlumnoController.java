package ar.edu.unju.fi.pvisual.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.pvisual.model.Alumno;

@Controller
public class AlumnoController {
  
	 
	public List<Alumno> getAlumno(){
		List<Alumno> listalumno=new ArrayList<>();
		
		listalumno.add(new Alumno(4320432,"luis","agirre","luis@34gmai.com",388493928));
		listalumno.add(new Alumno(3455233,"Albert","Yampa","abert23@gmail.com",232323233));
		listalumno.add(new Alumno(4320432,"Lisa","Simpsons","lisa23@gmmail.com",34324543));
		listalumno.add(new Alumno(4320432,"Bart","Simpsons","elbarto@gmail.com",34325322));
		
		return listalumno;
	}
	@GetMapping("/alumno")
	public String mostraralumno(Model model) {
		model.addAttribute("alumno",getAlumno());
		
		return "alumno";
	}
}
