/*
 1. Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. 
    Crie os m�todos p�blicos necess�rios para sets e gets e tamb�m um m�todo para imprimir todos dados de uma pessoa.
    Crie um m�todo para calcular a idade da pessoa. 
 */
package Ex1A1;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();

		p.setName();
		p.getName();
		p.setBD();
		p.getBD();
		p.setHeight();
		p.getHeight();
		p.showInfos();
	}

}
