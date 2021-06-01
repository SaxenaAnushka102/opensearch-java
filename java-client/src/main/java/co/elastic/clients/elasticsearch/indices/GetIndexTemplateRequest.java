/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: indices.get_index_template.Request
public final class GetIndexTemplateRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String name;

	@Nullable
	private final Boolean local;

	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Boolean includeTypeName;

	@Nullable
	private final JsonValue masterTimeout;

	// ---------------------------------------------------------------------------------------------

	protected GetIndexTemplateRequest(Builder builder) {

		this.name = builder.name;
		this.local = builder.local;
		this.flatSettings = builder.flatSettings;
		this.includeTypeName = builder.includeTypeName;
		this.masterTimeout = builder.masterTimeout;

	}

	/**
	 * Comma-separated list of index template names used to limit the request.
	 * Wildcard (*) expressions are supported.
	 *
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * If true, the request retrieves information from the local node only. Defaults
	 * to false, which means information is retrieved from the master node.
	 *
	 * API name: {@code local}
	 */
	@Nullable
	public Boolean local() {
		return this.local;
	}

	/**
	 * If true, returns settings in flat format.
	 *
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public Boolean flatSettings() {
		return this.flatSettings;
	}

	/**
	 * If true, a mapping type is expected in the body of mappings.
	 *
	 * API name: {@code include_type_name}
	 */
	@Nullable
	public Boolean includeTypeName() {
		return this.includeTypeName;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 *
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.flatSettings != null) {

			generator.writeKey("flat_settings");
			generator.write(this.flatSettings);

		}
		if (this.includeTypeName != null) {

			generator.writeKey("include_type_name");
			generator.write(this.includeTypeName);

		}
		if (this.masterTimeout != null) {

			generator.writeKey("master_timeout");
			generator.write(this.masterTimeout);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetIndexTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetIndexTemplateRequest> {
		@Nullable
		private String name;

		@Nullable
		private Boolean local;

		@Nullable
		private Boolean flatSettings;

		@Nullable
		private Boolean includeTypeName;

		@Nullable
		private JsonValue masterTimeout;

		/**
		 * Comma-separated list of index template names used to limit the request.
		 * Wildcard (*) expressions are supported.
		 *
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * If true, the request retrieves information from the local node only. Defaults
		 * to false, which means information is retrieved from the master node.
		 *
		 * API name: {@code local}
		 */
		public Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * If true, returns settings in flat format.
		 *
		 * API name: {@code flat_settings}
		 */
		public Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
			return this;
		}

		/**
		 * If true, a mapping type is expected in the body of mappings.
		 *
		 * API name: {@code include_type_name}
		 */
		public Builder includeTypeName(@Nullable Boolean value) {
			this.includeTypeName = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 *
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link GetIndexTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetIndexTemplateRequest build() {

			return new GetIndexTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for GetIndexTemplateRequest
	 */
	public static final JsonpValueParser<GetIndexTemplateRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, GetIndexTemplateRequest::setupGetIndexTemplateRequestParser);

	protected static void setupGetIndexTemplateRequestParser(
			DelegatingJsonpValueParser<GetIndexTemplateRequest.Builder> op) {

		op.add(Builder::flatSettings, JsonpValueParser.booleanParser(), "flat_settings");
		op.add(Builder::includeTypeName, JsonpValueParser.booleanParser(), "include_type_name");
		op.add(Builder::masterTimeout, JsonpValueParser.jsonValueParser(), "master_timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.get_index_template}".
	 */
	public static final Endpoint<GetIndexTemplateRequest, GetIndexTemplateResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= name;

				if (propsSet == (0))
					return "GET";
				if (propsSet == (0 | name))
					return "GET";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= name;

				if (propsSet == (0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					return buf.toString();
				}
				if (propsSet == (0 | name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, GetIndexTemplateResponse.JSONP_PARSER);
}