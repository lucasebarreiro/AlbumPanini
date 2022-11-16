package ar.edu.unlam.album;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class TestAlbum {

	@Test
	public void queSePuedaCrearUnaFigurita() {
		
		Figurita figurita = new Figurita (1, "A", "Argentina", "Lionel Messi", 80000000);
		
		assertEquals((Integer)1, figurita.getCodigoIdentificatorio());
		
	}
	
	@Test
	public void queSePuedaCrearUnUsuarioAdministrador() {
		
		Usuario admin = new Administrador(40378915, "Lucas Barreiro");
		
		assertEquals((Integer)40378915, admin.getDni());
		
	}
	
	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
		
		Usuario admin = new UsuarioFinal(40378915, "Lucas Barreiro");
		
		assertEquals((Integer)40378915, admin.getDni());
		
	}
	
	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() {
		
		Usuario admin = new Administrador(40378915, "Lucas Barreiro");
		Figurita figurita = new Figurita (1, "A", "Argentina", "Lionel Messi", 80000000);
		Figurita figurita2 = new Figurita (2, "A", "Argentina", "Lionel Messi", 80000000);
		
		admin.agregarFigurita(figurita);
		admin.agregarFigurita(figurita2);
		
		Integer valorEsperado=2;
		Integer valorObtenido= ((Administrador) admin).cantidadFiguritasDeAlta();
		
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() {
		
		Usuario admin = new UsuarioFinal(40378915, "Lucas Barreiro");
		Figurita figurita = new Figurita (1, "A", "Argentina", "Lionel Messi", 80000000);
		Figurita figurita2 = new Figurita (2, "A", "Argentina", "Lionel Messi", 80000000);
		
		admin.agregarFigurita(figurita);
		admin.agregarFigurita(figurita2);
		
		Integer valorEsperado=2;
		Integer valorObtenido= ((UsuarioFinal) admin).obtenerStockDisponible();
		
		assertEquals(valorEsperado, valorObtenido);
	
	}
	
	@Test
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas() { //SE ORDENAN SOLOS PORQUE ES UN TREESET
		
		Usuario admin = new Administrador(40378915, "Lucas Barreiro");
		Figurita figurita= new Figurita (10, "B", "Bolivia", "No Tengo Idea", 2);
		Figurita figurita2= new Figurita (5, "C", "Argentina", "Lionel Messi", 80000000);
		Figurita figurita3= new Figurita (1, "A", "Mexico", "Chicharito", 80000001);
		Figurita figurita4= new Figurita (7, "D", "Brasil", "Neymar Jr", 80000002);
		
		admin.agregarFigurita(figurita4);
		admin.agregarFigurita(figurita);
		admin.agregarFigurita(figurita3);
		admin.agregarFigurita(figurita2);
		
		Set<Figurita> figuritasEnVenta = ((Administrador) admin).obtenerFiguritasEnSuPoder(); //ESTE METODO DEVUELVE UNA COLECCION ASI QUE SE LO GUARDA EN "FIGURITAS EN VENTA" QUE ES UNA AL RECORRERLA PODEMOS SACARLE LO QUE QUERAMOS. 
		
		for (Figurita figuritas : figuritasEnVenta) {
			System.out.println(figuritas.getCodigoIdentificatorio());
		}

		
	}
	
	@Test
	public void queUnAdministradorNoPuedaAgregarFiguritasExistentes() { //SE ORDENAN SOLOS PORQUE ES UN TREESET
		
		Usuario admin = new Administrador(40378915, "Lucas Barreiro");
		Figurita figurita= new Figurita (10, "B", "Bolivia", "No Tengo Idea", 2);
		Figurita figurita2= new Figurita (5, "C", "Argentina", "Lionel Messi", 80000000);
		Figurita figurita3= new Figurita (1, "A", "Mexico", "Chicharito", 80000001);
		Figurita figurita4= new Figurita (7, "D", "Brasil", "Neymar Jr", 80000002);
		Figurita figurita5= new Figurita (8, "D", "Brasil", "Neymar Jr", 80000002);
		
		admin.agregarFigurita(figurita4);
		admin.agregarFigurita(figurita);
		admin.agregarFigurita(figurita3);
		admin.agregarFigurita(figurita2);
		admin.agregarFigurita(figurita5);
		
		Set<Figurita> figuritasEnVenta = ((Administrador) admin).obtenerFiguritasEnSuPoder(); //ESTE METODO DEVUELVE UNA COLECCION ASI QUE SE LO GUARDA EN "FIGURITAS EN VENTA" QUE ES UNA AL RECORRERLA PODEMOS SACARLE LO QUE QUERAMOS. 
		
		for (Figurita figuritas : figuritasEnVenta) {
			System.out.println(figuritas.getCodigoIdentificatorio());
			
			
		}
		
		assertEquals((Integer)5, ((Administrador)admin).cantidadFiguritasDeAlta());
	
	}
	
	@Test
	public void queUnUsuarioFinalSiPuedaAgregarFiguritasExistentes() { //SE ORDENAN SOLOS PORQUE ES UN TREESET
		
		Usuario admin = new UsuarioFinal(40378915, "Lucas Barreiro");
		Figurita figurita= new Figurita (10, "B", "Bolivia", "No Tengo Idea", 2);
		Figurita figurita2= new Figurita (5, "C", "Argentina", "Lionel Messi", 80000000);
		Figurita figurita3= new Figurita (1, "A", "Mexico", "Chicharito", 80000001);
		Figurita figurita4= new Figurita (7, "D", "Brasil", "Neymar Jr", 80000002);
		Figurita figurita5= new Figurita (7, "D", "Brasil", "Neymar Jr", 80000002);
		
		admin.agregarFigurita(figurita4);
		admin.agregarFigurita(figurita);
		admin.agregarFigurita(figurita3);
		admin.agregarFigurita(figurita2);
		admin.agregarFigurita(figurita5);
		
		//Set<Figurita> figuritasEnVenta = ((Administrador) admin).obtenerFiguritasEnSuPoder(); //ESTE METODO DEVUELVE UNA COLECCION ASI QUE SE LO GUARDA EN "FIGURITAS EN VENTA" QUE ES UNA AL RECORRERLA PODEMOS SACARLE LO QUE QUERAMOS. 
		
//		for (Figurita figuritas : figuritasEnVenta) {
//			System.out.println(figuritas.getCodigoIdentificatorio());
			
		assertEquals((Integer)5,((UsuarioFinal)admin).obtenerStockDisponible());
		}
	
	@Test
	public void queUnUsuarioFinalSiPuedaPegarUnaFigurita() throws FiguritaRepetidaException, FiguritaInexistente { 
		
		Usuario admin = new UsuarioFinal(40378915, "Lucas Barreiro");
		Figurita figurita= new Figurita (10, "B", "Bolivia", "No Tengo Idea", 2);
		Figurita figurita2= new Figurita (5, "C", "Argentina", "Lionel Messi", 80000000);
		Figurita figurita3= new Figurita (1, "A", "Mexico", "Chicharito", 80000001);
		Figurita figurita4= new Figurita (8, "D", "Brasil", "Neymar Jr", 80000002);
		Figurita figurita5= new Figurita (7, "D", "Brasil", "Neymar Jr", 80000002);
		
		admin.agregarFigurita(figurita4);
		admin.agregarFigurita(figurita);
		admin.agregarFigurita(figurita3);
		admin.agregarFigurita(figurita2);
		admin.agregarFigurita(figurita5);
		
		((UsuarioFinal) admin).pegarFigurita(figurita);
		((UsuarioFinal) admin).pegarFigurita(figurita);
		
		
//		Integer valorEsperado=5;
//		Integer valorObtenido= ((UsuarioFinal)admin).obtenerCantidadDeFiguritasPegadas();	
//		
//		assertEquals(valorEsperado, valorObtenido);
			
		//assertEquals((Integer)5,((UsuarioFinal)admin).obtenerStockDisponible());
		
		
		
		}
		
		
	
	
	
	

}
