package pokemon;

import java.util.Random;

public class Pokemon0 {
	private String nom;
	private int niveau;
	private int atk;
	protected int hp;
	private int niveauMax;
	private java.util.Random random;
	
	public void Pokemon(String nom) {
		this.nom=nom;
		this.niveau= random.nextInt(1, niveauMax);
		this.hp=2*niveau;
		this.atk=((niveau/2)+1);	
		this.niveauMax=10;
	}

	public String getNom() {
		return nom;
	}
	
	public int getNiveau() {
		return niveau;
	}

	public int getAtk() {
		return atk;
	}
	
	public int getHp() {
		return hp;
	}
	
	public boolean isKo() {
		if (hp==0) {
			return true;
		} else { return false;}
	}
	
	public void soigner() {
		hp=niveau*2;
	}
	
	public void attaquer(Pokemon0 p) {
		p.hp-=atk;
	}
	
	public String toString() {
		String msg = " ";
		return msg+="[Pokemon "+nom+" ] : Je m'appelle "+nom+" !";
	}
	
	public void log(String msg) {
		System.out.println(msg);
	}
	
}
