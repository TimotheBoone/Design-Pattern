package JsonDaoSingleton;

import DAO.*;

public class JsonDaoFactory extends DaoFactory {

    @Override
    public DaoAdresse getDaoAdresse() {
        return JsonDaoSingletonAdresse.getInstance();
    }

    @Override
    public DaoTypeBien getDaoTypeBien() {
        return JsonDaoSingletonTypeBien.getInstance();
    }

    @Override
    public DaoCategorieSurface getDaoCategorieSurface() {
        return JsonDaoSingletonCategorieSurface.getInstance();
    }

    @Override
    public DaoBien getDaoBien() {
        return JsonDaoSingletonBien.getInstance();
    }
}
