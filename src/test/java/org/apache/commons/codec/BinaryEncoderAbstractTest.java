/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.codec;

import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * @version $Id: BinaryEncoderAbstractTest.java 1812883 2017-10-22 08:01:06Z pascalschumacher $
 */
public abstract class BinaryEncoderAbstractTest {

    protected abstract BinaryEncoder makeEncoder();

    @Test
    public void testEncodeEmpty() throws Exception {
        final BinaryEncoder encoder = makeEncoder();
        encoder.encode(new byte[0]);
    }

    @Test
    public void testEncodeNull() throws Exception {
        final BinaryEncoder encoder = makeEncoder();
        try {
            encoder.encode(null);
            fail("EncoderException exptected");
        } catch (final EncoderException ee) {
            // An exception should be thrown
        }
    }
}
