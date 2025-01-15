// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

public interface Class7735
{
    int method24684();
    
    ITextComponent method24685(final int p0);
    
    default ITextComponent method24686(final int n) {
        return (n >= 0 && n < this.method24684()) ? this.method24685(n) : new StringTextComponent("");
    }
    
    default Class7735 method24687(final ItemStack class8321) {
        final Item method27622 = class8321.getItem();
        if (method27622 != Items.field31513) {
            return (method27622 != Items.field31512) ? Class723.field3946 : new Class7736(class8321);
        }
        return new Class7738(class8321);
    }
}
