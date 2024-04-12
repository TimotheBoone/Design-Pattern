package DAO;

import metier.E_CategorieSurfaceBien;

public interface DaoCategorieSurface extends Dao<E_CategorieSurfaceBien> {
    public E_CategorieSurfaceBien findLibCategorieSurface(String lib);
    public E_CategorieSurfaceBien find(int id);
}
