package entities;

public class PessoaJuridica extends Contribuinte{
	private Integer numeroFunc;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFunc) {
		super(nome, rendaAnual);
		this.numeroFunc = numeroFunc;
	}

	public Integer getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(Integer numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	@Override
	public double imposto() {
		if(numeroFunc > 10) {
			return rendaAnual * 0.14;
		}else {
			return rendaAnual * 0.16;
		}
	}
}
