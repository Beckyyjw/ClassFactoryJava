/**
 * La classe {@code DateduJour} représente une date avec le jour, le mois et l'année.
 * Elle permet de manipuler des dates sous forme d'entiers pour le jour, le mois et l'année.
 */
public class DateduJour {

    /**
     * Le jour du mois.
     */
    private int jour;

    /**
     * Le mois de l'année.
     */
    private int mois;

    /**
     * L'année de la date.
     */
    private int annee;

    /**
     * Constructeur par défaut de la classe {@code DateduJour}.
     * Initialise une date avec des valeurs par défaut (0 pour jour, mois et année).
     */
    public DateduJour(){}

    /**
     * Constructeur de la classe {@code DateduJour} avec des valeurs spécifiées pour le jour, le mois et l'année.
     *
     * @param jour Le jour du mois.
     * @param mois Le mois de l'année.
     * @param annee L'année.
     */
    public DateduJour(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    /**
     * Modifie la valeur du jour.
     *
     * @param jour Le nouveau jour.
     */
    public void setJour(int jour) {
        this.jour = jour;
    }

    /**
     * Modifie la valeur du mois.
     *
     * @param mois Le nouveau mois.
     */
    public void setMois(int mois) {
        this.mois = mois;
    }

    /**
     * Modifie la valeur de l'année.
     *
     * @param annee La nouvelle année.
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    /**
     * Récupère la valeur du jour.
     *
     * @return Le jour du mois.
     */
    public int getJour(){
        return jour;
    }

    /**
     * Récupère la valeur de l'année.
     *
     * @return L'année de la date.
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * Récupère la valeur du mois.
     *
     * @return Le mois de l'année.
     */
    public int getMois() {
        return mois;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la date dans le format "jour/mois/année".
     *
     * @return La date sous forme de chaîne "jour/mois/année".
     */
    @Override
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }

    /**
     * Compare cette date avec un autre objet pour vérifier si elles sont égales.
     * Deux dates sont considérées égales si elles ont le même jour, mois et année.
     *
     * @param o L'objet à comparer avec la date actuelle.
     * @return {@code true} si les deux dates sont égales, {@code false} sinon.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DateduJour)) return false; // Vérifie si l'objet n'est pas null et est une instance de DateduJour

        DateduJour date = (DateduJour) o;
        return this.jour == date.jour &&
                this.mois == date.mois &&
                this.annee == date.annee;
    }
}