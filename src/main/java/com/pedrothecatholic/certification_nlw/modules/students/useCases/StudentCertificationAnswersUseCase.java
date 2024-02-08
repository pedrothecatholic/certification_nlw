package com.pedrothecatholic.certification_nlw.modules.students.useCases;

import com.pedrothecatholic.certification_nlw.modules.students.dto.StudentCertificationAnswerDTO;
import com.pedrothecatholic.certification_nlw.modules.students.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCertificationAnswersUseCase {
    @Autowired
    private StudentRepository studentRepository;

    public void execute(StudentCertificationAnswerDTO dto) {
        // Verificar se usuário existe
        var student = studentRepository.findByEmail(dto.getEmail());

        if (student.isEmpty()) {
            throw new Exception("E-mail do estudante incorreto");
        }
        // Buscar as alternativas das perguntas
        // - Correta ou Incorreta

        // Salvar as informações das certificações
    }
}
