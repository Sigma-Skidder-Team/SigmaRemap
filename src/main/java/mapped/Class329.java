// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class329 implements Class328
{
    private Class305 field2044;
    private Class327[] field2045;
    private int field2046;
    
    public Class329(final Class305 field2044, final Class327[] field2045) {
        this.field2046 = -1;
        this.field2044 = field2044;
        this.field2045 = field2045;
    }
    
    @Override
    public float method1009() {
        final Class327[] field2045 = this.field2045;
        switch (Class8465.field34747[this.field2044.ordinal()]) {
            case 1: {
                if (!(field2045[0] instanceof Class337)) {
                    final float method1010 = method1010(field2045, 0);
                    final float n = (field2045.length > 1) ? method1010(field2045, 1) : 1.0f;
                    final float n2 = (field2045.length > 2) ? method1010(field2045, 2) : n;
                    if (this.field2046 < 0) {
                        this.field2046 = Class7901.method25571();
                    }
                    return Class7901.method25570(this.field2046, method1010, n, n2);
                }
                break;
            }
        }
        return this.field2044.method968(this.field2045);
    }
    
    private static float method1010(final Class327[] array, final int n) {
        return ((Class328)array[n]).method1009();
    }
    
    @Override
    public String toString() {
        return "" + this.field2044 + "()";
    }
}
