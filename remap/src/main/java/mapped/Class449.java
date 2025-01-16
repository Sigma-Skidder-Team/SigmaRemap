// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class449 extends TileEntity implements Class447
{
    private ItemStack field2689;
    
    public Class449() {
        super(Class5412.field22545);
        this.field2689 = ItemStack.EMPTY;
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        if (class51.contains("RecordItem", 10)) {
            this.method2278(ItemStack.method27619(class51.getCompound("RecordItem")));
        }
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        if (!this.method2277().method27620()) {
            class51.put("RecordItem", this.method2277().method27627(new CompoundNBT()));
        }
        return class51;
    }
    
    public ItemStack method2277() {
        return this.field2689;
    }
    
    public void method2278(final ItemStack field2689) {
        this.field2689 = field2689;
        this.method2161();
    }
    
    @Override
    public void method2164() {
        this.method2278(ItemStack.EMPTY);
    }
}
