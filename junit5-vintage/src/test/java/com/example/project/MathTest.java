/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import junit.framework.TestCase;

public class MathTest extends TestCase {

    private Calculator calculator = new Calculator();

    public void testAgentName() {
        String OS = System.getProperty("os.name").toLowerCase();
        assertEquals(OS.indexOf("win"), 0);
    }

    public void testAdd() throws InterruptedException {
        Thread.sleep(5000);
        assertEquals(calculator.add(1, 1), 2);
    }

    public void testAdd_ShouldFail() throws InterruptedException {
        Thread.sleep(5000);
        assertEquals(calculator.add(1, 1), 3);
    }
}