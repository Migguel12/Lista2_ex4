import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = ler.nextLine();
        System.out.println("");

        if(("A".equalsIgnoreCase(letra)) || ("E".equalsIgnoreCase(letra)) || ("I".equalsIgnoreCase(letra)) || ("O".equalsIgnoreCase(letra)) || ("U".equalsIgnoreCase(letra)) ){
            System.out.print("Vogal");

        }
        else{
            System.out.print("Consoante");
        }

        }
    }
