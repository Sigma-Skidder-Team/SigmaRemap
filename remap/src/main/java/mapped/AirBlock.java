// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class AirBlock extends Item
{
    private final Block field18202;
    
    public AirBlock(final Block field18202, final Properties properties) {
        super(properties);
        this.field18202 = field18202;
    }
    
    @Override
    public String getTranslationKey() {
        return this.field18202.getTranslationKey();
    }
    
    @Override
    public void addInformation(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final ITooltipFlag class8323) {
        super.addInformation(class8321, class8322, list, class8323);
        this.field18202.addInformation(class8321, class8322, list, class8323);
    }
}
