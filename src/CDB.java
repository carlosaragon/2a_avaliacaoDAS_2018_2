
public class CDB {
	public int n;
	public double p;
	public double i;
	public double ir;
	public double rendimentoBruto;
	public double impostoDeRenda;
	
	public CDB(int n, double p, double d) {
		super();
		this.n = n;
		this.p = p;
		this.i = d;
	}
	
	public double calculaRendimentoBruto() {
		if (n <= 180) {
			ir = 22.5;
		}
		else if (n <= 360) {
			ir = 20.00;
		}
		else if (n <= 720) {
			ir = 17.5;
		}
		else {
			ir = 15.00;
		}
		
		rendimentoBruto = p * n/365 * i/100;
		
		return rendimentoBruto;
		
	}

	public double calculaImpostoDeRenda() {
		impostoDeRenda = rendimentoBruto * ir/100;
		return impostoDeRenda;
	}

	public double calculaRendimentoLiquido() {
		double rendimentoLiquido = 0;
		rendimentoLiquido = (((rendimentoBruto + p - impostoDeRenda)/p)*100) - 100;
		return rendimentoLiquido;
	}
	
	
	
}
