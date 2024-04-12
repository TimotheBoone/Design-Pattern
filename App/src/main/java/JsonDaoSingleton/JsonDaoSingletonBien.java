package JsonDaoSingleton;

import DAO.DaoBien;
import metier.E_Bien;

public class JsonDaoSingletonBien extends JsonDaoSingleton<E_Bien> implements DaoBien {

    private static JsonDaoSingletonBien instance;

    private JsonDaoSingletonBien() {
        super();
        this.name = "Bien";
    }

    public static JsonDaoSingletonBien getInstance(){
        if (instance ==null){
            instance = new JsonDaoSingletonBien();
        }
        return instance;
    }
}
