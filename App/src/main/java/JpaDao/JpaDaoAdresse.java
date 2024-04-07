package JpaDao;

import DAO.DaoAdresse;
import metier.E_Adresse;
import metier.E_Bien;

import java.util.ArrayList;
import java.util.List;

public class JpaDaoAdresse extends JpaDao<E_Adresse> implements DaoAdresse {
    private JpaDaoBien jpaDaoBienService;

    public JpaDaoAdresse() {
        super();
        this.jpaDaoBienService = new JpaDaoBien();
    }

    @Override
    public boolean create(E_Adresse obj) {
        return super.create(obj);
    }

    @Override
    public E_Adresse find(int id) {
        return (E_Adresse) super.find(E_Adresse.class, id);
    }

    @Override
    public boolean update(E_Adresse obj) {
        return super.update(obj);
    }

    @Override
    public boolean delete(E_Adresse obj) {
        return super.delete(obj);
    }

    @Override
    public int nombreBiens(E_Adresse adresse) {
        List<E_Bien> list = this.jpaDaoBienService.findAll(E_Bien.class);
        int i = 0;
        for (E_Bien bien : list) {
            if (bien.getAdresse().equals(adresse)) {
                i++;
            }
        }
        return i;
    }

    @Override
    public List<E_Bien> biensACetteAdresse(E_Adresse adresse) {
        List<E_Bien> list = this.jpaDaoBienService.findAll(E_Bien.class);
        List<E_Bien> newList = new ArrayList<>();
        for (E_Bien bien : list) {
            if (bien.getAdresse().equals(adresse)) {
                newList.add(bien);
            }
        }
        return newList;
    }
}

