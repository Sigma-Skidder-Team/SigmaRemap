// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3452<T extends LivingEntity> extends Class3448<T>
{
    private static String[] field16275;
    private final Class817 field16290;
    
    public Class3452(final Class817 field16290, final Class<T> clazz, final float n, final double n2, final double n3) {
        super(field16290, clazz, n, n2, n3, Class9170.field38849::test);
        this.field16290 = field16290;
    }
    
    @Override
    public boolean method11013() {
        return !Class817.method4815(this.field16290) && super.method11013();
    }
    
    @Override
    public boolean method11017() {
        return !Class817.method4815(this.field16290) && super.method11017();
    }
}
