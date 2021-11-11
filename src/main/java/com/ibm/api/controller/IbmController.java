package com.ibm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.api.excpetion.BusinessException;
import com.ibm.api.models.inner.Request;
import com.ibm.api.models.inner.Response;
import com.ibm.api.service.IbmServiceInterface;

@RestController
@RequestMapping("/api")
public class IbmController implements IIBMController {

    @Autowired
    IbmServiceInterface ibmService;

    @Override
    @PostMapping("/city")
    public ResponseEntity<Response> getContryByIPAdress(@RequestBody Request request) throws BusinessException {

	Response response = ibmService.getContryByIPAdress(request);

	return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
