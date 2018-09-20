package ar.edu.unlam.pb2.dominio;

public class Monomio {
	
	private Integer exponente;
	private Double coeficiente;
	
	public Monomio(Integer exponente, Double coeficiente) {
		this.exponente = exponente;
		this.coeficiente = coeficiente;
	}
	
	public Double evaluar(Double x) {
		return coeficiente * Math.pow(x , this.exponente);
	}

	public Integer getExponente() {
		return exponente;
	}
}
