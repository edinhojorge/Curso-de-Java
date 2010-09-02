package br.com.dominio.visao;

import br.com.dominio.negocio.BaseNegocio;

/**
 * Classe base para todas as visões que serão implementadas
 * @author eder
 */
abstract public class BaseVisao {
	
	/**
	 * Método para deixar como forma única de identificação
	 * do negócio.
	 * @return O negócio a ser utilizado nesta visão
	 */
	abstract protected BaseNegocio getNegocio();
	
	/**
	 * Método de execução da visão. Irá mostrar a saída do
	 * resultado do negócio.
	 */
	abstract public void mostrar();

}
