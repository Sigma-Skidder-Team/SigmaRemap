// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1196 implements Runnable
{
    private static String[] field6480;
    public final /* synthetic */ long field6481;
    public final /* synthetic */ long field6482;
    public final /* synthetic */ Class22 field6483;
    public final /* synthetic */ boolean field6484;
    public final /* synthetic */ Class6710 field6485;
    
    public Class1196(final Class6710 field6485, final long field6486, final long field6487, final Class22 field6488, final boolean field6489) {
        this.field6485 = field6485;
        this.field6481 = field6486;
        this.field6482 = field6487;
        this.field6483 = field6488;
        this.field6484 = field6489;
    }
    
    @Override
    public void run() {
        for (long field6481 = this.field6481; field6481 < this.field6482; ++field6481) {
            Class6710.method20381(this.field6485).method34184(this.field6483, field6481 * Class6710.method20384(this.field6485), this.field6484);
        }
    }
}
