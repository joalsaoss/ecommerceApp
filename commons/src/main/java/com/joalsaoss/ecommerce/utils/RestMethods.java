/**
 * 
 */
package com.joalsaoss.ecommerce.utils;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jose Alvaro
 *
 */
@Component
public class RestMethods<T> {
	private HttpStatus status;
	private String server;
	private RestTemplate rest;
	private HttpHeaders headers;
	
	public RestMethods() {
		rest = new RestTemplate();
		headers = new HttpHeaders();
		headers.add(EcommConstants.HEADER_CONTENT_TYPE, EcommConstants.HEADER_APP_JSON);
		headers.add(EcommConstants.HEADER_ACCEPT, "*/*");
	}
	
	public T post(String dto, ParameterizedTypeReference<T> c, String uri, char type) {
		server = chooseServer(type);
		HttpEntity<String> requestEntity = new HttpEntity<>(dto, headers);
		ResponseEntity<T> responseEntity = rest.exchange(server + uri, HttpMethod.POST, requestEntity, c);
		setStatus(responseEntity.getStatusCode());
		return (T) responseEntity.getBody();
	}
	
	public T get(String uri, ParameterizedTypeReference<T> c, char type) {
		server = chooseServer(type);
		HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
		ResponseEntity<T> responseEntity = rest.exchange(server + uri, HttpMethod.GET, requestEntity, c);
		this.setStatus(responseEntity.getStatusCode());
		return (T) responseEntity.getBody();
	}
	
	public void put(T dto, Class<T> c, String uri, char type) {
		server = chooseServer(type);
		HttpEntity<T> requestEntity = new HttpEntity<>(dto, headers);
		ResponseEntity<T> responseEntity = rest.exchange(server + uri, HttpMethod.PUT, requestEntity, c);
		setStatus(responseEntity.getStatusCode());
		this.setStatus(responseEntity.getStatusCode());

	}
	
	public String chooseServer(char type) {
		if (type == 'C') {
			return server = EcommConstants.SERVICIO_WEB;
		} else {
			return server = EcommConstants.URL;
		}
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
}
