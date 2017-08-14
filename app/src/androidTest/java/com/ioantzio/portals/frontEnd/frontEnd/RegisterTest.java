package com.ioantzio.portals.frontEnd.frontEnd;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.test.InstrumentationTestCase;

import org.junit.Before;
import org.junit.Test;

public class RegisterTest extends InstrumentationTestCase
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
    public void testRegister() throws Exception
    {
        UiObject2 registerInButton = device.findObject(By.res("com.ioantzio.portals:id/register_button"));
        registerInButton.click();

        //Username
        UiObject2 usernameRegister = waitForObject(By.res("com.ioantzio.portals:id/username"));
        usernameRegister.setText("testRunner");
        //Name
        UiObject2 nameRegister = waitForObject(By.res("com.ioantzio.portals:id/name"));
        nameRegister.setText("test");
        //Surname
        UiObject2 surnameRegister = waitForObject(By.res("com.ioantzio.portals:id/surname"));
        surnameRegister.setText("runner");
        //Password
        UiObject2 passwordRegister = waitForObject(By.res("com.ioantzio.portals:id/password"));
        passwordRegister.setText("123456");

        //TODO add register complete widnow and check if it will appear
        //registerInButton.click();
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

