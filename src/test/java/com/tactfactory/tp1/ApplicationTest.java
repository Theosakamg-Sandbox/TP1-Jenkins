/*******************************************************************************
 * Copyright 2018 Mickael Gaillard <mickael.gaillard@tactfactory.com>
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
    public void testStartedAdd() {
        int i = 2, j = 3;

        // Test case bad
        int k = Application.add(i, j);
        Assert.assertEquals("Add not good !", k, Integer.MIN_VALUE);

        // Test case Good
        Application.main(null);
        k = Application.add(i, j);

        Assert.assertEquals("Add not good !", k, 5);
    }

    @Test
    @Ignore
    public void testKO() {
        fail("For fun ;)");
    }

}
