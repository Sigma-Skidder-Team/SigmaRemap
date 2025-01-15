// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3462 extends Class3461
{
    private static String[] field16316;
    public final /* synthetic */ Class803 field16320;
    
    public Class3462(final Class803 field16320, final int n, final int n2) {
        this.field16320 = field16320;
        super(field16320, n2);
    }
    
    @Override
    public void method11015() {
        Class803.method4691(this.field16320);
        super.method11015();
    }
    
    @Override
    public boolean method11013() {
        return super.method11013() && this.method11026();
    }
    
    @Override
    public boolean method11017() {
        return super.method11017() && this.method11026();
    }
    
    private boolean method11026() {
        if (!this.field16320.method2783()) {
            if (!this.field16320.method4654()) {
                if (!Class803.method4692(this.field16320)) {
                    if (this.field16320.method4152() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
