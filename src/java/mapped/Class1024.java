// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1024 implements Runnable
{
    private static String[] field5484;
    public final /* synthetic */ int field5485;
    public final /* synthetic */ int field5486;
    public final /* synthetic */ double[] field5487;
    public final /* synthetic */ boolean field5488;
    public final /* synthetic */ Class4406 field5489;
    
    public Class1024(final Class4406 field5489, final int field5490, final int field5491, final double[] field5492, final boolean field5493) {
        this.field5489 = field5489;
        this.field5485 = field5490;
        this.field5486 = field5491;
        this.field5487 = field5492;
        this.field5488 = field5493;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class4406.method13334(this.field5489)];
        for (int i = this.field5485; i < this.field5486; ++i) {
            for (int j = 0; j < Class4406.method13334(this.field5489); ++j) {
                array[j] = this.field5487[j * Class4406.method13332(this.field5489) + i];
            }
            Class4406.method13335(this.field5489).method30721(array, this.field5488);
            for (int k = 0; k < Class4406.method13334(this.field5489); ++k) {
                this.field5487[k * Class4406.method13332(this.field5489) + i] = array[k];
            }
        }
    }
}
