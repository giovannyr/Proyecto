/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniminuto.vista.session;

import edu.uniminuto.entities.Recurso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author GIOVANNY
 */
@Stateless
public class RecursoFacade extends AbstractFacade<Recurso> {
    @PersistenceContext(unitName = "Proyecto-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecursoFacade() {
        super(Recurso.class);
    }
    
}
