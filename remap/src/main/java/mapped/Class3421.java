// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3421 extends Class3418
{
    private static String[] field16165;
    private final Class446 field16166;
    private final Class7604 field16167;
    private final Class6601 field16168;
    
    public Class3421(final int n, final Class464 class464) {
        this(n, class464, new Class443(5), new Class7607(2));
    }
    
    public Class3421(final int n, final Class464 class464, final Class446 field16166, final Class7604 field16167) {
        super(Class8471.field34765, n);
        Class3418.method10868(field16166, 5);
        Class3418.method10869(field16167, 2);
        this.field16166 = field16166;
        this.field16167 = field16167;
        this.method10870(new Class6614(field16166, 0, 56, 51));
        this.method10870(new Class6614(field16166, 1, 79, 58));
        this.method10870(new Class6614(field16166, 2, 102, 51));
        this.field16168 = this.method10870(new Class6615(field16166, 3, 79, 17));
        this.method10870(new Class6605(field16166, 4, 17, 17));
        this.method10872(field16167);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6601(class464, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.method10870(new Class6601(class464, k, 8 + k * 18, 142));
        }
    }
    
    @Override
    public boolean method10854(final Class512 class512) {
        return this.field16166.method2162(class512);
    }
    
    @Override
    public ItemStack method10858(final Class512 class512, final int n) {
        ItemStack class513 = ItemStack.field34174;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                Label_0164: {
                    if (n < 0 || n > 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (Class6605.method20064(class513)) {
                                    if (!this.method10888(method20053, 4, 5, false)) {
                                        if (!this.field16168.method20046(method20053)) {
                                            break Label_0164;
                                        }
                                        if (this.method10888(method20053, 3, 4, false)) {
                                            break Label_0164;
                                        }
                                    }
                                    return ItemStack.field34174;
                                }
                                if (!this.field16168.method20046(method20053)) {
                                    if (Class6614.method20066(class513) && class513.method27690() == 1) {
                                        if (this.method10888(method20053, 0, 3, false)) {
                                            break Label_0164;
                                        }
                                        return ItemStack.field34174;
                                    }
                                    else if (n >= 5 && n < 32) {
                                        if (this.method10888(method20053, 32, 41, false)) {
                                            break Label_0164;
                                        }
                                        return ItemStack.field34174;
                                    }
                                    else if (n >= 32 && n < 41) {
                                        if (this.method10888(method20053, 5, 32, false)) {
                                            break Label_0164;
                                        }
                                        return ItemStack.field34174;
                                    }
                                    else {
                                        if (this.method10888(method20053, 5, 41, false)) {
                                            break Label_0164;
                                        }
                                        return ItemStack.field34174;
                                    }
                                }
                                else {
                                    if (this.method10888(method20053, 3, 4, false)) {
                                        break Label_0164;
                                    }
                                    return ItemStack.field34174;
                                }
                            }
                        }
                    }
                    if (!this.method10888(method20053, 5, 41, true)) {
                        return ItemStack.field34174;
                    }
                    class514.method20049(method20053, class513);
                }
                if (!method20053.method27620()) {
                    class514.method20056();
                }
                else {
                    class514.method20055(ItemStack.field34174);
                }
                if (method20053.method27690() == class513.method27690()) {
                    return ItemStack.field34174;
                }
                class514.method20047(class512, method20053);
            }
        }
        return class513;
    }
    
    public int method10902() {
        return this.field16167.method23902(1);
    }
    
    public int method10903() {
        return this.field16167.method23902(0);
    }
}
