// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7608 implements Class7604
{
    private static String[] field30157;
    public final /* synthetic */ Class461 field30158;
    
    public Class7608(final Class461 field30158) {
        this.field30158 = field30158;
    }
    
    @Override
    public int method23902(final int n) {
        switch (n) {
            case 0: {
                return Class461.method2340(this.field30158);
            }
            case 1: {
                return Class461.method2341(this.field30158);
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
                Class461.method2342(this.field30158, n2);
                break;
            }
            case 1: {
                Class461.method2343(this.field30158, n2);
                break;
            }
        }
    }
    
    @Override
    public int method23904() {
        return 2;
    }
}
