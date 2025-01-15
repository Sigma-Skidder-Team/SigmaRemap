// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3558<T extends LivingEntity> extends Class3555<T>
{
    private static String[] field16646;
    
    public Class3558(final Class846 class846, final Class<T> clazz) {
        super(class846, clazz, true);
    }
    
    @Override
    public boolean method11013() {
        return this.field16602.method1726() < 0.5f && super.method11013();
    }
}
