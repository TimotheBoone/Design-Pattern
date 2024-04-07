package metier;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "BIEN", schema = "michka", catalog = "")
public class E_Bien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_BIEN")
    private int idBien;
    @Basic
    @Column(name = "type_bien")
    private Integer typeBien;
    @Basic
    @Column(name = "categorie_surface_bien")
    private Integer categorieSurfaceBien;
    @Basic
    @Column(name = "surface_habitable")
    private BigDecimal surfaceHabitable;
    @Basic
    @Column(name = "nbr_pieces")
    private Integer nbrPieces;
    @Basic
    @Column(name = "description libre")
    private String descriptionLibre;
    @Basic
    @Column(name = "Commentaire_agence")
    private String commentaireAgence;
    @Basic
    @Column(name = "date_creation")
    private Date dateCreation;
    @Basic
    @Column(name = "date_derniere_maj")
    private Date dateDerniereMaj;
    @ManyToOne
    @JoinColumn(name = "ID_ADRESSE")
    private E_Adresse adresse;
    @Basic
    @Column(name = "NO_APPARTEMENT")
    private String noAppartement;
    @Basic
    @Column(name = "ETAGE")
    private Integer etage;

    public int getIdBien() {
        return idBien;
    }

    public void setIdBien(int idBien) {
        this.idBien = idBien;
    }

    public Integer getTypeBien() {
        return typeBien;
    }

    public void setTypeBien(Integer typeBien) {
        this.typeBien = typeBien;
    }

    public Integer getCategorieSurfaceBien() {
        return categorieSurfaceBien;
    }

    public void setCategorieSurfaceBien(Integer categorieSurfaceBien) {
        this.categorieSurfaceBien = categorieSurfaceBien;
    }

    public BigDecimal getSurfaceHabitable() {
        return surfaceHabitable;
    }

    public void setSurfaceHabitable(BigDecimal surfaceHabitable) {
        this.surfaceHabitable = surfaceHabitable;
    }

    public Integer getNbrPieces() {
        return nbrPieces;
    }

    public void setNbrPieces(Integer nbrPieces) {
        this.nbrPieces = nbrPieces;
    }

    public String getDescriptionLibre() {
        return descriptionLibre;
    }

    public void setDescriptionLibre(String descriptionLibre) {
        this.descriptionLibre = descriptionLibre;
    }

    public String getCommentaireAgence() {
        return commentaireAgence;
    }

    public void setCommentaireAgence(String commentaireAgence) {
        this.commentaireAgence = commentaireAgence;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateDerniereMaj() {
        return dateDerniereMaj;
    }

    public void setDateDerniereMaj(Date dateDerniereMaj) {
        this.dateDerniereMaj = dateDerniereMaj;
    }

    public E_Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(E_Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNoAppartement() {
        return noAppartement;
    }

    public void setNoAppartement(String noAppartement) {
        this.noAppartement = noAppartement;
    }

    public Integer getEtage() {
        return etage;
    }

    public void setEtage(Integer etage) {
        this.etage = etage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_Bien eBien = (E_Bien) o;
        return idBien == eBien.idBien && Objects.equals(typeBien, eBien.typeBien) && Objects.equals(categorieSurfaceBien, eBien.categorieSurfaceBien) && Objects.equals(surfaceHabitable, eBien.surfaceHabitable) && Objects.equals(nbrPieces, eBien.nbrPieces) && Objects.equals(descriptionLibre, eBien.descriptionLibre) && Objects.equals(commentaireAgence, eBien.commentaireAgence) && Objects.equals(dateCreation, eBien.dateCreation) && Objects.equals(dateDerniereMaj, eBien.dateDerniereMaj) && Objects.equals(adresse, eBien.adresse) && Objects.equals(noAppartement, eBien.noAppartement) && Objects.equals(etage, eBien.etage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBien, typeBien, categorieSurfaceBien, surfaceHabitable, nbrPieces, descriptionLibre, commentaireAgence, dateCreation, dateDerniereMaj, adresse, noAppartement, etage);
    }
}
