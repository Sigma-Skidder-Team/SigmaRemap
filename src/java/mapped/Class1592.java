// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1592 implements Runnable
{
    private static String[] field8882;
    public final /* synthetic */ long field8883;
    public final /* synthetic */ long field8884;
    public final /* synthetic */ Class17 field8885;
    public final /* synthetic */ boolean field8886;
    public final /* synthetic */ Class8983 field8887;
    
    public Class1592(final Class8983 field8887, final long field8888, final long field8889, final Class17 field8890, final boolean field8891) {
        this.field8887 = field8887;
        this.field8883 = field8888;
        this.field8884 = field8889;
        this.field8885 = field8890;
        this.field8886 = field8891;
    }
    
    @Override
    public void run() {
        for (long field8883 = this.field8883; field8883 < this.field8884; ++field8883) {
            Class8983.method31975(this.field8887).method26097(this.field8885, field8883 * Class8983.method31980(this.field8887), this.field8886);
        }
    }
}
