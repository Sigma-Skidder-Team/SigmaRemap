// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import javax.annotation.Nullable;
import java.util.Iterator;

public class Class470 implements IInventory, Class469
{
    private static String[] field2763;
    private final NonNullList<ItemStack> field2764;
    private IRecipe<?> field2765;
    
    public Class470() {
        this.field2764 = NonNullList.withSize(1, ItemStack.EMPTY);
    }
    
    @Override
    public int getSizeInventory() {
        return 1;
    }
    
    @Override
    public boolean method2156() {
        final Iterator<Object> iterator = this.field2764.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method27620()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public ItemStack getStackInSlot(final int n) {
        return this.field2764.get(0);
    }
    
    @Override
    public ItemStack method2158(final int n, final int n2) {
        return Class8508.method28423(this.field2764, 0);
    }
    
    @Override
    public ItemStack method2159(final int n) {
        return Class8508.method28423(this.field2764, 0);
    }
    
    @Override
    public void method2160(final int n, final ItemStack class8321) {
        this.field2764.set(0, class8321);
    }
    
    @Override
    public void method2161() {
    }
    
    @Override
    public boolean method2162(final PlayerEntity playerEntity) {
        return true;
    }
    
    @Override
    public void method2164() {
        this.field2764.clear();
    }
    
    @Override
    public void method2401(final IRecipe<?> field2765) {
        this.field2765 = field2765;
    }
    
    @Nullable
    @Override
    public IRecipe<?> method2402() {
        return this.field2765;
    }
}
