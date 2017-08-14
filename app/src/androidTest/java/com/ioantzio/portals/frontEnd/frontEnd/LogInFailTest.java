package com.ioantzio.portals.frontEnd.frontEnd;

import android.provider.Settings;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.test.InstrumentationTestCase;

import org.junit.Before;
import org.junit.Test;

public class LogInFailTest extends InstrumentationTestCase
{
    private UiDevice device;
    private boolean found;

    @Before
    public void setUp() throws Exception
    {
        found = false;
        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();

        while(!found)
        {
            if(device.findObject(By.desc("Portals")))
            {
                device.swipe(5, 5, device.getDisplayWidth()-5, 5, 50);
            }
            else
            {
                found = true;
            }
        }

        UiObject2 projectApp = device.findObject(By.desc("Portals"));
        projectApp.click();

    }
    @Test
    public void testLogIn() throws Exception
    {
        //Email
        UiObject2 emailSignIn = waitForObject(By.res("com.ioantzio.portals:id/email"));
        emailSignIn.setText("WrongMail");
        //Password
        UiObject2 passwordSignIn = waitForObject(By.res("com.ioantzio.portals:id/password"));
        passwordSignIn.setText("WrongPassword");

        UiObject2 signInButton = device.findObject(By.res("com.ioantzio.portals:id/login_button"));
        signInButton.click();

        //TODO check if it shows a window notification
        //waitForObject(By.res("android:id/content"));
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

