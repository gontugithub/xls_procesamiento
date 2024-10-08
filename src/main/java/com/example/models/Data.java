package com.example.models;

public class Data {
	
	private String hora;
	private String asigantura;
	private String dia;
	
	
	public Data(String hora, String asigantura, String dia) {
		this.hora = hora;
		this.asigantura = asigantura;
		this.dia = dia;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getAsigantura() {
		return asigantura;
	}


	public void setAsigantura(String asigantura) {
		this.asigantura = asigantura;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	@Override
	public String toString() {
		return "Data [dia=" + dia + ", hora=" + hora + ", asigantura=" + asigantura + "]";
	}
	
	
	
	
	
	
	

}
