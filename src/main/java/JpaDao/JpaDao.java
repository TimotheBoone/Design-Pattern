package JpaDao;

import DAO.Dao;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


abstract public class JpaDao<T> implements Dao<T> {
    protected static String name = "Employee";

    private final EntityManager entityManager;
    private final EntityManagerFactory entityManagerFactory;
    private final EntityTransaction entityTransaction;

    protected JpaDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("default");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        this.entityTransaction = this.entityManager.getTransaction();
    }

    @Override
    public boolean create(T obj) {
        try {
            this.entityTransaction.begin();
            this.entityManager.persist(obj);
            this.entityTransaction.commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(T obj) {
        try {
            this.entityTransaction.begin();
            this.entityManager.merge(obj);
            this.entityTransaction.commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(T obj) {
        try {
            this.entityTransaction.begin();
            this.entityManager.detach(obj);
            this.entityTransaction.commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public void close() {
        this.entityManagerFactory.close();
        this.entityManager.close();
    }

    @Override
    public List<T> findAll(Class c) {
        try {
            this.entityTransaction.begin();
            String queryString = "SELECT e FROM " + name + " e";
            TypedQuery query = this.entityManager.createQuery(queryString, c);
            List list = query.getResultList();
            this.entityTransaction.commit();
            return list;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public boolean deleteAll(Class c) {
        try {
            this.entityTransaction.begin();
            String queryString = "DELETE FROM " + name;
            Query query = this.entityManager.createQuery(queryString);
            query.executeUpdate();
            this.entityTransaction.commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public T find(Class c, int id) {
        try {
            this.entityTransaction.begin();
            T obj = (T) this.entityManager.find(c,id);
            this.entityTransaction.commit();
            return obj;
        } catch (Exception e) {
            return null;
        }
    }



}
