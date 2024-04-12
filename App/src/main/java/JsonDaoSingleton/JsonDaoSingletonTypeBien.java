package JsonDaoSingleton;

import DAO.DaoTypeBien;
import metier.E_TypeBien;

import java.util.List;

public class JsonDaoSingletonTypeBien extends JsonDaoSingleton<E_TypeBien> implements DaoTypeBien {

    private static JsonDaoSingletonTypeBien instance;

    private JsonDaoSingletonTypeBien() {
        super();
        this.name = "E_TypeBien";
    }

    public static JsonDaoSingletonTypeBien getInstance(){
        if (instance ==null){
            instance = new JsonDaoSingletonTypeBien();
        }
        return instance;
    }

    @Override
    public boolean create(E_TypeBien obj) {
        return super.create(obj);
    }

    @Override
    public E_TypeBien find(int id) {
        return (E_TypeBien) super.find(E_TypeBien.class, id);
    }

    @Override
    public boolean update(E_TypeBien obj) {
        return super.update(obj);
    }

    @Override
    public boolean delete(E_TypeBien obj) {
        return super.delete(obj);
    }

    @Override
    public E_TypeBien findLibTypeBien(String lib) {
        List<E_TypeBien> list = super.findAll(E_TypeBien.class);

        for (E_TypeBien bien : list) {
            if (bien.getLibTypeBien().equals(lib)) {
                return bien;
            }
        }
        return null;
    }
}
