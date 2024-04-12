package JpaDaoSingleton;

import DAO.DaoBien;
import metier.E_Bien;

public class JpaDaoSingletonBien extends JpaDaoSingleton<E_Bien> implements DaoBien {

    private static JpaDaoSingletonBien instance;

    private JpaDaoSingletonBien() {
        super();
        this.name = "E_Bien";
    }

    public static JpaDaoSingletonBien getInstance(){
        if (instance ==null){
            instance = new JpaDaoSingletonBien();
        }
        return instance;
    }
}
