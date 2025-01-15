// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class Class3627 extends Class3446
{
    private static String[] field16855;
    private final Class838 field16856;
    
    public Class3627(final Class838 field16856) {
        this.field16856 = field16856;
    }
    
    @Override
    public boolean method11013() {
        return !this.field16856.world.method6739((Class<? extends Entity>) LivingEntity.class, this.field16856.method1886().method18496(2.0), (Predicate<? super Entity>)Class838.method4993()).isEmpty();
    }
    
    @Override
    public void method11015() {
        Class838.method4994(this.field16856, 1);
        Class838.method4995(this.field16856, 0);
    }
    
    @Override
    public void method11018() {
        Class838.method4994(this.field16856, 0);
    }
    
    @Override
    public boolean method11017() {
        return !this.field16856.world.method6739((Class<? extends Entity>) LivingEntity.class, this.field16856.method1886().method18496(2.0), (Predicate<? super Entity>)Class838.method4993()).isEmpty();
    }
}
