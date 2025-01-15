// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class2410 extends Class2400
{
    private static String[] field14271;
    private boolean field14272;
    private boolean field14273;
    
    public Class2410(final float[] array) {
        this.field14272 = false;
        this.field14273 = true;
        final int length = array.length;
        this.field14212 = new float[length];
        this.field14216 = -1.4E-45f;
        this.field14217 = -1.4E-45f;
        this.field14218 = Float.MAX_VALUE;
        this.field14219 = Float.MAX_VALUE;
        this.field14214 = Float.MAX_VALUE;
        this.field14215 = Float.MAX_VALUE;
        for (int i = 0; i < length; ++i) {
            this.field14212[i] = array[i];
            if (i % 2 != 0) {
                if (array[i] > this.field14217) {
                    this.field14217 = array[i];
                }
                if (array[i] < this.field14219) {
                    this.field14219 = array[i];
                }
                if (array[i] < this.field14215) {
                    this.field14215 = array[i];
                }
            }
            else {
                if (array[i] > this.field14216) {
                    this.field14216 = array[i];
                }
                if (array[i] < this.field14218) {
                    this.field14218 = array[i];
                }
                if (array[i] < this.field14214) {
                    this.field14214 = array[i];
                }
            }
        }
        this.method9547();
        this.method9548();
        this.field14221 = true;
    }
    
    public Class2410() {
        this.field14272 = false;
        this.field14273 = true;
        this.field14212 = new float[0];
        this.field14216 = -1.4E-45f;
        this.field14217 = -1.4E-45f;
        this.field14218 = Float.MAX_VALUE;
        this.field14219 = Float.MAX_VALUE;
    }
    
    public void method9616(final boolean field14272) {
        this.field14272 = field14272;
    }
    
    public void method9617(final float field14218, final float field14219) {
        if (this.method9546(field14218, field14219) && !this.field14272) {
            return;
        }
        final ArrayList list = new ArrayList();
        for (int i = 0; i < this.field14212.length; ++i) {
            list.add(new Float(this.field14212[i]));
        }
        list.add(new Float(field14218));
        list.add(new Float(field14219));
        final int size = list.size();
        this.field14212 = new float[size];
        for (int j = 0; j < size; ++j) {
            this.field14212[j] = (float)list.get(j);
        }
        if (field14218 > this.field14216) {
            this.field14216 = field14218;
        }
        if (field14219 > this.field14217) {
            this.field14217 = field14219;
        }
        if (field14218 < this.field14218) {
            this.field14218 = field14218;
        }
        if (field14219 < this.field14219) {
            this.field14219 = field14219;
        }
        this.method9547();
        this.method9548();
        this.field14221 = true;
    }
    
    @Override
    public Class2400 method9519(final Class7310 class7310) {
        this.method9552();
        final Class2410 class7311 = new Class2410();
        final float[] field14212 = new float[this.field14212.length];
        class7310.method22419(this.field14212, 0, field14212, 0, this.field14212.length / 2);
        class7311.field14212 = field14212;
        class7311.method9547();
        class7311.field14273 = this.field14273;
        return class7311;
    }
    
    @Override
    public void method9522(final float n) {
        super.method9522(n);
        this.field14221 = false;
    }
    
    @Override
    public void method9523(final float n) {
        super.method9523(n);
        this.field14221 = false;
    }
    
    @Override
    public void method9520() {
    }
    
    @Override
    public boolean method9554() {
        return this.field14273;
    }
    
    public void method9618(final boolean field14273) {
        this.field14273 = field14273;
    }
    
    public Class2410 method9619() {
        final float[] array = new float[this.field14212.length];
        System.arraycopy(this.field14212, 0, array, 0, array.length);
        return new Class2410(array);
    }
}
