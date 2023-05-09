import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int cont = 0;
        
        while (idade >= 0){
            soma = soma+idade;
            cont++;
            idade = sc.nextInt();
        }
        if (cont > 0 ) {
            //como a divisão é entre números inteiros foi necessário acrescentar um casting informando ao programa que a divisão será um numero com ponto flutuante.
        double media = (double) soma / cont;
        System.out.printf( "%.2f%n", media, ". ");    
        } else {
            System.out.println("Ipossível calcular. ");
        }
        sc.close();
    }
}
