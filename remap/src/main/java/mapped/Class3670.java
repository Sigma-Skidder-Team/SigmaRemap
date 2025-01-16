// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.world.World;

public class Class3670 extends Class3666
{
    private static String[] field16955;
    
    public Class3670(final ResourceLocation class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        ItemStack field34174 = ItemStack.EMPTY;
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class473.getSizeInventory(); ++i) {
            final ItemStack method2157 = class473.getStackInSlot(i);
            if (!method2157.method27620()) {
                if (!(method2157.getItem() instanceof Class4053)) {
                    if (!(method2157.getItem() instanceof Class3829)) {
                        return false;
                    }
                    arrayList.add(method2157);
                }
                else {
                    if (!field34174.method27620()) {
                        return false;
                    }
                    field34174 = method2157;
                }
            }
        }
        return !field34174.method27620() && !arrayList.isEmpty();
    }
    
    public ItemStack method11303(final Class473 class473) {
        final ArrayList arrayList = Lists.newArrayList();
        ItemStack class474 = ItemStack.EMPTY;
        for (int i = 0; i < class473.getSizeInventory(); ++i) {
            final ItemStack method2157 = class473.getStackInSlot(i);
            if (!method2157.method27620()) {
                final Item method2158 = method2157.getItem();
                if (!(method2158 instanceof Class4053)) {
                    if (!(method2158 instanceof Class3829)) {
                        return ItemStack.EMPTY;
                    }
                    arrayList.add(method2158);
                }
                else {
                    if (!class474.method27620()) {
                        return ItemStack.EMPTY;
                    }
                    class474 = method2157.method27641();
                }
            }
        }
        return (!class474.method27620() && !arrayList.isEmpty()) ? Class4053.method12255(class474, arrayList) : ItemStack.EMPTY;
    }
    
    @Override
    public boolean canFit(final int n, final int n2) {
        return n * n2 >= 2;
    }
    
    @Override
    public IRecipeSerializer<?> getSerializer() {
        return IRecipeSerializer.field24735;
    }
}
