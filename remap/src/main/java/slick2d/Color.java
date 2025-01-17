// 
// Decompiled by Procyon v0.6.0
// 

package slick2d;

import mapped.SGL;

import java.nio.FloatBuffer;
import java.io.Serializable;

public class Color implements Serializable
{
    private static final long field14352 = 1393939L;
    public transient SGL field14353;
    public static final Color field14354;
    public static final Color field14355;
    public static final Color field14356;
    public static final Color field14357;
    public static final Color field14358;
    public static final Color field14359;
    public static final Color field14360;
    public static final Color field14361;
    public static final Color field14362;
    public static final Color field14363;
    public static final Color field14364;
    public static final Color field14365;
    public static final Color field14366;
    public static final Color field14367;
    public float field14368;
    public float field14369;
    public float field14370;
    public float field14371;
    
    public Color(final Color color) {
        this.field14353 = Renderer.get();
        this.field14371 = 1.0f;
        this.field14368 = color.field14368;
        this.field14369 = color.field14369;
        this.field14370 = color.field14370;
        this.field14371 = color.field14371;
    }
    
    public Color(final FloatBuffer floatBuffer) {
        this.field14353 = Renderer.get();
        this.field14371 = 1.0f;
        this.field14368 = floatBuffer.get();
        this.field14369 = floatBuffer.get();
        this.field14370 = floatBuffer.get();
        this.field14371 = floatBuffer.get();
    }
    
    public Color(final float field14368, final float field14369, final float field14370) {
        this.field14353 = Renderer.get();
        this.field14371 = 1.0f;
        this.field14368 = field14368;
        this.field14369 = field14369;
        this.field14370 = field14370;
        this.field14371 = 1.0f;
    }
    
    public Color(final float a, final float a2, final float a3, final float a4) {
        this.field14353 = Renderer.get();
        this.field14371 = 1.0f;
        this.field14368 = Math.min(a, 1.0f);
        this.field14369 = Math.min(a2, 1.0f);
        this.field14370 = Math.min(a3, 1.0f);
        this.field14371 = Math.min(a4, 1.0f);
    }
    
    public Color(final int n, final int n2, final int n3) {
        this.field14353 = Renderer.get();
        this.field14371 = 1.0f;
        this.field14368 = n / 255.0f;
        this.field14369 = n2 / 255.0f;
        this.field14370 = n3 / 255.0f;
        this.field14371 = 1.0f;
    }
    
    public Color(final int n, final int n2, final int n3, final int n4) {
        this.field14353 = Renderer.get();
        this.field14371 = 1.0f;
        this.field14368 = n / 255.0f;
        this.field14369 = n2 / 255.0f;
        this.field14370 = n3 / 255.0f;
        this.field14371 = n4 / 255.0f;
    }
    
    public Color(final int n) {
        this.field14353 = Renderer.get();
        this.field14371 = 1.0f;
        final int n2 = (n & 0xFF0000) >> 16;
        final int n3 = (n & 0xFF00) >> 8;
        final int n4 = n & 0xFF;
        int n5 = (n & 0xFF000000) >> 24;
        if (n5 < 0) {
            n5 += 256;
        }
        if (n5 == 0) {
            n5 = 255;
        }
        this.field14368 = n2 / 255.0f;
        this.field14369 = n3 / 255.0f;
        this.field14370 = n4 / 255.0f;
        this.field14371 = n5 / 255.0f;
    }
    
    public static Color method9765(final String nm) {
        return new Color(Integer.decode(nm));
    }
    
    public void bind() {
        this.field14353.method19252(this.field14368, this.field14369, this.field14370, this.field14371);
    }
    
