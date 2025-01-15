// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1169 implements Runnable
{
    private static String[] field6337;
    public final /* synthetic */ int field6338;
    public final /* synthetic */ int field6339;
    public final /* synthetic */ int field6340;
    public final /* synthetic */ int field6341;
    public final /* synthetic */ float[] field6342;
    public final /* synthetic */ Class7978 field6343;
    
    public Class1169(final Class7978 field6343, final int field6344, final int field6345, final int field6346, final int field6347, final float[] field6348) {
        this.field6343 = field6343;
        this.field6338 = field6344;
        this.field6339 = field6345;
        this.field6340 = field6346;
        this.field6341 = field6347;
        this.field6342 = field6348;
    }
    
    @Override
    public void run() {
        for (int i = this.field6338; i < this.field6339; ++i) {
            final int n = 2 * i;
            final int n2 = this.field6340 + (this.field6341 - n) % this.field6341;
            this.field6342[n2] = this.field6342[this.field6340 + n];
            this.field6342[n2 + 1] = -this.field6342[this.field6340 + n + 1];
        }
    }
}
