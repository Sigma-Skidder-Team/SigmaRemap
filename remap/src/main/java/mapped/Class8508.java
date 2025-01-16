// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.AbstractList;
import java.util.List;

public class Class8508
{
    public static ItemStack method28422(final List<ItemStack> list, final int n, final int n2) {
        if (n >= 0) {
            if (n < list.size()) {
                if (!list.get(n).method27620()) {
                    if (n2 > 0) {
                        return list.get(n).method27621(n2);
                    }
                }
            }
        }
        return ItemStack.field34174;
    }
    
    public static ItemStack method28423(final List<ItemStack> list, final int n) {
        return (n >= 0 && n < list.size()) ? list.set(n, ItemStack.field34174) : ItemStack.field34174;
    }
    
    public static CompoundNBT method28424(final CompoundNBT class51, final Class2265<ItemStack> class52) {
        return method28425(class51, class52, true);
    }
    
    public static CompoundNBT method28425(final CompoundNBT class51, final Class2265<ItemStack> class52, final boolean b) {
        final ListNBT class53 = new ListNBT();
        for (int i = 0; i < class52.size(); ++i) {
            final ItemStack class54 = class52.get(i);
            if (!class54.method27620()) {
                final CompoundNBT e = new CompoundNBT();
                e.putByte("Slot", (byte)i);
                class54.method27627(e);
                ((AbstractList<CompoundNBT>)class53).add(e);
            }
        }
        if (!class53.isEmpty() || b) {
            class51.put("Items", class53);
        }
        return class51;
    }
    
    public static void method28426(final CompoundNBT class51, final Class2265<ItemStack> class52) {
        final ListNBT method328 = class51.getList("Items", 10);
        for (int i = 0; i < method328.size(); ++i) {
            final CompoundNBT method329 = method328.method346(i);
            final int n = method329.getByte("Slot") & 0xFF;
            if (n >= 0) {
                if (n < class52.size()) {
                    class52.set(n, ItemStack.method27619(method329));
                }
            }
        }
    }
}
