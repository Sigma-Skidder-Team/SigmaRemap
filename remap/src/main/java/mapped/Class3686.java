// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.world.World;

public class Class3686 extends Class3685
{
    private static String[] field16991;
    
    public Class3686(final ResourceLocation class1932, final String s, final Ingredient class1933, final ItemStack class1934) {
        super(IRecipeType.field37848, IRecipeSerializer.field24752, class1932, s, class1933, class1934);
    }
    
    @Override
    public boolean matches(final IInventory class446, final World class447) {
        return this.field16985.test(class446.getStackInSlot(0));
    }
    
    @Override
    public ItemStack getIcon() {
        return new ItemStack(Blocks.STONECUTTER);
    }
}
