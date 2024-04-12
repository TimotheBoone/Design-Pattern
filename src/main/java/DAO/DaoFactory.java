package DAO;

import JpaDaoSingleton.JpaDaoFactory;
import JsonDaoSingleton.JsonDaoFactory;

public abstract class DaoFactory {
    public abstract DaoAdresse getDaoAdresse();
    public abstract DaoTypeBien getDaoTypeBien();
    public abstract DaoCategorieSurface getDaoCategorieSurface();
    public abstract DaoBien getDaoBien();

    public static DaoFactory getDaoFactory(PersistenceType type) {
        switch (type){
            case JPA:
                return new JpaDaoFactory();
            case JSON:
                return new JsonDaoFactory();
            default:
                return null;
        }
    }

}
