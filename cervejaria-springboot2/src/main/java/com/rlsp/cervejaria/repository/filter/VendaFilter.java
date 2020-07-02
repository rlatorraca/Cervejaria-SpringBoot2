package com.rlsp.cervejaria.repository.filter;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.rlsp.cervejaria.model.StatusVenda;



public class VendaFilter {

	private Long codigo;
	private StatusVenda status;

	private LocalDate desde;
	private LocalDate ate;
	private BigDecimal valorMinimo;
	private BigDecimal valorMaximo;

	private String nomeCliente;
	private String cpfOuCnpjCliente;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public StatusVenda getStatus() {
		return status;
	}

	public void setStatus(StatusVenda status) {
		this.status = status;
	}

	public LocalDate getDesde() {
		return desde;
	}

	public void setDesde(LocalDate desde) {
		this.desde = desde;
	}

	public LocalDate getAte() {
		return ate;
	}

	public void setAte(LocalDate ate) {
		this.ate = ate;
	}

	public BigDecimal getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(BigDecimal valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public BigDecimal getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(BigDecimal valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfOuCnpjCliente() {
		return cpfOuCnpjCliente;
	}

	public void setCpfOuCnpjCliente(String cpfOuCnpjCliente) {
		this.cpfOuCnpjCliente = cpfOuCnpjCliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VendaFilter other = (VendaFilter) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	

}
