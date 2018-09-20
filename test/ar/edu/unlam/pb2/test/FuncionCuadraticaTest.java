package ar.edu.unlam.pb2.test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.FuncionCuadratica;
import ar.edu.unlam.pb2.dominio.FuncionCuadraticaBuilder;

public class FuncionCuadraticaTest {

	@Test
	public void resolucionFuncionCuadraticaConDosMiembros() {
		
		Double constantePrueba = 5.0;
		Double coeficientexPrueba = 3.0;
		Double coeficienteX2Prueba = 2.0;
		FuncionCuadratica funcionCuadraticaPrueba = new FuncionCuadratica(coeficienteX2Prueba, coeficientexPrueba, constantePrueba);
		
		Double resultadoEsperado = 70.0;
		Double resultadoObtenido = funcionCuadraticaPrueba.resolver(5.0);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void resolucionFuncionCuadraticaConMultiplesMiembros() {
		
		List<Double> coeficientesGrado0 = new LinkedList<>();
		coeficientesGrado0.add(1.0);
		coeficientesGrado0.add(2.0);
		coeficientesGrado0.add(3.0);
		List<Double> coeficientesGrado1 = new LinkedList<>();
		coeficientesGrado1.add(2.0);
		coeficientesGrado1.add(3.0);
		List<Double> coeficientesGrado2 = new LinkedList<>();
		coeficientesGrado2.add(2.0);
		coeficientesGrado2.add(3.0);
		
		FuncionCuadraticaBuilder builder = new FuncionCuadraticaBuilder(coeficientesGrado2, coeficientesGrado1, coeficientesGrado0);
		FuncionCuadratica funcionCuadraticaPrueba = new FuncionCuadratica(builder);
		
		Double resultadoEsperado = 106.0;
		Double resultadoObtenido = funcionCuadraticaPrueba.resolver(-5.0);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}


}
