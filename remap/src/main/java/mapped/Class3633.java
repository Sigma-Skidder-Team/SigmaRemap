// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3633 extends Class3446
{
    private static String[] field16869;
    private final Class787 field16870;
    
    public Class3633(final Class787 field16870) {
        this.field16870 = field16870;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16870.world.method6703()) {
            if (this.field16870.method2718(Class2215.field13605).method27620()) {
                if (this.field16870.method4150() instanceof Class7747) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        ((Class7747)this.field16870.method4150()).method24749(true);
    }
    
    @Override
    public void method11018() {
        ((Class7747)this.field16870.method4150()).method24749(false);
    }
}
