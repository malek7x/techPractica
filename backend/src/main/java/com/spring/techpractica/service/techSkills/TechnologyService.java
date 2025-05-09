package com.spring.techpractica.service.techSkills;

import com.spring.techpractica.model.entity.techSkills.Technology;
import com.spring.techpractica.repository.techSkills.TechnologyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TechnologyService {

    private final TechnologyRepository technologyRepository;

    public TechnologyService(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    public List<Technology> findAllTechnologies() {
        return technologyRepository.findAll();
    }

    public Optional<Technology> findTechnologyByName(String technologyName) {
        return technologyRepository.findById(technologyName);
    }
}
