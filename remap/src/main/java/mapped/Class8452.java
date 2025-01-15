// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.PrivilegedAction;
import java.security.AccessController;

public final class Class8452
{
    private static String[] field34715;
    private static boolean field34716;
    private static boolean field34717;
    private static final String field34718 = "org.newdawn.slick.forceVerboseLog";
    private static final String field34719 = "true";
    private static Class6301 field34720;
    
    private Class8452() {
    }
    
    public static void method28198(final Class6301 field34720) {
        Class8452.field34720 = field34720;
    }
    
    public static void method28199(final boolean field34716) {
        if (!Class8452.field34717) {
            Class8452.field34716 = field34716;
        }
    }
    
    public static void method28200() {
        try {
            AccessController.doPrivileged((PrivilegedAction<Object>)new Class2428());
        }
        catch (final Throwable t) {}
    }
    
    public static void method28201() {
        Class8452.field34717 = true;
        Class8452.field34716 = true;
    }
    
    public static void method28202(final String s, final Throwable t) {
        Class8452.field34720.method18659(s, t);
    }
    
    public static void method28203(final Throwable t) {
        Class8452.field34720.method18660(t);
    }
    
    public static void method28204(final String s) {
        Class8452.field34720.method18661(s);
    }
    
    public static void method28205(final String s) {
        Class8452.field34720.method18662(s);
    }
    
    public static void method28206(final String s, final Throwable t) {
        Class8452.field34720.method18663(s, t);
    }
    
    public static void method28207(final String s) {
        if (Class8452.field34716 || Class8452.field34717) {
            Class8452.field34720.method18664(s);
        }
    }
    
    public static void method28208(final String s) {
        if (Class8452.field34716 || Class8452.field34717) {
            Class8452.field34720.method18665(s);
        }
    }
    
    static {
        Class8452.field34716 = true;
        Class8452.field34717 = false;
        Class8452.field34720 = new Class6302();
    }
}
