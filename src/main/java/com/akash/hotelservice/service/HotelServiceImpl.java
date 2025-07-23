package com.akash.hotelservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.hotelservice.exception.ResourceNotFoundException;
import com.akash.hotelservice.model.Hotel;
import com.akash.hotelservice.repository.HotelRepository;

@Service
public class HotelServiceImpl  implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel saveHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setHotelId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotel(String hotelId) {
		return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel Not Found With Give ID"));
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}

}
