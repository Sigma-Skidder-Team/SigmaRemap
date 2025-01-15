// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

public class Class2404 extends Class2403
{
    public static final int field14242 = 1;
    public static final int field14243 = 2;
    public static final int field14244 = 4;
    public static final int field14245 = 8;
    public static final int field14246 = 15;
    private static final int field14247 = 25;
    private float field14248;
    private int field14249;
    private int field14250;
    
    public Class2404(final float n, final float n2, final float n3, final float n4, final float n5) {
        this(n, n2, n3, n4, n5, 25);
    }
    
    public Class2404(final float n, final float n2, final float n3, final float n4, final float n5, final int n6) {
        this(n, n2, n3, n4, n5, n6, 15);
    }
    
    public Class2404(final float field14214, final float field14215, final float field14216, final float field14217, final float field14218, final int field14219, final int field14220) {
        super(field14214, field14215, field14216, field14217);
        if (field14218 >= 0.0f) {
            this.field14214 = field14214;
            this.field14215 = field14215;
            this.field14240 = field14216;
            this.field14241 = field14217;
            this.field14248 = field14218;
            this.field14249 = field14219;
            this.field14221 = true;
            this.field14250 = field14220;
            return;
        }
        throw new IllegalArgumentException("corner radius must be >= 0");
    }
    
    public float method9596() {
        return this.field14248;
    }
    
    public void method9597(final float field14248) {
        if (field14248 >= 0.0f) {
            if (field14248 != this.field14248) {
                this.field14248 = field14248;
                this.field14221 = true;
            }
        }
    }
    
    @Override
    public float method9559() {
        return this.field14241;
    }
    
    @Override
    public void method9593(final float field14241) {
        if (this.field14241 != field14241) {
            this.field14241 = field14241;
            this.field14221 = true;
        }
    }
    
    @Override
    public float method9558() {
        return this.field14240;
    }
    
    @Override
    public void method9592(final float field14240) {
        if (field14240 != this.field14240) {
            this.field14240 = field14240;
            this.field14221 = true;
        }
    }
    
    @Override
    public void method9520() {
        this.field14216 = this.field14214 + this.field14240;
        this.field14217 = this.field14215 + this.field14241;
        this.field14218 = this.field14214;
        this.field14219 = this.field14215;
        final float n = this.field14240 - 1.0f;
        final float n2 = this.field14241 - 1.0f;
        if (this.field14248 != 0.0f) {
            float n3 = this.field14248 * 2.0f;
            if (n3 > n) {
                n3 = n;
                this.field14248 = n3 / 2.0f;
            }
            if (n3 > n2) {
                this.field14248 = n2 / 2.0f;
            }
            final ArrayList<Float> list = new ArrayList<Float>();
            if ((this.field14250 & 0x1) == 0x0) {
                list.add(new Float(this.field14214));
                list.add(new Float(this.field14215));
            }
            else {
                list.addAll(this.method9598(this.field14249, this.field14248, this.field14214 + this.field14248, this.field14215 + this.field14248, 180.0f, 270.0f));
            }
            if ((this.field14250 & 0x2) == 0x0) {
                list.add(new Float(this.field14214 + n));
                list.add(new Float(this.field14215));
            }
            else {
                list.addAll(this.method9598(this.field14249, this.field14248, this.field14214 + n - this.field14248, this.field14215 + this.field14248, 270.0f, 360.0f));
            }
            if ((this.field14250 & 0x4) == 0x0) {
                list.add(new Float(this.field14214 + n));
                list.add(new Float(this.field14215 + n2));
            }
            else {
                list.addAll(this.method9598(this.field14249, this.field14248, this.field14214 + n - this.field14248, this.field14215 + n2 - this.field14248, 0.0f, 90.0f));
            }
            if ((this.field14250 & 0x8) == 0x0) {
                list.add(new Float(this.field14214));
                list.add(new Float(this.field14215 + n2));
            }
            else {
                list.addAll(this.method9598(this.field14249, this.field14248, this.field14214 + this.field14248, this.field14215 + n2 - this.field14248, 90.0f, 180.0f));
            }
            this.field14212 = new float[list.size()];
            for (int i = 0; i < list.size(); ++i) {
                this.field14212[i] = list.get(i);
            }
        }
        else {
            (this.field14212 = new float[8])[0] = this.field14214;
            this.field14212[1] = this.field14215;
            this.field14212[2] = this.field14214 + n;
            this.field14212[3] = this.field14215;
            this.field14212[4] = this.field14214 + n;
            this.field14212[5] = this.field14215 + n2;
            this.field14212[6] = this.field14214;
            this.field14212[7] = this.field14215 + n2;
        }
        this.method9547();
        this.method9548();
    }
    
    private List method9598(final int n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final ArrayList list = new ArrayList();
        final int n7 = 360 / n;
        for (float n8 = n5; n8 <= n6 + n7; n8 += n7) {
            float n9 = n8;
            if (n9 > n6) {
                n9 = n6;
            }
            final float value = (float)(n3 + Class6882.method21086(Math.toRadians(n9)) * n2);
            final float value2 = (float)(n4 + Class6882.method21085(Math.toRadians(n9)) * n2);
            list.add(new Float(value));
            list.add(new Float(value2));
        }
        return list;
    }
    
    @Override
    public Class2400 method9519(final Class7310 class7310) {
        this.method9552();
        final Class2410 class7311 = new Class2410();
        final float[] field14212 = new float[this.field14212.length];
        class7310.method22419(this.field14212, 0, field14212, 0, this.field14212.length / 2);
        class7311.field14212 = field14212;
        class7311.method9547();
        return class7311;
    }
}