    @Override
    public int hashCode() {
        return (int)(this.field14368 + this.field14369 + this.field14370 + this.field14371) * 255;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Color)) {
            return false;
        }
        final Color color = (Color)o;
        if (color.field14368 == this.field14368) {
            if (color.field14369 == this.field14369) {
                if (color.field14370 == this.field14370) {
                    if (color.field14371 == this.field14371) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Color (" + this.field14368 + "," + this.field14369 + "," + this.field14370 + "," + this.field14371 + ")";
    }
    
    public Color method9767() {
        return this.method9768(0.5f);
    }
    
    public Color method9768(float n) {
        n = 1.0f - n;
        return new Color(this.field14368 * n, this.field14369 * n, this.field14370 * n, this.field14371);
    }
    
    public Color method9769() {
        return this.method9778(0.2f);
    }
    
    public int method9770() {
        return (int)(this.field14368 * 255.0f);
    }
    
    public int method9771() {
        return (int)(this.field14369 * 255.0f);
    }
    
    public int method9772() {
        return (int)(this.field14370 * 255.0f);
    }
    
    public int method9773() {
        return (int)(this.field14371 * 255.0f);
    }
    
    public int method9774() {
        return (int)(this.field14368 * 255.0f);
    }
    
    public int method9775() {
        return (int)(this.field14369 * 255.0f);
    }
    
    public int method9776() {
        return (int)(this.field14370 * 255.0f);
    }
    
    public int method9777() {
        return (int)(this.field14371 * 255.0f);
    }
    
    public Color method9778(float n) {
        ++n;
        return new Color(this.field14368 * n, this.field14369 * n, this.field14370 * n, this.field14371);
    }
    
    public Color method9779(final Color color) {
        return new Color(this.field14368 * color.field14368, this.field14369 * color.field14369, this.field14370 * color.field14370, this.field14371 * color.field14371);
    }
    
    public void method9780(final Color color) {
        this.field14368 += color.field14368;
        this.field14369 += color.field14369;
        this.field14370 += color.field14370;
        this.field14371 += color.field14371;
    }
    
    public void method9781(final float n) {
        this.field14368 *= n;
        this.field14369 *= n;
        this.field14370 *= n;
        this.field14371 *= n;
    }
    
    public Color method9782(final Color color) {
        final Color class2429;
        final Color class2428 = class2429 = new Color(this.field14368, this.field14369, this.field14370, this.field14371);
        class2429.field14368 += color.field14368;
        final Color class2430 = class2428;
        class2430.field14369 += color.field14369;
        final Color class2431 = class2428;
        class2431.field14370 += color.field14370;
        final Color class2432 = class2428;
        class2432.field14371 += color.field14371;
        return class2428;
    }
    
    public Color method9783(final float n) {
        final Color class2428;
        final Color color = class2428 = new Color(this.field14368, this.field14369, this.field14370, this.field14371);
        class2428.field14368 *= n;
        final Color class2429 = color;
        class2429.field14369 *= n;
        final Color class2430 = color;
        class2430.field14370 *= n;
        final Color class2431 = color;
        class2431.field14371 *= n;
        return color;
    }
    
    static {
        field14354 = new Color(0.0f, 0.0f, 0.0f, 0.0f);
        field14355 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        field14356 = new Color(1.0f, 1.0f, 0.0f, 1.0f);
        field14357 = new Color(1.0f, 0.0f, 0.0f, 1.0f);
        field14358 = new Color(0.0f, 0.0f, 1.0f, 1.0f);
        field14359 = new Color(0.0f, 1.0f, 0.0f, 1.0f);
        field14360 = new Color(0.0f, 0.0f, 0.0f, 1.0f);
        field14361 = new Color(0.5f, 0.5f, 0.5f, 1.0f);
        field14362 = new Color(0.0f, 1.0f, 1.0f, 1.0f);
        field14363 = new Color(0.3f, 0.3f, 0.3f, 1.0f);
        field14364 = new Color(0.7f, 0.7f, 0.7f, 1.0f);
        field14365 = new Color(255, 175, 175, 255);
        field14366 = new Color(255, 200, 0, 255);
        field14367 = new Color(255, 0, 255, 255);
    }
}
