// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3548 extends Class3547
{
    private static String[] field16614;
    private final Class791 field16620;
    
    public Class3548(final Class791 field16620, final Class<?>... array) {
        super(field16620, array);
        this.field16620 = field16620;
    }
    
    @Override
    public boolean method11017() {
        if (!Class791.method4423(this.field16620) && !Class791.method4424(this.field16620)) {
            return super.method11017();
        }
        this.field16620.method4153(null);
        return false;
    }
    
    @Override
    public void method11102(final Class759 class759, final LivingEntity class760) {
        if (class759 instanceof Class791) {
            if (class759.method4216()) {
                class759.method4153(class760);
            }
        }
    }
}
