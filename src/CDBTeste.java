import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CDBTeste {
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{60, 1000.0, 8.5, 13.97, 3.14, 1.0829},
			{120, 500.0, 8.0, 13.15, 2.96, 2.0384},
			{240, 3000.0, 9.0, 177.53, 35.51, 4.7342}
		});
	}
	
	@Parameter(0)
	public int n;
	@Parameter(1)
	public double p;
	@Parameter(2)
	public double i;
	@Parameter(3)
	public double rendimentoBruto;;
	@Parameter(4)
	public double impostoDeRenda;
	@Parameter(5)
	public double rendimentoLiquido;
	
	@Test
	void  RendimentoBrutoTeste() {
		CDB cdb = new CDB(n, p, i);
		assertEquals(rendimentoBruto, cdb.calculaRendimentoBruto(), 0.1);
	}
	
	
	@Test
	void  ImpostoDeRendaTeste() {
		CDB cdb3 = new CDB(n, p, i);
		cdb3.calculaRendimentoBruto();
		assertEquals(impostoDeRenda, cdb3.calculaImpostoDeRenda(), 0.1);
	}
	
	@Test
	void  RendimentoLiquidoTeste() {
		CDB cdb5 = new CDB(n,p, i);
		cdb5.calculaRendimentoBruto();
		cdb5.calculaImpostoDeRenda();
		assertEquals(rendimentoLiquido, cdb5.calculaRendimentoLiquido(), 0.1);
	}

}
