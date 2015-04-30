package net.kst_d.labs.kr

import javax.ejb.EJB
import javax.ejb.Stateless
import javax.ws.rs.GET
import javax.ws.rs.Path


Path("/two")
Stateless
open class FlowTwoRest {

    EJB
    private val ejb: TwoEjb? = null


    Path("/")
    GET
    public fun method(): String {
        return ejb!!.method();
    }

}