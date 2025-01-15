// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class974 implements Runnable
{
    private static String[] field5188;
    public final /* synthetic */ int field5189;
    public final /* synthetic */ int field5190;
    public final /* synthetic */ int field5191;
    public final /* synthetic */ double[] field5192;
    public final /* synthetic */ Class8806 field5193;
    
    public Class974(final Class8806 field5193, final int field5194, final int field5195, final int field5196, final double[] field5197) {
        this.field5193 = field5193;
        this.field5189 = field5194;
        this.field5190 = field5195;
        this.field5191 = field5196;
        this.field5192 = field5197;
    }
    
    @Override
    public void run() {
        final int n = this.field5189 + Class8806.method30729(this.field5193) - 1;
        for (int i = this.field5190; i < this.field5191; ++i) {
            final int n2 = this.field5189 + i;
            final double n3 = this.field5192[n2];
            final int n4 = n - i;
            this.field5192[n2] = this.field5192[n4];
            this.field5192[n4] = n3;
        }
    }
}
