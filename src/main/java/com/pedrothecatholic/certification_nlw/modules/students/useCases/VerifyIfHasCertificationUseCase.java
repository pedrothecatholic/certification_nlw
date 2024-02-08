package com.pedrothecatholic.certification_nlw.modules.students.useCases;

import com.pedrothecatholic.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.pedrothecatholic.certification_nlw.modules.students.repositories.CertificationStudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {
    @Autowired
    private CertificationStudentRespository certificationStudentRespository;

    public boolean execute(VerifyHasCertificationDTO dto) {
        var result = this.certificationStudentRespository.findByStudentEmailAndTechnology(dto.getEmail(),
                dto.getTechnology());
        if (!result.isEmpty()) {
            return true;
        }
        return false;
    }
}
