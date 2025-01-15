// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1191 implements Runnable
{
    private static String[] field6449;
    public final /* synthetic */ int field6450;
    public final /* synthetic */ long field6451;
    public final /* synthetic */ int field6452;
    public final /* synthetic */ Class22 field6453;
    public final /* synthetic */ boolean field6454;
    public final /* synthetic */ Class6710 field6455;
    
    public Class1191(final Class6710 field6455, final int field6456, final long field6457, final int field6458, final Class22 field6459, final boolean field6460) {
        this.field6455 = field6455;
        this.field6450 = field6456;
        this.field6451 = field6457;
        this.field6452 = field6458;
        this.field6453 = field6459;
        this.field6454 = field6460;
    }
    
    @Override
    public void run() {
        if (this.field6450 != -1) {
            for (long field6451 = this.field6451; field6451 < Class6710.method20382(this.field6455); field6451 += this.field6452) {
                Class6710.method20381(this.field6455).method34188(this.field6453, field6451 * Class6710.method20384(this.field6455), this.field6454);
            }
        }
        else {
            for (long field6452 = this.field6451; field6452 < Class6710.method20385(this.field6455); field6452 += this.field6452) {
                Class6710.method20381(this.field6455).method34184(this.field6453, field6452 * Class6710.method20384(this.field6455), this.field6454);
            }
        }
    }
}
