package petitPrince.jeu;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet, Joueur {

	// Attributs
	private String nom;
	private Integer argent;
	private ConsoleJavaBoy console;
	private Integer cpt;

	// Constructeur
	public PetitPrince0() {
		ConsoleJavaBoy console = new ConsoleJavaBoy(this);
	}

	// Autres méthodes
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return this.nom;
	}

	@Override
	public int getArgent() {
		// TODO Auto-generated method stub
		return this.argent;
	}

	@Override
	public void run() {
		console.parler(this.getNom());
	}

	@Override
	public void gagner(Integer argent) {
		this.argent += argent;
	}

	@Override
	public void perdre(Integer argent) {
		this.argent -= (this.getArgent() < argent)?this.getArgent():argent;
	}

}
