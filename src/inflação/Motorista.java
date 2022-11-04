package inflação;

public class Motorista {
	
		//ATRIBUTOS DE UM MOTORISTA 
		private String nome;
		private String numeroRegistro;
		private String numeroPlaca;
		
		// MÉTODOS DE UM MOTORISTA 
		
		// MÉTODO NOME
		
		public String getnome(){
			return this.nome;
				
		}
		 public void setnome(String nome) {
			 this.nome = nome;
		 }
		 	
			 	// MÉTODO NUMERO DE REGISTRO
			 
				public String getnumeroRegistro(){
					return this.numeroRegistro;
				
					}
				public void setnumeroRegistro(String numeroRegistro){
					this.numeroRegistro = numeroRegistro;
				}

					// MÉTODO PLACA DO VEÍCULO
				
					public String getnumeroPlaca(){
						return this.numeroPlaca;
						
							}
					public void setnumeroPlaca(String numeroPlaca) {
						this.numeroPlaca = numeroPlaca;
					}
}
