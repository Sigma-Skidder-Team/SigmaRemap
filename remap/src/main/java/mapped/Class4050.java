// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class Class4050 extends Item
{
    private static String[] field18141;
    
    public Class4050(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        if (class7075.method21648() == Direction.DOWN) {
            return Class2201.field13403;
        }
        final World method21654 = class7075.method21654();
        final Class7074 class7076 = new Class7074(class7075);
        final BlockPos method21655 = class7076.method21639();
        final BlockPos method21656 = method21655.method1137();
        if (!class7076.method21640() || !method21654.method6701(method21656).method21750(class7076)) {
            return Class2201.field13403;
        }
        final double n = method21655.getX();
        final double n2 = method21655.getY();
        final double n3 = method21655.getZ();
        if (method21654.method7127(null, new AxisAlignedBB(n, n2, n3, n + 1.0, n2 + 2.0, n3 + 1.0)).isEmpty()) {
            final ItemStack method21657 = class7075.method21651();
            if (!method21654.isRemote) {
                method21654.method6690(method21655, false);
                method21654.method6690(method21656, false);
                final Class857 class7077 = new Class857(method21654, n + 0.5, n2, n3 + 0.5);
                class7077.method1730(n + 0.5, n2, n3 + 0.5, MathHelper.method35642((MathHelper.method35668(class7075.method21646() - 180.0f) + 22.5f) / 45.0f) * 45.0f, 0.0f);
                this.method12248(class7077, method21654.rand);
                EntityType.method23360(method21654, class7075.method21652(), class7077, method21657.method27657());
                method21654.method6886(class7077);
                method21654.method6706(null, class7077.getPosX(), class7077.getPosY(), class7077.getPosZ(), Class8520.field34990, Class286.field1582, 0.75f, 0.8f);
            }
            method21657.method27693(1);
            return Class2201.field13400;
        }
        return Class2201.field13403;
    }
    
    private void method12248(final Class857 class857, final Random random) {
        final Class8396 method5174 = class857.method5174();
        class857.method5168(new Class8396(method5174.method27997() + random.nextFloat() * 5.0f, method5174.method27998() + (random.nextFloat() * 20.0f - 10.0f), method5174.method27999()));
        final Class8396 method5175 = class857.method5175();
        class857.method5169(new Class8396(method5175.method27997(), method5175.method27998() + (random.nextFloat() * 10.0f - 5.0f), method5175.method27999()));
    }
}
