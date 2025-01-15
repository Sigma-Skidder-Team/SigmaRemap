// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3619 extends Class3617
{
    private static String[] field16816;
    public final /* synthetic */ Class798 field16814;
    
    private Class3619(final Class798 field16814) {
        this.field16814 = field16814;
        super(field16814, null);
    }
    
    @Override
    public boolean method11137() {
        if (this.field16814.method4523()) {
            if (Class798.method4544(this.field16814)) {
                if (Class798.method4545(this.field16814).method1082(this.field16814.method1934(), 2.0)) {
                    final Class436 method6727 = this.field16814.world.method6727(Class798.method4545(this.field16814));
                    if (method6727 instanceof Class438) {
                        if (!((Class438)method6727).method2217()) {
                            return true;
                        }
                        Class798.method4546(this.field16814, null);
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11138() {
        return false;
    }
    
    @Override
    public void method11015() {
        final Class436 method6727 = this.field16814.world.method6727(Class798.method4545(this.field16814));
        if (method6727 instanceof Class438) {
            ((Class438)method6727).method2220(this.field16814, this.field16814.method4529());
        }
    }
}
