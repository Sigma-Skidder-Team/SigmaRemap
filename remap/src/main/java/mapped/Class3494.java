// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class Class3494 extends Class3446
{
    private static String[] field16439;
    private final Class850 field16440;
    
    public Class3494(final Class850 field16440) {
        this.field16440 = field16440;
    }
    
    @Override
    public boolean method11013() {
        return this.field16440.method5080() != null && this.field16440.world.method6765().method31216(Class8878.field37316) && this.field16440.method2633().nextInt(2000) == 0;
    }
    
    @Override
    public void method11016() {
        final Random method2633 = this.field16440.method2633();
        final World field2391 = this.field16440.world;
        final BlockPos class354 = new BlockPos(MathHelper.floor(this.field16440.getPosX() - 1.0 + method2633.nextDouble() * 2.0), MathHelper.floor(this.field16440.getPosY() + method2633.nextDouble() * 2.0), MathHelper.floor(this.field16440.getPosZ() - 1.0 + method2633.nextDouble() * 2.0));
        final BlockState method2634 = field2391.method6701(class354);
        final BlockPos method2635 = class354.method1139();
        final BlockState method2636 = field2391.method6701(method2635);
        final BlockState method2637 = this.field16440.method5080();
        if (method2637 != null) {
            if (this.method11057(field2391, class354, method2637, method2634, method2636, method2635)) {
                field2391.method6688(class354, method2637, 3);
                this.field16440.method5079(null);
            }
        }
    }
    
    private boolean method11057(final Class1852 class1852, final BlockPos class1853, final BlockState class1854, final BlockState class1855, final BlockState class1856, final BlockPos class1857) {
        if (class1855.method21706()) {
            if (!class1856.method21706()) {
                if (class1856.method21762(class1852, class1857)) {
                    if (class1854.method21752(class1852, class1853)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
