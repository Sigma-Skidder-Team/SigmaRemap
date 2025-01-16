// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public final class Class7208 extends Class7207
{
    public Class7208(final int n, final String s) {
        super(n, s);
    }
    
    @Override
    public ItemStack method22107() {
        return new ItemStack(Blocks.BOOKSHELF);
    }
    
    @Override
    public void method22126(final NonNullList<ItemStack> class2265) {
        throw new RuntimeException("Implement exception client-side.");
    }
    
    @Override
    public boolean method22122() {
        return true;
    }
}
