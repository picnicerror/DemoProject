package com.cg.reservationdemo.service;

import java.util.Optional;



import com.cg.reservationdemo.entity.DemoEntity;



public interface DemoService {
public String addReservation(DemoEntity reservation);
	
	public DemoEntity modifyReservation(DemoEntity reservation);
	
	public Iterable<DemoEntity> viewAllReservation();
	
	public Optional<DemoEntity> viewReservationByReservationNo(long reservation_no);
	
	public String cancelReservation(DemoEntity reservation);
}
