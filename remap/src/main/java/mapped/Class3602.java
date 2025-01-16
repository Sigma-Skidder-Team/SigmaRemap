// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

public class Class3602 extends Class3446
{
    private static String[] field16776;
    private int field16777;
    public final /* synthetic */ Class839 field16778;
    
    private Class3602(final Class839 field16778) {
        this.field16778 = field16778;
    }
    
    @Override
    public boolean method11013() {
        final LivingEntity method2634 = this.field16778.method2634();
        return this.field16778.method1706() && method2634 != null && this.field16778.method1734(method2634) < 100.0;
    }
    
    @Override
    public void method11015() {
        this.field16777 = 0;
    }
    
    @Override
    public void method11016() {
        ++this.field16777;
        final LivingEntity method2634 = this.field16778.method2634();
        if (method2634 != null) {
            Vec3d class5487 = new Vec3d(this.field16778.getPosX() - method2634.getPosX(), this.field16778.getPosY() - method2634.getPosY(), this.field16778.getPosZ() - method2634.getPosZ());
            final BlockState method2635 = this.field16778.world.getBlockState(new BlockPos(this.field16778.getPosX() + class5487.x, this.field16778.getPosY() + class5487.y, this.field16778.getPosZ() + class5487.z));
            if (this.field16778.world.method6702(new BlockPos(this.field16778.getPosX() + class5487.x, this.field16778.getPosY() + class5487.y, this.field16778.getPosZ() + class5487.z)).method21793(Class7324.field28319) || method2635.method21706()) {
                final double method2636 = class5487.length();
                if (method2636 > 0.0) {
                    class5487.normalize();
                    float n = 3.0f;
                    if (method2636 > 5.0) {
                        n -= (float)((method2636 - 5.0) / 5.0);
                    }
                    if (n > 0.0f) {
                        class5487 = class5487.scale(n);
                    }
                }
                if (method2635.method21706()) {
                    class5487 = class5487.subtract(0.0, class5487.y, 0.0);
                }
                this.field16778.method4999((float)class5487.x / 20.0f, (float)class5487.y / 20.0f, (float)class5487.z / 20.0f);
            }
            if (this.field16777 % 10 == 5) {
                this.field16778.world.method6709(Class8432.field34601, this.field16778.getPosX(), this.field16778.getPosY(), this.field16778.getPosZ(), 0.0, 0.0, 0.0);
            }
        }
    }
}
