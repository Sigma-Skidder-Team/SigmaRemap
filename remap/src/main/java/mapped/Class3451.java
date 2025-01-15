// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3451<T extends LivingEntity> extends Class3448<T>
{
    private static String[] field16275;
    private final Class800 field16289;
    
    public Class3451(final Class800 field16289, final Class<T> clazz, final float n, final double n2, final double n3) {
        super(field16289, clazz, n, n2, n3, Class9170.field38849::test);
        this.field16289 = field16289;
    }
    
    @Override
    public boolean method11013() {
        return !this.field16289.method4480() && super.method11013();
    }
    
    @Override
    public boolean method11017() {
        return !this.field16289.method4480() && super.method11017();
    }
}
