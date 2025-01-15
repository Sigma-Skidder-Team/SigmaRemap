// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1149 implements Runnable
{
    private static String[] field6213;
    public final /* synthetic */ long field6214;
    public final /* synthetic */ long field6215;
    public final /* synthetic */ long field6216;
    public final /* synthetic */ Class17 field6217;
    public final /* synthetic */ Class8983 field6218;
    
    public Class1149(final Class8983 field6218, final long field6219, final long field6220, final long field6221, final Class17 field6222) {
        this.field6218 = field6218;
        this.field6214 = field6219;
        this.field6215 = field6220;
        this.field6216 = field6221;
        this.field6217 = field6222;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(2L * Class8983.method31978(this.field6218), false);
        for (long field6214 = this.field6214; field6214 < this.field6215; ++field6214) {
            final long n = 2L * field6214;
            for (long n2 = 0L; n2 < Class8983.method31978(this.field6218); ++n2) {
                final long n3 = 2L * n2;
                final long n4 = n2 * this.field6216 + n;
                class17.method171(n3, this.field6217.method137(n4));
                class17.method171(n3 + 1L, this.field6217.method137(n4 + 1L));
            }
            Class8983.method31977(this.field6218).method26073(class17);
            for (long n5 = 0L; n5 < Class8983.method31978(this.field6218); ++n5) {
                final long n6 = 2L * n5;
                final long n7 = n5 * this.field6216 + n;
                this.field6217.method171(n7, class17.method137(n6));
                this.field6217.method171(n7 + 1L, class17.method137(n6 + 1L));
            }
        }
    }
}
