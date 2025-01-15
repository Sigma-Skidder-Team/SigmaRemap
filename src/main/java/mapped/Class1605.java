// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1605 implements Runnable
{
    private static String[] field8968;
    public final /* synthetic */ int field8969;
    public final /* synthetic */ int field8970;
    public final /* synthetic */ double[][][] field8971;
    public final /* synthetic */ Class5815 field8972;
    
    public Class1605(final Class5815 field8972, final int field8973, final int field8974, final double[][][] field8975) {
        this.field8972 = field8972;
        this.field8969 = field8973;
        this.field8970 = field8974;
        this.field8971 = field8975;
    }
    
    @Override
    public void run() {
        for (int i = this.field8969; i < this.field8970; ++i) {
            for (int j = 0; j < Class5815.method17498(this.field8972); ++j) {
                Class5815.method17500(this.field8972).method21386(this.field8971[i][j]);
            }
        }
    }
}
