package com.ibm.api.service;

import com.ibm.api.excpetion.BusinessException;
import com.ibm.api.models.inner.Request;
import com.ibm.api.models.outer.OuterResponse;

public interface OuterAPI {

    OuterResponse getOuterResponse(Request request) throws BusinessException;

}
