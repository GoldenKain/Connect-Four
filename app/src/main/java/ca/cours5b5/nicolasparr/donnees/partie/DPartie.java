package ca.cours5b5.nicolasparr.donnees.partie;

import ca.cours5b5.nicolasparr.donnees.Donnees;
import ca.cours5b5.nicolasparr.enumerations.ECouleur;
import ca.cours5b5.nicolasparr.enumerations.ETailleGrille;
import ca.cours5b5.nicolasparr.global.GConstantes;
import ca.cours5b5.nicolasparr.global.GLog;

public abstract class DPartie extends Donnees {

    private ETailleGrille tailleGrille = GConstantes.tailleDefaut;
    private DGrille grille = new DGrille(this.tailleGrille.getLargeur(), this.tailleGrille.getHauteur());
    private ECouleur prochaineCouleur = ECouleur.ROUGE;

    public ETailleGrille getTailleGrille() {
        return tailleGrille;
    }

    public DGrille getGrille() {
        GLog.valeurs(this.grille);
        return grille;
    }

    public ECouleur getCouleur() {
        GLog.valeurs(this.prochaineCouleur);
        return prochaineCouleur;
    }

    public void prochaineCouleur() {
        GLog.appel(this);
        if (this.prochaineCouleur == ECouleur.ROUGE) {
            this.prochaineCouleur = ECouleur.BLEU;
        } else {
            this.prochaineCouleur = ECouleur.ROUGE;
        }
    }

    public void setTailleGrille(ETailleGrille tailleGrille) {
        this.tailleGrille = tailleGrille;
        GLog.valeurs(tailleGrille);
    }

    public void setGrille(DGrille grille) {
        this.grille = grille;
        GLog.valeurs(grille);
    }

    public void setProchaineCouleur(ECouleur prochaineCouleur) {
        this.prochaineCouleur = prochaineCouleur;
        GLog.valeurs(prochaineCouleur);
    }
}
