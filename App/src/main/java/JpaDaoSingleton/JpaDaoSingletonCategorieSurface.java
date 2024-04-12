package JpaDaoSingleton;

import DAO.DaoCategorieSurface;
import metier.E_CategorieSurfaceBien;

import java.util.List;

public class JpaDaoSingletonCategorieSurface extends JpaDaoSingleton<E_CategorieSurfaceBien> implements DaoCategorieSurface {

    private static JpaDaoSingletonCategorieSurface instance;

    private JpaDaoSingletonCategorieSurface() {
        super();
        name = "E_CategorieSurfaceBien";
    }

    public static JpaDaoSingletonCategorieSurface getInstance(){
        if (instance ==null){
            instance = new JpaDaoSingletonCategorieSurface();
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
