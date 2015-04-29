package net.kst_d.labs.kr

import javax.ws.rs.GET
import javax.ws.rs.Path


Path("/two")
public class FlowTwoRest {

    private val ejb: TwoEjb? = null


    Path("/")
    GET
    public fun method(): String {
        return  ejb!!.method()
    }

}