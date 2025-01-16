// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class Class3672 extends Class3666
{
    private static String[] field16957;
    
    public Class3672(final ResourceLocation class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        Class181 method12244 = null;
        ItemStack class475 = null;
        ItemStack class476 = null;
        for (int i = 0; i < class473.getSizeInventory(); ++i) {
            final ItemStack method12245 = class473.getStackInSlot(i);
            final Item method12246 = method12245.getItem();
            if (method12246 instanceof Class4044) {
                final Class4044 class477 = (Class4044)method12246;
                if (method12244 != null) {
                    if (method12244 != class477.method12244()) {
                        return false;
                    }
                }
                else {
                    method12244 = class477.method12244();
                }
                final int method12247 = Class465.method2385(method12245);
                if (method12247 > 6) {
                    return false;
                }
                if (method12247 <= 0) {
                    if (class476 != null) {
                        return false;
                    }
                    class476 = method12245;
                }
                else {
                    if (class475 != null) {
                        return false;
                    }
                    class475 = method12245;
                }
            }
        }
        return class475 != null && class476 != null;
    }
    
    public ItemStack method11303(final Class473 class473) {
        for (int i = 0; i < class473.getSizeInventory(); ++i) {
            final ItemStack method2157 = class473.getStackInSlot(i);
            if (!method2157.method27620()) {
                final int method2158 = Class465.method2385(method2157);
                if (method2158 > 0) {
                    if (method2158 <= 6) {
                        final ItemStack method2159 = method2157.method27641();
                        method2159.method27691(1);
                        return method2159;
                    }
                }
            }
        }
        return ItemStack.EMPTY;
    }
    
    public NonNullList<ItemStack> method11323(final Class473 class473) {
        final NonNullList<ItemStack> method8507 = NonNullList.withSize(class473.getSizeInventory(), ItemStack.EMPTY);
        for (int i = 0; i < method8507.size(); ++i) {
            final ItemStack method8508 = class473.getStackInSlot(i);
            if (!method8508.method27620()) {
                if (!method8508.getItem().hasContainerItem()) {
                    if (method8508.method27656()) {
                        if (Class465.method2385(method8508) > 0) {
                            final ItemStack method8509 = method8508.method27641();
                            method8509.method27691(1);
                            method8507.set(i, method8509);
                        }
                    }
                }
                else {
                    method8507.set(i, new ItemStack(method8508.getItem().getContainerItem()));
                }
            }
        }
        return method8507;
    }
    
    @Override
    public IRecipeSerializer<?> getSerializer() {
        return IRecipeSerializer.field24743;
    }
    
    @Override
    public boolean canFit(final int n, final int n2) {
        return n * n2 >= 2;
    }
}
