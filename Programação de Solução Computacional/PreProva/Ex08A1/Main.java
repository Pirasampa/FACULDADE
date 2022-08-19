/*
 *8. Calcule o retorno de um investimento financeiro fazendo as contas m�s a m�s, sem usar a
f�rmula de juros compostos. O usu�rio deve informar quanto ser� investido por m�s e
qual ser� a taxa de juros mensal. O programa deve informar o saldo do investimento ap�s
um ano (soma das aplica��es m�s a m�s considerando os juros compostos), e perguntar ao
usu�rio se ele deseja que seja calculado o ano seguinte, sucessivamente. Por exemplo,
caso o usu�rio deseje investir R$ 100,00 por m�s, e tenha uma taxa de juros de 1% ao m�s,
o programa forneceria a seguinte sa�da:
Saldo do investimento ap�s 1 ano: 1280.9328043328942
Deseja processar mais um ano? (S/N)
...
 */
package Ex08A1;

public class Main {

	public static void main(String[] args) {

		Calculadora c = new Calculadora(100,1);
		
		c.calcular();
		System.out.println(c.toString());
	}

}
