package com.techm.service.impl;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techm.entity.Train;
import com.techm.repository.TrainRepository;
import com.techm.service.TrainService;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainRepository trainRepository;

    @Override
    public void addTrain(Train train) {
        trainRepository.save(train);
    }

    @Override
    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    @Override
    public Train getTrainById(Long id) {
        Optional<Train> optionalTrain = trainRepository.findById(id);
        return optionalTrain.orElse(null);
    }

    @Override
    public void updateTrain(Train train) {
        trainRepository.save(train);
    }

    @Override
    public void deleteTrain(Long id) {
        trainRepository.deleteById(id);
    }
}
