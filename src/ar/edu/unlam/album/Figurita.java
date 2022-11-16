package ar.edu.unlam.album;

import java.util.Objects;

public class Figurita implements Comparable <Figurita> { //para meter una figu a un TREESET el objeto que va a entrar tiene que implementar COMPARABLE

	private Integer codigoIdentificatorio;
	private String letraGrupo;
	private String seleccion;
	private String nombreJugador;
	private Integer precioJugador;
	
	public Figurita(Integer codigoIdentificatorio, String letraGrupo, String seleccion, String nombreJugador,
			Integer precioJugador) {
		super();
		this.codigoIdentificatorio = codigoIdentificatorio;
		this.letraGrupo = letraGrupo;
		this.seleccion = seleccion;
		this.nombreJugador = nombreJugador;
		this.precioJugador = precioJugador;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(codigoIdentificatorio);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)				//Borramos lo que sobra porque lo que discrimina es el CODIGO
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurita other = (Figurita) obj;
		return Objects.equals(codigoIdentificatorio, other.codigoIdentificatorio);
				
	}



	public Integer getCodigoIdentificatorio() {
		return codigoIdentificatorio;
	}

	public void setCodigoIdentificatorio(Integer codigoIdentificatorio) {
		this.codigoIdentificatorio = codigoIdentificatorio;
	}

	public String getLetraGrupo() {
		return letraGrupo;
	}

	public void setLetraGrupo(String letraGrupo) {
		this.letraGrupo = letraGrupo;
	}

	public String getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public Integer getPrecioJugador() {
		return precioJugador;
	}

	public void setPrecioJugador(Integer precioJugador) {
		this.precioJugador = precioJugador;
	}





	@Override
	public int compareTo(Figurita o) {
		return this.codigoIdentificatorio.compareTo(o.codigoIdentificatorio);
	}






	
	
	
	
	
}
