package org.example.intership.manytomany.service.applicationservice;

import org.example.intership.manytomany.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteApplication {
    @Autowired
    ApplicationRepository applicationRepository;

    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }

}
