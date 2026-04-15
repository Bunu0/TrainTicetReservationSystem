package com.techm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techm.entity.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long>{
	 @Query("SELECT t FROM Train t " + "WHERE LOWER(t.sourceStation) = LOWER(:fromStation) " +
	           "AND LOWER(t.destinationStation) = LOWER(:toStation)")
	 
List<Train> findTrainsBetweenStations(@Param("fromStation") String fromStation,
		@Param("toStation") String toStation );

}
