package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertMoney{
	Monedas monedas = new Monedas();
	MiMoneda miMoneda = new MiMoneda();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir: ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"Quetzal -> Dólar", "Quetzal -> Euro", "Quetzal -> Libras","Quetzal -> Yen","Quetzal -> Won Coreano","Dólar -> Quetzal", "Euro -> Quetzal", "Libras -> Quetzal","Yen -> Quetzal","Won Coreano -> Quetzal"}, 
    			"Seleccione")).toString();
        switch(opcion) {
        case "Quetzal -> Dólar":
        	miMoneda.quetzalAdolar(Minput);
        	break;
        case "Quetzal ->Euro":
        	miMoneda.quetzalAeuros(Minput);
        	break;
        case "Quetzal -> Libras":
        	miMoneda.quetzalalibras(Minput);
        	break;
        case "Quetzal -> Yen":
        	miMoneda.quetzalAyen(Minput);
        	break;
        case "Quetzal -> Won Coreano":
        	miMoneda.quetzalAwon(Minput);
        	break;    	    	                          
        case "Dólar -> Quetzal":
        	miMoneda.dolarAquetzal(Minput);
        	break;
        case "Euro -> Quetzal":
        	miMoneda.eurosAquetzal(Minput);
        	break;
        case "Libras -> Quetzal":
        	miMoneda.librasAquetzal(Minput);
        	break;
        case "Yen -> Quetzal":
        	miMoneda.yenAquetzal(Minput);
        	break;
        case "Won Coreano -> Quetzal":
        	miMoneda.wonAquetzal(Minput);
            break;
        }      
    }

	
        
}
