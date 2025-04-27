// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3551 extends Class3547
{
    private static String[] field16614;
    public final /* synthetic */ Class790 field16622;
    
    public Class3551(final Class790 field16622) {
        this.field16622 = field16622;
        super(field16622, new Class[0]);
    }
    
    @Override
    public void method11015() {
        super.method11015();
        if (this.field16622.method2625()) {
            this.method11101();
            this.method11018();
        }
    }
    
    @Override
    public void method11102(final Class759 class759, final LivingEntity class760) {
        if (class759 instanceof Class790) {
            if (!class759.method2625()) {
                super.method11102(class759, class760);
            }
        }
    }
}
