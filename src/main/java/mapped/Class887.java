// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class887 implements Runnable
{
    private static String[] field4788;
    public final /* synthetic */ int field4789;
    public final /* synthetic */ int field4790;
    public final /* synthetic */ int field4791;
    public final /* synthetic */ double[] field4792;
    public final /* synthetic */ double[] field4793;
    public final /* synthetic */ int field4794;
    
    public Class887(final int field4789, final int field4790, final int field4791, final double[] field4792, final double[] field4793, final int field4794) {
        this.field4789 = field4789;
        this.field4790 = field4790;
        this.field4791 = field4791;
        this.field4792 = field4792;
        this.field4793 = field4793;
        this.field4794 = field4794;
    }
    
    @Override
    public void run() {
        final int n = this.field4789 + this.field4790;
        int i = this.field4791;
        while (i > 512) {
            i >>= 2;
            Class9133.method33215(i, this.field4792, n - i, this.field4793, this.field4794 - (i >> 1));
        }
        Class9133.method33213(i, 1, this.field4792, n - i, this.field4794, this.field4793);
        int n2 = 0;
        final int n3 = this.field4789 - i;
        for (int j = this.field4790 - i; j > 0; j -= i) {
            ++n2;
            Class9133.method33213(i, Class9133.method33211(i, j, n2, this.field4792, this.field4789, this.field4794, this.field4793), this.field4792, n3 + j, this.field4794, this.field4793);
        }
    }
}
