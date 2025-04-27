// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.text.ITextComponent;

public class Class474 extends Class466
{
    public Class474() {
        super(Class5412.field22568, IRecipeType.field37845);
    }
    
    @Override
    public ITextComponent method2243() {
        return new Class2259("container.blast_furnace");
    }
    
    @Override
    public int method2398(final ItemStack class8321) {
        return super.method2398(class8321) / 2;
    }
    
    @Override
    public Class3418 method2253(final int n, final Class464 class464) {
        return new Class3430(n, class464, this, this.field2760);
    }
}
