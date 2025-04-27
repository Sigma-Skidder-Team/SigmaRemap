// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth.hwid;

import com.sun.jna.Platform;

import java.util.Base64;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SerialNumberUtil
{
    public static String getSerialNumber() {
        final SerialNumberGetter sng = getSerialNumberGetter();
        return (sng != null) ? sng.getSerialNumber() : "Unknown";
    }
    
    public static byte[] getHWID(final String prefix) {
        final SerialNumberGetter sng = getSerialNumberGetter();
        final String s = (prefix + sng == null) ? "Unknown" : (SerialNumberGetter.field34904 + sng.getSerialNumber());
        byte[] array;
        try {
            return MessageDigest.getInstance("SHA-256").digest(s.getBytes(StandardCharsets.UTF_8));
        }
        catch (final NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            array = new byte[256];
            for (int i = 0; i < 256; ++i) {
                array[i] = 15;
            }
        }
        return array;
    }
    
    public static byte[] getHWID() {
        final SerialNumberGetter sng = getSerialNumberGetter();
        final String s = (sng == null) ? "Unknown" : (SerialNumberGetter.field34904 + sng.getSerialNumber());
        byte[] array;
        try {
            return MessageDigest.getInstance("SHA-256").digest(s.getBytes(StandardCharsets.UTF_8));
        }
        catch (final NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            array = new byte[256];
            for (int i = 0; i < 256; ++i) {
                array[i] = 15;
            }
        }
        return array;
    }
    
    public static String getHashedHWID() {
        return new String(Base64.getEncoder().encode(getHWID()));
    }
    
    public static String method25923(final String s) {
        return new String(Base64.getEncoder().encode(getHWID(s)));
    }
    
    public static SerialNumberGetter getSerialNumberGetter() {
        if (Platform.isMac()) {
            return new MacOSSNGetter();
        }
        if (Platform.isWindows()) {
            return new WindowsSNGetter();
        }
        if (!Platform.isLinux()) {
            return null;
        }
        return new LinuxSNGetter();
    }
}
