package ar.edu.unlam.pb2.dominio;

public class FuncionLineal extends Polinomio {
	
	public FuncionLineal(Double x, Double cte ) {
		super(new Monomio(1,x), new Monomio(0, cte));
	}
	
	public FuncionLineal(FuncionLinealBuilder builder) {
		super(builder.getMonomios());
	}

}
