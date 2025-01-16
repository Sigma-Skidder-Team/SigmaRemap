// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class4092 extends Class4090
{
    private static String[] field18194;
    
    public Class4092(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public void method11728(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final Class1981 class8323) {
        Class5333.method16478(class8321, list, 0.25f);
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), Class8520.field35346, Class286.field1584, 0.5f, 0.4f / (Class4092.field17363.nextFloat() * 0.4f + 0.8f));
        return super.method11695(class1847, class1848, class1849);
    }
}
