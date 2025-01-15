// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1279 implements Runnable
{
    private static String[] field6987;
    public final /* synthetic */ long field6988;
    public final /* synthetic */ long field6989;
    public final /* synthetic */ long field6990;
    public final /* synthetic */ Class17 field6991;
    public final /* synthetic */ Class8806 field6992;
    
    public Class1279(final Class8806 field6992, final long field6993, final long field6994, final long field6995, final Class17 field6996) {
        this.field6992 = field6992;
        this.field6988 = field6993;
        this.field6989 = field6994;
        this.field6990 = field6995;
        this.field6991 = field6996;
    }
    
    @Override
    public void run() {
        final long n = this.field6988 + Class8806.method30730(this.field6992) - 1L;
        for (long field6989 = this.field6989; field6989 < this.field6990; ++field6989) {
            final long n2 = this.field6988 + field6989;
            final double method137 = this.field6991.method137(n2);
            final long n3 = n - field6989;
            this.field6991.method171(n2, this.field6991.method137(n3));
            this.field6991.method171(n3, method137);
        }
    }
}
