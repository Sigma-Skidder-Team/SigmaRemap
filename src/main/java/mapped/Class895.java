// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class895 implements Runnable
{
    private static String[] field4835;
    public final /* synthetic */ long field4836;
    public final /* synthetic */ long field4837;
    public final /* synthetic */ Class17 field4838;
    public final /* synthetic */ boolean field4839;
    public final /* synthetic */ Class4406 field4840;
    
    public Class895(final Class4406 field4840, final long field4841, final long field4842, final Class17 field4843, final boolean field4844) {
        this.field4840 = field4840;
        this.field4836 = field4841;
        this.field4837 = field4842;
        this.field4838 = field4843;
        this.field4839 = field4844;
    }
    
    @Override
    public void run() {
        for (long field4836 = this.field4836; field4836 < this.field4837; ++field4836) {
            Class4406.method13333(this.field4840).method30724(this.field4838, field4836 * Class4406.method13336(this.field4840), this.field4839);
        }
    }
}
