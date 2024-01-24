package com.schedulertm.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schedulertm.entities.Agendamento;
import com.schedulertm.repo.AgendamentoRepo;
import com.schedulertm.service.AgendamentoService;

@Service("agendamentoImpl")
public class AgendamentoImpl implements AgendamentoService{

	@Autowired
	AgendamentoRepo repository;	
	
	@Override
	public Agendamento createAgendamento(Agendamento agendamento) {
		
		Agendamento obj = new Agendamento();
		obj.setDataRegistro(dateStampNow());
		obj.setCtaOrigem(agendamento.getCtaOrigem());
		obj.setCtaDestino(agendamento.getCtaDestino());
		obj.setDataTransferencia(agendamento.getDataTransferencia());
		obj.setValorTransferencia(agendamento.getValorTransferencia());
		obj.setTaxaAplicavel(agendamento.getTaxaAplicavel());
		obj.setStatus(agendamento.getStatus());
		
		return repository.save(obj);
		
	}
	
	@Override
	public List<Agendamento> findByRangeDate(String startDate, String endDate) {
		return repository.findByRangeDate(startDate, endDate);
	}	
	
	
	@Override
	public List<Agendamento> getTodayAgendamento() {
		return repository.findToday(dateStampNow());
	}
	

	@Override
	public Agendamento updateAgendamento(Agendamento agendamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Agendamento> getAllAgendamento() {

		return repository.findAll();
	}

	@Override
	public Agendamento getAgendamentoById(long agendamentoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAgendamento(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	private String dateStampNow() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		LocalDateTime now = LocalDateTime.now();
		
		return dtf.format(now);
	}
	

}
