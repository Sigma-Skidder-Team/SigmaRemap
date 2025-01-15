// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1409 implements Runnable
{
    private static String[] field7784;
    public final /* synthetic */ long field7785;
    public final /* synthetic */ long field7786;
    public final /* synthetic */ Class17 field7787;
    public final /* synthetic */ long field7788;
    public final /* synthetic */ Class17 field7789;
    public final /* synthetic */ Class6062 field7790;
    
    public Class1409(final Class6062 field7790, final long field7791, final long field7792, final Class17 field7793, final long field7794, final Class17 field7795) {
        this.field7790 = field7790;
        this.field7785 = field7791;
        this.field7786 = field7792;
        this.field7787 = field7793;
        this.field7788 = field7794;
        this.field7789 = field7795;
    }
    
    @Override
    public void run() {
        for (long field7785 = this.field7785; field7785 < this.field7786; ++field7785) {
            final long n = 2L * field7785;
            final double method137 = this.field7787.method137(this.field7788 + field7785);
            this.field7789.method171(n, Class6062.method18051(this.field7790).method137(n) * method137);
            this.field7789.method171(n + 1L, -Class6062.method18051(this.field7790).method137(n + 1L) * method137);
        }
    }
}
