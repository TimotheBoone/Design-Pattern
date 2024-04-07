package test;

import DAO.DaoAdresse;
import DAO.DaoBien;
import DAO.DaoCategorieSurface;
import DAO.DaoTypeBien;
import JpaDao.JpaDaoAdresse;
import JpaDao.JpaDaoBien;
import JpaDao.JpaDaoCategorieSurface;
import JpaDao.JpaDaoTypeBien;
import metier.E_Adresse;
import metier.E_Bien;
import metier.E_CategorieSurfaceBien;
import metier.E_TypeBien;

import java.math.BigDecimal;

public class Test1 {
    public static void main(String[] args) {
        DaoAdresse adresseManager = new JpaDaoAdresse();
        E_Adresse chezMoi = adresseManager.find(5);
        if (chezMoi != null)
            System.out.println("Chez moi : "+chezMoi.toString()+" il y a "+adresseManager.nombreBiens(chezMoi));
        else
            System.out.println("Flute, adresse non trouvée !");

        // recherche des biens à cette adresse
        System.out.println("les biens de l'adresse N°1 : "+adresseManager.biensACetteAdresse(adresseManager.find(1)).toString());
        System.out.println("les biens de l'adresse N°5 : "+adresseManager.biensACetteAdresse(adresseManager.find(5)).toString());

        // Création d'un nouveau Bien
        DaoTypeBien typeBienManager = new JpaDaoTypeBien();
        E_TypeBien appartement = typeBienManager.find(1);

        DaoCategorieSurface categorieSurfaceManager = new JpaDaoCategorieSurface();
        E_CategorieSurfaceBien studio = categorieSurfaceManager.findLibCategorieSurface("STUDIO");

        E_Bien chezToi = new E_Bien();
        chezToi.setTypeBien(1);
        chezToi.setAdresse(chezMoi);
        chezToi.setCategorieSurfaceBien(1);
        chezToi.setSurfaceHabitable(BigDecimal.valueOf(30));

        DaoBien BienManager = new JpaDaoBien();
        BienManager.create(chezToi);
        System.out.println(chezToi);


    }

}
