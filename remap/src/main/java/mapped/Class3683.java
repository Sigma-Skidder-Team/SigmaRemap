// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;

public class Class3683 extends Class3680
{
    private static String[] field16983;
    
    public Class3683(final ResourceLocation class1932, final String s, final Ingredient class1933, final ItemStack class1934, final float n, final int n2) {
        super(IRecipeType.field37846, class1932, s, class1933, class1934, n, n2);
    }
    
    @Override
    public ItemStack getIcon() {
        return new ItemStack(Blocks.SMOKER);
    }
    
    @Override
    public IRecipeSerializer<?> getSerializer() {
        return IRecipeSerializer.field24750;
    }
}
