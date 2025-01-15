// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;

public class Native$AWT
{
    private Native$AWT() {
    }
    
    public static long getWindowID(final Window w) throws HeadlessException {
        return getComponentID(w);
    }
    
    public static long getComponentID(final Object o) throws HeadlessException {
        if (GraphicsEnvironment.isHeadless()) {
            throw new HeadlessException("No native windows when headless");
        }
        final Component component = (Component)o;
        if (component.isLightweight()) {
            throw new IllegalArgumentException("Component must be heavyweight");
        }
        if (!component.isDisplayable()) {
            throw new IllegalStateException("Component must be displayable");
        }
        if (Platform.isX11() && System.getProperty("java.version").startsWith("1.4") && !component.isVisible()) {
            throw new IllegalStateException("Component must be visible");
        }
        return Native.getWindowHandle0(component);
    }
}
