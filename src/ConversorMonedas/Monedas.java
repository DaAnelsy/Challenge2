package ConversorMonedas;

import javax.swing.JOptionPane;

public class Monedas {
	private double dolar=7.80;
	private double euro=8.46;
	private double LbEsterlinas= 9.55;
	private double yenJapones= 0.059;
	private double wonSulCoreano= 0.0060;
	
	
	public Monedas() {
		
	}
	
	public double getDolar() {
		return dolar;
	}
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	public double getEuro() {
		return euro;
	}
	public void setEuro(double euro) {
		this.euro = euro;
	}
	public double getLbEsterlinas() {
		return LbEsterlinas;
	}
	public void setLbEsterlinas(double lbEsterlinas) {
		LbEsterlinas = lbEsterlinas;
	}
	public double getYenJapones() {
		return yenJapones;
	}
	public void setYenJapones(double yenJapones) {
		this.yenJapones = yenJapones;
	}
	public double getWonSulCoreano() {
		return wonSulCoreano;
	}
	public void setWonSulCoreano(double wonSulCoreano) {
		this.wonSulCoreano = wonSulCoreano;
	}
		
}
