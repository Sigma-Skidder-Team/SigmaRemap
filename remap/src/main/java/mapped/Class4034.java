// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.AbstractList;
import java.util.List;

public class Class4034 extends Item
{
    public Class4034(final Properties properties) {
        super(properties);
    }
    
    @Override
    public boolean method11730(final ItemStack class8321) {
        return true;
    }
    
    @Override
    public boolean method11732(final ItemStack class8321) {
        return false;
    }
    
    public static ListNBT method12225(final ItemStack class8321) {
        final CompoundNBT method27657 = class8321.method27657();
        return (method27657 == null) ? new ListNBT() : method27657.getList("StoredEnchantments", 10);
    }
    
    @Override
    public void addInformation(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final ITooltipFlag class8323) {
        super.addInformation(class8321, class8322, list, class8323);
        ItemStack.method27669(list, method12225(class8321));
    }
    
    public static void method12226(final ItemStack class8321, final Class6827 class8322) {
        final ListNBT method12225 = method12225(class8321);
        int n = 1;
        final ResourceLocation method12226 = Registry.field209.getKey(class8322.field26818);
        for (int i = 0; i < method12225.size(); ++i) {
            final CompoundNBT method12227 = method12225.method346(i);
            final ResourceLocation method12228 = ResourceLocation.method7795(method12227.getString("id"));
            if (method12228 != null && method12228.equals(method12226)) {
                if (method12227.getInt("lvl") < class8322.field26819) {
                    method12227.putShort("lvl", (short)class8322.field26819);
                }
                n = 0;
                break;
            }
        }
        if (n != 0) {
            final CompoundNBT e = new CompoundNBT();
            e.putString("id", String.valueOf(method12226));
            e.putShort("lvl", (short)class8322.field26819);
            method12225.add(e);
        }
        class8321.method27658().put("StoredEnchantments", method12225);
    }
    
    public static ItemStack method12227(final Class6827 class6827) {
        final ItemStack class6828 = new ItemStack(Items.field31534);
        method12226(class6828, class6827);
        return class6828;
    }
    
    @Override
    public void method11735(final Class7207 class7207, final NonNullList<ItemStack> class7208) {
        if (class7207 != Class7207.field27998) {
            if (class7207.method22123().length != 0) {
                for (final Class6257 class7209 : Registry.field209) {
                    if (!class7207.method22125(class7209.field25118)) {
                        continue;
                    }
                    class7208.add(method12227(new Class6827(class7209, class7209.method18588())));
                }
            }
        }
        else {
            for (final Class6257 class7210 : Registry.field209) {
                if (class7210.field25118 == null) {
                    continue;
                }
                for (int i = class7210.method18593(); i <= class7210.method18588(); ++i) {
                    class7208.add(method12227(new Class6827(class7210, i)));
                }
            }
        }
    }
}
