// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class3437 extends Class3418
{
    private static String[] field16233;
    private final Class446 field16234;
    
    public Class3437(final int n, final Class464 class464) {
        this(n, class464, new Class443(5));
    }
    
    public Class3437(final int n, final Class464 class464, final Class446 field16234) {
        super(Class8471.field34770, n);
        Class3418.method10868(this.field16234 = field16234, 5);
        field16234.method2241(class464.field2744);
        for (int i = 0; i < 5; ++i) {
            this.method10870(new Class6601(field16234, i, 44 + i * 18, 20));
        }
        for (int j = 0; j < 3; ++j) {
            for (int k = 0; k < 9; ++k) {
                this.method10870(new Class6601(class464, k + j * 9 + 9, 8 + k * 18, j * 18 + 51));
            }
        }
        for (int l = 0; l < 9; ++l) {
            this.method10870(new Class6601(class464, l, 8 + l * 18, 109));
        }
    }
    
    @Override
    public boolean method10854(final Class512 class512) {
        return this.field16234.method2162(class512);
    }
    
    @Override
    public ItemStack method10858(final Class512 class512, final int n) {
        ItemStack class513 = ItemStack.field34174;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                if (n >= this.field16234.method2239()) {
                    if (!this.method10888(method20053, 0, this.field16234.method2239(), false)) {
                        return ItemStack.field34174;
                    }
                }
                else if (!this.method10888(method20053, this.field16234.method2239(), this.field16151.size(), true)) {
                    return ItemStack.field34174;
                }
                if (!method20053.method27620()) {
                    class514.method20056();
                }
                else {
                    class514.method20055(ItemStack.field34174);
                }
            }
        }
        return class513;
    }
    
    @Override
    public void method10859(final Class512 class512) {
        super.method10859(class512);
        this.field16234.method2242(class512);
    }
}
