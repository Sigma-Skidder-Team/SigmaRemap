// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class3425 extends Class3418
{
    private static String[] field16189;
    private final IInventory field16190;
    private final Class806 field16191;
    
    public Class3425(final int n, final Class464 class464, final IInventory field16190, final Class806 field16191) {
        super(null, n);
        this.field16190 = field16190;
        this.field16191 = field16191;
        field16190.method2241(class464.field2744);
        this.method10870(new Class6627(this, field16190, 0, 8, 18, field16191));
        this.method10870(new Class6620(this, field16190, 1, 8, 36, field16191));
        if (field16191 instanceof Class812) {
            if (((Class812)field16191).method4780()) {
                for (int i = 0; i < 3; ++i) {
                    for (int j = 0; j < ((Class812)field16191).method4783(); ++j) {
                        this.method10870(new Class6601(field16190, 2 + j + i * ((Class812)field16191).method4783(), 80 + j * 18, 18 + i * 18));
                    }
                }
            }
        }
        for (int k = 0; k < 3; ++k) {
            for (int l = 0; l < 9; ++l) {
                this.method10870(new Class6601(class464, l + k * 9 + 9, 8 + l * 18, 102 + k * 18 - 18));
            }
        }
        for (int n2 = 0; n2 < 9; ++n2) {
            this.method10870(new Class6601(class464, n2, 8 + n2 * 18, 142));
        }
    }
    
    @Override
    public boolean method10854(final PlayerEntity playerEntity) {
        if (this.field16190.method2162(playerEntity)) {
            if (this.field16191.isAlive()) {
                return this.field16191.method1732(playerEntity) < 8.0f;
            }
        }
        return false;
    }
    
    @Override
    public ItemStack method10858(final PlayerEntity playerEntity, final int n) {
        ItemStack class513 = ItemStack.EMPTY;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                final int method20054 = this.field16190.getSizeInventory();
                if (n >= method20054) {
                    if (this.getSlot(1).method20046(method20053) && !this.getSlot(1).method20054()) {
                        if (!this.method10888(method20053, 1, 2, false)) {
                            return ItemStack.EMPTY;
                        }
                    }
                    else if (!this.getSlot(0).method20046(method20053)) {
                        if (method20054 <= 2 || !this.method10888(method20053, 2, method20054, false)) {
                            final int n2 = method20054 + 27;
                            final int n3 = n2 + 9;
                            if (n >= n2 && n < n3) {
                                if (!this.method10888(method20053, method20054, n2, false)) {
                                    return ItemStack.EMPTY;
                                }
                            }
                            else if (n >= method20054 && n < n2) {
                                if (!this.method10888(method20053, n2, n3, false)) {
                                    return ItemStack.EMPTY;
                                }
                            }
                            else if (!this.method10888(method20053, n2, n2, false)) {
                                return ItemStack.EMPTY;
                            }
                            return ItemStack.EMPTY;
                        }
                    }
                    else if (!this.method10888(method20053, 0, 1, false)) {
                        return ItemStack.EMPTY;
                    }
                }
                else if (!this.method10888(method20053, method20054, this.field16151.size(), true)) {
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
        this.field16190.method2242(playerEntity);
    }
}
