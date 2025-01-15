// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1108 implements Runnable
{
    private static String[] field5979;
    public final /* synthetic */ int field5980;
    public final /* synthetic */ int field5981;
    public final /* synthetic */ float[] field5982;
    public final /* synthetic */ boolean field5983;
    public final /* synthetic */ Class8328 field5984;
    
    public Class1108(final Class8328 field5984, final int field5985, final int field5986, final float[] field5987, final boolean field5988) {
        this.field5984 = field5984;
        this.field5980 = field5985;
        this.field5981 = field5986;
        this.field5982 = field5987;
        this.field5983 = field5988;
    }
    
    @Override
    public void run() {
        for (int i = this.field5980; i < this.field5981; ++i) {
            Class8328.method27759(this.field5984).method25949(this.field5982, i * Class8328.method27763(this.field5984), this.field5983);
        }
    }
}
