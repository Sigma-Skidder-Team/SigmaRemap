// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3450<T extends LivingEntity> extends Class3448<T>
{
    private static String[] field16275;
    private final Class791 field16288;
    
    public Class3450(final Class791 field16288, final Class<T> clazz, final float n, final double n2, final double n3) {
        super(field16288, clazz, n, n2, n3, Class9170.field38850::test);
        this.field16288 = field16288;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16288.method4395()) {
            if (this.field16288.method4414()) {
                if (super.method11013()) {
                    return true;
                }
            }
        }
        return false;
    }
}
