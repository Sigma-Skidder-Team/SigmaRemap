// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class7738 implements Class7735
{
    private final List<String> field30753;
    
    public Class7738(final ItemStack class8321) {
        this.field30753 = method24689(class8321);
    }
    
    private static List<String> method24689(final ItemStack class8321) {
        final Class51 method27657 = class8321.method27657();
        return (List<String>)((method27657 != null && Class4096.method12339(method27657)) ? Class723.method3979(method27657) : ImmutableList.of((Object)new Class2259("book.invalid.tag", new Object[0]).applyTextStyle(TextFormatting.DARK_RED).getFormattedText()));
    }
    
    @Override
    public int method24684() {
        return this.field30753.size();
    }
    
    @Override
    public ITextComponent method24685(final int n) {
        final String s = this.field30753.get(n);
        try {
            final ITextComponent method17871 = Class5953.method17871(s);
            if (method17871 != null) {
                return method17871;
            }
        }
        catch (final Exception ex) {}
        return new StringTextComponent(s);
    }
}
