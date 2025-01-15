// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class Class3454 extends Class3446
{
    private static String[] field16293;
    private final Class850 field16294;
    
    public Class3454(final Class850 field16294) {
        this.field16294 = field16294;
    }
    
    @Override
    public boolean method11013() {
        return this.field16294.method5080() == null && this.field16294.world.method6765().method31216(Class8878.field37316) && this.field16294.method2633().nextInt(20) == 0;
    }
    
    @Override
    public void method11016() {
        final Random method2633 = this.field16294.method2633();
        final World field2391 = this.field16294.world;
        final int method2634 = MathHelper.floor(this.field16294.getPosX() - 2.0 + method2633.nextDouble() * 4.0);
        final int method2635 = MathHelper.floor(this.field16294.getPosY() + method2633.nextDouble() * 3.0);
        final int method2636 = MathHelper.floor(this.field16294.getPosZ() - 2.0 + method2633.nextDouble() * 4.0);
        final BlockPos class354 = new BlockPos(method2634, method2635, method2636);
        final BlockState method2637 = field2391.method6701(class354);
        final Class3833 method2638 = method2637.method21696();
        final boolean equals = field2391.method6987(new Class8478(new Vec3d(MathHelper.floor(this.field16294.getPosX()) + 0.5, method2635 + 0.5, MathHelper.floor(this.field16294.getPosZ()) + 0.5), new Vec3d(method2634 + 0.5, method2635 + 0.5, method2636 + 0.5), Class2040.field11633, Class2191.field13325, this.field16294)).method21447().equals(class354);
        if (method2638.method11785(Class7188.field27916)) {
            if (equals) {
                this.field16294.method5079(method2637);
                field2391.method6690(class354, false);
            }
        }
    }
}
