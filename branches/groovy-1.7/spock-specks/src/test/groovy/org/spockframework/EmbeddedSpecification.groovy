/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

package org.spockframework

import spock.lang.*
import org.spockframework.smoke.EmbeddedSpeckCompiler
import org.spockframework.smoke.EmbeddedSpeckRunner

/**
 * Convenience base class for specifications that embed other
 * specifications within them.
 *
 * @author Peter Niederwieser
 */
class EmbeddedSpecification extends Specification {
  EmbeddedSpeckRunner runner = new EmbeddedSpeckRunner()
  EmbeddedSpeckCompiler compiler = runner.compiler
}