package net.kst_d.labs.kr;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/one")
@Stateless
public class OneRest {


//    @EJB
    private FlowOneEjb ejb = null;

    @Path("/")
    @GET
    public String get() {
	if (ejb != null) {
	    return ejb.method();
	}else {
	    return "No EJB Found";
	}

    }

}
