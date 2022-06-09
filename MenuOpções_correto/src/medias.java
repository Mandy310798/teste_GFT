import java.util.Scanner;

public class medias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Digite o número correspondente à sua escolha:" +
                    "1 - Média Aritimética; " +
                    "2 - Media ponderada; " +
                    "3 - Sair"
        );

        int op = scan.nextInt();

        while (op<=3){
            if (op==1) {
                System.out.println("Digite nota 1:");
                double a1 = scan.nextDouble();
                System.out.println("Digite nota 2:");
                double a2 = scan.nextDouble();
                double mediaart = ((a1+a2)/2);
                System.out.print("Média Aritimética = " + mediaart);
            }
            if (op==2) {
                System.out.println("Digite nota 1:");
                double n1 = scan.nextDouble();
                System.out.println("Digite peso da nota 1:");
                double p1 = scan.nextDouble();
                System.out.println("Digite nota 2:");
                double n2 = scan.nextDouble();
                System.out.println("Digite peso da nota 2:");
                double p2 = scan.nextDouble();
                System.out.println("Digite nota 3:");
                double n3 = scan.nextDouble();
                System.out.println("Digite peso da nota 3:");
                double p3 = scan.nextDouble();

                double nxp1 = (n1*p1);
                double nxp2 = (n2*p2);
                double nxp3 = (n3*p3);
                double dominador = (p1+p2+p3);
                double medipond = ((nxp1+nxp2+nxp3)/dominador);
                System.out.print("Média Ponderada = " + medipond);
            }
            if (op==3) {
                break;
            }
            if (op > 3) System.out.println("Opção inválida");
    }

}}