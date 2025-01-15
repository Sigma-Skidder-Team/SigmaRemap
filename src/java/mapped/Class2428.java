// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.PrivilegedAction;

public final class Class2428 implements PrivilegedAction
{
    @Override
    public Object run() {
        final String property = System.getProperty("org.newdawn.slick.forceVerboseLog");
        if (property != null) {
            if (property.equalsIgnoreCase("true")) {
                Class8452.method28201();
            }
        }
        return null;
    }
}
