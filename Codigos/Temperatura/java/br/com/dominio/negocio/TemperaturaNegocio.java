package br.com.dominio.negocio;

public class TemperaturaNegocio extends BaseNegocio {

	@Override
	public String executarNegocio(String cidade) {
		
		String temperatura;
		
		if (cidade.equalsIgnoreCase("São Paulo")){
			temperatura = "15 graus Celsius";
		} else if (cidade.equalsIgnoreCase("Rio de Janeiro")){
			temperatura = "40 graus Celsius";
		} else if (cidade.equalsIgnoreCase("Fortaleza")){
			temperatura = "28 graus Celsius";
		} else {
			return "Não há temperatura para " + cidade;
		}
		
		return cidade + " está com " + temperatura;
		
	}

}
