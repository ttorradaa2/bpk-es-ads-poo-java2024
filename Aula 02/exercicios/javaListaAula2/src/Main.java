import java.util.Random;
import java.util.Scanner;

/*
class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        int I = 10;
        double D = 13.33 ;
        boolean B = true;
        char Ch = 'o';
        System.out.printf("\n%d",I);
        System.out.printf("\n%f",D);
        System.out.printf("\n%b",B);
        System.out.printf("\n%s",Ch);
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero");
        float n = Integer.parseInt(entrada.next());
        System.out.println("digite outro numero");
        float n2 = Integer.parseInt(entrada.next());
        System.out.println("\n" + (n+n2));
        System.out.println("\n" + (n-n2));
        System.out.println("\n" + (n*n2));
        System.out.println("\n" + (n/n2));
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero");
        float n = Integer.parseInt(entrada.next());

        if (n%2==0){
            System.out.println("É par");
        } else System.out.println("É impar");
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            n[i]=i;
            System.out.println(n[i]);
        }
    }
}
 */
/*public class Main {
    public static int soma(int n, int n2) {
        return n + n2;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero");
        float n = Integer.parseInt(entrada.next());
        System.out.println("digite outro numero");
        float n2 = Integer.parseInt(entrada.next());
        int n3 = soma((int) n, (int) n2);
        System.out.println(n3);
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu primeiro nome");
        String n = scanner.nextLine();
        System.out.println("digite seu sobrenome");
        String n2 = scanner.nextLine();
        System.out.println("\nNome: " + n +" "+ n2);
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero\n");
        float n = Integer.parseInt(scanner.next());
        System.out.println("[1] para soma\n[2] para subtração\n[3] para multiplicação\n[4] para divisão\n");
        int cal = Integer.parseInt(scanner.next());
        System.out.println("digite outro numero\n");
        float n2 = Integer.parseInt(scanner.next());

        switch (cal) {
            case 1:
                System.out.println((n+n2));
                break;
            case 2:
                System.out.println((n-n2));
                break;
            case 3:
                System.out.println((n*n2));
                break;
            case 4:
                System.out.println((n/n2));
                break;
            default:
                System.out.println("Número invalio");
                break;
        }
    }
}
 */

/*class veri {

    static boolean pri(int n) {
        if (n <= 1) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero\n");
        int n = Integer.parseInt(scanner.next());

        if (veri.pri(n)) {
            System.out.println("é primo.");
        } else {
            System.out.println("não é primo.");
        }
        scanner.close();
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um palíndromo");
        String n = scanner.nextLine();
        String inver = "";
        for (int i = (n.length() -1); i >= 0; i--) {
            inver += n.charAt(i);
        }
        if (inver.toLowerCase().equals(n.toLowerCase())) {
            System.out.println("\né um palíndromo");
        } else {
            System.out.println("\nnão é um palíndromo");
        }
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite 5 números\n");
        int[] n = new int[5];
        for (int i=0; i<5; i++) {
            n[i] = Integer.parseInt(scanner.next());
        }
        for (int i = 4; i>-1; i--) {
            System.out.println(n[i]);
        }
    }
}
 */
/*class Naleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int ale = random.nextInt(101);

        System.out.println("Digite um numero");
        int n = Integer.parseInt(scanner.next());

        for (int i = 0; i<100; i++){
            if (n==ale){
                System.out.println("Acertou!\nnúmero de tentativas: "+i);
                break;
            }
            else{
                if (n<ale){
                    System.out.println("Tente mais alto!");
                    n = Integer.parseInt(scanner.next());
                }
                else{
                    System.out.println("Tente mais baixo!");
                    n = Integer.parseInt(scanner.next());
                }
            }
        }
    }
}
 */
import java.util.Scanner;

/*class ContadorVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String n = scanner.nextLine();

        n = n.toLowerCase();

        int nVogal = 0;

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                nVogal++;
            }
        }
        System.out.println(nVogal+" Vogais");
    }
}
 */
/*class Fatorial {

    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número");
        int n = scanner.nextInt();

        int resultadoIterativo = fatorial(n);
        System.out.println("Fatorial (iterativo) de " + n + " é: " + resultadoIterativo);
    }
}
 */
/*class Fatorial {

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número");
        int n = scanner.nextInt();

        int resultadoRecursivo = fatorial(n);
        System.out.println("Fatorial (recursivo) de " + n + " é: " + resultadoRecursivo);
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("[1] ºC -> ºF\n[2] ºF -> ºC\n");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.print("Digite a temperatura em ºC\n");
                float tempe = scanner.nextInt();
                float cal = (float) (tempe*1.8+32);
                System.out.print(tempe+"ºC = "+cal+"ºF");
                break;
            case 2:
                System.out.print("Digite a temperatura em ºF\n");
                float tempeF = scanner.nextInt();
                float calF = (float) (tempeF/1.8-32);
                System.out.print(tempeF+"ºF = "+calF+"ºC");
                break;
            default:
                System.out.println("Número invalio");
                break;
        }
    }
}
 */
