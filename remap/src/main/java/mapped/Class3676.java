// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class Class3676 extends Class3666
{
    public Class3676(final ResourceLocation class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        int n = 0;
        ItemStack field34174 = ItemStack.EMPTY;
        for (int i = 0; i < class473.getSizeInventory(); ++i) {
            final ItemStack method2157 = class473.getStackInSlot(i);
            if (!method2157.method27620()) {
                if (method2157.getItem() != Items.field31513) {
                    if (method2157.getItem() != Items.field31512) {
                        return false;
                    }
                    ++n;
                }
                else {
                    if (!field34174.method27620()) {
                        return false;
                    }
                    field34174 = method2157;
                }
            }
        }
        if (!field34174.method27620()) {
            if (field34174.method27656()) {
                return n > 0;
            }
        }
        return false;
    }
    
    public ItemStack method11303(final Class473 class473) {
        int n = 0;
        ItemStack field34174 = ItemStack.EMPTY;
        for (int i = 0; i < class473.getSizeInventory(); ++i) {
            final ItemStack method2157 = class473.getStackInSlot(i);
            if (!method2157.method27620()) {
                if (method2157.getItem() != Items.field31513) {
                    if (method2157.getItem() != Items.field31512) {
                        return ItemStack.EMPTY;
                    }
                    ++n;
                }
                else {
                    if (!field34174.method27620()) {
                        return ItemStack.EMPTY;
                    }
                    field34174 = method2157;
                }
            }
        }
        if (!field34174.method27620()) {
            if (field34174.method27656()) {
                if (n >= 1) {
                    if (Class4096.method12340(field34174) < 2) {
                        final ItemStack class474 = new ItemStack(Items.field31513, n);
                        final CompoundNBT method2158 = field34174.method27657().copy();
                        method2158.putInt("generation", Class4096.method12340(field34174) + 1);
                        class474.method27663(method2158);
                        return class474;
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
            if (!method8508.getItem().hasContainerItem()) {
                if (method8508.getItem() instanceof Class4096) {
                    final ItemStack method8509 = method8508.method27641();
                    method8509.method27691(1);
                    method8507.set(i, method8509);
                    break;
                }
            }
            else {
                method8507.set(i, new ItemStack(method8508.getItem().getContainerItem()));
            }
        }
        return method8507;
    }
    
    @Override
    public IRecipeSerializer<?> getSerializer() {
        return IRecipeSerializer.field24736;
    }
    
    @Override
    public boolean canFit(final int n, final int n2) {
        return n >= 3 && n2 >= 3;
    }
}
