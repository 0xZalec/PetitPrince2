package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;
import petitPrince.jeu.Joueur;

public class PetitPrince0 implements Sujet, Joueur {

	// Attributs
	private String nom;
	private Integer argent;
	private ConsoleJavaBoy console;
	private Integer cpt;

	// Constructeur
	public PetitPrince0() {
		this.nom = "Oui";
		this.argent = 0;
		ConsoleJavaBoy console = new ConsoleJavaBoy(this);
		this.cpt = 0;
	}

	// Autres méthodes
	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public int getArgent() {
		return this.argent;
	}

	@Override
	public void run() {
		this.console.parler("Tour : " + this.cpt);
		this.console.seDirigerVers(0);
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
