// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class Class3562<T extends LivingEntity> extends Class3555<T>
{
    private static String[] field16633;
    private boolean field16650;
    
    public Class3562(final Class776 class776, final Class<T> clazz, final int n, final boolean b, final boolean b2, final Predicate<LivingEntity> predicate) {
        super(class776, clazz, n, b, b2, predicate);
        this.field16650 = true;
    }
    
    public void method11107(final boolean field16650) {
        this.field16650 = field16650;
    }
    
    @Override
    public boolean method11013() {
        return this.field16650 && super.method11013();
    }
}
