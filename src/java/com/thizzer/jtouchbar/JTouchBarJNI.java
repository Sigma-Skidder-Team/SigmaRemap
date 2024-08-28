package com.thizzer.jtouchbar;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class JTouchBarJNI {
    static {
        try {
            System.loadLibrary("JTouchBar");
        } catch (UnsatisfiedLinkError var3) {
            loadLibraryFromJar("/lib/libJTouchBar.dylib");
        }
    }

    public static native void setTouchBar0(long var0, JTouchBar var2);

    public static native void updateTouchBarItem(long var0);

    public static native void callObjectSelector(long var0, String var2, boolean var3);

    public static native int callIntObjectSelector(long var0, String var2);

    public static native long getAWTViewPointer0(Component var0);

    private static void loadLibraryFromJar(String path) throws UnsatisfiedLinkError {
        try (InputStream var3 = JTouchBarJNI.class.getResourceAsStream(path)) {
            File buffer = File.createTempFile(path, "");
            byte[] read = new byte[1024];
            int fileOutputStream = -1;

            try (FileOutputStream var8 = new FileOutputStream(buffer)) {
                while ((fileOutputStream = var3.read(read)) != -1) {
                    var8.write(read, 0, fileOutputStream);
                }
            }

            System.load(buffer.getAbsolutePath());
        } catch (Exception var38) {
            throw new UnsatisfiedLinkError("Unable to open " + path + " from jar file.");
        }
    }
}
