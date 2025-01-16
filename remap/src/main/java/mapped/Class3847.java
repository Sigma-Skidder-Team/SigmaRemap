// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class3847 extends Class3846
{
    private static String[] field17455;
    
    public Class3847(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11860(final World class1847, final BlockPos class1848, final Entity class1849, final float n) {
        if (!class1849.method1811()) {
            class1849.method1705(n, 0.0f);
        }
        else {
            super.method11860(class1847, class1848, class1849, n);
        }
    }
    
    @Override
    public void method11861(final IBlockReader class1855, final Entity class1856) {
        if (!class1856.method1811()) {
            this.method11901(class1856);
        }
        else {
            super.method11861(class1855, class1856);
        }
    }
    
    private void method11901(final Entity class399) {
        final Vec3d method1935 = class399.getMotion();
        if (method1935.y < 0.0) {
            class399.setMotion(method1935.x, -method1935.y * ((class399 instanceof LivingEntity) ? 1.0 : 0.8), method1935.z);
        }
    }
    
    @Override
    public void method11845(final World class1847, final BlockPos class1848, final Entity class1849) {
        final double abs = Math.abs(class1849.getMotion().y);
        if (abs < 0.1) {
            if (!class1849.method1810()) {
                final double n = 0.4 + abs * 0.2;
                class1849.method1936(class1849.getMotion().mul(n, 1.0, n));
            }
        }
        super.method11845(class1847, class1848, class1849);
    }
}
