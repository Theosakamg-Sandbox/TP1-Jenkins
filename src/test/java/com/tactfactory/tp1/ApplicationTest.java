package com.tactfactory.tp1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ApplicationTest {

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
