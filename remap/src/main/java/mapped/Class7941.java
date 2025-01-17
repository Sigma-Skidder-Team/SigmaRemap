// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Renderer;

public class Class7941
{
    private static String[] field32617;
    public static SGL field32618;
    
    public static void method25759() {
        Class7941.field32618.method19293(true);
        Class7941.field32618.method19291(1.0f);
        Class7941.field32618.method19261(256);
        Class7941.field32618.method19292(519);
        Class7941.field32618.method19265(2929);
        Class7941.field32618.method19293(true);
        Class7941.field32618.method19263(false, false, false, false);
    }
    
    public static void method25760() {
        Class7941.field32618.method19293(false);
        Class7941.field32618.method19263(true, true, true, true);
    }
    
    public static void method25761() {
        Class7941.field32618.method19292(514);
    }
    
    public static void method25762() {
        Class7941.field32618.method19292(517);
    }
    
    public static void method25763() {
        Class7941.field32618.method19293(true);
        Class7941.field32618.method19291(0.0f);
        Class7941.field32618.method19261(256);
        Class7941.field32618.method19293(false);
        Class7941.field32618.method19264(2929);
    }
    
    static {
        Class7941.field32618 = Renderer.get();
    }
}
