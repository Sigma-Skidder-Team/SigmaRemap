// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1092 implements Runnable
{
    private static String[] field5893;
    public final /* synthetic */ int field5894;
    public final /* synthetic */ int field5895;
    public final /* synthetic */ float[] field5896;
    public final /* synthetic */ Class6874 field5897;
    
    public Class1092(final Class6874 field5897, final int field5898, final int field5899, final float[] field5900) {
        this.field5897 = field5897;
        this.field5894 = field5898;
        this.field5895 = field5899;
        this.field5896 = field5900;
    }
    
    @Override
    public void run() {
        for (int i = this.field5894; i < this.field5895; ++i) {
            Class6874.method21034(this.field5897).method30447(this.field5896, i * Class6874.method21033(this.field5897));
        }
    }
}
