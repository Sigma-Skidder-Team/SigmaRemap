// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
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
    
    default NonNullList<Ingredient> getIngredients() {
        return NonNullList.create();
    }
    
    default boolean isDynamic() {
        return false;
    }
    
    default String getGroup() {
        return "";
    }
    
    default ItemStack getIcon() {
        return new ItemStack(Blocks.CRAFTING_TABLE);
    }
    
    ResourceLocation getId();

    IRecipeSerializer<?> getSerializer();

    IRecipeType<?> getType();
}
