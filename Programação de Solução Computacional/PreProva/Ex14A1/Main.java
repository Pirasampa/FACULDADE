/*
 * 14. Leia do usu�rio o tempo em segundos e escreva em horas, minutos e segundos. Utilize
cinco m�todos, para a leitura e escrita de dados e para obten��o de horas, minutos e
segundos a partir do tempo em segundos.
 */
package Ex14A1;

public class Main {

	public static void main(String[] args) {

		Relogio w = new Relogio();
		
		w.input();
		w.horas();
		w.minutos();
		w.segundos();
		System.out.println(w.toString());
	}

}
