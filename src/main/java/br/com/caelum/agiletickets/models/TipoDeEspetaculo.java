package br.com.caelum.agiletickets.models;

public enum TipoDeEspetaculo {

	CINEMA(0.05, 0.1), 
	SHOW(0.05, 0.1), 
	TEATRO(0, 0), 
	BALLET(0.5, 0.2, 60, 0.1), 
	ORQUESTRA(0.5, 0.2, 60, 0.1);
		
	public double getPercentualSobreprecoLotacao() {
		return percentualSobreprecoLotacao;
	}

	public double getTaxaSobreprecoLotacao() {
		return taxaSobreprecoLotacao;
	}

	public int getTempoSobreprecoDuracao() {
		return tempoSobreprecoDuracao;
	}

	public double getTaxaSobreprecoDuracao() {
		return taxaSobreprecoDuracao;
	}
	
	private double percentualSobreprecoLotacao;
	private double taxaSobreprecoLotacao;
	
	private int tempoSobreprecoDuracao;
	private double taxaSobreprecoDuracao;
	
	private TipoDeEspetaculo(double percentualSobreprecoLotacao, double taxaSobreprecoLotacao) {
		this(percentualSobreprecoLotacao, taxaSobreprecoLotacao, Integer.MAX_VALUE, 1.0);		
	}
	
	private TipoDeEspetaculo(double percentualSobreprecoLotacao, double taxaSobreprecoLotacao, 
			int tempoSobreprecoDuracao, double taxaSobreprecoDuracao) {
		this.percentualSobreprecoLotacao = percentualSobreprecoLotacao;
		this.taxaSobreprecoLotacao = taxaSobreprecoLotacao;
		this.tempoSobreprecoDuracao = tempoSobreprecoDuracao;
		this.taxaSobreprecoDuracao = taxaSobreprecoDuracao;

	}	
	
}