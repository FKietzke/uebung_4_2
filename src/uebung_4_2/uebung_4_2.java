package uebung_4_2;

public class uebung_4_2 {

	public static void main(String[] args) {

		int zaehler = 1;
		int nenner = 1;
		double loesung = 1;

		while (loesung > 0.1) {
			bruchDarstellen(zaehler, nenner);
			nenner = zaehler + nenner;

		}

	}

	public static double bruchDarstellen(int a, int b) {

		double c = a;
		double d = b;

		double loesung = c / d;

		System.out.println(a);
		System.out.println("--- = " + loesung);
		System.out.println(b);
		System.out.println();

		return loesung;

	}
}
