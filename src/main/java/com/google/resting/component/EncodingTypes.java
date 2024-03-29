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
package com.google.resting.component;
/**
 * Types of encoding supported. The standard charset and binary are included here.
 * 
 * @author sujata.de
 * @since resting 0.3
 *
 */
public enum EncodingTypes {
	
	UTF8("UTF-8"),
	UTF16("UTF-16"),
	USASCII("US-ASCII"),
	ISO88591("ISO-8859-1"),
	UTF16BE("UTF-16BE"),
	UTF16LE("UTF-16LE"),
	BINARY("BINARY"); //Binary. May or may not include printable chars
	
	
	private String name;
	
	private EncodingTypes (String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}

}
