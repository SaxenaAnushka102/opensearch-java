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

package org.opensearch.clients.opensearch._types.analysis;

import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import javax.annotation.Nullable;

// typedef: _types.analysis.TokenizerBase

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/analysis/tokenizers.ts#L26-L28">API
 *      specification</a>
 */

public abstract class TokenizerBase implements JsonpSerializable {
	@Nullable
	private final String version;

	// ---------------------------------------------------------------------------------------------

	protected TokenizerBase(AbstractBuilder<?> builder) {

		this.version = builder.version;

	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
		@Nullable
		private String version;

		/**
		 * API name: {@code version}
		 */
		public final BuilderT version(@Nullable String value) {
			this.version = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupTokenizerBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}