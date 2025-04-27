// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class7736 implements Class7735
{
    private static String[] field30751;
    private final List<String> field30752;
    
    public Class7736(final ItemStack class8321) {
        this.field30752 = method24688(class8321);
    }
    
    private static List<String> method24688(final ItemStack class8321) {
        final CompoundNBT method27657 = class8321.method27657();
        return (method27657 == null) ? ImmutableList.of() : Class723.method3979(method27657);
    }
    
    @Override
    public int method24684() {
        return this.field30752.size();
    }
    
    @Override
    public ITextComponent method24685(final int n) {
        return new StringTextComponent(this.field30752.get(n));
    }
}
