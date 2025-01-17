// 
// Decompiled by Procyon v0.6.0
// 

package slick2d;

import mapped.*;

public class Renderer
{
    public static final int field32094 = 1;
    public static final int field32095 = 2;
    public static final int field32096 = 3;
    public static final int field32097 = 4;
    private static SGL field32098;
    private static Class6020 field32099;
    
    public static void method25326(final int i) {
        switch (i) {
            case 1: {
                method25329(new Class6447());
                return;
            }
            case 2: {
                method25329(new Class6446());
                return;
            }
            default: {
                throw new RuntimeException("Unknown renderer type: " + i);
            }
        }
    }
    
    public static void method25327(final int i) {
        switch (i) {
            case 3: {
                method25328(new Class6021());
                return;
            }
            case 4: {
                method25328(new Class6019());
                return;
            }
            default: {
                throw new RuntimeException("Unknown line strip renderer type: " + i);
            }
        }
    }
    
    public static void method25328(final Class6020 field32099) {
        Renderer.field32099 = field32099;
    }
    
    public static void method25329(final SGL field32098) {
        Renderer.field32098 = field32098;
    }
    
    public static SGL get() {
        return Renderer.field32098;
    }
    
    public static Class6020 method25331() {
        return Renderer.field32099;
    }
    
    static {
        Renderer.field32098 = new Class6447();
        Renderer.field32099 = new Class6021();
    }
}
