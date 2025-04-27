// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3552 extends Class3547
{
    private static String[] field16614;
    public final /* synthetic */ Class798 field16623;
    
    public Class3552(final Class798 field16623, final Class798 class798) {
        this.field16623 = field16623;
        super(class798, new Class[0]);
    }
    
    @Override
    public void method11102(final Class759 class759, final LivingEntity class760) {
        if (class759 instanceof Class798) {
            if (this.field16602.method2747(class760)) {
                if (((Class798)class759).method4541(class760)) {
                    class759.method4153(class760);
                }
            }
        }
    }
}
