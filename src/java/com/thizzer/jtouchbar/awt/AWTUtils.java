// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.awt;

import com.thizzer.jtouchbar.JTouchBarJNI;
import java.awt.Component;

public class AWTUtils
{
    public static long getViewPointer(final Component component) throws RuntimeException {
        if (component == null) {
            return 0L;
        }
        try {
            return JTouchBarJNI.getAWTViewPointer0(component);
        }
        catch (final Exception cause) {
            throw new RuntimeException(cause);
        }
    }
}
