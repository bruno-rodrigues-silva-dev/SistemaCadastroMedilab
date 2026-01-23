
import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println ("Sistema Medilab iniciando");
        int opcao = -1;
        Scanner scanner = new Scanner (System.in);
        while (opcao != 0) {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("0 - Sair");
            System.out.println("Escolher uma opção: ");

            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Você escolheu CADASTRAR");
            }
            else if (opcao == 2) {
                System.out.println("Você escolheu LISTAR");
            }
            else if (opcao == 0) {
                System.out.println("Você escolheu SAIR");
            }
            else {
                System.out.println("Opção inválida. Tente novamente.");


            }
        } // fecha while
    } // fecha main
} // fecha classe