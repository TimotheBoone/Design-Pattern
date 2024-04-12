package DAO;

import metier.E_Adresse;
import metier.E_Bien;

import java.util.List;

public interface DaoAdresse extends Dao<E_Adresse> {
    int nombreBiens(E_Adresse adresse);
    List<E_Bien> biensACetteAdresse(E_Adresse adresse);
    E_Adresse find(int id);
}

