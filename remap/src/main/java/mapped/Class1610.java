// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1610 implements Runnable
{
    private static String[] field8987;
    public final /* synthetic */ int field8988;
    public final /* synthetic */ int field8989;
    public final /* synthetic */ float[] field8990;
    public final /* synthetic */ int field8991;
    public final /* synthetic */ float[] field8992;
    public final /* synthetic */ Class8673 field8993;
    
    public Class1610(final Class8673 field8993, final int field8994, final int field8995, final float[] field8996, final int field8997, final float[] field8998) {
        this.field8993 = field8993;
        this.field8988 = field8994;
        this.field8989 = field8995;
        this.field8990 = field8996;
        this.field8991 = field8997;
        this.field8992 = field8998;
    }
    
    @Override
    public void run() {
        for (int i = this.field8988; i < this.field8989; ++i) {
            final int n = 2 * i;
            final float n2 = this.field8990[this.field8991 + i];
            this.field8992[n] = Class8673.method29703(this.field8993)[n] * n2;
            this.field8992[n + 1] = -Class8673.method29703(this.field8993)[n + 1] * n2;
        }
    }
}
