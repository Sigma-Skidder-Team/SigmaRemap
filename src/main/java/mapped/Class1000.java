// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1000 implements Runnable
{
    private static String[] field5336;
    public final /* synthetic */ long field5337;
    public final /* synthetic */ long field5338;
    public final /* synthetic */ long field5339;
    public final /* synthetic */ Class17 field5340;
    public final /* synthetic */ Class8806 field5341;
    
    public Class1000(final Class8806 field5341, final long field5342, final long field5343, final long field5344, final Class17 field5345) {
        this.field5341 = field5341;
        this.field5337 = field5342;
        this.field5338 = field5343;
        this.field5339 = field5344;
        this.field5340 = field5345;
    }
    
    @Override
    public void run() {
        final long n = this.field5337 + Class8806.method30730(this.field5341) - 1L;
        for (long field5338 = this.field5338; field5338 < this.field5339; ++field5338) {
            final long n2 = this.field5337 + field5338;
            final double method137 = this.field5340.method137(n2);
            final long n3 = n - field5338;
            this.field5340.method171(n2, this.field5340.method137(n3));
            this.field5340.method171(n3, method137);
        }
    }
}
