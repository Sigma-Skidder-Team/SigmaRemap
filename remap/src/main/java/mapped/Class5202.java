// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.Color;

import java.util.ArrayList;

public class Class5202
{
    private static String[] field22201;
    private String field22202;
    private ArrayList field22203;
    private float field22204;
    private float field22205;
    private float field22206;
    private float field22207;
    private float field22208;
    private Class7764 field22209;
    private boolean field22210;
    private Class7310 field22211;
    private String field22212;
    
    public Class5202(final String field22202, final boolean field22203) {
        this.field22203 = new ArrayList();
        this.field22202 = field22202;
        this.field22210 = field22203;
    }
    
    public boolean method16269() {
        return this.field22210;
    }
    
    public void method16270(final Class7310 field22211) {
        this.field22211 = field22211;
    }
    
    public Class7310 method16271() {
        return this.field22211;
    }
    
    public void method16272(final String field22212) {
        this.field22212 = field22212;
    }
    
    public void method16273(final Class5831 class5831) {
        if (this.field22212 != null) {
            final Class5202 method17525 = class5831.method17525(this.field22212);
            for (int i = 0; i < method17525.field22203.size(); ++i) {
                this.field22203.add(method17525.field22203.get(i));
            }
        }
    }
    
    public void method16274() {
        if (this.field22209 == null) {
            final Class5335 class5335 = new Class5335(128, 16);
            for (int i = 0; i < 128; ++i) {
                final Color method16287 = this.method16287(i / 128.0f);
                for (int j = 0; j < 16; ++j) {
                    class5335.method16486(i, j, method16287.getRedByte(), method16287.getGreenByte(), method16287.getBlueByte(), method16287.getAlphaByte());
                }
            }
            this.field22209 = class5335.method16487();
        }
    }
    
    public Class7764 method16275() {
        this.method16274();
        return this.field22209;
    }
    
    public void method16276(final float field22208) {
        this.field22208 = field22208;
    }
    
    public void method16277(final float field22204) {
        this.field22204 = field22204;
    }
    
    public void method16278(final float field22205) {
        this.field22205 = field22205;
    }
    
    public void method16279(final float field22206) {
        this.field22206 = field22206;
    }
    
    public void method16280(final float field22207) {
        this.field22207 = field22207;
    }
    
    public float method16281() {
        return this.field22208;
    }
    
    public float method16282() {
        return this.field22204;
    }
    
    public float method16283() {
        return this.field22205;
    }
    
    public float method16284() {
        return this.field22206;
    }
    
    public float method16285() {
        return this.field22207;
    }
    
    public void method16286(final float n, final Color color) {
        this.field22203.add(new Class5592(this, n, color));
    }
    
    public Color method16287(float n) {
        if (n <= 0.0f) {
            return this.field22203.get(0).field22823;
        }
        if (n <= 1.0f) {
            for (int i = 1; i < this.field22203.size(); ++i) {
                final Class5592 class5592 = this.field22203.get(i - 1);
                final Class5592 class5593 = this.field22203.get(i);
                if (n <= class5593.field22822) {
                    final float n2 = class5593.field22822 - class5592.field22822;
                    n -= class5592.field22822;
                    final float n3 = n / n2;
                    final Color class5594 = new Color(1, 1, 1, 1);
                    class5594.a = class5592.field22823.a * (1.0f - n3) + class5593.field22823.a * n3;
                    class5594.r = class5592.field22823.r * (1.0f - n3) + class5593.field22823.r * n3;
                    class5594.g = class5592.field22823.g * (1.0f - n3) + class5593.field22823.g * n3;
                    class5594.b = class5592.field22823.b * (1.0f - n3) + class5593.field22823.b * n3;
                    return class5594;
                }
            }
            return Color.black;
        }
        return this.field22203.get(this.field22203.size() - 1).field22823;
    }
}
