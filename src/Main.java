
import br.com.medilab.model.Paciente;
import service.PacienteService;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema Medilab iniciando");

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        // Criando um paciente
        Paciente p1 = new Paciente("Bruno", 37, "123.456.789-00");


        // Mostrando os dados  usando getters
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("CPF: " + p1.getCpf());

        PacienteService pacienteService = new PacienteService();
        pacienteService.cadastrarPaciente(p1);

        //While(opcao != 0) {


        while (opcao != 0) {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("0 - Sair");
            System.out.println("Escolher uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            //limpa o ENTER que ficou no buffer

            if (opcao == 1) {
                System.out.print("Digite o nome:");
                String nome = scanner.nextLine();

                System.out.println("Digite a idade:");
                int idade = scanner.nextInt();
                scanner.nextLine(); //limpar o Enter depois do número

                System.out.println("Digite o cpf:");
                String cpf = scanner.nextLine();

                Paciente paciente = new Paciente(nome, idade, cpf);
                pacienteService.cadastrarPaciente(paciente);

                System.out.println("br.com.medilab.model.Paciente cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("Lista de pacientes:");

                for (Paciente p : pacienteService.listarPacientes()) {
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("IDADE: " + p.getIdade());
                    System.out.println("CPF: " + p.getCpf());
                    System.out.println("------------");
                }
            }

              else if (opcao == 0) {
                    System.out.println("Saindo do sistema...");
                }


                }

            }

        }
