/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.garParameters.ws;

import co.com.claro.garParameters.entity.ParameterGar;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import co.com.claro.garParameters.facade.ParameterGarFacade;
import co.com.claro.garParameters.model.GenericResponse;
import co.com.claro.garParameters.model.ParameterResponse;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import java.util.List;

/**
 *
 * @author vargascarr
 */
@Path("garParameters")
@Stateless
@TransactionManagement
public class GarParametersService {

    @EJB
    private ParameterGarFacade ParameterGarFacade;

    public GarParametersService() {
    }

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("queryParametersGar")
    public ParameterResponse queryParametersGar() {
        ParameterResponse response = new ParameterResponse();
        try {
            GenericResponse responseG = new GenericResponse(true, "Transacción completa.");
            List<ParameterGar> listado = ParameterGarFacade.findAll();
            response.setParameters(listado);
            response.setResponse(responseG);
        } catch (Exception e) {
            GenericResponse responseG = new GenericResponse(false, "Error inesperado en la consulta: " + e);
            response.setResponse(responseG);
        }
        return response;
    }

}
