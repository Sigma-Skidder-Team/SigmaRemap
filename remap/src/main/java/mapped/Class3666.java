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
    public ResourceLocation method11298() {
        return this.field16952;
    }
    
    @Override
    public boolean method11295() {
        return true;
    }
    
    @Override
    public ItemStack method11292() {
        return ItemStack.field34174;
    }
}
