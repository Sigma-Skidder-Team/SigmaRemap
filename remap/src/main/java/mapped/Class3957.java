// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class Class3957 extends Class3841
{
    private static String[] field17863;
    
    public Class3957(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public TileEntity method11898(final Class1855 class1855) {
        return new Class488();
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        final TileEntity method6727 = class7097.method6727(class7098);
        if (method6727 instanceof Class488) {
            for (int method6728 = ((Class488)method6727).method2445(), i = 0; i < method6728; ++i) {
                double n = class7098.getX() + (double)random.nextFloat();
                final double n2 = class7098.getY() + (double)random.nextFloat();
                double n3 = class7098.getZ() + (double)random.nextFloat();
                double n4 = (random.nextFloat() - 0.5) * 0.5;
                final double n5 = (random.nextFloat() - 0.5) * 0.5;
                double n6 = (random.nextFloat() - 0.5) * 0.5;
                final int n7 = random.nextInt(2) * 2 - 1;
                if (!random.nextBoolean()) {
                    n = class7098.getX() + 0.5 + 0.25 * n7;
                    n4 = random.nextFloat() * 2.0f * n7;
                }
                else {
                    n3 = class7098.getZ() + 0.5 + 0.25 * n7;
                    n6 = random.nextFloat() * 2.0f * n7;
                }
                class7097.method6709(Class8432.field34637, n, n2, n3, n4, n5, n6);
            }
        }
    }
    
    @Override
    public ItemStack method11862(final Class1855 class1855, final BlockPos class1856, final BlockState class1857) {
        return ItemStack.field34174;
    }
    
    @Override
    public boolean method11799(final BlockState class7096, final Class7255 class7097) {
        return false;
    }
}