package exercicios08;

public class Exercicio07 {
	public static void main(String[] args) {

		int n1 = 1;
		int n2 = 0;

		for (int i = 1; i <= 15; i++) {
			if (i < 2) {

				System.out.println(1);

			} else {
				n1 = n1 + n2;
				n2 = n1 - n2;

				System.out.println(n1);
			}
		}
	}

}
