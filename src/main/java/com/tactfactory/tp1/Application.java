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

import org.joda.time.DateTime;

/**
 * My main Application.
 * @author Mickael Gaillard.
 * @version 1.0
 */
public final class Application {

    private Application() {
        super();
    }

    /** State of application. (true if running). */
    private static boolean isRunning = false;


    /**
     * Entry-point of application.
     * @param args Argument from CLI.
     */
    public static void main(final String[] args) {
        isRunning = true;

        final DateTime date = DateTime.now();
        System.out.println("Application start at : " + date );
    }

    /**
     * Add two value.
     * @param value1 first value.
     * @param value2 second value.
     * @return result of addition.
     */
    public static int add(final int value1, final int value2) {
        int result = Integer.MIN_VALUE;

        if (isRunning) {
            result = value1 + value2;
        }

        return result;
    }

}
