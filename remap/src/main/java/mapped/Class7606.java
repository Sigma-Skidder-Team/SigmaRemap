// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7606 implements Class7604
{
    private static String[] field30153;
    public final /* synthetic */ Class490 field30154;
    
    public Class7606(final Class490 field30154) {
        this.field30154 = field30154;
    }
    
    @Override
    public int method23902(final int n) {
        switch (n) {
            case 0: {
                return Class490.method2454(this.field30154);
            }
            case 1: {
                return Class5328.method16451(Class490.method2455(this.field30154));
            }
            case 2: {
                return Class5328.method16451(Class490.method2456(this.field30154));
            }
            default: {
                return 0;
            }
        }
    }
    
    @Override
    public void method23903(final int n, final int n2) {
        switch (n) {
            case 0: {
                Class490.method2457(this.field30154, n2);
                break;
            }
            case 1: {
                if (!this.field30154.field2656.isRemote && !Class490.method2458(this.field30154).isEmpty()) {
                    this.field30154.method2449(Class8520.field35013);
                }
                Class490.method2459(this.field30154, Class490.method2460(n2));
                break;
            }
            case 2: {
                Class490.method2461(this.field30154, Class490.method2460(n2));
                break;
            }
        }
    }
    
    @Override
    public int method23904() {
        return 3;
    }
}
