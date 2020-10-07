package com.cg.reservationdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.reservationdemo.entity.DemoEntity;
import com.cg.reservationdemo.exception.ReservationAlreadyPresentException;
import com.cg.reservationdemo.repository.DemoRepo;
@Service
public class DemoServiceImpl implements DemoService {

	
	@Autowired
	DemoRepo ReservationRepo;
	
	
	
	
	@Override
	public String addReservation(DemoEntity reservation) {
		// TODO Auto-generated method stub
		if (ReservationRepo.findById(reservation.getReservation_no()).isPresent())
		{
			
				throw new ReservationAlreadyPresentException("Reservation with ReservationNo: "+reservation.getReservation_no()+" is already there!!!!");
		}
		else
		{
			ReservationRepo.save(reservation);
		}
		return ("Reservation with ReservationNo: "+reservation.getReservation_no()+" is added!!!!");
	}

	

	@Override
	public DemoEntity modifyReservation(DemoEntity reservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<DemoEntity> viewAllReservation() {
		// TODO Auto-generated method stub
		return ReservationRepo.findAll();
	}

	@Override
	public Optional<DemoEntity> viewReservationByReservationNo(long reservation_no) {
		// TODO Auto-generated method stub
		return ReservationRepo.findById(reservation_no);
	}

	@Override
	public String cancelReservation(DemoEntity reservation) {
		// TODO Auto-generated method stub
		return null;
	}

}
