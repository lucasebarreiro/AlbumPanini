package ar.edu.unlam.album;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Administrador extends Usuario {
	
	
	private Set<Figurita>figuritasDadasDeAlta = new TreeSet<>();
	//private Integer cantidadFiguritasDadasDeAlta=0;
	
	public Administrador(Integer dni, String nombre) {
		super(dni, nombre);
		
	}
	
	public void agregarFigurita(Figurita figurita) {
		figuritasDadasDeAlta.add(figurita);
	}
	
	public Integer cantidadFiguritasDeAlta() {
		return figuritasDadasDeAlta.size();
	}
	
	public Set<Figurita> obtenerFiguritasEnSuPoder() { // SI NO INSTANCIAMOS UNA COLECCION EN EL TEST PARA IMPRIMIR POR PANTALLA LOS CODIGOS TE MUESTRO LOS VALORES EN MEMORIA, ASI QUE CREAMOS ESTE METODO QUE DEVUELVE UNA COLECCION
		return figuritasDadasDeAlta;
	}

	@Override
	public String toString() {
		return "Administrador [figuritasDadasDeAlta=" + figuritasDadasDeAlta + "]";
	}
	
	

}
