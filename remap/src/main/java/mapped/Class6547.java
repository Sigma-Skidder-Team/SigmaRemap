// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6547 extends Class6546
{
    private static String[] field26017;
    public final /* synthetic */ int[] field26018;
    public final /* synthetic */ int field26019;
    
    public Class6547(final int[] field26018, final int field26019) {
        this.field26018 = field26018;
        this.field26019 = field26019;
    }
    
    @Override
    public int method19832() {
        return this.field26018[this.field26019];
    }
    
    @Override
    public void method19833(final int n) {
        this.field26018[this.field26019] = n;
    }
}
