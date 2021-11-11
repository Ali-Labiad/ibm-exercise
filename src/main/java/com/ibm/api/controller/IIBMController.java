package com.ibm.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibm.api.excpetion.BusinessException;
import com.ibm.api.models.inner.Request;
import com.ibm.api.models.inner.Response;

public interface IIBMController {

    ResponseEntity<Response> getContryByIPAdress(@RequestBody Request request) throws BusinessException;

}
