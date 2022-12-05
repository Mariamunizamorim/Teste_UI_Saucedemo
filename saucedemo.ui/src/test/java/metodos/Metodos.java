package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import driver.Drivers;

public class Metodos extends Drivers {

	/**
	 * Método para escrever passando o parametro By e String texto
	 * 
	 * @param elemento
	 * @param texto
	 */

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.out.println("Erro ao tentar escrever o elemento" + elemento);
		}
	}

	/**
	 * Método para clicar passando o parametro By
	 * 
	 * @param elemento
	 */

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("Erro ao tentar clicar o elemento" + elemento);

		}
	}
	/**
	 * Método para validar url capturada
	 * @param urlDesejada
	 */

	public void currentUrl(String urlDesejada){
		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
			
		} catch (Exception e) {
			System.out.println("Erro ao tentar validar url"+ urlDesejada);
		}
		
	}
	/*
	 * Método para validar mensagem passando o By e a mensagem esperada
	 */
	public void validarTexto(By elemento ,String MensagemEsperada) {
		try {
		String msgCapturada = driver.findElement(elemento).getText();
		assertEquals(MensagemEsperada, 	msgCapturada);
		}catch (Exception e) {
			System.out.println("Erro ao tentar validar a mensagem" + MensagemEsperada);
		}
	}
}
