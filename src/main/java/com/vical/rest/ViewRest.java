package com.vical.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vical.domain.Embarazo;
import com.vical.domain.Negro;

@Path("/prueba")
public class ViewRest {
	
	@GET
	@Path("/obtenerEdad")
	@Produces({MediaType.APPLICATION_JSON})
	public Negro obtenerNegro(){
		Negro negro = new Negro();
		negro.setNombre("Mandingo");
		negro.setTamanio("30cm");
		negro.setPreferencia("Luis Flores");
		List<Embarazo> embarazos = new ArrayList<Embarazo>();
		Embarazo embarazo = new Embarazo(); 
		embarazo.setNombre("Luis"); embarazo.setSexo("F");
		
		Embarazo embarazo1 = new Embarazo(); 
		embarazo1.setNombre("Alberto"); embarazo1.setSexo("F");
		
		Embarazo embarazo2 = new Embarazo(); 
		embarazo2.setNombre("Paul"); embarazo2.setSexo("M");
		embarazos.add(embarazo); embarazos.add(embarazo1); embarazos.add(embarazo2);
		negro.setEmbarazos(embarazos);
		return negro;
	}
}
