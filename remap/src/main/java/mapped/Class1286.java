// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1286 implements Runnable
{
    private static String[] field7024;
    public final /* synthetic */ int field7025;
    public final /* synthetic */ int field7026;
    public final /* synthetic */ float[] field7027;
    public final /* synthetic */ boolean field7028;
    public final /* synthetic */ Class5934 field7029;
    
    public Class1286(final Class5934 field7029, final int field7030, final int field7031, final float[] field7032, final boolean field7033) {
        this.field7029 = field7029;
        this.field7025 = field7030;
        this.field7026 = field7031;
        this.field7027 = field7032;
        this.field7028 = field7033;
    }
    
    @Override
    public void run() {
        for (int i = this.field7025; i < this.field7026; ++i) {
            final int n = i * Class5934.method17837(this.field7029);
            for (int j = 0; j < Class5934.method17838(this.field7029); ++j) {
                Class5934.method17840(this.field7029).method30451(this.field7027, n + j * Class5934.method17839(this.field7029), this.field7028);
            }
        }
    }
}
