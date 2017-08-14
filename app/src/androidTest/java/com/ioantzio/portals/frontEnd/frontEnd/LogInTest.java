package com.ioantzio.portals.frontEnd.frontEnd;

import android.support.test.uiautomator.*;
import android.test.InstrumentationTestCase;
import org.junit.Before;
import org.junit.Test;

public class LogInTest extends InstrumentationTestCase
{
    private UiDevice device;

    @Before
    public void setUp() throws Exception
    {
        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();

        UiObject2 appsButton = device.findObject(By.desc("Apps"));
        appsButton.click();

        UiObject2 projectApp = device.findObject(By.desc("Portals"));
        projectApp.click();

    }
    @Test
    public void testLogIn() throws Exception
    {
        //Username
        UiObject2 usernameSignIn = waitForObject(By.res("com.ioantzio.portals:id/username"));
        usernameSignIn.setText("admin");
        //Password
        UiObject2 passwordSignIn = waitForObject(By.res("com.ioantzio.portals:id/password"));
        passwordSignIn.setText("admin");

        UiObject2 signInButton = device.findObject(By.res("com.ioantzio.portals:id/login_button"));
        signInButton.click();

        waitForObject(By.res("android:id/content"));
        Thread.sleep(5000);
    }

    private UiObject2 waitForObject(BySelector selector) throws InterruptedException {
        UiObject2 object = null;
        int timeout = 30000;
        int delay = 1000;
        long time = System.currentTimeMillis();
        while (object == null) {
            object = device.findObject(selector);
            Thread.sleep(delay);
            if (System.currentTimeMillis() - timeout > time) {
                fail();
            }
        }
        return object;
    }
}

