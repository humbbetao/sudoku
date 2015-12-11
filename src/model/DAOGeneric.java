/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author hgoncalves
 */
public class DAOGeneric<T> {

    private final EntityManager em = Persistence.createEntityManagerFactory("UP").createEntityManager();

    private final Class clazz;

    public DAOGeneric(Class clazz) {
        this.clazz = clazz;
    }

    public void insert(T entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    public void update(T entity) {
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
    }

    public void remove(int id) {
        T obj = this.get(id);
        if (obj == null) {
            return;
        }
        em.getTransaction().begin();
        em.remove(obj);
        em.getTransaction().commit();
    }

    public T get(int id) {
        return (T) em.find(this.clazz, id);
    }
//
//    public List<T> list() {
//        return em.createQuery("SELECT c FROM " + clazz.getSimpleName() + " c").getResultList();
//    }
//
//    public List<T> listByNome(String nome) {
//        return em.createQuery("SELECT t FROM " + clazz.getSimpleName() + " t WHERE t.nome LIKE '%" + nome + "%' ").getResultList();
//    }

//    public List<T> listByNomeA(String nome, String cpf) {
//        return em.createQuery("SELECT t FROM " + clazz.getSimpleName() + " t WHERE t.nome LIKE '%" + nome + "%' AND t.cpf LIKE '%"
//                + cpf + "%'").getResultList();
//    }
}
