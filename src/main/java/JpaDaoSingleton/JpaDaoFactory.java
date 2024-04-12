package JpaDaoSingleton;

import DAO.*;

public class JpaDaoFactory extends DaoFactory {

    @Override
    public DaoAdresse getDaoAdresse() {
        return JpaDaoSingletonAdresse.getInstance();
    }

    @Override
    public DaoTypeBien getDaoTypeBien() {
        return JpaDaoSingletonTypeBien.getInstance();
    }

    @Override
    public DaoCategorieSurface getDaoCategorieSurface() {
        return JpaDaoSingletonCategorieSurface.getInstance();
    }

    @Override
    public DaoBien getDaoBien() {
        return JpaDaoSingletonBien.getInstance();
    }
}
