package ar.edu.unju.fi.pvisual.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.pvisual.model.Docente;
import ar.edu.unju.fi.pvisual.service.IDocenteService;
import ar.edu.unju.fi.pvisual.until.ListaDocente;

@Controller
@RequestMapping("/docente")
public class AgregarController {
	
	@Autowired
	@Qualifier("DocenteServiceImpList")
	private IDocenteService docenteService;
	
	Logger logger = LoggerFactory.getLogger(AgregarController.class);
 
	
	@RequestMapping("nuevo")
	public String NuevoDocente(Model model) {
		model.addAttribute("docente",docenteService.getDocente());
		return "nuevo-docente";
	}
	
	@PostMapping("/guardar")
	public ModelAndView listaDocente(@Validated @ModelAttribute("docente") Docente docente, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			logger.info("no se cumplen las regals de validacion");
			ModelAndView mav =new ModelAndView("nuevo-docente");
			mav.addObject("docente", docente);
			ListaDocente listadocente =new ListaDocente();
			mav.addObject("docentes",listadocente.getDocentes());
			return mav;
		}
		ModelAndView mav =new ModelAndView("redirect:/docente/listaDocente");
		
		
		if(docenteService.guardarDocente(docente)) {
			logger.info("Se agrego un objeto al ArrayList de docentes");
		};
	
		return mav;
	}
	@GetMapping("/listaDocente")
	public ModelAndView getListaAlumnosPage() {
		ModelAndView mav = new ModelAndView("lista_docentes");
		mav.addObject("docentes",docenteService.getListaDocente().getDocentes());
		return mav;
	}
	
	@GetMapping("/editar/{legajo}")
	public ModelAndView getEditarDocente(@PathVariable (value="legajo")int legajo) {
		ModelAndView mav =new ModelAndView("editar_docente");
	    Docente docente= docenteService.buscarDocente(legajo);
	    mav.addObject("docentes", docente);
		return mav;		
	}
	
	@PostMapping("/modificar")
	public ModelAndView editarDatos(@Validated @ModelAttribute("docente")Docente docente, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			logger.info("ocurrio un error"+ docente);
			ModelAndView mav =new ModelAndView("editar_docente");
            mav.addObject("docente", docente);   		
			return mav;
		}
		ModelAndView mav = new ModelAndView("redirect:/docente/listaDocente");
	    docenteService.modificarDocente(docente);
	    logger.info("Se modifico un objeto del ArrayList docente");
		return mav;
	}
	@GetMapping("/eliminar/{legajo}")
	public ModelAndView getEliminarDocente(@PathVariable (value="legajo")int legajo) {
		ModelAndView mav =new ModelAndView("redirect:/docente/listaDocente");
	
	    Docente docente= docenteService.buscarDocente(legajo);
	     logger.info("se encontro al docente y se envio a eliminado");
	     docenteService.eliminarDocente(docente);
	     
	    mav.addObject("docentes", docenteService.getListaDocente().getDocentes());
	  
		return mav;		
	}
	
	@PostMapping("/eliminado")
	public ModelAndView eliminarDocente(@PathVariable(value="docente")Docente docente) {
		logger.info("recivio el dato del docente para ser elimnado");
		 ModelAndView mav =new ModelAndView("redirect:/docente/listaDocente");
		 docenteService.eliminarDocente(docente);
		 return mav;
	}
}
