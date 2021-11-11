package com.ibm.api.service;

import com.ibm.api.excpetion.BusinessException;
import com.ibm.api.models.inner.Request;
import com.ibm.api.models.inner.Response;

public interface IbmServiceInterface {

    Response getContryByIPAdress(Request request) throws BusinessException;

}
