package questao1;

public class Aluno extends Pessoa {
	public int matricula;

	public Aluno(float altura, float peso, int matricula) {
		super(altura, peso);
	}
	protected void andar() {
		System.out.println("Voc� esta andando");
				
	}
	protected void correr() {
		System.out.println("Voc� esta correndo");
	}

}
