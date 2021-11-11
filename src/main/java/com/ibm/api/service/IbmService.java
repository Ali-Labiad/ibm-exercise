package com.ibm.api.service;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.api.excpetion.BusinessException;
import com.ibm.api.models.inner.Request;
import com.ibm.api.models.inner.Response;
import com.ibm.api.models.outer.OuterResponse;

@Service
public class IbmService implements IbmServiceInterface {

    @Autowired
    OuterAPI outerAPI;

    @Override
    public Response getContryByIPAdress(Request request) throws BusinessException {

	OuterResponse outerResponse = outerAPI.getOuterResponse(request);

	if (StringUtils.isEmpty(request.getIpAdress()) || StringUtils.isEmpty(request.getPassword())
		|| StringUtils.isEmpty(request.getUserName()))
	    throw new BusinessException("Internal Server Error.");

	if (outerResponse.getStatus().equals("fail"))
	    throw new BusinessException("internal Server Error.");

	if (!outerResponse.getCountryCode().equalsIgnoreCase("CA"))
	    throw new BusinessException("address not in canada");

	UUID uuid = UUID.randomUUID();
	Response response = new Response();

	response.setCity(outerResponse.getCity());
	response.setUuid(uuid.toString());

	return response;

    }

}
