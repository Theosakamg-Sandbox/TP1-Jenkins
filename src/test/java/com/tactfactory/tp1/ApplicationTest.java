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
        Application.main(null);
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
