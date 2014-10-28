package br.com.caelum.agiletickets;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.agiletickets.models.Sessao;

public class FirstTest {

	@Test
	public void deveVender2IngressosSeHa2Vagas() {
		Sessao sessao = new Sessao();
		sessao.setTotalIngressos(2);
		Assert.assertTrue(sessao.podeReservar(2));
	}
	
}
