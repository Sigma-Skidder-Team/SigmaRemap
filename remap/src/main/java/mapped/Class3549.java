// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3549 extends Class3547
{
    private static String[] field16621;
    
    public Class3549(final Class828 class828) {
        super(class828, new Class[0]);
        this.method11100(Class827.class);
    }
    
    @Override
    public void method11102(final Class759 class759, final LivingEntity class760) {
        if (class759 instanceof Class828) {
            if (this.field16602.method2747(class760)) {
                if (Class828.method4939((Class828)class759, class760)) {
                    class759.method4153(class760);
                }
            }
        }
    }
}
