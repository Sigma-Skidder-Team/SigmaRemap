// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4690 implements Class4659
{
    public final /* synthetic */ int[] field20245;
    public final /* synthetic */ Runnable field20246;
    public final /* synthetic */ Class1189 field20247;
    
    public Class4690(final Class1189 field20247, final int[] field20248, final Runnable field20249) {
        this.field20247 = field20247;
        this.field20245 = field20248;
        this.field20246 = field20249;
    }
    
    @Override
    public void method13945(final Object... array) {
        Class4965.method15024().fine("pre-pause polling complete");
        final int[] field20245 = this.field20245;
        final int n = 0;
        final int n2 = field20245[n] - 1;
        field20245[n] = n2;
        if (n2 == 0) {
            this.field20246.run();
        }
    }
}
