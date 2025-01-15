// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1178 implements Runnable
{
    private static String[] field6388;
    public final /* synthetic */ long field6389;
    public final /* synthetic */ long field6390;
    public final /* synthetic */ Class22 field6391;
    public final /* synthetic */ Class8328 field6392;
    
    public Class1178(final Class8328 field6392, final long field6393, final long field6394, final Class22 field6395) {
        this.field6392 = field6392;
        this.field6389 = field6393;
        this.field6390 = field6394;
        this.field6391 = field6395;
    }
    
    @Override
    public void run() {
        for (long field6389 = this.field6389; field6389 < this.field6390; ++field6389) {
            Class8328.method27759(this.field6392).method25936(this.field6391, field6389 * Class8328.method27764(this.field6392));
        }
    }
}
