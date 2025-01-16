// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Class6623 extends Class6601
{
    private static String[] field26171;
    private final Class473 field26204;
    private final PlayerEntity field26205;
    private int field26206;
    
    public Class6623(final PlayerEntity field26205, final Class473 field26206, final IInventory class446, final int n, final int n2, final int n3) {
        super(class446, n, n2, n3);
        this.field26205 = field26205;
        this.field26204 = field26206;
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return false;
    }
    
    @Override
    public ItemStack method20060(final int a) {
        if (this.method20054()) {
            this.field26206 += Math.min(a, this.method20053().method27690());
        }
        return super.method20060(a);
    }
    
    @Override
    public void method20050(final ItemStack class8321, final int n) {
        this.field26206 += n;
        this.method20052(class8321);
    }
    
    @Override
    public void method20051(final int n) {
        this.field26206 += n;
    }
    
    @Override
    public void method20052(final ItemStack class8321) {
        if (this.field26206 > 0) {
            class8321.method27651(this.field26205.world, this.field26205, this.field26206);
        }
        if (this.field26173 instanceof Class469) {
            ((Class469)this.field26173).method2403(this.field26205);
        }
        this.field26206 = 0;
    }
    
    @Override
    public ItemStack method20047(final PlayerEntity playerEntity, final ItemStack class513) {
        this.method20052(class513);
        final NonNullList<ItemStack> method6381 = playerEntity.world.method6792().method6381(Class8976.field37843, this.field26204, playerEntity.world);
        for (int i = 0; i < method6381.size(); ++i) {
            ItemStack class514 = this.field26204.getStackInSlot(i);
            final ItemStack class515 = method6381.get(i);
            if (!class514.method27620()) {
                this.field26204.method2158(i, 1);
                class514 = this.field26204.getStackInSlot(i);
            }
            if (!class515.method27620()) {
                if (!class514.method27620()) {
                    if (ItemStack.method27645(class514, class515) && ItemStack.method27642(class514, class515)) {
                        class515.method27692(class514.method27690());
                        this.field26204.method2160(i, class515);
                    }
                    else if (!this.field26205.field3006.method2362(class515)) {
                        this.field26205.method2822(class515, false);
                    }
                }
                else {
                    this.field26204.method2160(i, class515);
                }
            }
        }
        return class513;
    }
}
