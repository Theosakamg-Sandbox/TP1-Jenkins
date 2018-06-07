/*******************************************************************************
 * Copyright 2018 Mickael Gaillard <mickael.gaillard@tactfactory.com>
 ******************************************************************************/

package com.tactfactory.tp1;

import org.joda.time.DateTime;

/**
 * My main Application.
 * @author Mickael Gaillard.
 * @version 1.0
 */
public final class Application {

    /** State of application. (true if running). */
    private static boolean isRunning;

    private Application() {
        super();
    }

    /**
     * Entry-point of application.
     * @param args Argument from CLI.
     */
    public static void main(final String[] args) {
        isRunning = true;

        final DateTime date = DateTime.now();
        System.out.println("Application start at : " + date);
    }

    /**
     * Add two value.
     * @param value1 first value.
     * @param value2 second value.
     * @return result of addition.
     */
    public static int add(final int value1, final int value2) {
        int result;

        if (isRunning) {
            result = value1 + value2;
        } else {
            result = Integer.MIN_VALUE;
        }

        return result;
    }

    // Test CPD
    /**
     * Sub two value.
     * @param value1 first value.
     * @param value2 second value.
     * @return result of addition.
     */
    public static int sub(final int value1, final int value2) {
        int result;

        if (isRunning) {
            result = value1 - value2;
        } else {
            result = Integer.MIN_VALUE;
        }

        return result;
    }

    // Findbugs test
    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        return true;
    }

}
