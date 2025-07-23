package com.akash.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.hotelservice.model.Hotel;
import com.akash.hotelservice.service.HotelService;

@RestController
@RequestMapping("hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping
	public Hotel saveHotel(@RequestBody Hotel hotel)
	{
		return hotelService.saveHotel(hotel);
	}
	
	@GetMapping("/{hotelId}")
	public Hotel getHotelById(@PathVariable String hotelId) {
		return hotelService.getHotel(hotelId);
	}
	
	@GetMapping
	public List<Hotel> getAllHotels(){
		return hotelService.getAllHotels();
	}
	
}
