package ar.edu.unlam.pb2.dominio;

import java.util.LinkedList;
import java.util.List;

public class FuncionConstanteBuilder {
	
	private List<Monomio> monomios;
	
	public FuncionConstanteBuilder(Double...coeficientes) {
		this.monomios = new LinkedList<>();
		for (int i = 0; i < coeficientes.length; i++) {
			this.monomios.add(new Monomio(0, coeficientes[i]));
		}
	}
	
	public List<Monomio> getMonomios() {
		return this.monomios;
	}
	
	
}


