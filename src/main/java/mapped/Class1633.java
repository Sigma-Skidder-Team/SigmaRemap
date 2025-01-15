// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1633 implements Runnable
{
    private static String[] field9126;
    public final /* synthetic */ int field9127;
    public final /* synthetic */ int field9128;
    public final /* synthetic */ float[] field9129;
    public final /* synthetic */ int field9130;
    public final /* synthetic */ boolean field9131;
    public final /* synthetic */ Class8328 field9132;
    
    public Class1633(final Class8328 field9132, final int field9133, final int field9134, final float[] field9135, final int field9136, final boolean field9137) {
        this.field9132 = field9132;
        this.field9127 = field9133;
        this.field9128 = field9134;
        this.field9129 = field9135;
        this.field9130 = field9136;
        this.field9131 = field9137;
    }
    
    @Override
    public void run() {
        for (int i = this.field9127; i < this.field9128; ++i) {
            Class8328.method27759(this.field9132).method25931(this.field9129, i * this.field9130, this.field9131);
        }
    }
}
