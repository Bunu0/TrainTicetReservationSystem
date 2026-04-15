package com.techm.service;

import java.util.List;

import com.techm.entity.Train;

public interface TrainService {
	
	 void addTrain(Train train);
	    List<Train> getAllTrains();
	    Train getTrainById(Long id);
	    void updateTrain(Train train);
	    void deleteTrain(Long id);
    
}
