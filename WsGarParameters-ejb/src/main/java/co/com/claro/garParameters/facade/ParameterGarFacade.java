/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.garParameters.facade;

import co.com.claro.garParameters.entity.ParameterGar;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vargascarr
 */
@Stateless
public class ParameterGarFacade extends AbstractFacade<ParameterGar> {

    @PersistenceContext(unitName = "QueryParameters")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParameterGarFacade() {
        super(ParameterGar.class);
    }

    public List<ParameterGar> listado() {
        List<ParameterGar> list = (List<ParameterGar>) em.createQuery("SELECT p FROM ParameterGar p").getResultList();
        return list;
    }

}
