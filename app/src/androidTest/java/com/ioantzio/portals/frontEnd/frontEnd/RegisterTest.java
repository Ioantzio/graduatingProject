package com.ioantzio.portals.frontEnd.frontEnd;

import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.fail;

public class RegisterTest extends Exception
{
    private UiDevice device;
    private Context context;
    private Intent intent;
    private Instrumentation instrumentation;

    @Before
    public void setUp() throws Exception
    {
        instrumentation = InstrumentationRegistry.getInstrumentation();
        context = instrumentation.getContext();
        device = UiDevice.getInstance(instrumentation);

        intent = context.getPackageManager().getLaunchIntentForPackage("com.ioantzio.portals");
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

        context.startActivity(intent);
    }

    @Test
    public void testRegister() throws Exception
    {
        UiObject2 registerButton = waitForObject(By.res("com.ioantzio.portals:id/register_button"));
        registerButton.click();

        //TODO: StaleObjectException on Username
        //Username
        UiObject2 usernameRegister = waitForObject(By.res("com.ioantzio.portals:id/username"));
        usernameRegister.setText("test");
        //Name
        UiObject2 nameRegister = waitForObject(By.res("com.ioantzio.portals:id/name"));
        nameRegister.setText("test");
        //Surname
        UiObject2 surnameRegister = waitForObject(By.res("com.ioantzio.portals:id/surname"));
        surnameRegister.setText("runner");
        //Password
        UiObject2 passwordRegister = waitForObject(By.res("com.ioantzio.portals:id/password"));
        passwordRegister.setText("123456");

        registerButton = waitForObject(By.res("com.ioantzio.portals:id/register_button"));
        registerButton.click();

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

    @After
    public void nullifyVariable()
    {
        device = null;
        context = null;
        intent = null;
        instrumentation = null;
    }
}

