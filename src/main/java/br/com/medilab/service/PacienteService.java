package br.com.medilab.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PacienteService {

    public List<String> listarPacientes() {
            return List.of("João", "Maria", "Carlos");
        }
    }
