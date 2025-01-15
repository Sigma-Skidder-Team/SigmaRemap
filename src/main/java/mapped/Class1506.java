// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1506 implements Runnable
{
    private static String[] field8378;
    public final /* synthetic */ long field8379;
    public final /* synthetic */ long field8380;
    public final /* synthetic */ Class17 field8381;
    public final /* synthetic */ long field8382;
    public final /* synthetic */ boolean field8383;
    public final /* synthetic */ Class8983 field8384;
    
    public Class1506(final Class8983 field8384, final long field8385, final long field8386, final Class17 field8387, final long field8388, final boolean field8389) {
        this.field8384 = field8384;
        this.field8379 = field8385;
        this.field8380 = field8386;
        this.field8381 = field8387;
        this.field8382 = field8388;
        this.field8383 = field8389;
    }
    
    @Override
    public void run() {
        for (long field8379 = this.field8379; field8379 < this.field8380; ++field8379) {
            Class8983.method31975(this.field8384).method26079(this.field8381, field8379 * this.field8382, this.field8383);
        }
    }
}
