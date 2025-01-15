// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3556 extends Class3555<LivingEntity>
{
    private static String[] field16638;
    
    public Class3556(final Class775 class775) {
        super(class775, LivingEntity.class, 0, true, true, LivingEntity::method2777);
    }
    
    @Override
    public boolean method11013() {
        return Class775.method4287((Class775)this.field16602) && super.method11013();
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16602.method2641(0);
    }
}
