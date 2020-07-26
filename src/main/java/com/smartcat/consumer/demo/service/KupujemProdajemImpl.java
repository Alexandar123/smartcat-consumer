package com.smartcat.consumer.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartcat.consumer.demo.model.Kupujemprodajem;
import com.smartcat.consumer.demo.repository.KupujemprodajemRepository;

@RestController
@RequestMapping("/api/v1/kp")
public class KupujemProdajemImpl {
	
	@Autowired
	public KupujemprodajemRepository kupujemprodajemRepository;
	
	public KupujemProdajemImpl(KupujemprodajemRepository kupujemprodajemRepository) {
		this.kupujemprodajemRepository = kupujemprodajemRepository;
	}
	
	@GetMapping("/all")
	public Iterable<Kupujemprodajem> getByAll() {
		return kupujemprodajemRepository.findAll();
	}
	
	@GetMapping("/get/name/{name}")
	public Kupujemprodajem getByName(@PathVariable("name") String name) {
		return kupujemprodajemRepository.findByName(name);
	}
	
	@GetMapping("/get/price/{price}")
	public List<Kupujemprodajem> getByPrice(@PathVariable("price") String price) {
		return kupujemprodajemRepository.findByPrice(price);
	}
	
	@GetMapping("/get/category/{category}")
	public List<Kupujemprodajem> getByCategory(@PathVariable("category") String category) {
		return kupujemprodajemRepository.findByCategory(category);
	}
	
	@GetMapping("/get/posted/{posted}")
	public List<Kupujemprodajem> getPyposted(@PathVariable("posted") String posted) {
		return kupujemprodajemRepository.findByPosted(posted);
	}
	

}
