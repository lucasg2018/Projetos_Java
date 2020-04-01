package entities;

public class PessoaFisica extends Contribuinte{
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		if(rendaAnual >= 20000) {
			return (rendaAnual * 0.25) - (gastosSaude * 0.50);
		}
		else {
			return (rendaAnual * 0.15) - (gastosSaude * 0.50);
		}
	}
}
