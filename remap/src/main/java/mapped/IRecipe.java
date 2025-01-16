// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public interface IRecipe<C extends IInventory>
{
    boolean matches(final C p0, final World p1);
    
    ItemStack getCraftingResult(final C p0);
    
    boolean canFit(final int p0, final int p1);
    
    ItemStack getRecipeOutput();

    default NonNullList<ItemStack> getRemainingItems(C inv) {
        NonNullList<ItemStack> nonnulllist = NonNullList.withSize(inv.getSizeInventory(), ItemStack.EMPTY);

        for (int i = 0; i < nonnulllist.size(); ++i) {
            Item item = inv.getStackInSlot(i).getItem();

            if (item.hasContainerItem()) {
                nonnulllist.set(i, new ItemStack(item.getContainerItem()));
            }
        }

        return nonnulllist;
    }
    
    default NonNullList<Class120> method11294() {
        return NonNullList.create();
    }
    
    default boolean method11295() {
        return false;
    }
    
    default String method11296() {
        return "";
    }
    
    default ItemStack method11297() {
        return new ItemStack(Class7521.field29296);
    }
    
    ResourceLocation method11298();
    
    Class6096<?> method11299();
    
    Class8976<?> method11300();
}
