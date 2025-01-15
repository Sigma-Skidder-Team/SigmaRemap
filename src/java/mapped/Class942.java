// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class942 implements Runnable
{
    private static String[] field4969;
    public final /* synthetic */ int field4970;
    public final /* synthetic */ int field4971;
    public final /* synthetic */ double[] field4972;
    public final /* synthetic */ boolean field4973;
    public final /* synthetic */ Class7568 field4974;
    
    public Class942(final Class7568 field4974, final int field4975, final int field4976, final double[] field4977, final boolean field4978) {
        this.field4974 = field4974;
        this.field4970 = field4975;
        this.field4971 = field4976;
        this.field4972 = field4977;
        this.field4973 = field4978;
    }
    
    @Override
    public void run() {
        for (int i = this.field4970; i < this.field4971; ++i) {
            final int n = i * Class7568.method23776(this.field4974);
            for (int j = 0; j < Class7568.method23777(this.field4974); ++j) {
                Class7568.method23779(this.field4974).method30723(this.field4972, n + j * Class7568.method23778(this.field4974), this.field4973);
            }
        }
    }
}
