// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.dispenser.IPosition;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public final class Class6412 extends Class6409
{
    private static String[] field25526;
    
    @Override
    public Class401 method19093(final World class1847, final IPosition class1848, final ItemStack class1849) {
        final Class405 class1850 = new Class405(class1847, class1848.getX(), class1848.getY(), class1848.getZ());
        class1850.method1992(class1849);
        class1850.field2474 = Class2151.field12783;
        return class1850;
    }
}
