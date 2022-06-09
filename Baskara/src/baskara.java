import java.util.Scanner;

public class baskara {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite um valor para a:");
        a = scan.nextInt();
        System.out.println("Digite um valor para b:");
        b = scan.nextInt();
        System.out.println("Digite um valor para c:");
        c = scan.nextInt();

        double delta = ((b*b)- (4*a*c));
        double raiz = Math.sqrt(delta);

        double x1 = (-b + raiz);
        double dominador = (2*a);
        double xI = x1/ dominador;

        double x2 = (-b - raiz);
        double dominador2 = (2*a);
        double xII = x2/ dominador2;

        System.out.println("x' = " + xI);
        System.out.println("X'' = " + xII);

    }

}
