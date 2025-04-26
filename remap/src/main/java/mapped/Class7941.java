// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.opengl.renderer.Renderer;

public class Class7941
{
    private static String[] field32617;
    public static SGL field32618;
    
    public static void method25759() {
        Class7941.field32618.glDepthMask(true);
        Class7941.field32618.glClearDepth(1.0f);
        Class7941.field32618.glClear(256);
        Class7941.field32618.glDepthFunc(519);
        Class7941.field32618.glEnable(2929);
        Class7941.field32618.glDepthMask(true);
        Class7941.field32618.glColorMask(false, false, false, false);
    }
    
    public static void method25760() {
        Class7941.field32618.glDepthMask(false);
        Class7941.field32618.glColorMask(true, true, true, true);
    }
    
    public static void method25761() {
        Class7941.field32618.glDepthFunc(514);
    }
    
    public static void method25762() {
        Class7941.field32618.glDepthFunc(517);
    }
    
    public static void method25763() {
        Class7941.field32618.glDepthMask(true);
        Class7941.field32618.glClearDepth(0.0f);
        Class7941.field32618.glClear(256);
        Class7941.field32618.glDepthMask(false);
        Class7941.field32618.glDisable(2929);
    }
    
    static {
        Class7941.field32618 = Renderer.get();
    }
}
