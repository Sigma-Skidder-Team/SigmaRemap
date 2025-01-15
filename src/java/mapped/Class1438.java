// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1438 implements Runnable
{
    private static String[] field7961;
    public final /* synthetic */ long field7962;
    public final /* synthetic */ long field7963;
    public final /* synthetic */ long field7964;
    public final /* synthetic */ Class22 field7965;
    public final /* synthetic */ Class22 field7966;
    public final /* synthetic */ long field7967;
    
    public Class1438(final long field7962, final long field7963, final long field7964, final Class22 field7965, final Class22 field7966, final long field7967) {
        this.field7962 = field7962;
        this.field7963 = field7963;
        this.field7964 = field7964;
        this.field7965 = field7965;
        this.field7966 = field7966;
        this.field7967 = field7967;
    }
    
    @Override
    public void run() {
        final long n = this.field7962 + this.field7963;
        long field7964 = this.field7964;
        while (field7964 > 512L) {
            field7964 >>= 2;
            Class9133.method33274(field7964, this.field7965, n - field7964, this.field7966, this.field7967 - (field7964 >> 1));
        }
        Class9133.method33272(field7964, 1L, this.field7965, n - field7964, this.field7967, this.field7966);
        long n2 = 0L;
        final long n3 = this.field7962 - field7964;
        for (long n4 = this.field7963 - field7964; n4 > 0L; n4 -= field7964) {
            ++n2;
            Class9133.method33272(field7964, Class9133.method33270(field7964, n4, n2, this.field7965, this.field7962, this.field7967, this.field7966), this.field7965, n3 + n4, this.field7967, this.field7966);
        }
    }
}
