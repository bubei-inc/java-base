/*
 * Copyright (c) 2018-2019. All rights reserved.
 * 注意：本内容仅限于项目内部传阅，禁止外泄以及用于其他的商业目的
 */

package com.test;

import lombok.Data;

/**
 * @author Ethan Pau
 * @version Version 1.0
 * @title KubeAPIServerDto
 * @date 2019/4/8 21:20
 * @description TODO
 */

@Data
public class KubeAPIServerDto {

	private String address;
	private Authorization authorization;

	@Data
	public class Authorization {

		private String type;
		private String credentials;

		private String clientCertData;
		private String clientCertKeyData;

		public Authorization(){}

		public Authorization(String credentials){
			this.type = "Basic";
			this.credentials = credentials;
		}

		public Authorization(String type, String credentials){
			this.type = type;
			this.credentials = credentials;
		}

		public Authorization(String type, String clientCertData, String clientCertKeyData){
			this.type = type;
			this.clientCertData = clientCertData;
			this.clientCertKeyData = clientCertKeyData;
		}
	}

}


