// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public abstract class Class3680 implements IRecipe<IInventory>
{
    public final IRecipeType<?> field16974;
    public final ResourceLocation field16975;
    public final String field16976;
    public final Ingredient field16977;
    public final ItemStack field16978;
    public final float field16979;
    public final int field16980;
    
    public Class3680(final IRecipeType<?> field16974, final ResourceLocation field16975, final String field16976, final Ingredient field16977, final ItemStack field16978, final float field16979, final int field16980) {
        this.field16974 = field16974;
        this.field16975 = field16975;
        this.field16976 = field16976;
        this.field16977 = field16977;
        this.field16978 = field16978;
        this.field16979 = field16979;
        this.field16980 = field16980;
    }
    
    @Override
    public boolean matches(final IInventory class446, final World class447) {
        return this.field16977.test(class446.getStackInSlot(0));
    }
    
    @Override
    public ItemStack getCraftingResult(final IInventory class446) {
        return this.field16978.method27641();
    }
    
    @Override
    public boolean canFit(final int n, final int n2) {
        return true;
    }
    
    @Override
    public NonNullList<Ingredient> getIngredients() {
        final NonNullList<Object> method8506 = NonNullList.create();
        method8506.add(this.field16977);
        return (NonNullList<Ingredient>)method8506;
    }
    
    public float method11328() {
        return this.field16979;
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return this.field16978;
    }
    
    @Override
    public String getGroup() {
        return this.field16976;
    }
    
    public int method11329() {
        return this.field16980;
    }
    
    @Override
    public ResourceLocation getId() {
        return this.field16975;
    }
    
    @Override
    public IRecipeType<?> getType() {
        return this.field16974;
    }
}
