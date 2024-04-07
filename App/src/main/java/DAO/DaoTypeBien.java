package DAO;

import metier.E_TypeBien;

public interface DaoTypeBien extends Dao<E_TypeBien> {
    public E_TypeBien findLibTypeBien(String lib);
    public E_TypeBien find(int id);
}
