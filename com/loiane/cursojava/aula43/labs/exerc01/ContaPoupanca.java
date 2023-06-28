package com.loiane.cursojava.aula43.labs.exerc01;

import java.util.Calendar;
import java.util.Date;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento + "]";
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
	
	

}
