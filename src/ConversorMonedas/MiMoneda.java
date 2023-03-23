package ConversorMonedas;

import javax.swing.JOptionPane;

public class MiMoneda extends Monedas {
	
	public void dolarAquetzal(double dolar) {
		double total;
		total=getDolar()*dolar;
		total = (double) Math.round(total *100d)/100;
	    JOptionPane.showMessageDialog(null,"Dolar $"+dolar+" = Quetzal Q" +total);	
	}
	
	public void eurosAquetzal(double euro) {
		double total;
		total=getEuro()*euro;
		total = (double) Math.round(total *100d)/100;
	    JOptionPane.showMessageDialog(null,"Euro "+euro+" = Q" +total);	
		
	}
	
	public void librasAquetzal(double libra) {
		double total;
		total=getLbEsterlinas()*libra;
		total = (double) Math.round(total *100d)/100;
	    JOptionPane.showMessageDialog(null,"Libras Estrlinas:"+libra+" = Q" +total);	
		
	}
	
	public void yenAquetzal(double yen) {
		double total;
		total=getYenJapones()*yen;
		total = (double) Math.round(total *100d)/100;
	    JOptionPane.showMessageDialog(null,"Yen Japones "+yen+" = Q" +total);	
		
	}
	
	public void wonAquetzal(double won) {
		double total;
		total=getWonSulCoreano()*won;
		total = (double) Math.round(total *100d)/100;
	    JOptionPane.showMessageDialog(null,"Won Coreano "+won+" = Q" +total);	
		
	}
	public void quetzalAdolar(double quetzal) {
		double total;
		total= (quetzal / getDolar());
		total = (double) Math.round(total *100d)/100;
	    JOptionPane.showMessageDialog(null,"Q"+quetzal+" = Dollar &" +total);	
	}
	
	public void quetzalAeuros(double quetzal) {
		double total;
		total=(quetzal / getEuro());
		total = (double) Math.round(total *100d)/100;
	    JOptionPane.showMessageDialog(null,"Q"+quetzal+" = " +total+ " Euros");	
		
	}
	
	public void quetzalalibras(double quetzal) {
		double total;
		total=quetzal/getLbEsterlinas();
		total = (double) Math.round(total *100d)/100;
	    JOptionPane.showMessageDialog(null,"Q"+quetzal+"= " +total+" Libras Esterlinas");	
		
	}
	
	public void quetzalAyen(double quetzal) {
		double total;
		total=quetzal/getYenJapones();
		total = (double) Math.round(total *100d)/100;
	    JOptionPane.showMessageDialog(null,"Q"+quetzal+"= " +total+" Yen Japones");	
		
	}
	
	public void quetzalAwon(double quetzal) {
		double total;
		total=quetzal/getWonSulCoreano();
		total = (double) Math.round(total *100d)/100;
	    JOptionPane.showMessageDialog(null,"Q"+quetzal+"= " +total+" won Coreano");	
		
	}
}
