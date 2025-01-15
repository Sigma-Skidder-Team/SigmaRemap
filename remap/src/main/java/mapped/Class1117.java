// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1117 implements Runnable
{
    private static String[] field6015;
    public final /* synthetic */ int field6016;
    public final /* synthetic */ int field6017;
    public final /* synthetic */ float[] field6018;
    public final /* synthetic */ boolean field6019;
    public final /* synthetic */ Class6362 field6020;
    
    public Class1117(final Class6362 field6020, final int field6021, final int field6022, final float[] field6023, final boolean field6024) {
        this.field6020 = field6020;
        this.field6016 = field6021;
        this.field6017 = field6022;
        this.field6018 = field6023;
        this.field6019 = field6024;
    }
    
    @Override
    public void run() {
        for (int i = this.field6016; i < this.field6017; ++i) {
            final int n = i * Class6362.method18997(this.field6020);
            for (int j = 0; j < Class6362.method18998(this.field6020); ++j) {
                Class6362.method19000(this.field6020).method25931(this.field6018, n + j * Class6362.method18999(this.field6020), this.field6019);
            }
        }
    }
}
