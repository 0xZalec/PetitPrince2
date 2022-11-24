package petitPrince.jeu;

import java.util.Random;

public class JeuDe extends JeuSimple {

	public JeuDe() {
		super.nom = "Dés";
	}

	@Override
	public Integer arbitrer(String c1, String c2) {
		
		if (Integer.parseInt(c1) > Integer.parseInt(c2))
			return 1;
		if (Integer.parseInt(c1) < Integer.parseInt(c2))
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
		Integer I = (Integer) r.nextInt(5)+1;
		return I.toString();
	}

}
