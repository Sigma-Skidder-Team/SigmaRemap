// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.EnumSet;

public class Class3522 extends Class3446
{
    private static String[] field16524;
    public final /* synthetic */ Class803 field16525;
    
    public Class3522(final Class803 field16525) {
        this.field16525 = field16525;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16525.method2783()) {
            final LivingEntity method4152 = this.field16525.method4152();
            if (method4152 != null) {
                if (method4152.isAlive()) {
                    if (Class803.method4693().test(method4152)) {
                        if (this.field16525.method1734(method4152) > 36.0) {
                            if (!this.field16525.method1814()) {
                                if (!this.field16525.method4670()) {
                                    return !this.field16525.field2967;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16525.method4655(false);
        Class803.method4694(this.field16525, false);
    }
    
    @Override
    public void method11018() {
        final LivingEntity method4152 = this.field16525.method4152();
        if (method4152 != null && Class803.method4677(this.field16525, method4152)) {
            this.field16525.method4669(true);
            this.field16525.method4668(true);
            this.field16525.method4150().method24733();
            this.field16525.method4147().method24667(method4152, (float)this.field16525.method4174(), (float)this.field16525.method4173());
        }
        else {
            this.field16525.method4669(false);
            this.field16525.method4668(false);
        }
    }
    
    @Override
    public void method11016() {
        final LivingEntity method4152 = this.field16525.method4152();
        this.field16525.method4147().method24667(method4152, (float)this.field16525.method4174(), (float)this.field16525.method4173());
        if (this.field16525.method1734(method4152) > 36.0) {
            this.field16525.method4150().method24725(method4152, 1.5);
        }
        else {
            this.field16525.method4669(true);
            this.field16525.method4668(true);
            this.field16525.method4150().method24733();
        }
    }
}
