// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8408
{
    private static String[] field34521;
    public static final float field34522 = Float.NEGATIVE_INFINITY;
    public static final Class8408 field34523;
    private static final int field34524 = 32;
    private final float[] field34525;
    
    public Class8408() {
        this.field34525 = new float[32];
    }
    
    public Class8408(final float[] array) {
        this.field34525 = new float[32];
        this.method28055(array);
    }
    
    public Class8408(final Class7934 class7934) {
        this.field34525 = new float[32];
        this.method28056(class7934);
    }
    
    public void method28055(final float[] array) {
        this.method28058();
        for (int n = (array.length <= 32) ? array.length : 32, i = 0; i < n; ++i) {
            this.field34525[i] = this.method28062(array[i]);
        }
    }
    
    public void method28056(final Class7934 class7934) {
        this.method28058();
        for (int n = 32, i = 0; i < n; ++i) {
            this.field34525[i] = this.method28062(class7934.method25735(i));
        }
    }
    
    public void method28057(final Class8408 class8408) {
        if (class8408 != this) {
            this.method28055(class8408.field34525);
        }
    }
    
    public void method28058() {
        for (int i = 0; i < 32; ++i) {
            this.field34525[i] = 0.0f;
        }
    }
    
    public int method28059() {
        return this.field34525.length;
    }
    
    public float method28060(final int n, final float n2) {
        float n3 = 0.0f;
        if (n >= 0) {
            if (n < 32) {
                n3 = this.field34525[n];
                this.field34525[n] = this.method28062(n2);
            }
        }
        return n3;
    }
    
    public float method28061(final int n) {
        float n2 = 0.0f;
        if (n >= 0) {
            if (n < 32) {
                n2 = this.field34525[n];
            }
        }
        return n2;
    }
    
    private float method28062(final float n) {
        if (n == Float.NEGATIVE_INFINITY) {
            return n;
        }
        if (n > 1.0f) {
            return 1.0f;
        }
        if (n >= -1.0f) {
            return n;
        }
        return -1.0f;
    }
    
    public float[] method28063() {
        final float[] array = new float[32];
        for (int i = 0; i < 32; ++i) {
            array[i] = this.method28064(this.field34525[i]);
        }
        return array;
    }
    
    public float method28064(final float n) {
        if (n != Float.NEGATIVE_INFINITY) {
            return (float)Math.pow(2.0, n);
        }
        return 0.0f;
    }
    
    static {
        field34523 = new Class8408();
    }
}
