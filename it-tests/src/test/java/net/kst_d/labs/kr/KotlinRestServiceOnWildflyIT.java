package net.kst_d.labs.kr;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KotlinRestServiceOnWildflyIT {
    @Test
    public void one() throws Exception {
	request("http://localhost:8080/kr-test/rs/one", "flow one ejb here!");
    }

    @Test
    public void three() throws Exception {
	request("http://localhost:8080/kr-test/rs/three", "flow two ejb here!");
    }

    @Test
    public void two() throws Exception {
	request("http://localhost:8080/kr-test/rs/two", "flow two ejb here!");
    }

    private void request(String url, String pattern) throws Exception {

	HttpGet get = new HttpGet(url);
	try (CloseableHttpClient client = HttpClients.createMinimal();
	     CloseableHttpResponse response = client.execute(get);
	) {
	    final InputStream is = response.getEntity().getContent();
	    final String ret = IOUtils.toString(is);

	    Assert.assertNotNull(ret);
	    Assert.assertEquals(ret, pattern);
	}

    }

}
