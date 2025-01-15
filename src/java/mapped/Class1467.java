// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1467 implements Runnable
{
    private static String[] field8145;
    public final /* synthetic */ long field8146;
    public final /* synthetic */ long field8147;
    public final /* synthetic */ long field8148;
    public final /* synthetic */ Class17 field8149;
    public final /* synthetic */ Class17 field8150;
    public final /* synthetic */ long field8151;
    
    public Class1467(final long field8146, final long field8147, final long field8148, final Class17 field8149, final Class17 field8150, final long field8151) {
        this.field8146 = field8146;
        this.field8147 = field8147;
        this.field8148 = field8148;
        this.field8149 = field8149;
        this.field8150 = field8150;
        this.field8151 = field8151;
    }
    
    @Override
    public void run() {
        final long n = this.field8146 + this.field8147;
        long n2 = 1L;
        long field8148 = this.field8148;
        while (field8148 > 512L) {
            field8148 >>= 2;
            n2 <<= 2;
            Class9133.method33218(field8148, this.field8149, n - field8148, this.field8150, this.field8151 - field8148);
        }
        Class9133.method33214(field8148, 0L, this.field8149, n - field8148, this.field8151, this.field8150);
        long n3 = n2 >> 1;
        final long n4 = this.field8146 - field8148;
        for (long n5 = this.field8147 - field8148; n5 > 0L; n5 -= field8148) {
            ++n3;
            Class9133.method33214(field8148, Class9133.method33212(field8148, n5, n3, this.field8149, this.field8146, this.field8151, this.field8150), this.field8149, n4 + n5, this.field8151, this.field8150);
        }
    }
}
