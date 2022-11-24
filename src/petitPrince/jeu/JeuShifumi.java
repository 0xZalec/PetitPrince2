package petitPrince.jeu;

import java.util.Random;

public class JeuShifumi extends JeuSimple {

	public JeuShifumi() {
		super.nom = "Shifumi";
	}

	@Override
	public Integer arbitrer(String c1, String c2) {

		if ((c1 == "Feuille" && c2 == "Pierre") || (c1 == "Ciseaux" && c2 == "Feuille")
				|| (c1 == "Pierre" && c2 == "Ciseaux"))
			return 1;
		if ((c1 == "Pierre" && c2 == "Feuille") || (c1 == "Feuille" && c2 == "Ciseaux")
				|| (c1 == "Ciseaux" && c2 == "Pierre"))
			return -1;

		return 0;
	}

	@Override
	public String getNom() {
		return super.nom;
	}

	@Override
	public String jouerUnTour() {
		Random r = new Random();
		switch (r.nextInt(2)) {
		case 0:
			return Shifumi.PIERRE.toString();
		case 1:
			return Shifumi.FEUILLE.toString();
		case 2:
			return Shifumi.CISEAUX.toString();
		}
		;
		return null; // Return de défault pour pas que l'IDE me casse la tête avec des messages d'erreur inutiles
	}

	public enum Shifumi {
		PIERRE("Pierre"), FEUILLE("Feuille"), CISEAUX("Ciseaux");

		private String libelle;

		Shifumi(String l) {
			this.libelle = l;
		}

		@Override
		public String toString() {
			return this.libelle;
		}
	}

}
