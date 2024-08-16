package org.example.hibernatefinal.repository;

import org.example.hibernatefinal.entity.Human;
import org.springframework.stereotype.Service;



@Service
public class HumanService {

    private HumanRepository humanRepository;

    public HumanService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    public void saveHuman (Human human) {
       humanRepository.save(human);
    }

    public void deleteHuman (Human human) {
        humanRepository.delete(human);
    }

    public void deleteAllHumans() {
        humanRepository.deleteAll();
    }

    public void deleteId (Integer id) {
        humanRepository.deleteById(id);
    }

}
