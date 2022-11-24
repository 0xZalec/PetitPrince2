package petitPrince.jeu;

public class TestArbitre {

	public TestArbitre() {
		// TODO Auto-generated constructor stub
	}

	static void arbitrer(Joueur j1, Joueur j2, JeuSimple jeu) {
		System.out.println("Jouons maintenant au jeu : " + jeu.getNom());

		String move1 = jeu.jouerUnTour(), move2 = jeu.jouerUnTour();
		System.out.println("J1 joue : " + move1);
		System.out.println("J2 joue : " + move2);
		
		Integer score = jeu.arbitrer(move1, move2);
		
		if (score > 0) {
			System.out.println("Gagnant : J1");
		} else if (score < 0) {
			System.out.println("Gagnant : J2");			
		} else {
			System.out.println("Pas de gagnant");
		}
	}

}
