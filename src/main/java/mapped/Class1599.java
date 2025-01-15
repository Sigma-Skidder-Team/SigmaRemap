// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1599 implements Runnable
{
    private static String[] field8929;
    public final /* synthetic */ int field8930;
    public final /* synthetic */ int field8931;
    public final /* synthetic */ float[] field8932;
    public final /* synthetic */ int field8933;
    public final /* synthetic */ Class8328 field8934;
    
    public Class1599(final Class8328 field8934, final int field8935, final int field8936, final float[] field8937, final int field8938) {
        this.field8934 = field8934;
        this.field8930 = field8935;
        this.field8931 = field8936;
        this.field8932 = field8937;
        this.field8933 = field8938;
    }
    
    @Override
    public void run() {
        for (int i = this.field8930; i < this.field8931; ++i) {
            Class8328.method27759(this.field8934).method25927(this.field8932, i * this.field8933);
        }
    }
}
