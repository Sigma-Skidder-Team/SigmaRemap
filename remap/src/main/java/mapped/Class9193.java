// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class9193
{
    private static String[] field38965;
    private static final Random field38966;
    
    public static void method33638(final World class1847, final BlockPos class1848, final Class446 class1849) {
        method33640(class1847, class1848.getX(), class1848.getY(), class1848.getZ(), class1849);
    }
    
    public static void method33639(final World class1847, final Entity class1848, final Class446 class1849) {
        method33640(class1847, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), class1849);
    }
    
    private static void method33640(final World class1847, final double n, final double n2, final double n3, final Class446 class1848) {
        for (int i = 0; i < class1848.method2239(); ++i) {
            method33642(class1847, n, n2, n3, class1848.method2157(i));
        }
    }
    
    public static void method33641(final World class1847, final BlockPos class1848, final Class2265<ItemStack> class1849) {
        class1849.forEach(class1852 -> method33642(class1850, class1851.method1074(), class1851.method1075(), class1851.method1076(), class1852));
    }
    
    public static void method33642(final World class1847, final double a, final double a2, final double a3, final ItemStack class1848) {
        final double n = EntityType.field28992.method23369();
        final double n2 = 1.0 - n;
        final double n3 = n / 2.0;
        final double n4 = Math.floor(a) + Class9193.field38966.nextDouble() * n2 + n3;
        final double n5 = Math.floor(a2) + Class9193.field38966.nextDouble() * n2;
        final double n6 = Math.floor(a3) + Class9193.field38966.nextDouble() * n2 + n3;
        while (!class1848.method27620()) {
            final Class427 class1849 = new Class427(class1847, n4, n5, n6, class1848.method27621(Class9193.field38966.nextInt(21) + 10));
            class1849.setMotion(Class9193.field38966.nextGaussian() * 0.05000000074505806, Class9193.field38966.nextGaussian() * 0.05000000074505806 + 0.20000000298023224, Class9193.field38966.nextGaussian() * 0.05000000074505806);
            class1847.method6886(class1849);
        }
    }
    
    static {
        field38966 = new Random();
    }
}
