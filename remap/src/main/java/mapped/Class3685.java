// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.NonNullList;

public abstract class Class3685 implements IRecipe<IInventory>
{
    public final Ingredient field16985;
    public final ItemStack field16986;
    private final IRecipeType<?> field16987;
    private final IRecipeSerializer<?> field16988;
    public final ResourceLocation field16989;
    public final String field16990;
    
    public Class3685(final IRecipeType<?> field16987, final IRecipeSerializer<?> field16988, final ResourceLocation field16989, final String field16990, final Ingredient field16991, final ItemStack field16992) {
        this.field16987 = field16987;
        this.field16988 = field16988;
        this.field16989 = field16989;
        this.field16990 = field16990;
        this.field16985 = field16991;
        this.field16986 = field16992;
    }
    
    @Override
    public IRecipeType<?> getType() {
        return this.field16987;
    }
    
    @Override
    public IRecipeSerializer<?> getSerializer() {
        return this.field16988;
    }
    
    @Override
    public ResourceLocation getId() {
        return this.field16989;
    }
    
    @Override
    public String getGroup() {
        return this.field16990;
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return this.field16986;
    }
    
    @Override
    public NonNullList<Ingredient> getIngredients() {
        final NonNullList<Object> method8506 = NonNullList.create();
        method8506.add(this.field16985);
        return (NonNullList<Ingredient>)method8506;
    }
    
    @Override
    public boolean canFit(final int n, final int n2) {
        return true;
    }
    
    @Override
    public ItemStack getCraftingResult(final IInventory class446) {
        return this.field16986.method27641();
    }
}
