package com.pedrothecatholic.certification_nlw.modules.certifications.useCases;

import com.pedrothecatholic.certification_nlw.modules.students.entities.CertificationStudentEntity;
import com.pedrothecatholic.certification_nlw.modules.students.repositories.CertificationStudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Top10RankingUseCase {
    @Autowired
    private CertificationStudentRespository certificationStudentRespository;

    public List<CertificationStudentEntity> execute() {
        return this.certificationStudentRespository.findTop10ByOrderByGradeDesc();
    }
}
