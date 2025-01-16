// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class3438 extends Class3418
{
    private static String[] field16235;
    private final Class446 field16236;
    private final int field16237;
    
    private Class3438(final Class8471<?> class8471, final int n, final Class464 class8472, final int n2) {
        this(class8471, n, class8472, new Class443(9 * n2), n2);
    }
    
    public static Class3438 method10964(final int n, final Class464 class464) {
        return new Class3438(Class8471.field34755, n, class464, 1);
    }
    
    public static Class3438 method10965(final int n, final Class464 class464) {
        return new Class3438(Class8471.field34756, n, class464, 2);
    }
    
    public static Class3438 method10966(final int n, final Class464 class464) {
        return new Class3438(Class8471.field34757, n, class464, 3);
    }
    
    public static Class3438 method10967(final int n, final Class464 class464) {
        return new Class3438(Class8471.field34758, n, class464, 4);
    }
    
    public static Class3438 method10968(final int n, final Class464 class464) {
        return new Class3438(Class8471.field34759, n, class464, 5);
    }
    
    public static Class3438 method10969(final int n, final Class464 class464) {
        return new Class3438(Class8471.field34760, n, class464, 6);
    }
    
    public static Class3438 method10970(final int n, final Class464 class464, final Class446 class465) {
        return new Class3438(Class8471.field34757, n, class464, class465, 3);
    }
    
    public static Class3438 method10971(final int n, final Class464 class464, final Class446 class465) {
        return new Class3438(Class8471.field34760, n, class464, class465, 6);
    }
    
    public Class3438(final Class8471<?> class8471, final int n, final Class464 class8472, final Class446 field16236, final int field16237) {
        super(class8471, n);
        Class3418.method10868(field16236, field16237 * 9);
        this.field16236 = field16236;
        this.field16237 = field16237;
        field16236.method2241(class8472.field2744);
        final int n2 = (this.field16237 - 4) * 18;
        for (int i = 0; i < this.field16237; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6601(field16236, j + i * 9, 8 + j * 18, 18 + i * 18));
            }
        }
        for (int k = 0; k < 3; ++k) {
            for (int l = 0; l < 9; ++l) {
                this.method10870(new Class6601(class8472, l + k * 9 + 9, 8 + l * 18, 103 + k * 18 + n2));
            }
        }
        for (int n3 = 0; n3 < 9; ++n3) {
            this.method10870(new Class6601(class8472, n3, 8 + n3 * 18, 161 + n2));
        }
    }
    
    @Override
    public boolean method10854(final PlayerEntity playerEntity) {
        return this.field16236.method2162(playerEntity);
    }
    
    @Override
    public ItemStack method10858(final PlayerEntity playerEntity, final int n) {
        ItemStack class513 = ItemStack.field34174;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                if (n >= this.field16237 * 9) {
                    if (!this.method10888(method20053, 0, this.field16237 * 9, false)) {
                        return ItemStack.field34174;
                    }
                }
                else if (!this.method10888(method20053, this.field16237 * 9, this.field16151.size(), true)) {
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
    public void method10859(final PlayerEntity playerEntity) {
        super.method10859(playerEntity);
        this.field16236.method2242(playerEntity);
    }
    
    public Class446 method10972() {
        return this.field16236;
    }
    
    public int method10973() {
        return this.field16237;
    }
}
