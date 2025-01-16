// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class3434 extends Class3418
{
    private static String[] field16224;
    public final Class2265<ItemStack> field16225;
    
    public Class3434(final PlayerEntity playerEntity) {
        super(null, 0);
        this.field16225 = Class2265.method8506();
        final Class464 field3006 = playerEntity.field3006;
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6603(Class525.method3024(), i * 9 + j, 9 + j * 18, 18 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.method10870(new Class6601(field3006, k, 9 + k * 18, 112));
        }
        this.method10957(0.0f);
    }
    
    @Override
    public boolean method10854(final PlayerEntity playerEntity) {
        return true;
    }
    
    public void method10957(final float n) {
        int n2 = (int)(n * ((this.field16225.size() + 9 - 1) / 9 - 5) + 0.5);
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 9; ++j) {
                final int n3 = j + (i + n2) * 9;
                if (n3 >= 0 && n3 < this.field16225.size()) {
                    Class525.method3024().method2160(j + i * 9, this.field16225.get(n3));
                }
                else {
                    Class525.method3024().method2160(j + i * 9, ItemStack.field34174);
                }
            }
        }
    }
    
    public boolean method10958() {
        return this.field16225.size() > 45;
    }
    
    @Override
    public ItemStack method10858(final PlayerEntity playerEntity, final int n) {
        if (n >= this.field16151.size() - 9) {
            if (n < this.field16151.size()) {
                final Class6601 class513 = this.field16151.get(n);
                if (class513 != null) {
                    if (class513.method20054()) {
                        class513.method20055(ItemStack.field34174);
                    }
                }
            }
        }
        return ItemStack.field34174;
    }
    
    @Override
    public boolean method10857(final ItemStack class8321, final Class6601 class8322) {
        return class8322.field26173 != Class525.method3024();
    }
    
    @Override
    public boolean method10896(final Class6601 class6601) {
        return class6601.field26173 != Class525.method3024();
    }
}
