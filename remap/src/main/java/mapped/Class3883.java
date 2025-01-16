// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.World;

import java.util.Random;

public class Class3883 extends Class3882
{
    private static String[] field17540;
    
    public Class3883(final Class5328 class5328, final Class9288 class5329) {
        super(class5328, 8, class5329);
    }
    
    @Override
    public boolean method11943(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        final Block method21696 = class7096.getBlock();
        if (!super.method11943(class7096, class7097, class7098)) {
            if (method21696 != Class7521.field29338) {
                if (method21696 != Class7521.field29339) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        final Vec3d method18517 = this.method11808(class7096, class7097, class7098, ISelectionContext.dummy()).getBoundingBox().getCenter();
        final double n = class7098.getX() + method18517.x;
        final double n2 = class7098.getZ() + method18517.z;
        for (int i = 0; i < 3; ++i) {
            if (random.nextBoolean()) {
                class7097.method6709(Class8432.field34639, n + random.nextFloat() / 5.0f, class7098.getY() + (0.5 - random.nextFloat()), n2 + random.nextFloat() / 5.0f, 0.0, 0.0, 0.0);
            }
        }
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        if (!class7097.isRemote) {
            if (class7097.method6954() != Class2113.field12290) {
                if (class7099 instanceof LivingEntity) {
                    final LivingEntity class7100 = (LivingEntity)class7099;
                    if (!class7100.method1849(DamageSource.field32577)) {
                        class7100.method2655(new Class1948(Class9439.field40493, 40));
                    }
                }
            }
        }
    }
}
