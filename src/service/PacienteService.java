package service;
import br.com.medilab.model.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteService {

    public List<Paciente> listarPacientes(){
        return pacientes;
    }
    private List<Paciente> pacientes = new ArrayList<>();

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

}

