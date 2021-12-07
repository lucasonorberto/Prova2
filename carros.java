package br.edu.univas.main;

import java.util.Scanner;

public class carros {
	public String marca;
	public String cor;
	public int anoFabricacao;
	public int anoModelo;
	public float potencia;
	public int cilindros;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		carros[] carros = new carros[50];
		int currentPosition = 0;

		int option = 0;

		do {
			printMenu();
			option = readIntValue(scanner);

			Object carros1 = null;
			if (option == 1) {
				try {
					createNewcarros(scanner, carros1, currentPosition);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				currentPosition++;

			} else if (option == 2) {
				printCarros(carros1, currentPosition);

			} else if (option != 5) {
				System.out.println("Por favor digite uma opção correta!");
			} else {
				System.out.println("Até mais!");
			}

		} while (option != 3);

		scanner.close();
	}

	private static void printCarros(Object carros, int currentPosition) {
		// TODO Auto-generated method stub
		
	}

	private static void createNewcarros(Scanner scanner, Object carros, int currentPosition) {
		// TODO Auto-generated method stub
		
	}

	private static int readIntValue(Scanner scanner) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void printMenu() {
		// TODO Auto-generated method stub
		
	}
  
}

