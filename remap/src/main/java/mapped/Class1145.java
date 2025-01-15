// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1145 implements Runnable
{
    private static String[] field6188;
    public final /* synthetic */ int field6189;
    public final /* synthetic */ int field6190;
    public final /* synthetic */ double[] field6191;
    public final /* synthetic */ Class5815 field6192;
    
    public Class1145(final Class5815 field6192, final int field6193, final int field6194, final double[] field6195) {
        this.field6192 = field6192;
        this.field6189 = field6193;
        this.field6190 = field6194;
        this.field6191 = field6195;
    }
    
    @Override
    public void run() {
        for (int i = this.field6189; i < this.field6190; ++i) {
            final int n = i * Class5815.method17497(this.field6192);
            for (int j = 0; j < Class5815.method17498(this.field6192); ++j) {
                Class5815.method17500(this.field6192).method21388(this.field6191, n + j * Class5815.method17499(this.field6192));
            }
        }
    }
}
