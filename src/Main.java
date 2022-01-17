
public class Main {
	
	public double areaTriang(double altura, double base) {
		return (altura * base) / 2;
	}
	
	public double areaRetang(double altura, double comprimento) {
		return (altura * comprimento);
	}
	
	public double areaCal(double x, double y, double z) {
		if(z == 1) {
			return areaTriang(x,y);
		}else{
			return areaRetang(x,y);
		}
	}
	
	public int factor(int n) {
		if(n == 0) {
			return 1;
		}
		
		int i = 0;
		
		for(i = n-1; i >= 1; i--) {
			n = n * i;
		}
		return n;
	}
	
	public int factorRecursivo(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * factorRecursivo(n - 1);
	}
	
	public int numTotalVogais(String frase) {
		int num_vogais = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
				System.out.println("Vogal " + frase.charAt(i) + " no index " + i);
				num_vogais += 1;
			}
		}
		return num_vogais;
	}
	
	public String numVogais(String frase) {
		int num_vogais_a = 0;
		int num_vogais_e = 0;
		int num_vogais_i = 0;
		int num_vogais_o = 0;
		int num_vogais_u = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'a') {
				System.out.println("Vogal " + frase.charAt(i) + " no index " + i);
				num_vogais_a += 1;
			}
			if(frase.charAt(i) == 'e') {
				System.out.println("Vogal " + frase.charAt(i) + " no index " + i);
				num_vogais_e += 1;
			}
			if(frase.charAt(i) == 'i') {
				System.out.println("Vogal " + frase.charAt(i) + " no index " + i);
				num_vogais_i += 1;
			}
			if(frase.charAt(i) == 'o') {
				System.out.println("Vogal " + frase.charAt(i) + " no index " + i);
				num_vogais_o += 1;
			}
			if(frase.charAt(i) == 'u') {
				System.out.println("Vogal " + frase.charAt(i) + " no index " + i);
				num_vogais_u += 1;
			}
		}
		return "Vogais a: " + num_vogais_a + "\nVogais e: " + num_vogais_e + "\nVogais i: " + num_vogais_i + "\nVogais o: " + num_vogais_o + "\nVogais u: " + num_vogais_u;
	}
	
	public String tempo(int segundos) {
		int minutos = segundos / 60;
		int horas = minutos / 60;
		int dias = horas / 24;
		int meses = dias / 30;
		return "\nMeses: " + meses + "\nDias: " + dias + "\nHoras: " + horas + "\nMinutos: " + minutos + "\nSegundos: " + segundos;
	}

}
