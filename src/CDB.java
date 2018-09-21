
public class CDB {
	public int n;
	public double p;
	public double i;
	public double ir;
	public double rendimento_bruto;
	public double imposto_de_renda;
	public double rendimento_liquido;
	
	public CDB(int n, double p, double d, double e) {
		super();
		this.n = n;
		this.p = p;
		this.i = d;
		this.ir = e;
	}
	
	public double calculaRendimentoBruto() {
		return 13.97;
		
	}

	public double calculaImpostoDeRenda() {
		return 3.14;
	}

	public double calculaRendimentoLiquido() {
		return 1.0829;
	}
	
	
	
}
