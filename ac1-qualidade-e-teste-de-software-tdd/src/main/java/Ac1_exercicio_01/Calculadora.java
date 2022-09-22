package Ac1_exercicio_01;

public class Calculadora {
	
	public int Soma(int a, int b){
		return a+b;
	}
	
	public int Subtracao(int a, int b) {
		return a-b;
	}
	
	public int Multiplicacao(int a, int b) {
		return a*b;
	}
	
	public double Divisao(double a, double b) {
		return a/b;
	}
	
	public int Fatorial(int a) {
		int resp = 1;
		for (int i = a; i > 0; i--) {
			resp = resp * i;
		}
		return resp;
	}
	
	public double Media(double a, double b, double c, double d, double e) {
		return (a + b + c + d + e) / 5;
	}
}
