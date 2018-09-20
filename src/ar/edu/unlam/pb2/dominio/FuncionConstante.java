package ar.edu.unlam.pb2.dominio;

import java.util.List;

public class FuncionConstante extends Polinomio {
	
	public FuncionConstante(Double constante) {
		super(new Monomio(0, constante));
	}
	
	public FuncionConstante(FuncionConstanteBuilder builder) {
		super(builder.getMonomios());
	}

}
