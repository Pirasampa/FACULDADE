/*
 * 9. Calcule a raiz quadrada aproximada de um n�mero inteiro informado pelo usu�rio,
respeitando o erro m�ximo tamb�m informado pelo usu�rio. N�o utilize fun��es
predefinidas.
 */
package Ex09A1;

public class Main {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora(5);
		
		c.messages();
		c.calcularRaiz();
		System.out.println(c.toString());
	}

}
