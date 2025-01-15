// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1018 implements Runnable
{
    private static String[] field5446;
    public final /* synthetic */ long field5447;
    public final /* synthetic */ long field5448;
    public final /* synthetic */ Class17 field5449;
    public final /* synthetic */ boolean field5450;
    public final /* synthetic */ Class4406 field5451;
    
    public Class1018(final Class4406 field5451, final long field5452, final long field5453, final Class17 field5454, final boolean field5455) {
        this.field5451 = field5451;
        this.field5447 = field5452;
        this.field5448 = field5453;
        this.field5449 = field5454;
        this.field5450 = field5455;
    }
    
    @Override
    public void run() {
        for (long field5447 = this.field5447; field5447 < this.field5448; ++field5447) {
            Class4406.method13333(this.field5451).method30728(this.field5449, field5447 * Class4406.method13336(this.field5451), this.field5450);
        }
    }
}
