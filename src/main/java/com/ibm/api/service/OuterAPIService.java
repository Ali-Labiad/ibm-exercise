package com.ibm.api.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.api.excpetion.BusinessException;
import com.ibm.api.models.inner.Request;
import com.ibm.api.models.outer.OuterResponse;

@Service
public class OuterAPIService implements OuterAPI {

    @Value("${outer.api.url}")
    private String outerUrl;

    @Value("${outer.api.args}")
    private String outerArgs;

    @Override
    public OuterResponse getOuterResponse(Request request) throws BusinessException {

	try {

	    StringBuilder stringBuilder = new StringBuilder();
	    stringBuilder.append(outerUrl);
	    stringBuilder.append(request.getIpAdress());
	    stringBuilder.append(outerArgs);

	    URL url = new URL(stringBuilder.toString());

	    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    conn.setRequestMethod("GET");
	    conn.connect();

	    // Getting the response code
	    int responsecode = conn.getResponseCode();

	    System.out.print("response : " + responsecode);

	    if (responsecode != 200) {
		throw new BusinessException("external Server Error.");
	    } else {

		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
		    content.append(inputLine);
		}
		in.close();
		ObjectMapper objectMapper = new ObjectMapper();
		OuterResponse response = objectMapper.readValue(content.toString(), OuterResponse.class);

		return response;

	    }

	} catch (Exception e) {
	    throw new BusinessException("external Server Error.");
	}

    }

}
