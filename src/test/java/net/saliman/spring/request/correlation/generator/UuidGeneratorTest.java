/*
 * Copyright (c) 2017 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.saliman.spring.request.correlation.generator;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import static org.junit.Assert.assertNotNull;

/**
 * Tests the {@link UuidGenerator} class.
 *
 * @author Jakub Narloch
 */
public class UuidGeneratorTest {

    // TODO: 8/17/2016 Create a test to get sessionID
    @Test
    public void shouldGenerateId() {
        final MockHttpServletRequest request = new MockHttpServletRequest();

        // when
        final String requestId = new UuidGenerator().generateRequestId(request);

        // then
        assertNotNull(requestId);
    }

}