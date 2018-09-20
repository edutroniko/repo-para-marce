package ar.edu.unlam.pb2.test;

import static org.junit.Assert.*;

import ar.edu.unlam.pb2.dominio.*;

import org.junit.Test;

public class FuncionConstanteTest {

	@Test
	public void resolucionFuncionConstante() {
		
		Double constanteDePrueba = 5.0;
		FuncionConstante funcionDePrueba = new FuncionConstante(constanteDePrueba);
		
		Double resultadoEsperado = 5.0;
		Double variableDePrueba = 4.0;
		Double resultadoObtenido = funcionDePrueba.resolver(variableDePrueba);
		
		assertEquals(resultadoEsperado, resultadoObtenido);

		
	}
	
	@Test
	public void resolucionFuncionConstanteConVariosCoeficientes() {
		
		Double coeficientePrimerTermino = 5.0;
		Double coeficienteSegundoTermino = 4.0;
		Double coeficienteTercerTermino = 3.0;
		FuncionConstanteBuilder builder = new FuncionConstanteBuilder(coeficientePrimerTermino,coeficienteSegundoTermino,coeficienteTercerTermino);
		FuncionConstante funcionDePrueba = new FuncionConstante(builder);
		
		Double resultadoEsperado = 12.0;
		Double variableDePrueba = 4.0;
		Double resultadoObtenido = funcionDePrueba.resolver(variableDePrueba);
		
		assertEquals(resultadoEsperado, resultadoObtenido);

		
	}

}
