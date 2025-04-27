// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3464 extends Class3446
{
    private static String[] field16325;
    private final Class853 field16326;
    
    public Class3464(final Class853 field16326) {
        this.field16326 = field16326;
        this.method11019(EnumSet.of(Class2139.field12582, Class2139.field12580));
        field16326.method4150().method24741(true);
    }
    
    @Override
    public boolean method11013() {
        if (this.field16326.method1706() || this.field16326.method1723()) {
            return this.field16326.method4148() instanceof Class6567;
        }
        return false;
    }
    
    @Override
    public void method11016() {
        if (this.field16326.method2633().nextFloat() < 0.8f) {
            this.field16326.method4149().method22382();
        }
        ((Class6567)this.field16326.method4148()).method19914(1.2);
    }
}
