package ar.edu.unlam.pb2.dominio;

public class FuncionCuadratica extends Polinomio {
	
	public FuncionCuadratica(Double x2, Double x, Double cte ) {
		super(new Monomio(2,x2), new Monomio(1,x), new Monomio(0, cte));
	}
	
	public FuncionCuadratica(FuncionCuadraticaBuilder builder) {
		super(builder.getMonomios());
	}

}
