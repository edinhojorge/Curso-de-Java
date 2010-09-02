package br.com.dominio.main;

import br.com.dominio.visao.BaseVisao;
import br.com.dominio.visao.ConsoleTemperaturaVisao;
import br.com.dominio.visao.JanelaTemperaturaVisao;


public class Main {

	private static boolean hasProxy = false;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		if (hasProxy)
			configProxy();
		
		mostrarTemperatura(new ConsoleTemperaturaVisao("São Paulo"));
		mostrarTemperatura(new ConsoleTemperaturaVisao("Rio de Janeiro"));
		mostrarTemperatura(new ConsoleTemperaturaVisao("Fortaleza"));
		mostrarTemperatura(new ConsoleTemperaturaVisao("Patagonia"));
		
		mostrarTemperatura(new JanelaTemperaturaVisao("São Paulo"));

		//mostrarTemperatura(new JanelaTemperaturaVisao("Patagonia"));
		
	}
	
	private static void mostrarTemperatura(BaseVisao visao){
		visao.mostrar();
	}
	
	private static void configProxy(){
		System.getProperties().put("proxySet","true");
	    System.getProperties().put("proxyPort","8080");
	    System.getProperties().put("proxyHost","proxy1");
	}
	
	
	
	
	

}
