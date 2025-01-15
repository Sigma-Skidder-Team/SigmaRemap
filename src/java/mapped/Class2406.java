// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class2406 extends Class2400
{
    private static String[] field14257;
    public static final int field14258 = 50;
    private int field14259;
    private float field14260;
    private float field14261;
    
    public Class2406(final float n, final float n2, final float n3, final float n4) {
        this(n, n2, n3, n4, 50);
    }
    
    public Class2406(final float n, final float n2, final float field14260, final float field14261, final int field14262) {
        this.field14214 = n - field14260;
        this.field14215 = n2 - field14261;
        this.field14260 = field14260;
        this.field14261 = field14261;
        this.field14259 = field14262;
        this.method9552();
    }
    
    public void method9600(final float n, final float n2) {
        this.method9602(n);
        this.method9604(n2);
    }
    
    public float method9601() {
        return this.field14260;
    }
    
    public void method9602(final float field14260) {
        if (field14260 != this.field14260) {
            this.field14260 = field14260;
            this.field14221 = true;
        }
    }
    
    public float method9603() {
        return this.field14261;
    }
    
    public void method9604(final float field14261) {
        if (field14261 != this.field14261) {
            this.field14261 = field14261;
            this.field14221 = true;
        }
    }
    
    @Override
    public void method9520() {
        final ArrayList list = new ArrayList();
        this.field14216 = -1.4E-45f;
        this.field14217 = -1.4E-45f;
        this.field14218 = Float.MAX_VALUE;
        this.field14219 = Float.MAX_VALUE;
        final float n = 0.0f;
        final float n2 = 359.0f;
        final float n3 = this.field14214 + this.field14260;
        final float n4 = this.field14215 + this.field14261;
        final int n5 = 360 / this.field14259;
        for (float n6 = n; n6 <= n2 + n5; n6 += n5) {
            float n7 = n6;
            if (n7 > n2) {
                n7 = n2;
            }
            final float value = (float)(n3 + Class6882.method21086(Math.toRadians(n7)) * this.field14260);
            final float value2 = (float)(n4 + Class6882.method21085(Math.toRadians(n7)) * this.field14261);
            if (value > this.field14216) {
                this.field14216 = value;
            }
            if (value2 > this.field14217) {
                this.field14217 = value2;
            }
            if (value < this.field14218) {
                this.field14218 = value;
            }
            if (value2 < this.field14219) {
                this.field14219 = value2;
            }
            list.add(new Float(value));
            list.add(new Float(value2));
        }
        this.field14212 = new float[list.size()];
        for (int i = 0; i < this.field14212.length; ++i) {
            this.field14212[i] = (float)list.get(i);
        }
    }
    
    @Override
    public Class2400 method9519(final Class7310 class7310) {
        this.method9552();
        final Class2410 class7311 = new Class2410();
        final float[] field14212 = new float[this.field14212.length];
        class7310.method22419(this.field14212, 0, field14212, 0, this.field14212.length / 2);
        class7311.field14212 = field14212;
        class7311.method9552();
        return class7311;
    }
    
    @Override
    public void method9547() {
        (this.field14213 = new float[2])[0] = this.field14214 + this.field14260;
        this.field14213[1] = this.field14215 + this.field14261;
    }
    
    @Override
    public void method9548() {
        this.field14220 = ((this.field14260 <= this.field14261) ? this.field14261 : this.field14260);
    }
}
