package ar.edu.unju.fi.pvisual.service;

import ar.edu.unju.fi.pvisual.model.Docente;
import ar.edu.unju.fi.pvisual.until.ListaDocente;

public interface IDocenteService {
 
	 public Docente getDocente();
	 public boolean guardarDocente(Docente docente);
	 public void modificarDocente(Docente docente);
	 public void eliminarDocente(Docente docente);
	 public ListaDocente getListaDocente();
	 public Docente buscarDocente(int legajo);
	  
}
