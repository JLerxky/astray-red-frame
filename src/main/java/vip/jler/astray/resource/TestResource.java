package vip.jler.astray.resource;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

/**
 * @author JLer
 */
@Path("/test")
public class TestResource {

  @GET
  @Path("/public")
  @PermitAll
  @Produces(MediaType.TEXT_PLAIN)
  public String publicResource() {
    return "public";
  }

  @GET
  @Path("/admin")
  @RolesAllowed("admin")
  @Produces(MediaType.TEXT_PLAIN)
  public String adminResource() {
    return "admin";
  }

  @GET
  @Path("/me")
  @RolesAllowed("public")
  @Produces(MediaType.APPLICATION_JSON)
  public Object me(@Context SecurityContext securityContext) {
    return securityContext;
  }
}
