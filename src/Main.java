import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static double areaTriang(double altura, double base) {
		return (altura * base) / 2;
	}
	
	public static double areaRetang(double altura, double comprimento) {
		return (altura * comprimento);
	}
	
	public static double areaCal(double x, double y, double z) {
		if(z == 1) {
			return areaTriang(x,y);
		}else{
			return areaRetang(x,y);
		}
	}
	
	public static int factor(int n) {
		if(n == 0) {
			return 1;
		}
		
		int i = 0;
		
		for(i = n-1; i >= 1; i--) {
			n = n * i;
		}
		return n;
	}
	
	public static int factorRecursivo(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * factorRecursivo(n - 1);
	}
	
	public static int numTotalVogais(String frase) {
		int num_vogais = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A'|| frase.charAt(i) == 'e' || frase.charAt(i) == 'E'|| frase.charAt(i) == 'i' || frase.charAt(i) == 'I'|| frase.charAt(i) == 'o' || frase.charAt(i) == 'O' || frase.charAt(i) == 'u' || frase.charAt(i) == 'U') {
				System.out.println("Vogal " + frase.charAt(i) + " no index " + i);
				num_vogais += 1;
			}
		}
		return num_vogais;
	}
	
	public static String numVogais() {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira uma frase: ");
		String frase = in.nextLine();
		int num_vogais_a = 0;
		int num_vogais_e = 0;
		int num_vogais_i = 0;
		int num_vogais_o = 0;
		int num_vogais_u = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
				num_vogais_a += 1;
			}
			if(frase.charAt(i) == 'e' || frase.charAt(i) == 'E') {
				num_vogais_e += 1;
			}
			if(frase.charAt(i) == 'i' || frase.charAt(i) == 'I') {
				num_vogais_i += 1;
			}
			if(frase.charAt(i) == 'o' || frase.charAt(i) == 'O') {
				num_vogais_o += 1;
			}
			if(frase.charAt(i) == 'u' || frase.charAt(i) == 'U') {
				num_vogais_u += 1;
			}
		}
		return "Vogais a: " + num_vogais_a + "\nVogais e: " + num_vogais_e + "\nVogais i: " + num_vogais_i + "\nVogais o: " + num_vogais_o + "\nVogais u: " + num_vogais_u;
	}
	
	public static String tempo() {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o numero de segundos: ");
		int segundos = in.nextInt();
		int resto = 0;
		int meses = (segundos / 2592000);
		int dias = (segundos % 2592000) / 86400;
		int horas = ((segundos % 2592000) % 86400) / 3600;
		int minutos = (((segundos % 2592000) % 86400) % 3600) / 60;
		segundos = (((segundos % 2592000) % 86400) % 3600) % 60;
		Date d = new Date(segundos); return "\nMeses: " + meses + "\nDias: " + dias + "\nHoras: " + horas + "\nMinutos: " + minutos + "\nSegundos: " + segundos;
	}
	
	public static void main(String[] args) {
		System.out.println(numVogais());
		System.out.println(tempo());
	}
	
}
