// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.sun.jna.Platform;
import java.util.Base64;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Class7977
{
    public static String method25919() {
        final Class8505 method25924 = method25924();
        return (method25924 != null) ? method25924.method28418() : "Unknown";
    }
    
    public static byte[] method25920(final String str) {
        final Class8505 method25924 = method25924();
        final String s = (str + method25924 == null) ? "Unknown" : (Class8505.field34904 + method25924.method28418());
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
    
    public static byte[] method25921() {
        final Class8505 method25924 = method25924();
        final String s = (method25924 == null) ? "Unknown" : (Class8505.field34904 + method25924.method28418());
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
    
    public static String method25922() {
        return new String(Base64.getEncoder().encode(method25921()));
    }
    
    public static String method25923(final String s) {
        return new String(Base64.getEncoder().encode(method25920(s)));
    }
    
    public static Class8505 method25924() {
        if (Platform.isMac()) {
            return new Class8506();
        }
        if (Platform.isWindows()) {
            return new Class8507();
        }
        if (!Platform.isLinux()) {
            return null;
        }
        return new Class8504();
    }
}
