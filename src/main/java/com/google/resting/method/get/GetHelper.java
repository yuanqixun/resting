/*
 * Copyright (C) 2010 Google Code.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.resting.method.get;

import java.util.List;

import org.apache.http.Header;

import com.google.resting.component.EncodingTypes;
import com.google.resting.component.RequestParams;
import com.google.resting.component.ServiceContext;
import com.google.resting.component.impl.ServiceResponse;
import com.google.resting.component.impl.URLContext;
import com.google.resting.serviceaccessor.impl.ServiceAccessor;
/**
 * Helper class for HTTP GET operation
 * 
 * @author sujata.de
 * @since resting 0.2
 *
 */
public class GetHelper {
	public final static ServiceResponse get(String url, int port, RequestParams requestParams, EncodingTypes encoding){
		return get(url,port,requestParams, encoding, null);
	}//get
	
	public final static ServiceResponse get(String url, int port, RequestParams requestParams, EncodingTypes encoding,  List<Header> inputHeaders){
		URLContext urlContext=new URLContext(url,port);
		ServiceContext serviceContext= new GetServiceContext(urlContext,requestParams, encoding, inputHeaders);
		return ServiceAccessor.access(serviceContext);
	}//get
	
}//GetHelper
