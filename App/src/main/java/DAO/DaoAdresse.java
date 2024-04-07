package DAO;

import metier.E_Adresse;
import metier.E_Bien;

import java.util.List;

public interface DaoAdresse extends Dao<E_Adresse> {
    public int nombreBiens(E_Adresse adresse);
    public List<E_Bien> biensACetteAdresse(E_Adresse adresse);
    public E_Adresse find(int id);

}
