/*
 * 17. Identifique as classes e implemente um programa para a seguinte especifica��o: �O
supermercado vende diferentes tipos de produtos. Cada produto tem um pre�o e uma
quantidade em estoque. Um pedido de um cliente � composto de itens, onde cada item
especifica o produto que o cliente deseja e a respectiva quantidade. Esse pedido pode ser
pago em dinheiro, cheque ou cart�o.�
 */
package Ex17A1;

public class Main {

	public static void main(String[] args) {
		
		Supermercado m = new Supermercado(0, 0);
		
		m.input();
		m.calcValor();
		System.out.println(m.toString());

	}

}
