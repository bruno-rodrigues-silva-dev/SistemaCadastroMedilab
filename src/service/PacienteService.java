package service;

import br.com.medilab.model.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteService {

    private List<Paciente> pacientes = new ArrayList<>();

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacientes;
    }

    public Paciente buscarPacientePorCpf(String cpf) {
        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    public boolean removerPacientePorCpf(String cpf) {
        Paciente paciente = buscarPacientePorCpf(cpf);

        if (paciente != null) {
            pacientes.remove(paciente);
            return true;
        }
        return false;

    }

    public boolean editarPacientePorCpf(String cpf, String novoNome, int novaIdade) {
        Paciente paciente = buscarPacientePorCpf(cpf);

        if (paciente != null) {
            paciente.setNome(novoNome);
            paciente.setIdade(novaIdade);
            return true;
        }
        return false;
    }

}




