/*******************************************************************************
 * Copyright 2018 Mickael Gaillard <mickael.gaillard@tactfactory.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/

package com.tactfactory.tp1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ApplicationTest {

    @Before
    public void setup() {
        System.out.println("Pre-test");
    }

    @After
    public void teardown() {

    }

    @Test
    public void testAdd() {
        int i = 2, j = 3;

        int k = Application.add(i, j);

        Assert.assertEquals("Add not good !", k, 5);
    }

    @Test
    @Ignore
    public void testKO() {
        fail("For fun ;)");
    }

}
