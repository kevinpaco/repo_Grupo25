package ar.edu.unju.fi.pvisual.service.imp;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.pvisual.model.Docente;
import ar.edu.unju.fi.pvisual.service.IDocenteService;
import ar.edu.unju.fi.pvisual.until.ListaDocente;

@Service("DocenteServiceImpList")
public class DocenteServiceImp implements IDocenteService {
   
	@Autowired
	private ListaDocente listadocente;
	
	
	@Override
	public Docente getDocente() {
		// TODO Auto-generated method stub
		// retorna un objeto de la clase Docente
		return new Docente();
	}

	@Override
	public boolean guardarDocente(Docente docente) {
		// guarda un objeto docente en la lista docente
		boolean respuesta = listadocente.getDocentes().add(docente);
		
		return respuesta;
	}

	@Override
	public void modificarDocente(Docente docente) {
		// TODO Auto-generated method stub
      for(Docente elu: listadocente.getDocentes()) {
    	  if(elu.getLegajo()== docente.getLegajo()) {
    		  elu.setNombre(docente.getNombre());
    		  elu.setApellido(docente.getApellido());
    		  elu.setEmail(docente.getEmail());
    		  elu.setTelefono(docente.getTelefono());
    	  }
      }
	}

	@Override
	public void eliminarDocente(Docente docente) {
		// TODO Auto-generated method stub
		
	
    for(int i=0;i < listadocente.getDocentes().size();i++) {
    	if(listadocente.getDocentes().get(i).getLegajo()==docente.getLegajo()) {
    		listadocente.getDocentes().remove(i);
    		//list.remove(docente);
    	    
    	}
    }
    		   
       
	}

	@Override
	public ListaDocente getListaDocente() {
		// retorna el objeto que accede a la lista de alumnos
		return listadocente;
	}

	@Override
	public Docente buscarDocente(int legajo) {
		//busca el docente por  legajo y debuelbe el objeto asosiado al legajo
	 Optional<Docente> docente =listadocente.getDocentes().stream().filter(a -> a.getLegajo() == legajo).findFirst();
		
		return docente.get();
	}

}
