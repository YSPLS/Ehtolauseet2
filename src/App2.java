public class App2 {

	public static void main(String[] args) {
		// TEHTÄVÄ 2 
		int arvo1 = 1;
		int arvo2 = 1;
		int arvo3 = 1;
		
		{
			if (arvo1 == arvo2 || arvo2 == arvo3)
			System.out.println("arvo1 ja arvo2 ovat yhtäsuuria, tai arvo2 ja arvo3 ovat yhtäsuuria.");
			if (arvo1 > arvo2 && arvo1 == arvo3)
				System.out.println("arvo1 on suurempi kuin arvo2, mutta arvo1  on yhtäsuuri kuin arvo3.");
			if (arvo1 == arvo2 && arvo2 == arvo3)
				System.out.println("Kaikki arvot ovat yhtäsuuria!");
			if (arvo1 > arvo2) {
				System.out.println("Arvo1 on suurempi kuin Arvo2.");
			} else {
			if (arvo2 > arvo3)
				System.out.println("Arvo2 on suurempi kuin Arvo3.");
			}
			if (arvo1 == arvo2) {
				System.out.println("Arvo1 ja Arvo2 ovat yhtäsuuria.");
			} else {
			if (arvo1 == arvo3)
				System.out.println("Arvo1 ja Arvo3 ovat yhtäsuuria.");
			}
		
			
		}
	}

}