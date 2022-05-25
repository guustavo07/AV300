package questao2;

public class Motocicleta extends VeiculoDePasseio {
	public int potencia;
	public Motocicleta(String placa, String cor, String modelo, String fabricante, String anoFab, int numPortas,
			double valDiaria, int potencia) {
		super(placa, cor, modelo, fabricante, anoFab, numPortas, valDiaria);
		this.potencia = potencia;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
