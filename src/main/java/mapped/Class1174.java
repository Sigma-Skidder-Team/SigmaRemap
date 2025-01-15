// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1174 implements Runnable
{
    private static String[] field6360;
    public final /* synthetic */ long field6361;
    public final /* synthetic */ long field6362;
    public final /* synthetic */ long field6363;
    public final /* synthetic */ Class22 field6364;
    public final /* synthetic */ Class22 field6365;
    public final /* synthetic */ long field6366;
    
    public Class1174(final long field6361, final long field6362, final long field6363, final Class22 field6364, final Class22 field6365, final long field6366) {
        this.field6361 = field6361;
        this.field6362 = field6362;
        this.field6363 = field6363;
        this.field6364 = field6364;
        this.field6365 = field6365;
        this.field6366 = field6366;
    }
    
    @Override
    public void run() {
        final long n = this.field6361 + this.field6362;
        long n2 = 1L;
        long field6363 = this.field6363;
        while (field6363 > 512L) {
            field6363 >>= 2;
            n2 <<= 2;
            Class9133.method33276(field6363, this.field6364, n - field6363, this.field6365, this.field6366 - field6363);
        }
        Class9133.method33272(field6363, 0L, this.field6364, n - field6363, this.field6366, this.field6365);
        long n3 = n2 >> 1;
        final long n4 = this.field6361 - field6363;
        for (long n5 = this.field6362 - field6363; n5 > 0L; n5 -= field6363) {
            ++n3;
            Class9133.method33272(field6363, Class9133.method33270(field6363, n5, n3, this.field6364, this.field6361, this.field6366, this.field6365), this.field6364, n4 + n5, this.field6366, this.field6365);
        }
    }
}
