import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CDBTeste {

	@Test
	void  RendimentoBrutoTeste() {
		CDB cdb = new CDB(60, 1000.00, 8.5, 22.5);
		assertEquals(13.97, cdb.getRendimentoBruto());
	}

}
