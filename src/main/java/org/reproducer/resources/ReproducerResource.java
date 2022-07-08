package org.reproducer.resources;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path( "/" )
@Transactional
public class ReproducerResource {

    private EntityManager em;

    public ReproducerResource() {
        // deliberately empty
    }

    @Inject
    public ReproducerResource(EntityManager em) {
        this.em = em;
    }

    @GET
    @Path( "test" )
    @Produces( MediaType.TEXT_PLAIN )
    public Response test() {
        Query q = em.createNativeQuery( "SELECT 1 from dual" );
        Object object = q.getSingleResult();
        System.out.println( object );
        return Response.ok()
                       .entity( "test" )
                       .build();
    }

}
