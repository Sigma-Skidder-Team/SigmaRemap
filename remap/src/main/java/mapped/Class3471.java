// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;
import java.util.function.Predicate;

public class Class3471 extends Class3470
{
    private static String[] field16356;
    
    public Class3471(final Class759 class759) {
        super(class759, 6, Class775.method4285());
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11017() {
        return ((Class775)this.field16340).method4293() && super.method11017();
    }
    
    @Override
    public boolean method11013() {
        final Class775 class775 = (Class775)this.field16340;
        if (class775.method4293()) {
            if (Class775.method4286(class775).nextInt(10) == 0) {
                return super.method11013();
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16340.method2641(0);
    }
}
