// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6607 extends Class6601
{
    private static String[] field26171;
    private final Class512 field26185;
    private int field26186;
    
    public Class6607(final Class512 field26185, final Class446 class446, final int n, final int n2, final int n3) {
        super(class446, n, n2, n3);
        this.field26185 = field26185;
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return false;
    }
    
    @Override
    public ItemStack method20060(final int a) {
        if (this.method20054()) {
            this.field26186 += Math.min(a, this.method20053().method27690());
        }
        return super.method20060(a);
    }
    
    @Override
    public ItemStack method20047(final Class512 class512, final ItemStack class513) {
        this.method20052(class513);
        super.method20047(class512, class513);
        return class513;
    }
    
    @Override
    public void method20050(final ItemStack class8321, final int n) {
        this.field26186 += n;
        this.method20052(class8321);
    }
    
    @Override
    public void method20052(final ItemStack class8321) {
        class8321.method27651(this.field26185.world, this.field26185, this.field26186);
        if (!this.field26185.world.isRemote) {
            if (this.field26173 instanceof Class466) {
                ((Class466)this.field26173).method2404(this.field26185);
            }
        }
        this.field26186 = 0;
    }
}
