
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){

            System.out.println("Digite o primeiro parâmetro");
            int n1 = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int n2 = scanner.nextInt();

            contar(n1, n2);
        } catch (ParametrosInvalidosException exception){
            System.err.println("Por favor digite o primeiro valor maior que o segundo valor");
        } catch (Exception InputMismatchException){
            System.err.println("Por favor digite apenas números inteiros");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois <= parametroUm){
            throw new ParametrosInvalidosException(); 
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        System.out.println("Contando de 1 até " + contagem);

        for(int i = 1; i <= contagem;i++){
            System.out.println("Imprimindo o número: " + i);
        }
	}
}
