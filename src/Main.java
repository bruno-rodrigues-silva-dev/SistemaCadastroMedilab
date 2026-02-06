
import br.com.medilab.model.Paciente;
import service.PacienteService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema Medilab iniciando");

        Scanner scanner = new Scanner(System.in);
        PacienteService pacienteService = new PacienteService();

        int opcao = -1;

        //While(opcao != 0) {
        while (opcao != 0) {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar por CPF");
            System.out.println("4 - Editar por CPF");
            System.out.println("5 - Excluir por CPF");
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
            } else if (opcao == 3) {
                System.out.println("Digite o CPF para buscar: ");
                String cpfBusca = scanner.nextLine();

                Paciente pacienteEncontrado =
                        pacienteService.buscarPacientePorCpf(cpfBusca);

                if (pacienteEncontrado == null) {
                    System.out.println("Paciente não encontrado");
                } else {
                    System.out.println("Paciente encontrado");
                    System.out.println("Nome:" + pacienteEncontrado.getNome());
                    System.out.println("Idade:" + pacienteEncontrado.getIdade());
                    System.out.println("CPF: " + pacienteEncontrado.getCpf());
                }
            } else if (opcao == 4) {
                System.out.println(("Digite o CPF do paciente: "));
                String cpf = scanner.nextLine();

                System.out.println("Novo nome: ");
                String novoNome = scanner.nextLine();

                System.out.println("Nova idade: ");
                int novaIdade = scanner.nextInt();
                scanner.nextLine();

                boolean editado =
                        pacienteService.editarPacientePorCpf(cpf, novoNome, novaIdade);
                if (editado) {
                    System.out.println("Paciente atualizado com sucesso!");
                } else {
                    System.out.println("Paciente não encontrado. ");
                }
            } else if (opcao == 5) {
                System.out.println("Digite o CPF do paciente para excluir: ");
                String cpf = scanner.nextLine();

                boolean removido =
                        pacienteService.removerPacientePorCpf(cpf);

                if (removido) {
                    System.out.println("Paciente removido com sucesso!");
                } else {
                    System.out.println("Paciente não encontrado. ");
                }


            } else if (opcao == 0) {
                System.out.println("Saindo do sistema...");
            }


        }

    }

}
