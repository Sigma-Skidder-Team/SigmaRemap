// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class Class3436 extends Class3418
{
    private static String[] field16228;
    private final Class446 field16229;
    private final Class6629 field16230;
    private final Class7318 field16231;
    private final Class7604 field16232;
    
    public Class3436(final int n, final Class446 class446) {
        this(n, class446, new Class7607(3), Class7318.field28308);
    }
    
    public Class3436(final int n, final Class446 class446, final Class7604 field16232, final Class7318 field16233) {
        super(Class8471.field34763, n);
        this.field16229 = new Class486(this, 1);
        Class3418.method10869(field16232, 3);
        this.field16232 = field16232;
        this.field16231 = field16233;
        this.method10870(this.field16230 = new Class6629(this, this.field16229, 0, 136, 110));
        this.method10872(field16232);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6601(class446, j + i * 9 + 9, 36 + j * 18, 137 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.method10870(new Class6601(class446, k, 36 + k * 18, 195));
        }
    }
    
    @Override
    public void method10859(final Class512 class512) {
        super.method10859(class512);
        if (!class512.world.isRemote) {
            final ItemStack method20060 = this.field16230.method20060(this.field16230.method20057());
            if (!method20060.method27620()) {
                class512.method2822(method20060, false);
            }
        }
    }
    
    @Override
    public boolean method10854(final Class512 class512) {
        return Class3418.method10866(this.field16231, class512, Class7521.field29417);
    }
    
    @Override
    public void method10884(final int n, final int n2) {
        super.method10884(n, n2);
        this.method10876();
    }
    
    @Override
    public ItemStack method10858(final Class512 class512, final int n) {
        ItemStack class513 = ItemStack.field34174;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                Label_0093: {
                    if (n != 0) {
                        if (!this.field16230.method20054()) {
                            if (this.field16230.method20046(method20053)) {
                                if (method20053.method27690() == 1) {
                                    if (this.method10888(method20053, 0, 1, false)) {
                                        break Label_0093;
                                    }
                                    return ItemStack.field34174;
                                }
                            }
                        }
                        if (n >= 1 && n < 28) {
                            if (!this.method10888(method20053, 28, 37, false)) {
                                return ItemStack.field34174;
                            }
                        }
                        else if (n >= 28 && n < 37) {
                            if (!this.method10888(method20053, 1, 28, false)) {
                                return ItemStack.field34174;
                            }
                        }
                        else if (!this.method10888(method20053, 1, 37, false)) {
                            return ItemStack.field34174;
                        }
                    }
                    else {
                        if (!this.method10888(method20053, 1, 37, true)) {
                            return ItemStack.field34174;
                        }
                        class514.method20049(method20053, class513);
                    }
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
    
    public int method10959() {
        return this.field16232.method23902(0);
    }
    
    @Nullable
    public Class5328 method10960() {
        return Class5328.method16450(this.field16232.method23902(1));
    }
    
    @Nullable
    public Class5328 method10961() {
        return Class5328.method16450(this.field16232.method23902(2));
    }
    
    public void method10962(final int n, final int n2) {
        if (this.field16230.method20054()) {
            this.field16232.method23903(1, n);
            this.field16232.method23903(2, n2);
            this.field16230.method20060(1);
        }
    }
    
    public boolean method10963() {
        return !this.field16229.method2157(0).method27620();
    }
}
