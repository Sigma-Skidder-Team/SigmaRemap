// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class4091 extends Class4090
{
    private static String[] field18195;
    
    public Class4091(final Properties properties) {
        super(properties);
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), Class8520.field35610, Class286.field1585, 0.5f, 0.4f / (Class4091.field17363.nextFloat() * 0.4f + 0.8f));
        return super.method11695(class1847, class1848, class1849);
    }
}
