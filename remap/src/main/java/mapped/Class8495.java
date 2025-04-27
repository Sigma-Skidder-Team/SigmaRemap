// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.PrivilegedAction;
import java.security.AccessController;

public class Class8495
{
    private static boolean field34883;
    private static boolean field34884;
    private static final String field34885 = "org.newdawn.slick.pngloader";
    
    private static void method28386() {
        if (!Class8495.field34884) {
            Class8495.field34884 = true;
            try {
                AccessController.doPrivileged(new Class2429());
            }
            catch (final Throwable t) {}
        }
    }
    
    public static Class5337 method28387(String lowerCase) {
        method28386();
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.endsWith(".tga")) {
            return new Class5340();
        }
        if (!lowerCase.endsWith(".png")) {
            return new Class5338();
        }
        final Class5341 class5341 = new Class5341();
        if (Class8495.field34883) {
            class5341.method16500(new Class5339());
        }
        class5341.method16500(new Class5338());
        return class5341;
    }
    
    static {
        Class8495.field34883 = true;
        Class8495.field34884 = false;
    }
}
