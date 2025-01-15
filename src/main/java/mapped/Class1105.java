// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1105 implements Runnable
{
    private static String[] field5966;
    public final /* synthetic */ int field5967;
    public final /* synthetic */ int field5968;
    public final /* synthetic */ int field5969;
    public final /* synthetic */ double[] field5970;
    public final /* synthetic */ Class8806 field5971;
    
    public Class1105(final Class8806 field5971, final int field5972, final int field5973, final int field5974, final double[] field5975) {
        this.field5971 = field5971;
        this.field5967 = field5972;
        this.field5968 = field5973;
        this.field5969 = field5974;
        this.field5970 = field5975;
    }
    
    @Override
    public void run() {
        final int n = this.field5967 + Class8806.method30729(this.field5971) - 1;
        for (int i = this.field5968; i < this.field5969; ++i) {
            final int n2 = this.field5967 + i;
            final double n3 = this.field5970[n2];
            final int n4 = n - i;
            this.field5970[n2] = this.field5970[n4];
            this.field5970[n4] = n3;
        }
    }
}
