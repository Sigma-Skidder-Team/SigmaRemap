// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8690
{
    private static String[] field36520;
    private float field36521;
    private float field36522;
    private float field36523;
    private long field36524;
    
    public Class8690(final float n, final float n2) {
        this(n, n2, n2);
    }
    
    public Class8690(final float field36521, final float field36522, final float field36523) {
        this.field36521 = field36521;
        this.field36522 = field36522;
        this.field36523 = field36523;
        this.field36524 = System.currentTimeMillis();
    }
    
    public float method29785() {
        return this.field36521;
    }
    
    public float method29786() {
        return this.field36522;
    }
    
    public float method29787() {
        return this.field36523;
    }
    
    public long method29788() {
        return this.field36524;
    }
    
    public float method29789(final float n, final float field36522, final float field36523) {
        this.field36522 = field36522;
        this.field36523 = field36523;
        return this.method29790(n);
    }
    
    public float method29790(final float n) {
        final long currentTimeMillis = System.currentTimeMillis();
        final float field36521 = this.field36521;
        final float method29791 = method29791(field36521, n, (currentTimeMillis - this.field36524) / 1000.0f, (n < field36521) ? this.field36523 : this.field36522);
        this.field36521 = method29791;
        this.field36524 = currentTimeMillis;
        return method29791;
    }
    
    public static float method29791(final float n, final float n2, final float n3, final float n4) {
        if (n3 > 0.0f) {
            final float a = n2 - n;
            if (n4 > 0.0f) {
                if (n3 < n4) {
                    if (Math.abs(a) > 1.0E-6f) {
                        return n + a * Class3444.method11011(n3 / n4 * (4.61f - 1.0f / (0.13f + n4 / n3 / 10.0f)), 0.0f, 1.0f);
                    }
                }
            }
            return n2;
        }
        return n;
    }
}
