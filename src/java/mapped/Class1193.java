// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1193 implements Runnable
{
    private static String[] field6463;
    public final /* synthetic */ int field6464;
    public final /* synthetic */ int field6465;
    public final /* synthetic */ double[] field6466;
    public final /* synthetic */ boolean field6467;
    public final /* synthetic */ Class7796 field6468;
    
    public Class1193(final Class7796 field6468, final int field6469, final int field6470, final double[] field6471, final boolean field6472) {
        this.field6468 = field6468;
        this.field6464 = field6469;
        this.field6465 = field6470;
        this.field6466 = field6471;
        this.field6467 = field6472;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7796.method25149(this.field6468)];
        for (int i = this.field6464; i < this.field6465; ++i) {
            final int n = i * Class7796.method25145(this.field6468);
            for (int j = 0; j < Class7796.method25147(this.field6468); ++j) {
                for (int k = 0; k < Class7796.method25149(this.field6468); ++k) {
                    array[k] = this.field6466[k * Class7796.method25143(this.field6468) + n + j];
                }
                Class7796.method25150(this.field6468).method18036(array, this.field6467);
                for (int l = 0; l < Class7796.method25149(this.field6468); ++l) {
                    this.field6466[l * Class7796.method25143(this.field6468) + n + j] = array[l];
                }
            }
        }
    }
}
