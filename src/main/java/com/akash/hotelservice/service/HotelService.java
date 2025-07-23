package com.akash.hotelservice.service;

import java.util.List;

import com.akash.hotelservice.model.Hotel;

public interface HotelService {

	public Hotel saveHotel(Hotel hotel);
	
	public Hotel getHotel(String hotelId);
	
	public List<Hotel> getAllHotels();
	
	
}
