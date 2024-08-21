package Classes__;

public class Computador {

		String cor;
		String material;
		String ligar;
		String desligar;
		String modelo;

		public String getCor() {
			return cor;		
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public String getLigar () {
			return "desligar";
		}
		public String getDesligar () {
			return "ligar";
		}
			

	}


