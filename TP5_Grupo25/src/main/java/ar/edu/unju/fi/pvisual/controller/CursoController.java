package ar.edu.unju.fi.pvisual.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import ar.edu.unju.fi.pvisual.model.Curso;


@Controller

public class CursoController {
	
	public List<Curso> getCurso(){
		List<Curso> listacursos=new ArrayList<>();
		
		listacursos.add(new Curso(1,"tec. base de datos","base de datos", "27/03/22","01/06/22",150,"Presencial", "Raul Chato Padilla"));
		listacursos.add(new Curso(2,"tec. en redes","redes", "01/03/22","01/06/22",90,"Virtual", "Ruben Agirre"));
		listacursos.add(new Curso(3,"Desarrollo web","web", "03/06/22","01/12/22",150,"Presencial", "Juan Perez"));
		return listacursos;
	}
	
	@RequestMapping("/cursos")
	public String getcursos(Model model) {
		model.addAttribute("cursos",getCurso());
		
		return "cursos";
	}
	
	/*@RequestMapping("/curso")
	public ModelAndView visualisarCurso(@RequestParam (name="codigo") int codigo) {
		ModelAndView modelandview =new ModelAndView("docente");
		
		Docente p=new Docente();
		for(Docente p1:this.getDocente()) {
			if(p1.getLegajo()==legajo) {
				p.setNombre(p1.getNombre());
			}
		}
	
		
		Curso p= new Curso();
		for(Curso p1: this.getCurso()) {
			if(p1.getCodigo()==codigo) {
			    
				
				p.setDocente(p1.getDocente());
				p.setHoras(p1.getHoras());
				p.setCodigo(p1.getCodigo());
			}
		}
		
		modelandview.addObject("docente",p);
		return modelandview;
		
	}*/
	
	
}
