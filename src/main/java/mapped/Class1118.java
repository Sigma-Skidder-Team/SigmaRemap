// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1118 implements Runnable
{
    private static String[] field6021;
    public final /* synthetic */ int field6022;
    public final /* synthetic */ int field6023;
    public final /* synthetic */ int field6024;
    public final /* synthetic */ float[] field6025;
    public final /* synthetic */ float[] field6026;
    public final /* synthetic */ Class8673 field6027;
    
    public Class1118(final Class8673 field6027, final int field6028, final int field6029, final int field6030, final float[] field6031, final float[] field6032) {
        this.field6027 = field6027;
        this.field6022 = field6028;
        this.field6023 = field6029;
        this.field6024 = field6030;
        this.field6025 = field6031;
        this.field6026 = field6032;
    }
    
    @Override
    public void run() {
        for (int i = this.field6022; i < this.field6023; ++i) {
            final int n = 2 * i;
            this.field6025[this.field6024 + i] = Class8673.method29703(this.field6027)[n] * this.field6026[n] - Class8673.method29703(this.field6027)[n + 1] * this.field6026[n + 1];
        }
    }
}
