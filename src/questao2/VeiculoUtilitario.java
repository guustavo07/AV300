package questao2;

public class VeiculoUtilitario extends VeiculoDePasseio {
	public String tipoTracao, tipo;

	public VeiculoUtilitario(String placa, String cor, String modelo, String fabricante, String anoFab, int numPortas,
			double valDiaria, String tipoTracao, String tipo) {
		super(placa, cor, modelo, fabricante, anoFab, numPortas, valDiaria);
		this.tipoTracao = tipoTracao;
		this.tipo = tipo;
	}

	public String getTipoTracao() {
		return tipoTracao;
	}

	public void setTipoTracao(String tipoTracao) {
		this.tipoTracao = tipoTracao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
