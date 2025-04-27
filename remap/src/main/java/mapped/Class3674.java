// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.world.World;

import java.util.AbstractList;

public class Class3674 extends Class3666
{
    private static final Ingredient field16959;
    private static final Ingredient field16960;
    private static final Ingredient field16961;
    
    public Class3674(final ResourceLocation class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < class473.getSizeInventory(); ++i) {
            final ItemStack method2157 = class473.getStackInSlot(i);
            if (!method2157.method27620()) {
                if (!Class3674.field16959.test(method2157)) {
                    if (!Class3674.field16960.test(method2157)) {
                        if (!Class3674.field16961.test(method2157)) {
                            return false;
                        }
                    }
                    else if (++n2 > 3) {
                        return false;
                    }
                }
                else {
                    if (n != 0) {
                        return false;
                    }
                    n = 1;
                }
            }
        }
        return n != 0 && n2 >= 1;
    }
    
    public ItemStack method11303(final Class473 class473) {
        final ItemStack class474 = new ItemStack(Items.field31532, 3);
        final CompoundNBT method27659 = class474.method27659("Fireworks");
        final ListNBT class475 = new ListNBT();
        int n = 0;
        for (int i = 0; i < class473.getSizeInventory(); ++i) {
            final ItemStack method27660 = class473.getStackInSlot(i);
            if (!method27660.method27620()) {
                if (!Class3674.field16960.test(method27660)) {
                    if (Class3674.field16961.test(method27660)) {
                        final CompoundNBT method27661 = method27660.method27660("Explosion");
                        if (method27661 != null) {
                            class475.add(method27661);
                        }
                    }
                }
                else {
                    ++n;
                }
            }
        }
        method27659.putByte("Flight", (byte)n);
        if (!class475.isEmpty()) {
            method27659.put("Explosions", class475);
        }
        return class474;
    }
    
    @Override
    public boolean canFit(final int n, final int n2) {
        return n * n2 >= 2;
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return new ItemStack(Items.field31532);
    }
    
    @Override
    public IRecipeSerializer<?> getSerializer() {
        return IRecipeSerializer.field24739;
    }
    
    static {
        field16959 = Ingredient.method618(Items.field31369);
        field16960 = Ingredient.method618(Items.field31308);
        field16961 = Ingredient.method618(Items.field31533);
    }
}
