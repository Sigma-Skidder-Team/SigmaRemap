// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3576 extends Class3574
{
    private static String[] field16684;
    public final /* synthetic */ Class790 field16696;
    
    public Class3576(final Class790 field16696) {
        this.field16696 = field16696;
        super(field16696, 1.25, true);
    }
    
    @Override
    public void method11116(final LivingEntity class511, final double n) {
        final double method11117 = this.method11117(class511);
        if (n <= method11117 && this.field16686 <= 0) {
            this.field16686 = 20;
            this.field16685.method2734(class511);
            this.field16696.method4369(false);
        }
        else if (n > method11117 * 2.0) {
            this.field16686 = 20;
            this.field16696.method4369(false);
        }
        else {
            if (this.field16686 <= 0) {
                this.field16696.method4369(false);
                this.field16686 = 20;
            }
            if (this.field16686 <= 10) {
                this.field16696.method4369(true);
                this.field16696.method4367();
            }
        }
    }
    
    @Override
    public void method11018() {
        this.field16696.method4369(false);
        super.method11018();
    }
    
    @Override
    public double method11117(final LivingEntity class511) {
        return 4.0f + class511.method1930();
    }
}
