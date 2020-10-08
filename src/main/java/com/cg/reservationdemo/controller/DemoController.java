package com.cg.reservationdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.reservationdemo.entity.DemoEntity;
import com.cg.reservationdemo.service.DemoService;



@RestController
@RequestMapping("/reservation")
public class DemoController {

	
	@Autowired
	DemoService reservationservice; 
	
	
	
	@PostMapping("/addReservation")
	public void addReservation(@RequestBody DemoEntity reservation)
	{
		reservationservice.addReservation(reservation);
		
	}
	
	@GetMapping("/viewAllReservation/{reservation_no}")
	public Optional<DemoEntity> viewReservationByReservationNo(@PathVariable("reservation_no") long reservation_no)
	{
		return reservationservice.viewReservationByReservationNo(reservation_no);
		
	}
	
	@GetMapping("/viewAllReservation")
	public Iterable<DemoEntity> viewAllReservation()
	{
		return reservationservice.viewAllReservation();
	}
	
	@PutMapping("/modifyReservation")
	public void modifyReservation(@RequestBody ReservationEntity reservation)
	{
		reservationservice.modifyReservation(reservation);
	}
	
}
