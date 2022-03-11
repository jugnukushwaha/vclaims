package com.app.vclaims.controller;

import static org.junit.Assert.assertTrue;


import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.vclaims.VclaimsApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = VclaimsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class ClaimControllerTest {

	@LocalServerPort
	private int port;

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();

	@Test
	public void testGetClaimsOfUser() throws JSONException {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(createURLWithPort("/vclaims/claim/121"), HttpMethod.GET,
				entity, String.class);

		String expected = "C_121314";
		System.out.println(response.getBody());
		System.out.println("above is response");

		assertTrue(response.getBody().contains(expected));

	}

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}

}
