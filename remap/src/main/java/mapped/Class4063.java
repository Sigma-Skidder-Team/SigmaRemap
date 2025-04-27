// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class4063 extends Item
{
    public Class4063(final Properties properties) {
        super(properties);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        if (!method21654.isRemote) {
            final ItemStack method21655 = class7075.method21651();
            final Vec3d method21656 = class7075.method21649();
            final Direction method21657 = class7075.method21648();
            method21654.method6886(new Class406(method21654, method21656.x + method21657.getXOffset() * 0.15, method21656.y + method21657.getYOffset() * 0.15, method21656.z + method21657.getZOffset() * 0.15, method21655));
            method21655.method27693(1);
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        if (!class1848.method2773()) {
            return Class9355.method34676(class1848.method2715(class1849));
        }
        final ItemStack method2715 = class1848.method2715(class1849);
        if (!class1847.isRemote) {
            class1847.method6886(new Class406(class1847, method2715, class1848));
            if (!class1848.field3025.field27304) {
                method2715.method27693(1);
            }
        }
        return Class9355.method34674(class1848.method2715(class1849));
    }
    
    @Override
    public void addInformation(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final ITooltipFlag class8323) {
        final CompoundNBT method27660 = class8321.method27660("Fireworks");
        if (method27660 != null) {
            if (method27660.contains("Flight", 99)) {
                list.add(new Class2259("item.minecraft.firework_rocket.flight").appendText(" ").appendText(String.valueOf(method27660.getByte("Flight"))).applyTextStyle(TextFormatting.GRAY));
            }
            final ListNBT method27661 = method27660.getList("Explosions", 10);
            if (!method27661.isEmpty()) {
                for (int i = 0; i < method27661.size(); ++i) {
                    final CompoundNBT method27662 = method27661.method346(i);
                    final ArrayList arrayList = Lists.newArrayList();
                    Class4057.method12262(method27662, arrayList);
                    if (!arrayList.isEmpty()) {
                        for (int j = 1; j < arrayList.size(); ++j) {
                            arrayList.set(j, new StringTextComponent("  ").appendSibling((ITextComponent)arrayList.get(j)).applyTextStyle(TextFormatting.GRAY));
                        }
                        list.addAll(arrayList);
                    }
                }
            }
        }
    }
}
