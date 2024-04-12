package JsonDaoSingleton;

import DAO.DaoCategorieSurface;
import metier.E_CategorieSurfaceBien;

import java.util.List;

public class JsonDaoSingletonCategorieSurface extends JsonDaoSingleton<E_CategorieSurfaceBien> implements DaoCategorieSurface {

    private static JsonDaoSingletonCategorieSurface instance;

    private JsonDaoSingletonCategorieSurface() {
        super();
        this.name = "E_CategorieSurfaceBien";
    }

    public static JsonDaoSingletonCategorieSurface getInstance(){
        if (instance ==null){
            instance = new JsonDaoSingletonCategorieSurface();
        }
        return instance;
    }

    @Override
    public boolean create(E_CategorieSurfaceBien obj) {
        return super.create(obj);
    }

    @Override
    public E_CategorieSurfaceBien find(int id) {
        return (E_CategorieSurfaceBien) super.find(E_CategorieSurfaceBien.class, id);
    }

    @Override
    public boolean update(E_CategorieSurfaceBien obj) {
        return super.update(obj);
    }

    @Override
    public boolean delete(E_CategorieSurfaceBien obj) {
        return super.delete(obj);
    }

    @Override
    public E_CategorieSurfaceBien findLibCategorieSurface(String lib) {
        List<E_CategorieSurfaceBien> list = super.findAll(E_CategorieSurfaceBien.class);
        for (E_CategorieSurfaceBien categorieSurfaceBien : list) {
            if (categorieSurfaceBien.getLibCategorieSurfaceBien().equals(lib)) {
                return categorieSurfaceBien;
            }
        }
        return null;
    }
}
