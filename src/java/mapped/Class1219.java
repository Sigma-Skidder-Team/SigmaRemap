// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1219 implements Runnable
{
    private static String[] field6618;
    public final /* synthetic */ int field6619;
    public final /* synthetic */ int field6620;
    public final /* synthetic */ double[] field6621;
    public final /* synthetic */ boolean field6622;
    public final /* synthetic */ Class7568 field6623;
    
    public Class1219(final Class7568 field6623, final int field6624, final int field6625, final double[] field6626, final boolean field6627) {
        this.field6623 = field6623;
        this.field6619 = field6624;
        this.field6620 = field6625;
        this.field6621 = field6626;
        this.field6622 = field6627;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7568.method23777(this.field6623)];
        for (int i = this.field6619; i < this.field6620; ++i) {
            final int n = i * Class7568.method23776(this.field6623);
            for (int j = 0; j < Class7568.method23780(this.field6623); ++j) {
                for (int k = 0; k < Class7568.method23777(this.field6623); ++k) {
                    array[k] = this.field6621[n + k * Class7568.method23778(this.field6623) + j];
                }
                Class7568.method23781(this.field6623).method30721(array, this.field6622);
                for (int l = 0; l < Class7568.method23777(this.field6623); ++l) {
                    this.field6621[n + l * Class7568.method23778(this.field6623) + j] = array[l];
                }
            }
        }
    }
}
