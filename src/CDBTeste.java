import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CDBTeste {

	@Test
	void  RendimentoBrutoTeste() {
		CDB cdb = new CDB(60, 1000.00, 8.5);
		assertEquals(13.97, cdb.calculaRendimentoBruto(), 0.1);
	}
	
	@Test
	void  OutroRendimentoBrutoTeste() {
		CDB cdb2 = new CDB(120, 500.00, 8.0);
		assertEquals(13.15, cdb2.calculaRendimentoBruto(), 0.1);
	}
	
	@Test
	void  ImpostoDeRendaTeste() {
		CDB cdb3 = new CDB(60, 1000.00, 8.5);
		cdb3.calculaRendimentoBruto();
		assertEquals(3.14, cdb3.calculaImpostoDeRenda(), 0.1);
	}
	
	@Test
	void  OutroImpostoDeRendaTeste() {
		CDB cdb4 = new CDB(120, 500.00, 8.0);
		cdb4.calculaRendimentoBruto();
		assertEquals(2.96, cdb4.calculaImpostoDeRenda(), 0.1);
	}
	
	@Test
	void  RendimentoLiquidoTeste() {
		CDB cdb5 = new CDB(60, 1000.00, 8.5);
		cdb5.calculaRendimentoBruto();
		cdb5.calculaImpostoDeRenda();
		assertEquals(1.0829, cdb5.calculaRendimentoLiquido(), 0.1);
	}
	
	@Test
	void  OutroRendimentoLiquidoTeste() {
		CDB cdb6 = new CDB(120, 500.00, 8.0);
		cdb6.calculaRendimentoBruto();
		cdb6.calculaImpostoDeRenda();
		assertEquals(2.0384, cdb6.calculaRendimentoLiquido(), 0.1);
	}

}
