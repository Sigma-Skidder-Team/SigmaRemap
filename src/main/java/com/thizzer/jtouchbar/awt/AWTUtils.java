package com.thizzer.jtouchbar.awt;

import com.thizzer.jtouchbar.JTouchBarJNI;

import java.awt.*;

public class AWTUtils {
    public static long getViewPointer(Component component) throws RuntimeException {
        if (component == null) {
            return 0L;
        } else {
            try {
                return JTouchBarJNI.getAWTViewPointer0(component);
            } catch (Exception var4) {
                throw new RuntimeException(var4);
            }
        }
    }
}
