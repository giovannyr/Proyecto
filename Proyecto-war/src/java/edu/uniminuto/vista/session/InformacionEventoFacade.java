/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniminuto.vista.session;

import edu.uniminuto.entities.InformacionEvento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author GIOVANNY
 */
@Stateless
public class InformacionEventoFacade extends AbstractFacade<InformacionEvento> {
    @PersistenceContext(unitName = "Proyecto-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InformacionEventoFacade() {
        super(InformacionEvento.class);
    }
    
}
