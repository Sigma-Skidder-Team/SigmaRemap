// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.EnumSet;

public class Class3498 extends Class3446
{
    private static String[] field16453;
    private final Class765 field16454;
    private LivingEntity field16455;
    
    public Class3498(final Class765 field16454) {
        this.field16454 = field16454;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        final LivingEntity method4152 = this.field16454.method4152();
        return this.field16454.method4235() > 0 || (method4152 != null && this.field16454.method1734(method4152) < 9.0);
    }
    
    @Override
    public void method11015() {
        this.field16454.method4150().method24733();
        this.field16455 = this.field16454.method4152();
    }
    
    @Override
    public void method11018() {
        this.field16455 = null;
    }
    
    @Override
    public void method11016() {
        if (this.field16455 != null) {
            if (this.field16454.method1734(this.field16455) <= 49.0) {
                if (this.field16454.method4151().method34143(this.field16455)) {
                    this.field16454.method4236(1);
                }
                else {
                    this.field16454.method4236(-1);
                }
            }
            else {
                this.field16454.method4236(-1);
            }
        }
        else {
            this.field16454.method4236(-1);
        }
    }
}
