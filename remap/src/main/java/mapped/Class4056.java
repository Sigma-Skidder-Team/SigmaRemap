// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class4056 extends Item
{
    private final Class230 field18152;
    
    public Class4056(final Class230 field18152, final Properties properties) {
        super(properties);
        this.field18152 = field18152;
    }
    
    public Class230 method12260() {
        return this.field18152;
    }
    
    @Override
    public void addInformation(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final ITooltipFlag class8323) {
        list.add(this.method12261().applyTextStyle(TextFormatting.GRAY));
    }
    
    public ITextComponent method12261() {
        return new Class2259(this.getTranslationKey() + ".desc");
    }
}
