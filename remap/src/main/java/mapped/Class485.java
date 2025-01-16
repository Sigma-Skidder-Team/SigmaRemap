// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.AbstractList;

public class Class485 extends Class443
{
    private Class477 field2794;
    
    public Class485() {
        super(27);
    }
    
    public void method2429(final Class477 field2794) {
        this.field2794 = field2794;
    }
    
    public void method2430(final ListNBT class52) {
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            this.method2160(i, ItemStack.EMPTY);
        }
        for (int j = 0; j < class52.size(); ++j) {
            final CompoundNBT method346 = class52.method346(j);
            final int n = method346.getByte("Slot") & 0xFF;
            if (n >= 0) {
                if (n < this.getSizeInventory()) {
                    this.method2160(n, ItemStack.method27619(method346));
                }
            }
        }
    }
    
    public ListNBT method2431() {
        final ListNBT class52 = new ListNBT();
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            final ItemStack method2157 = this.getStackInSlot(i);
            if (!method2157.method27620()) {
                final CompoundNBT e = new CompoundNBT();
                e.putByte("Slot", (byte)i);
                method2157.method27627(e);
                ((AbstractList<CompoundNBT>)class52).add(e);
            }
        }
        return class52;
    }
    
    @Override
    public boolean method2162(final PlayerEntity playerEntity) {
        return (this.field2794 == null || this.field2794.method2428(playerEntity)) && super.method2162(playerEntity);
    }
    
    @Override
    public void method2241(final PlayerEntity playerEntity) {
        if (this.field2794 != null) {
            this.field2794.method2426();
        }
        super.method2241(playerEntity);
    }
    
    @Override
    public void method2242(final PlayerEntity playerEntity) {
        if (this.field2794 != null) {
            this.field2794.method2427();
        }
        super.method2242(playerEntity);
        this.field2794 = null;
    }
}
