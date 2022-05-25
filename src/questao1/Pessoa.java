package questao1;

public class Pessoa {
	protected float altura, peso;

	public Pessoa(float altura, float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}
	public Pessoa() {
		
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	protected void andar() {
		System.out.println("Você esta andando");
				
	}
	protected void correr() {
		System.out.println("Você esta correndo");
	}
	
}
