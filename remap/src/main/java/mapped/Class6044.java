// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.opengl.renderer.LineStripRenderer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.opengl.renderer.Renderer;
import slick2d.Texture;

public final class Class6044
{
    private static String[] field24591;
    private static SGL field24592;
    private static LineStripRenderer field24593;
    
    public static void method17966(final Class2400 class2400) {
        final Texture method24927 = Class7777.method24927();
        Class7777.method24930();
        final float[] method24928 = class2400.method9536();
        Class6044.field24593.start();
        for (int i = 0; i < method24928.length; i += 2) {
            Class6044.field24593.vertex(method24928[i], method24928[i + 1]);
        }
        if (class2400.method9554()) {
            Class6044.field24593.vertex(method24928[0], method24928[1]);
        }
        Class6044.field24593.end();
        if (method24927 != null) {
            method24927.bind();
        }
        else {
            Class7777.method24930();
        }
    }
    
    public static void method17967(final Class2400 class2400, final Class7471 class2401) {
        final float[] method9536 = class2400.method9536();
        final Texture method9537 = Class7777.method24927();
        Class7777.method24930();
        class2400.method9535();
        Class6044.field24592.glBegin(3);
        for (int i = 0; i < method9536.length; i += 2) {
            class2401.method23071(class2400, method9536[i], method9536[i + 1]).bind();
            final Class2412 method9538 = class2401.method23073(class2400, method9536[i], method9536[i + 1]);
            Class6044.field24592.glVertex2f(method9536[i] + method9538.field14278, method9536[i + 1] + method9538.field14279);
        }
        if (class2400.method9554()) {
            class2401.method23071(class2400, method9536[0], method9536[1]).bind();
            final Class2412 method9539 = class2401.method23073(class2400, method9536[0], method9536[1]);
            Class6044.field24592.glVertex2f(method9536[0] + method9539.field14278, method9536[1] + method9539.field14279);
        }
        Class6044.field24592.glEnd();
        if (method9537 != null) {
            method9537.bind();
        }
        else {
            Class7777.method24930();
        }
    }
    
    public static boolean method17968(final Class2400 class2400) {
        return class2400.method9551() != null && class2400.method9551().method9733() != 0;
    }
    
    public static void method17969(final Class2400 class2400) {
        if (method17968(class2400)) {
            final Texture method24927 = Class7777.method24927();
            Class7777.method24930();
            method17970(class2400, new Class6923());
            if (method24927 != null) {
                method24927.bind();
            }
            else {
                Class7777.method24930();
            }
        }
    }
    
    private static void method17970(final Class2400 class2400, final Class6918 class2401) {
        final Class2422 method9551 = class2400.method9551();
        Class6044.field24592.glBegin(4);
        for (int i = 0; i < method9551.method9733(); ++i) {
            for (int j = 0; j < 3; ++j) {
                final float[] method9552 = method9551.method9734(i, j);
                final float[] method9553 = class2401.method21290(class2400, method9552[0], method9552[1]);
                if (method9553 != null) {
                    Class6044.field24592.glVertex2f(method9553[0], method9553[1]);
                }
                else {
                    Class6044.field24592.glVertex2f(method9552[0], method9552[1]);
                }
            }
        }
        Class6044.field24592.glEnd();
    }
    
    public static void method17971(final Class2400 class2400, final Class7764 class2401) {
        method17973(class2400, class2401, 0.01f, 0.01f);
    }
    
    public static void method17972(final Class2400 class2400, final Class7764 class2401) {
        method17974(class2400, class2401, 1.0f, 1.0f);
    }
    
    public static void method17973(final Class2400 class2400, final Class7764 class2401, final float n, final float n2) {
        if (method17968(class2400)) {
            final Texture method24927 = Class7777.method24927();
            class2401.method24852().bind();
            method17970(class2400, new Class6917(n, n2, class2401));
            class2400.method9536();
            if (method24927 != null) {
                method24927.bind();
            }
            else {
                Class7777.method24930();
            }
        }
    }
    
    public static void method17974(final Class2400 class2400, final Class7764 class2401, final float n, final float n2) {
        if (method17968(class2400)) {
            class2400.method9536();
            final Texture method24927 = Class7777.method24927();
            class2401.method24852().bind();
            final float method24928 = class2400.method9521();
            final float method24929 = class2400.method9524();
            final float n3 = class2400.method9530() - method24928;
            final float n4 = class2400.method9531() - method24929;
            method17970(class2400, new Class6922(n, n2, class2401));
            if (method24927 != null) {
                method24927.bind();
            }
            else {
                Class7777.method24930();
            }
        }
    }
    
    public static void method17975(final Class2400 class2400, final Class7471 class2401) {
        if (method17968(class2400)) {
            final Texture method24927 = Class7777.method24927();
            Class7777.method24930();
            class2400.method9535();
            method17970(class2400, new Class6919(class2401));
            if (method24927 != null) {
                method24927.bind();
            }
            else {
                Class7777.method24930();
            }
        }
    }
    
    public static void method17976(final Class2400 class2400, final Class7764 class2401, final float n, final float n2, final Class7471 class2402) {
        if (method17968(class2400)) {
            final Texture method24927 = Class7777.method24927();
            class2401.method24852().bind();
            method17970(class2400, new Class6920(class2402, class2400.method9535(), n, n2, class2401));
            if (method24927 != null) {
                method24927.bind();
            }
            else {
                Class7777.method24930();
            }
        }
    }
    
    public static void method17977(final Class2400 class2400, final Class7764 class2401, final Class8375 class2402) {
        final Texture method24927 = Class7777.method24927();
        class2401.method24852().bind();
        class2400.method9535();
        method17970(class2400, new Class6921(class2402));
        if (method24927 != null) {
            method24927.bind();
        }
        else {
            Class7777.method24930();
        }
    }
    
    static {
        Class6044.field24592 = Renderer.get();
        Class6044.field24593 = Renderer.getLineStripRenderer();
    }
}
