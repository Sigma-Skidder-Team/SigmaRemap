// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class Class121 implements Predicate<LivingEntity>
{
    private static String[] field378;
    private final Class844 field379;
    
    public Class121(final Class844 field379) {
        this.field379 = field379;
    }
    
    @Override
    public boolean test(final LivingEntity class511) {
        if (class511 instanceof PlayerEntity || class511 instanceof Class839) {
            return class511.method1734(this.field379) > 9.0;
        }
        return false;
    }
}
