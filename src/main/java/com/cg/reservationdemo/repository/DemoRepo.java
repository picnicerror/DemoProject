package com.cg.reservationdemo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cg.reservationdemo.entity.DemoEntity;
import com.cg.reservationdemo.entity.ReservationStatus;


public interface DemoRepo extends CrudRepository<DemoEntity, Long>{

	//Optional<DemoEntity> findById(ReservationStatus booked);

	//void deleteById(DemoEntity reservation);

}
