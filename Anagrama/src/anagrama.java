import java.util.Arrays;
import java.util.Scanner;

public class anagrama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra1, palavra2;

        System.out.println("Digite a primeira palavra: ");
        palavra1 = scan.next();
        System.out.println("Digite a segunda palavra ");
        palavra2 = scan.next();

        //String palavra1 = "pedra";
        //String palavra2 = "perda";

        char[] chars1 = palavra1.toCharArray();
        char[] chars2 = palavra2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        //System.out.print(Arrays.toString(chars1));
        //System.out.print(Arrays.toString(chars2));

        if (Arrays.equals(chars1,chars2))
            System.out.print("Palavras são anagrama");
        else
            System.out.print("Palavras não são anagrama");

    }

}
