package DAO;

import java.util.List;

public interface Dao<T> {
    boolean create(T obj) ;
    T find(Class c, int id) ;
    List<T> findAll(Class c);
    boolean update(T obj) ;
    boolean delete(T obj) ;
    boolean deleteAll(Class c) ;
    void close(); // Ferme la connexion au stockage de données
}


