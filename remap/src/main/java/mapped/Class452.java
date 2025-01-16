// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class452 implements IInventory
{
    private static String[] field2699;
    public final /* synthetic */ Class435 field2700;
    
    public Class452(final Class435 field2700) {
        this.field2700 = field2700;
    }
    
    @Override
    public int getSizeInventory() {
        return 1;
    }
    
    @Override
    public boolean method2156() {
        return Class435.method2181(this.field2700).method27620();
    }
    
    @Override
    public ItemStack getStackInSlot(final int n) {
        return (n != 0) ? ItemStack.EMPTY : Class435.method2181(this.field2700);
    }
    
    @Override
    public ItemStack method2158(final int n, final int n2) {
        if (n != 0) {
            return ItemStack.EMPTY;
        }
        final ItemStack method27621 = Class435.method2181(this.field2700).method27621(n2);
        if (Class435.method2181(this.field2700).method27620()) {
            Class435.method2182(this.field2700);
        }
        return method27621;
    }
    
    @Override
    public ItemStack method2159(final int n) {
        if (n != 0) {
            return ItemStack.EMPTY;
        }
        final ItemStack method2181 = Class435.method2181(this.field2700);
        Class435.method2183(this.field2700, ItemStack.EMPTY);
        Class435.method2182(this.field2700);
        return method2181;
    }
    
    @Override
    public void method2160(final int n, final ItemStack class8321) {
    }
    
    @Override
    public int method2254() {
        return 1;
    }
    
    @Override
    public void method2161() {
        this.field2700.method2161();
    }
    
    @Override
    public boolean method2162(final PlayerEntity playerEntity) {
        return this.field2700.field2656.getTileEntity(this.field2700.field2657) == this.field2700 && playerEntity.method1733(this.field2700.field2657.getX() + 0.5, this.field2700.field2657.getY() + 0.5, this.field2700.field2657.getZ() + 0.5) <= 64.0 && this.field2700.method2169();
    }
    
    @Override
    public boolean method2264(final int n, final ItemStack class8321) {
        return false;
    }
    
    @Override
    public void method2164() {
    }
}
