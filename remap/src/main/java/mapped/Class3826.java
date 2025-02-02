// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class3826 extends Class3824
{
    public Class3826(final Properties properties) {
        super(properties);
    }
    
    @Override
    public ItemStack method11741() {
        return Class5333.method16476(super.method11741(), Class8644.field36279);
    }
    
    @Override
    public void method11735(final Class7207 class7207, final NonNullList<ItemStack> class7208) {
        if (this.method11736(class7207)) {
            for (final Class8061 class7209 : Registry.field212) {
                if (class7209.method26449().isEmpty()) {
                    continue;
                }
                class7208.add(Class5333.method16476(new ItemStack(this), class7209));
            }
        }
    }
    
    @Override
    public void addInformation(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final ITooltipFlag class8323) {
        Class5333.method16478(class8321, list, 0.125f);
    }
    
    @Override
    public String method11718(final ItemStack class8321) {
        return Class5333.method16474(class8321).method26448(this.getTranslationKey() + ".effect.");
    }
}
