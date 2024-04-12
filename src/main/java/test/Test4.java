package test;

import DAO.*;
import metier.E_Adresse;
import metier.E_Bien;
import metier.E_CategorieSurfaceBien;
import metier.E_TypeBien;

import java.math.BigDecimal;

import static DAO.PersistenceType.JSON;

public class Test4 {
    public static void main(String[] args) {
        DaoFactory jsonFactory = DaoFactory.getDaoFactory(JSON);
        DaoAdresse adresseManager = jsonFactory.getDaoAdresse();
        DaoBien bienManager = jsonFactory.getDaoBien();

        E_Bien chezToi = new E_Bien();
        chezToi.setTypeBien(1);
        chezToi.setCategorieSurfaceBien(1);
        chezToi.setSurfaceHabitable(BigDecimal.valueOf(30));
        System.out.println("Chez toi" + chezToi);
        bienManager.create(chezToi);
    }
}
