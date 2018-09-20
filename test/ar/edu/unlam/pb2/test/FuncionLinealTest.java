package ar.edu.unlam.pb2.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.FuncionLineal;
import ar.edu.unlam.pb2.dominio.FuncionLinealBuilder;

public class FuncionLinealTest {

	@Test
	public void resolucionFuncionLinealconDosMiembros() {
		
		Double constantePrueba = 5.0;
		Double coeficientexPrueba = 3.0;
		FuncionLineal funcionLinealPrueba = new FuncionLineal(coeficientexPrueba, constantePrueba);
		
		Double resultadoEsperado = 20.0;
		Double resultadoObtenido = funcionLinealPrueba.resolver(5.0);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void resolucionFuncionLinealconMultiplesMiembros() {
		
		List<Double> coeficientesGrado0 = new LinkedList<>();
		coeficientesGrado0.add(1.0);
		coeficientesGrado0.add(2.0);
		coeficientesGrado0.add(3.0);
		List<Double> coeficientesGrado1 = new LinkedList<>();
		coeficientesGrado1.add(5.0);
		coeficientesGrado1.add(6.0);
		
		FuncionLinealBuilder builder = new FuncionLinealBuilder(coeficientesGrado1, coeficientesGrado0);
		FuncionLineal funcionLinealPrueba = new FuncionLineal(builder);
		
		Double resultadoEsperado = -49.0;
		Double resultadoObtenido = funcionLinealPrueba.resolver(-5.0);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
