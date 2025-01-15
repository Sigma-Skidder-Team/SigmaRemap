// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1629 implements Runnable
{
    private static String[] field9107;
    public final /* synthetic */ int field9108;
    public final /* synthetic */ int field9109;
    public final /* synthetic */ double[] field9110;
    public final /* synthetic */ boolean field9111;
    public final /* synthetic */ Class7796 field9112;
    
    public Class1629(final Class7796 field9112, final int field9113, final int field9114, final double[] field9115, final boolean field9116) {
        this.field9112 = field9112;
        this.field9108 = field9113;
        this.field9109 = field9114;
        this.field9110 = field9115;
        this.field9111 = field9116;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7796.method25144(this.field9112)];
        for (int i = this.field9108; i < this.field9109; ++i) {
            final int n = i * Class7796.method25143(this.field9112);
            for (int j = 0; j < Class7796.method25147(this.field9112); ++j) {
                for (int k = 0; k < Class7796.method25144(this.field9112); ++k) {
                    array[k] = this.field9110[n + k * Class7796.method25145(this.field9112) + j];
                }
                Class7796.method25148(this.field9112).method18036(array, this.field9111);
                for (int l = 0; l < Class7796.method25144(this.field9112); ++l) {
                    this.field9110[n + l * Class7796.method25145(this.field9112) + j] = array[l];
                }
            }
        }
    }
}
