package JpaDao;

import DAO.DaoBien;
import metier.E_Bien;

public class JpaDaoBien extends JpaDao<E_Bien> implements DaoBien {
    public JpaDaoBien() {
        super();
        name = "E_Bien";
    }
}
