// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.EnumSet;

public class Class3569 extends Class3545
{
    private static String[] field16660;
    private final Class794 field16661;
    private LivingEntity field16662;
    private int field16663;
    
    public Class3569(final Class794 field16661) {
        super(field16661, false);
        this.field16661 = field16661;
        this.method11019(EnumSet.of(Class2139.field12583));
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16661.method4480() || this.field16661.method4483()) {
            return false;
        }
        final LivingEntity method4488 = this.field16661.method4488();
        if (method4488 != null) {
            this.field16662 = method4488.method2637();
            if (method4488.method2638() != this.field16663) {
                if (this.method11097(this.field16662, Class7843.field32117)) {
                    return this.field16661.method4491(this.field16662, method4488);
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16602.method4153(this.field16662);
        final LivingEntity method4488 = this.field16661.method4488();
        if (method4488 != null) {
            this.field16663 = method4488.method2638();
        }
        super.method11015();
    }
}
