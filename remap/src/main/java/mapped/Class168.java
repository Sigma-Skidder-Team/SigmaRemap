// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.function.Predicate;

public class Class168 implements Predicate<Entity>
{
    private static String[] field488;
    private final ItemStack field489;
    
    public Class168(final ItemStack field489) {
        this.field489 = field489;
    }
    
    @Override
    public boolean test(final Entity class399) {
        return class399.method1768() && class399 instanceof Class511 && ((Class511)class399).method2779(this.field489);
    }
}
