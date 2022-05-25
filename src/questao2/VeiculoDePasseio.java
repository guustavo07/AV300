package questao2;

public abstract class VeiculoDePasseio {
	public String Placa, Cor, Modelo, Fabricante, AnoFab;
	public int numPortas;
	public double valDiaria;
	
	public VeiculoDePasseio(String placa, String cor, String modelo, String fabricante, String anoFab,
			int numPortas, double valDiaria) {
		super();
		Placa = placa;
		Cor = cor;
		Modelo = modelo;
		Fabricante = fabricante;
		AnoFab = anoFab;
		this.numPortas = numPortas;
		this.valDiaria = valDiaria;
	}

	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public String getAnoFab() {
		return AnoFab;
	}
	public void setAnoFab(String anoFab) {
		AnoFab = anoFab;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public double getValDiaria() {
		return valDiaria;
	}
	public void setValDiaria(double valDiaria) {
		this.valDiaria = valDiaria;
	}
}
