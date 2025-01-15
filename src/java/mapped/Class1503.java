// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1503 implements Runnable
{
    private static String[] field8363;
    public final /* synthetic */ int field8364;
    public final /* synthetic */ int field8365;
    public final /* synthetic */ float[] field8366;
    public final /* synthetic */ Class7978 field8367;
    
    public Class1503(final Class7978 field8367, final int field8368, final int field8369, final float[] field8370) {
        this.field8367 = field8367;
        this.field8364 = field8368;
        this.field8365 = field8369;
        this.field8366 = field8370;
    }
    
    @Override
    public void run() {
        for (int i = this.field8364; i < this.field8365; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            final float n3 = -this.field8366[n] * Class7978.method26005(this.field8367)[n2] + this.field8366[n2] * Class7978.method26005(this.field8367)[n];
            this.field8366[n] = this.field8366[n] * Class7978.method26005(this.field8367)[n] + this.field8366[n2] * Class7978.method26005(this.field8367)[n2];
            this.field8366[n2] = n3;
        }
    }
}
