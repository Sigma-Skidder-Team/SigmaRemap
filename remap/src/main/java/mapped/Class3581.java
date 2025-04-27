// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3581 extends Class3574
{
    private static String[] field16684;
    public final /* synthetic */ Class803 field16703;
    
    public Class3581(final Class803 field16703, final double n, final boolean b) {
        this.field16703 = field16703;
        super(field16703, n, b);
    }
    
    @Override
    public void method11116(final LivingEntity class511, final double n) {
        if (n <= this.method11117(class511)) {
            if (this.field16686 <= 0) {
                this.field16686 = 20;
                this.field16685.method2734(class511);
                this.field16703.method1695(Class8520.field35204, 1.0f, 1.0f);
            }
        }
    }
    
    @Override
    public void method11015() {
        this.field16703.method4669(false);
        super.method11015();
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16703.method4654()) {
            if (!this.field16703.method2783()) {
                if (!this.field16703.method1814()) {
                    if (!this.field16703.method4656()) {
                        return super.method11013();
                    }
                }
            }
        }
        return false;
    }
}
