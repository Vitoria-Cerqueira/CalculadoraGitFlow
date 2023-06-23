import java.util.Scanner;

public class Calculator {
    Scanner scan = new Scanner(System.in);
    public void menuCalc() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Escolha a operação que você deseja fazer: \n[1] SOMA " + "            " + "[2] SUBTRAIR\n" +" [3] DIVIDIR" +  "         [4] SAIR");
        switch (scan.nextInt()) {
            case 1:
                System.out.println("A soma dos números informados é igual a " + somarNumeros());
                menuCalc();
                break;
            case 2:
                System.out.println("A subtração dos números informados é igual a " + subtrairNumeros());
                menuCalc();
                break;
            case 3:
                System.out.println("A divisão dos números informados é igual a " + dividirNumeros());
                menuCalc();
                break;
            case 4:
                System.out.println("Encerrando sistema...");
                System.exit(0);
            default:
                System.out.println("INVALID");
        }
    }
    public int somarNumeros() {
        int n1, n2;
        System.out.println("Informe um número: ");
        n1 = scan.nextInt();

        System.out.println("Informe um número: ");
        n2 = scan.nextInt();

        return n1 + n2;
    }

    public int subtrairNumeros() {
        int n1, n2;

        System.out.println("Informe um número: ");
        n1 = scan.nextInt();

        System.out.println("Informe um número: ");
        n2 = scan.nextInt();
        return n1 - n2;
    }
    public double dividirNumeros(){

       double n1, n2;

        System.out.println("Informe um número: ");
        n1 = scan.nextDouble();

        System.out.println("Informe um número: ");
        n2 = scan.nextDouble();

        return n1 / n2;

    }
}
