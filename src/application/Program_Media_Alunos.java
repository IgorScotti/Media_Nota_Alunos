package application;

import java.util.Scanner;

public class Program_Media_Alunos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas notas você irá digitar? ");
		int numero_notas = sc.nextInt();

		double vectNotas[] = new double[numero_notas];

		for (int i = 0; i < vectNotas.length; i++) {
			System.out.print("Digite a " + (i + 1) + " Nota: ");
			int nota = sc.nextInt();
			vectNotas[i] = nota;
		}

		sc.close();

	}

}