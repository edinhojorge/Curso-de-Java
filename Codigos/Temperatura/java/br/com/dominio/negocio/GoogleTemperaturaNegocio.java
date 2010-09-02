package br.com.dominio.negocio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

/**
 * @author eder
 * Faz a busca da temperatura atual na API do google.
 * Requer as bibliotecas JSON de {@link http://www.json.org/java/}
 * TODO Codificar a URL para tratar outros caracteres além de espaços
 */
public class GoogleTemperaturaNegocio extends BaseNegocio {

	private String urlGoogleWeatherAPI = "http://www.google.com/ig/api?weather=";
	
	@Override
	public String executarNegocio(String cidade) {
		
		String xml = null;
		InputStreamReader inputStreamReader = null;
		String temperatura = null;
		
		try {
			URL url = new URL(urlGoogleWeatherAPI + cidade.replaceAll(" ", "%20"));
			
			inputStreamReader = new InputStreamReader(url.openStream());
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			xml = bufferedReader.readLine();  
			
		} catch (MalformedURLException e1) {
			// URL invalida
			e1.printStackTrace();
		} catch (IOException e1) {
			// Erro ao ler resultado da pagina
			e1.printStackTrace();
		} finally {
			try {
				inputStreamReader.close();
			} catch (IOException e) {
			}
			inputStreamReader = null;
		}
		
		if (xml == null)
			return "Temperatura não encontrada para " + cidade;
		
		try {

			JSONObject json = XML.toJSONObject(xml).getJSONObject("xml_api_reply").getJSONObject("weather").getJSONObject("current_conditions").getJSONObject("temp_c");
			temperatura = json.get("data").toString() + " graus celsius.";

		} catch (JSONException e) {
			// Erro ao acessar um campo ou durante a conversao
			e.printStackTrace();
		}
				
		if (temperatura == null)
			return "Temperatura não encontrada para " + cidade;
		
		
		return cidade + " está com " + temperatura;
		
	}

}
