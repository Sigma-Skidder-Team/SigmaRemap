// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth;

import java.lang.reflect.InvocationTargetException;
import java.io.File;

public class LicenseManager
{
    public static void killLicenseAndExit() {
        File licenseFile = new File("jello/jello.lic");
        if (licenseFile.exists()) {
            licenseFile.delete();
        }
        try {
            System.class.getMethod("exit", int.class).invoke(null, 0);
        } catch (InvocationTargetException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException ex) {
            ex.printStackTrace();
        }
    }
}
