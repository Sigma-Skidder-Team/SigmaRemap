// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1643 implements Runnable
{
    private static String[] field9187;
    public final /* synthetic */ long field9188;
    public final /* synthetic */ long field9189;
    public final /* synthetic */ long field9190;
    public final /* synthetic */ Class17 field9191;
    public final /* synthetic */ Class17 field9192;
    public final /* synthetic */ long field9193;
    
    public Class1643(final long field9188, final long field9189, final long field9190, final Class17 field9191, final Class17 field9192, final long field9193) {
        this.field9188 = field9188;
        this.field9189 = field9189;
        this.field9190 = field9190;
        this.field9191 = field9191;
        this.field9192 = field9192;
        this.field9193 = field9193;
    }
    
    @Override
    public void run() {
        final long n = this.field9188 + this.field9189;
        long field9190 = this.field9190;
        while (field9190 > 512L) {
            field9190 >>= 2;
            Class9133.method33216(field9190, this.field9191, n - field9190, this.field9192, this.field9193 - (field9190 >> 1));
        }
        Class9133.method33214(field9190, 1L, this.field9191, n - field9190, this.field9193, this.field9192);
        long n2 = 0L;
        final long n3 = this.field9188 - field9190;
        for (long n4 = this.field9189 - field9190; n4 > 0L; n4 -= field9190) {
            ++n2;
            Class9133.method33214(field9190, Class9133.method33212(field9190, n4, n2, this.field9191, this.field9188, this.field9193, this.field9192), this.field9191, n3 + n4, this.field9193, this.field9192);
        }
    }
}
