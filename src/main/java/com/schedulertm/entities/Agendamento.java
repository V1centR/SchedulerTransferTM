package com.schedulertm.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "data_sequence")
	@SequenceGenerator(name = "data_sequence", sequenceName = "data_sequence_custom",initialValue = 1, allocationSize = 3)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@Column(name = "DATAREGISTRO", length = 50, nullable = false)
    private String dataRegistro;
	
	@Column(name = "DATATRANSFERENCIA", nullable = false)
	private String dataTransferencia;
	
	@Column(name = "VALORTRANSFERENCIA", nullable = false)
	private String valorTransferencia;
	
	@Column(name = "CTAORIGEM", nullable = false)
	private String ctaOrigem;
	
	@Column(name = "CTADESTINO", nullable = false)
	private String ctaDestino;
	
	@Column(name = "TAXAAPLICAVEL", nullable = false)
	private String taxaAplicavel;
	
	@Column(name = "STATUS", nullable = false)
	private String status;
	
}
