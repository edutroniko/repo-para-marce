package ar.edu.unlam.pb2.dominio;

import java.util.Arrays;


import java.util.List;

public class Polinomio {
	
	private List<Monomio> monomios;
	
	public Polinomio(Monomio...monomio) {
		this.monomios = Arrays.asList(monomio);
	}
	
	public Polinomio(List<Monomio> monomios) {
		this.monomios = monomios;
	}
	
	public Double resolver(Double x) {
		
		Double resultado = 0.0;
		
		for (Monomio unMonomio: monomios) {
			resultado += unMonomio.evaluar(x);
		}
		
		return resultado;
	}
	
}