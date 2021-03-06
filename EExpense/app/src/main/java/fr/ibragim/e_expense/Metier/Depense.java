package fr.ibragim.e_expense.Metier;

/**
 * Created by ibragim.abubakarov on 03/04/2018.
 */

public abstract class Depense {
    private int id;
    private String dateDepense;
    private double MontantRemboursement;
    private String etatValidation;
    private String dateValidation;
    private double montantDepense;
    private int codeFrais;
    private int idUtilisateur;


    public Depense(int id, String datePaiement, double montantRemboursement, String etatValidation, String dateValidation, double montantDepense,int codeF, int idU) {
        this.id = id;
        this.dateDepense = datePaiement;
        MontantRemboursement = montantRemboursement;
        this.etatValidation = etatValidation;
        this.dateValidation = dateValidation;
        this.montantDepense = montantDepense;
        this.codeFrais = codeF;
        this.idUtilisateur = idU;
    }


    public Depense(String datePaiement, double montantRemboursement, String etatValidation, String dateValidation, double montantDepense,int codeF, int idU) {
        this.dateDepense = datePaiement;
        MontantRemboursement = montantRemboursement;
        this.etatValidation = etatValidation;
        this.dateValidation = dateValidation;
        this.montantDepense = montantDepense;
        this.codeFrais = codeF;
        this.idUtilisateur = idU;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateDepense() {
        return dateDepense;
    }

    public void setDateDepense(String dateDepense) {
        this.dateDepense = dateDepense;
    }

    public double getMontantRemboursement() {
        return MontantRemboursement;
    }

    public void setMontantRemboursement(double montantRemboursement) {
        MontantRemboursement = montantRemboursement;
    }

    public String getEtatValidation() {
        return etatValidation;
    }

    public void setEtatValidation(String etatValidation) {
        this.etatValidation = etatValidation;
    }

    public String getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(String dateValidation) {
        this.dateValidation = dateValidation;
    }

    public double getMontantDepense() {
        return montantDepense;
    }

    public void setMontantDepense(double montantDepense) {
        this.montantDepense = montantDepense;
    }

    public int getCodeFrais() {
        return codeFrais;
    }

    public void setCodeFrais(int codeFrais) {
        this.codeFrais = codeFrais;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}
