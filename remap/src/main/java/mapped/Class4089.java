// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class4089 extends Item
{
    public Class4089(final Properties properties) {
        super(properties);
    }
    
    @Override
    public ItemStack method11741() {
        return Class5333.method16476(super.method11741(), Class8644.field36251);
    }
    
    @Override
    public ItemStack method11707(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final PlayerEntity class8324 = (class8323 instanceof PlayerEntity) ? ((PlayerEntity)class8323) : null;
        if (class8324 instanceof Class513) {
            Class7770.field31800.method13819((Class513)class8324, class8321);
        }
        if (!class8322.isRemote) {
            for (final Class1948 class8325 : Class5333.method16465(class8321)) {
                if (!class8325.method7906().method16453()) {
                    class8323.method2655(new Class1948(class8325));
                }
                else {
                    class8325.method7906().method16452(class8324, class8324, class8323, class8325.method7908(), 1.0);
                }
            }
        }
        if (class8324 != null) {
            class8324.method2859(Class8276.field33981.method8449(this));
            if (!class8324.field3025.field27304) {
                class8321.method27693(1);
            }
        }
        if (class8324 == null || !class8324.field3025.field27304) {
            if (class8321.method27620()) {
                return new ItemStack(Items.field31442);
            }
            if (class8324 != null) {
                class8324.inventory.method2362(new ItemStack(Items.field31442));
            }
        }
        return class8321;
    }
    
    @Override
    public int method11726(final ItemStack class8321) {
        return 32;
    }
    
    @Override
    public Class1992 method11725(final ItemStack class8321) {
        return Class1992.field11156;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        class1848.method2762(class1849);
        return Class9355.method34674(class1848.method2715(class1849));
    }
    
    @Override
    public String method11718(final ItemStack class8321) {
        return Class5333.method16474(class8321).method26448(this.getTranslationKey() + ".effect.");
    }
    
    @Override
    public void addInformation(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final ITooltipFlag class8323) {
        Class5333.method16478(class8321, list, 1.0f);
    }
    
    @Override
    public boolean method11730(final ItemStack class8321) {
        return super.method11730(class8321) || !Class5333.method16465(class8321).isEmpty();
    }
    
    @Override
    public void method11735(final Class7207 class7207, final NonNullList<ItemStack> class7208) {
        if (this.method11736(class7207)) {
            for (final Class8061 class7209 : Registry.field212) {
                if (class7209 == Class8644.field36250) {
                    continue;
                }
                class7208.add(Class5333.method16476(new ItemStack(this), class7209));
            }
        }
    }
}
