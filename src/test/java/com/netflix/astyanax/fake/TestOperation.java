/*******************************************************************************
 * Copyright 2011 Netflix
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.netflix.astyanax.fake;

import java.math.BigInteger;

import com.netflix.astyanax.connectionpool.Host;
import com.netflix.astyanax.connectionpool.Operation;
import com.netflix.astyanax.connectionpool.exceptions.ConnectionException;
import com.netflix.astyanax.connectionpool.exceptions.OperationException;

public class TestOperation implements Operation<TestClient, String> {
	@Override
	public String execute(TestClient client)
			throws ConnectionException, OperationException {
		return "RESULT";
	}

	@Override
	public BigInteger getToken() {
		return null;
	}

	@Override
	public String getKeyspace() {
		return null;
	}

	@Override
	public Host getPinnedHost() {
		return null;
	}
}
