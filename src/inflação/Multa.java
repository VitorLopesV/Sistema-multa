package inflação;

public class Multa {
	// ATRIBUTOS DE MULTA
		private String inflacao = "Transitar com farol desregulado";
		private String tipo = "Grave";
		private Double valor = 195.23;
		private String local = "AV.martin luther king, 134";
		private String data = "12/04/2022";
		
		// MÉTODOS INFLAÇÃO
		public String getInflacao() {
			return inflacao;
		}
		public void setInflacao(String inflacao) {
		this.inflacao = inflacao;
		}
				// MÉTODOS TIPO DE MULTA 
				public String getTipo() {
					return tipo;
				}
				public void setTipo(String tipo) {
					this.tipo = tipo;
				}
						// MÉTODOS VALOR DA MULTA 
						public Double getValor() {
							return valor;
						}
						public void setValor(Double valor) {
							this.valor = valor;
						}
								//MÉTODOS LOCAL 
								public String getLocal() {
									return local;
								}
								public void setLocal(String local) {
									this.local = local;
								}
										// MÉTODOS DATA 			
										public String getData() {
											return data;
										}
										public void setData(String data) {
											this.data = data;
										}
}
