// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class3435 extends Class3418
{
    private static String[] field16226;
    private final IInventory field16227;
    
    public Class3435(final int n, final Class464 class464) {
        this(n, class464, new Class443(27));
    }
    
    public Class3435(final int n, final Class464 class464, final IInventory field16227) {
        super(Class8471.field34774, n);
        Class3418.method10868(field16227, 27);
        (this.field16227 = field16227).method2241(class464.field2744);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6613(field16227, j + i * 9, 8 + j * 18, 18 + i * 18));
            }
        }
        for (int k = 0; k < 3; ++k) {
            for (int l = 0; l < 9; ++l) {
                this.method10870(new Class6601(class464, l + k * 9 + 9, 8 + l * 18, 84 + k * 18));
            }
        }
        for (int n2 = 0; n2 < 9; ++n2) {
            this.method10870(new Class6601(class464, n2, 8 + n2 * 18, 142));
        }
    }
    
    @Override
    public boolean method10854(final PlayerEntity playerEntity) {
        return this.field16227.method2162(playerEntity);
    }
    
    @Override
    public ItemStack method10858(final PlayerEntity playerEntity, final int n) {
        ItemStack class513 = ItemStack.EMPTY;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                if (n >= this.field16227.getSizeInventory()) {
                    if (!this.method10888(method20053, 0, this.field16227.getSizeInventory(), false)) {
                        return ItemStack.EMPTY;
                    }
                }
                else if (!this.method10888(method20053, this.field16227.getSizeInventory(), this.field16151.size(), true)) {
                    return ItemStack.EMPTY;
                }
                if (!method20053.method27620()) {
                    class514.method20056();
                }
                else {
                    class514.method20055(ItemStack.EMPTY);
                }
            }
        }
        return class513;
    }
    
    @Override
    public void method10859(final PlayerEntity playerEntity) {
        super.method10859(playerEntity);
        this.field16227.method2242(playerEntity);
    }
}
