package jeu;

public class JeuShifumi extends JeuSimple {

	public JeuShifumi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer arbitrer(String c1, String c2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNom() {
		return super.nom;
	}

	@Override
	public String jouerUnTour() {
		// TODO Auto-generated method stub
		return null;
	}

	public enum Shifumi {
		PIERRE("Pierre"),
		FEUILLE("Feuille"),
		CISEAUX("Ciseaux");
		
		private String libelle;
		
		Shifumi(String l) {
			this.libelle = l;
		}
	}
	
}
