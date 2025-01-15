// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class Class3567<T extends LivingEntity> extends Class3555<T>
{
    private static String[] field16633;
    private int field16657;
    
    public Class3567(final Class776 class776, final Class<T> clazz, final boolean b, final Predicate<LivingEntity> predicate) {
        super(class776, clazz, 500, b, false, predicate);
        this.field16657 = 0;
    }
    
    public int method11110() {
        return this.field16657;
    }
    
    public void method11111() {
        --this.field16657;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16657 > 0 || !this.field16602.method2633().nextBoolean()) {
            return false;
        }
        if (((Class776)this.field16602).method4293()) {
            this.method11104();
            return this.field16636 != null;
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16657 = 200;
        super.method11015();
    }
}
