// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public abstract class Class3666 implements Class3663
{
    private final ResourceLocation field16952;
    
    public Class3666(final ResourceLocation field16952) {
        this.field16952 = field16952;
    }
    
    @Override
    public ResourceLocation getId() {
        return this.field16952;
    }
    
    @Override
    public boolean isDynamic() {
        return true;
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return ItemStack.EMPTY;
    }
}
