package com.mentalfrostbyte.jello.unmapped;

import com.sun.jna.Platform;
import mapped.Class7066;
import mapped.Class7067;
import mapped.Class7068;
import mapped.Class7069;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class USELESSCLASS2 {
    public static String method20754() {
        Class7067 var2 = method20759();
        return var2 != null ? var2.method21980() : "Unknown";
    }

    public static byte[] method20755(String var0) {
        Class7067 var3 = method20759();
        String var4 = var0 + var3 == null ? "Unknown" : Class7067.field30444 + var3.method21980();

        try {
            MessageDigest var8 = MessageDigest.getInstance("SHA-256");
            return var8.digest(var4.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException var7) {
            var7.printStackTrace();
            byte[] var5 = new byte[256];

            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = 15;
            }

            return var5;
        }
    }

    public static byte[] method20756() {
        Class7067 var2 = method20759();
        String var3 = var2 == null ? "Unknown" : Class7067.field30444 + var2.method21980();

        try {
            MessageDigest var7 = MessageDigest.getInstance("SHA-256");
            return var7.digest(var3.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException var6) {
            var6.printStackTrace();
            byte[] var4 = new byte[256];

            for (int var5 = 0; var5 < 256; var5++) {
                var4[var5] = 15;
            }

            return var4;
        }
    }

    public static String method20757() {
        byte[] var2 = method20756();
        return new String(Base64.getEncoder().encode(var2));
    }

    public static String method20758(String var0) {
        byte[] var3 = method20755(var0);
        return new String(Base64.getEncoder().encode(var3));
    }

    public static Class7067 method20759() {
        if (!Platform.isMac()) {
            if (!Platform.isWindows()) {
                return !Platform.isLinux() ? null : new Class7068();
            } else {
                return new Class7066();
            }
        } else {
            return new Class7069();
        }
    }
}
