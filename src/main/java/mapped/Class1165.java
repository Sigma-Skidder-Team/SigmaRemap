// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1165 implements Runnable
{
    private static String[] field6319;
    public final /* synthetic */ int field6320;
    public final /* synthetic */ int field6321;
    public final /* synthetic */ float[] field6322;
    public final /* synthetic */ boolean field6323;
    public final /* synthetic */ Class7706 field6324;
    
    public Class1165(final Class7706 field6324, final int field6325, final int field6326, final float[] field6327, final boolean field6328) {
        this.field6324 = field6324;
        this.field6320 = field6325;
        this.field6321 = field6326;
        this.field6322 = field6327;
        this.field6323 = field6328;
    }
    
    @Override
    public void run() {
        for (int i = this.field6320; i < this.field6321; ++i) {
            Class7706.method24577(this.field6324).method29695(this.field6322, i * Class7706.method24576(this.field6324), this.field6323);
        }
    }
}
