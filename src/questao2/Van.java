package questao2;

public class Van extends VeiculoDePasseio{
	public int numPassageiros, numEixos;

	public Van(String placa, String cor, String modelo, String fabricante, String anoFab, int numPortas,
			double valDiaria, int numPassageiros, int numEixos) {
		super(placa, cor, modelo, fabricante, anoFab, numPortas, valDiaria);
		this.numPassageiros = numPassageiros;
		this.numEixos = numEixos;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public int getNumEixos() {
		return numEixos;
	}

	public void setNumEixos(int numEixos) {
		this.numEixos = numEixos;
	}

}
