// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.PrivilegedAction;

public final class Class2429 implements PrivilegedAction
{
    @Override
    public Object run() {
        if ("false".equalsIgnoreCase(System.getProperty("org.newdawn.slick.pngloader"))) {
            Class8495.method28388(false);
        }
        Class8452.method28207("Use Java PNG Loader = " + Class8495.method28389());
        return null;
    }
}
