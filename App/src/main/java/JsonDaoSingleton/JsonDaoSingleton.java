package JsonDaoSingleton;

import DAO.Dao;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

abstract public class JsonDaoSingleton<T> implements Dao<T> {
    protected static String name = "Employee";

    private final MongoClient mongoClient;

    private final MongoDatabase database;

    private final MongoCollection<T> collection;

    protected JsonDaoSingleton() {
//        this.entityManagerFactory = Persistence.createEntityManagerFactory("default");
//        this.entityManager = this.entityManagerFactory.createEntityManager();
//        this.entityTransaction = this.entityManager.getTransaction();
        this.mongoClient = new MongoClient( "localhost" , 27017 );
        this.database = mongoClient.getDatabase("michka");
        this.collection = (MongoCollection<T>) database.getCollection(name);
    }


    @Override
    public boolean create(T obj) {
        try {
            collection.insertOne(obj);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(T obj) {
        try {
            //collection.updateOne(eq:"id")
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(T obj) {
        try {

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public void close() {

    }

    @Override
    public List<T> findAll(Class c) {
        try {

        } catch (Exception e) {
            return new ArrayList<>();
        }
        return null;
    }

    @Override
    public boolean deleteAll(Class c) {
        try {

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public T find(Class c, int id) {
        try {
            return null;
        } catch (Exception e) {
            return null;
        }
    }

}
