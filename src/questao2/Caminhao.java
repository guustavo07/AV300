package questao2;

public class Caminhao extends VeiculoDePasseio{
	public double capacidadeCarga;

	public Caminhao(String placa, String cor, String modelo, String fabricante, String anoFab, int numPortas,
			double valDiaria, double capacidadeCarga) {
		super(placa, cor, modelo, fabricante, anoFab, numPortas, valDiaria);
		this.capacidadeCarga = capacidadeCarga;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
}
