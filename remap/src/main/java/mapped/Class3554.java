// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.EnumSet;

public class Class3554 extends Class3545
{
    private static String[] field16629;
    private final Class794 field16630;
    private LivingEntity field16631;
    private int field16632;
    
    public Class3554(final Class794 field16630) {
        super(field16630, false);
        this.field16630 = field16630;
        this.method11019(EnumSet.of(Class2139.field12583));
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16630.method4480() || this.field16630.method4483()) {
            return false;
        }
        final LivingEntity method4488 = this.field16630.method4488();
        if (method4488 != null) {
            this.field16631 = method4488.method2634();
            if (method4488.method2635() != this.field16632) {
                if (this.method11097(this.field16631, Class7843.field32117)) {
                    return this.field16630.method4491(this.field16631, method4488);
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16602.method4153(this.field16631);
        final LivingEntity method4488 = this.field16630.method4488();
        if (method4488 != null) {
            this.field16632 = method4488.method2635();
        }
        super.method11015();
    }
}
