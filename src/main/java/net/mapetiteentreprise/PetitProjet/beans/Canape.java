package net.mapetiteentreprise.PetitProjet.beans;

public class Canape {

    private int ID;
    private int nombrePlaces;
    private String couleur;
    private String motif;

    @Override
    public String toString() {
        return "Canape{" +
                "ID=" + ID +
                ", nombrePlaces=" + nombrePlaces +
                ", couleur='" + couleur + '\'' +
                ", motif='" + motif + '\'' +
                '}';
    }

    public Canape(int nombrePlaces, String couleur, String motif) {
        this.nombrePlaces = nombrePlaces;
        this.couleur = couleur;
        this.motif = motif;
    }

    public Canape() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
}
