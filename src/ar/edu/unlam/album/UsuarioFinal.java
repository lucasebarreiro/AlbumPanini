package ar.edu.unlam.album;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsuarioFinal extends Usuario {
	private List<Figurita> stockDisponible = new ArrayList<>();
	private Set<Figurita> albumFiguritas = new HashSet<>();

	public UsuarioFinal(Integer dni, String nombre) {
		super(dni, nombre);
		// TODO Auto-generated constructor stub
	}

	
	public void agregarFigurita(Figurita figurita) {
		stockDisponible.add(figurita);
	}
	
	public Integer obtenerStockDisponible() {
		return stockDisponible.size();
	}
	
	public void pegarFigurita(Figurita figurita) throws FiguritaRepetidaException, FiguritaInexistente {
//	 Boolean sePudoPegar = false;
//	 for (Figurita figuritas : stockDisponible){
//		 albumFiguritas.add(figuritas);
//	 		sePudoPegar=true;
//		}
//	 	return false;
//	}
		if (stockDisponible.contains(figurita)) {//SI EL STOCK CONTIENE LA FIGURITA A PEGAR
			if (albumFiguritas.contains(figurita)) {
				throw new FiguritaRepetidaException();
			}else {
				albumFiguritas.add(figurita);
			}
		}else {
			throw new FiguritaInexistente();
		}
	}
	
	public Integer obtenerCantidadDeFiguritasPegadas() {
		return albumFiguritas.size();
	}
	 
	 
	

}
