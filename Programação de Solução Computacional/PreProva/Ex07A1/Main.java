/*
 * 7. Calcule a s�rie de Fibonacci para um n�mero inteiro n�o negativo informado pelo usu�rio.
A s�rie de Fibonacci inicia com os n�meros F0 = 0 e F1 = 1, e cada n�mero posterior
equivale � soma dos dois n�meros anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso o usu�rio
informe o n�mero 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
 */
package Ex07A1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int f1 = 0,f2 = 1,control = 0;
		Scanner sc = new Scanner(System.in);
		int loop = 0;
		
		while(loop == 0) {
			System.out.println("Digite a quantidade de numeros da sequencia de Fibonacci desejada: ");
			control = sc.nextInt();
			if(control > 0) {
				loop++;
			}
		}
		
		for(int i = 0 , x = 0 ; i <= control ; i++) {
			x = f2;
			f2 = f1;
			f1 = f1 + x;
			if(i == 0) {
				System.out.print(0 + ",");
			}else if(i == control) {
				System.out.print(f2 + ".");
			}else {
				System.out.print(f2 + ",");
			}
		    }
		sc.close();
	}
}
