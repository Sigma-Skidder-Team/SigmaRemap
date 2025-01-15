// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class944 implements Runnable
{
    private static String[] field4981;
    public final /* synthetic */ int field4982;
    public final /* synthetic */ int field4983;
    public final /* synthetic */ double[] field4984;
    public final /* synthetic */ boolean field4985;
    public final /* synthetic */ Class4406 field4986;
    
    public Class944(final Class4406 field4986, final int field4987, final int field4988, final double[] field4989, final boolean field4990) {
        this.field4986 = field4986;
        this.field4982 = field4987;
        this.field4983 = field4988;
        this.field4984 = field4989;
        this.field4985 = field4990;
    }
    
    @Override
    public void run() {
        for (int i = this.field4982; i < this.field4983; ++i) {
            Class4406.method13333(this.field4986).method30723(this.field4984, i * Class4406.method13332(this.field4986), this.field4985);
        }
    }
}
