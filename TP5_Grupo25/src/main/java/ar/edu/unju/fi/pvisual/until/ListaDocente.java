package ar.edu.unju.fi.pvisual.until;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.pvisual.model.Docente;

@Component
public class ListaDocente {

	private ArrayList<Docente> docentes;
	
	public ListaDocente(){
	   docentes =new ArrayList<Docente>(); 
		 docentes.add(new Docente(100,"Alejandro","Sanches","asanches@gmail.com",388478926));
		 docentes.add(new Docente(101,"Maria","Lamas","mlamas@gmail.com",388234423));
		 docentes.add(new Docente(102,"Maria Adriana","Perez","mperez@gmail.com",388543543));
		 docentes.add(new Docente(103,"Pedro Antonio","Miranda","pmiranda@gmail.com",388478543));
		 
	}

	public ArrayList<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(ArrayList<Docente> docentes) {
		this.docentes = docentes;
	}
	
	
}
