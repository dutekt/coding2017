package com.coding2017.jvm.engine;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kaitao.li on 2017/5/18.
 */
public class MiniJVMTest {

    static final String PATH = "C:\\Users\\liuxin\\git\\coding2017\\liuxin\\mini-jvm\\answer\\bin";

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMain() throws Exception {
        String[] classPaths = { PATH };
        MiniJVM jvm = new MiniJVM();
        jvm.run(classPaths, "com.coderising.jvm.test.EmployeeV1");

    }

}