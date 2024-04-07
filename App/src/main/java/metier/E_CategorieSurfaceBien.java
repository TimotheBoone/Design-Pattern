package metier;

import jakarta.persistence.*;

@Entity
@Table(name = "CATEGORIE_SURFACE_BIEN", schema = "michka", catalog = "")
public class E_CategorieSurfaceBien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_CATEGORIE_SURFACE_BIEN")
    private int idCategorieSurfaceBien;
    @Basic
    @Column(name = "LIB_CATEGORIE_SURFACE_BIEN")
    private String libCategorieSurfaceBien;

    public int getIdCategorieSurfaceBien() {
        return idCategorieSurfaceBien;
    }

    public void setIdCategorieSurfaceBien(int idCategorieSurfaceBien) {
        this.idCategorieSurfaceBien = idCategorieSurfaceBien;
    }

    public String getLibCategorieSurfaceBien() {
        return libCategorieSurfaceBien;
    }

    public void setLibCategorieSurfaceBien(String libCategorieSurfaceBien) {
        this.libCategorieSurfaceBien = libCategorieSurfaceBien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_CategorieSurfaceBien that = (E_CategorieSurfaceBien) o;

        if (idCategorieSurfaceBien != that.idCategorieSurfaceBien) return false;
        if (libCategorieSurfaceBien != null ? !libCategorieSurfaceBien.equals(that.libCategorieSurfaceBien) : that.libCategorieSurfaceBien != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategorieSurfaceBien;
        result = 31 * result + (libCategorieSurfaceBien != null ? libCategorieSurfaceBien.hashCode() : 0);
        return result;
    }
}
