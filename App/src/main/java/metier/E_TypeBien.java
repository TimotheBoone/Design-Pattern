package metier;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TYPE_BIEN", schema = "michka", catalog = "")
public class E_TypeBien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TYPE_BIEN")
    private int idTypeBien;
    @Basic
    @Column(name = "LIB_TYPE_BIEN")
    private String libTypeBien;

    public int getIdTypeBien() {
        return idTypeBien;
    }

    public void setIdTypeBien(int idTypeBien) {
        this.idTypeBien = idTypeBien;
    }

    public String getLibTypeBien() {
        return libTypeBien;
    }

    public void setLibTypeBien(String libTypeBien) {
        this.libTypeBien = libTypeBien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_TypeBien eTypeBien = (E_TypeBien) o;

        if (idTypeBien != eTypeBien.idTypeBien) return false;
        if (!Objects.equals(libTypeBien, eTypeBien.libTypeBien))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTypeBien;
        result = 31 * result + (libTypeBien != null ? libTypeBien.hashCode() : 0);
        return result;
    }
}
