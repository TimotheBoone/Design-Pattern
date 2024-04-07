package metier;

import jakarta.persistence.*;

@Entity
@Table(name = "ADRESSE", schema = "michka", catalog = "")
public class E_Adresse {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ADRESSE")
    private int idAdresse;
    @Basic
    @Column(name = "type_voie")
    private String typeVoie;
    @Basic
    @Column(name = "nom_voie")
    private String nomVoie;
    @Basic
    @Column(name = "numero_voie")
    private String numeroVoie;
    @Basic
    @Column(name = "code_postal")
    private String codePostal;
    @Basic
    @Column(name = "ville")
    private String ville;

    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }

    public String getTypeVoie() {
        return typeVoie;
    }

    public void setTypeVoie(String typeVoie) {
        this.typeVoie = typeVoie;
    }

    public String getNomVoie() {
        return nomVoie;
    }

    public void setNomVoie(String nomVoie) {
        this.nomVoie = nomVoie;
    }

    public String getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(String numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Adresse eAdresse = (E_Adresse) o;

        if (idAdresse != eAdresse.idAdresse) return false;
        if (typeVoie != null ? !typeVoie.equals(eAdresse.typeVoie) : eAdresse.typeVoie != null) return false;
        if (nomVoie != null ? !nomVoie.equals(eAdresse.nomVoie) : eAdresse.nomVoie != null) return false;
        if (numeroVoie != null ? !numeroVoie.equals(eAdresse.numeroVoie) : eAdresse.numeroVoie != null) return false;
        if (codePostal != null ? !codePostal.equals(eAdresse.codePostal) : eAdresse.codePostal != null) return false;
        if (ville != null ? !ville.equals(eAdresse.ville) : eAdresse.ville != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAdresse;
        result = 31 * result + (typeVoie != null ? typeVoie.hashCode() : 0);
        result = 31 * result + (nomVoie != null ? nomVoie.hashCode() : 0);
        result = 31 * result + (numeroVoie != null ? numeroVoie.hashCode() : 0);
        result = 31 * result + (codePostal != null ? codePostal.hashCode() : 0);
        result = 31 * result + (ville != null ? ville.hashCode() : 0);
        return result;
    }
}
