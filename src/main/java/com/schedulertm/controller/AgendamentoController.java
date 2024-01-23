package com.schedulertm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schedulertm.entities.Agendamento;
import com.schedulertm.impl.AgendamentoImpl;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
	
	@Autowired
	AgendamentoImpl service;
	
	@CrossOrigin
	@GetMapping("/all")
	public List<Agendamento> getAll() {
		return service.getAllAgendamento();
	}
	
	@CrossOrigin
	@GetMapping("/today")
	public List<Agendamento> getToday() {
		return service.getTodayAgendamento();
	}
	
	@CrossOrigin
	@GetMapping("/range/{startDate}/{endDate}")
	public List<Agendamento> getByRangeDate(@PathVariable("startDate") String startDate, @PathVariable("endDate") String endDate) {
		return service.findByRangeDate(startDate,endDate);
	}
	
	@CrossOrigin
	@PostMapping
	public String registerAgendamento(@RequestBody String postData) {
		
		
		return "OK";
	}
	
	
	
	

}
