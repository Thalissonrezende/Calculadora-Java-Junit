
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTeste {
	
	public Calculadora cal = new Calculadora();
	@Test
	void test() {
		int SubtrairComSucesso = cal.subtrair(2, 2);
		assertEquals(0,SubtrairComSucesso);
	}
	
	@Test
	void test2() {
		int SomarDoisValores = cal.somar(2, 2);
		assertEquals(4,SomarDoisValores);
}
	@Test
	void test3() {
		int MultiplicarValores = cal.multiplicar(2, 2);
		assertEquals(4,MultiplicarValores);
}
	@Test
	void test4() {
		double DivisãoNumeros = cal.dividir(2, 2);
		assertEquals(1,DivisãoNumeros);
}
	@Test
	void test5() {
		double PotenciaDeDoisValores = cal.potenciar(2, 1);
		assertEquals(2,PotenciaDeDoisValores);
}
}