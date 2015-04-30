package net.kst_d.labs.kr;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path ("/three")
@Stateless
public class ThreeRest {

    @EJB
    private TwoEjb ejb;

    @Path ("/")
    @GET
    public String get() {
	if (ejb != null) {
	    return ejb.method();
	} else {
	    return "No EJB Found";
	}

    }


}
