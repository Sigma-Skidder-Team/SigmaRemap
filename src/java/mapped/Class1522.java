// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1522 implements Runnable
{
    private static String[] field8485;
    public final /* synthetic */ long field8486;
    public final /* synthetic */ long field8487;
    public final /* synthetic */ long field8488;
    public final /* synthetic */ long field8489;
    public final /* synthetic */ Class22 field8490;
    public final /* synthetic */ long field8491;
    public final /* synthetic */ Class6362 field8492;
    
    public Class1522(final Class6362 field8492, final long field8493, final long field8494, final long field8495, final long field8496, final Class22 field8497, final long field8498) {
        this.field8492 = field8492;
        this.field8486 = field8493;
        this.field8487 = field8494;
        this.field8488 = field8495;
        this.field8489 = field8496;
        this.field8490 = field8497;
        this.field8491 = field8498;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field8486);
        for (long field8487 = this.field8487; field8487 >= this.field8488; --field8487) {
            final long n = field8487 * Class6362.method19005(this.field8492);
            final long n2 = field8487 * this.field8489;
            for (long n3 = Class6362.method19006(this.field8492) - 1L; n3 >= 0L; --n3) {
                Class8601.method29152(this.field8490, n + n3 * Class6362.method19007(this.field8492), class22, 0L, Class6362.method19008(this.field8492));
                Class6362.method19000(this.field8492).method25938(class22);
                Class8601.method29152(class22, 0L, this.field8490, n2 + n3 * this.field8491, this.field8486);
            }
        }
    }
}
