package ar.edu.unlam.pb2.dominio;

import java.util.LinkedList;
import java.util.List;

public class FuncionLinealBuilder {
	
	private List<Monomio> monomios;
	
	public FuncionLinealBuilder(List<Double> coeficientesGrado1, List<Double> coeficientesGrado0) {
		this.monomios = new LinkedList<>();
		for (int i = 0; i < coeficientesGrado0.size(); i++) {
			this.monomios.add(new Monomio(0, coeficientesGrado0.get(i)));
		}
		for (int i = 0; i < coeficientesGrado1.size(); i++) {
			this.monomios.add(new Monomio(1, coeficientesGrado1.get(i)));
		}
	}
	
	public List<Monomio> getMonomios() {
		return this.monomios;
	}

}
