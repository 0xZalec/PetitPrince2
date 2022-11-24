package petitPrince.jeu;

public abstract class JeuSimple {

	protected String nom;
	
	public abstract Integer arbitrer(String c1, String c2);
	
	public abstract String getNom();
	
	public abstract String jouerUnTour();
}
