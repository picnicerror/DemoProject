package com.cg.reservationdemo.entity;



import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "reservation_info")

public class DemoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long reservation_no;
	
	private String guest_name;
//	@Id
//	@GeneratedValue(strategy = arrival_date.datesUntil(arrival_date))
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate arrival_date;
	//@DateTimeFormat(pattern = "yyyy/MM/dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate departure_date;
	//@DateTimeFormat(pattern = "yyyy/MM/dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate booking_date;
	//@DateTimeFormat(pattern = "yyyy/MM/dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate modified_date;
	
	@Enumerated(EnumType.STRING)
	private ReservationStatus reservation_status;
	

	public Long getReservation_no() {
		return reservation_no;
	}

	public void setReservation_no(Long reservation_no) {
		this.reservation_no = reservation_no;
	}

	public String getGuest_name() {
		return guest_name;
	}

	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}

	public LocalDate getArrival_date() {
		return arrival_date;
	}

	public void setArrival_date(LocalDate arrival_date) {
		this.arrival_date = arrival_date;
	}

	public LocalDate getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(LocalDate departure_date) {
		this.departure_date = departure_date;
	}

	public LocalDate getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(LocalDate booking_date) {
		this.booking_date = booking_date;
	}

	public LocalDate getModified_date() {
		return modified_date;
	}

	public void setModified_date(LocalDate modified_date) {
		this.modified_date = modified_date;
	}

	public ReservationStatus getReservation_status() {
		return reservation_status;
	}

	public void setReservation_status(ReservationStatus reservation_status) {
		this.reservation_status = reservation_status;
	}

	
	@Override
	public String toString() {
		return "ReservationEntity [reservation_no=" + reservation_no + ", guest_name=" + guest_name + ", arrival_date="
				+ arrival_date + ", departure_date=" + departure_date + ", booking_date=" + booking_date
				+ ", modified_date=" + modified_date + ", reservation_status=" + reservation_status + "]";
	}

	public DemoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemoEntity(Long reservation_no, String guest_name, LocalDate arrival_date, LocalDate departure_date,
			LocalDate booking_date, LocalDate modified_date, ReservationStatus reservation_status) {
		super();
		this.reservation_no = reservation_no;
		this.guest_name = guest_name;
		this.arrival_date = arrival_date;
		this.departure_date = departure_date;
		this.booking_date = booking_date;
		this.modified_date = modified_date;
		this.reservation_status = reservation_status;
		
	}
	
	
	
	
	
}

