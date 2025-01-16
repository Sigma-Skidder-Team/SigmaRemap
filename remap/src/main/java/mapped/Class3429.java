// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class Class3429 extends Class3426<Class446>
{
    private final Class446 field16209;
    private final Class7604 field16210;
    public final World field16211;
    private final Class8976<? extends Class3680> field16212;
    
    public Class3429(final Class8471<?> class8471, final Class8976<? extends Class3680> class8472, final int n, final Class464 class8473) {
        this(class8471, class8472, n, class8473, new Class443(3), new Class7607(4));
    }
    
    public Class3429(final Class8471<?> class8471, final Class8976<? extends Class3680> field16212, final int n, final Class464 class8472, final Class446 field16213, final Class7604 field16214) {
        super(class8471, n);
        this.field16212 = field16212;
        Class3418.method10868(field16213, 3);
        Class3418.method10869(field16214, 4);
        this.field16209 = field16213;
        this.field16210 = field16214;
        this.field16211 = class8472.field2744.world;
        this.method10870(new Class6601(field16213, 0, 56, 17));
        this.method10870(new Class6625(this, field16213, 1, 56, 53));
        this.method10870(new Class6607(class8472.field2744, field16213, 2, 116, 35));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6601(class8472, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.method10870(new Class6601(class8472, k, 8 + k * 18, 142));
        }
        this.method10872(field16214);
    }
    
    @Override
    public void method10934(final Class5024 class5024) {
        if (this.field16209 instanceof Class472) {
            ((Class472)this.field16209).method2259(class5024);
        }
    }
    
    @Override
    public void method10935() {
        this.field16209.method2164();
    }
    
    @Override
    public void method10933(final boolean b, final Class3662<?> class3662, final Class513 class3663) {
        new Class591<Object>(this).method3458(class3663, class3662, b);
    }
    
    @Override
    public boolean method10936(final Class3662<? super Class446> class3662) {
        return class3662.method11289(this.field16209, this.field16211);
    }
    
    @Override
    public int method10937() {
        return 2;
    }
    
    @Override
    public int method10938() {
        return 1;
    }
    
    @Override
    public int method10939() {
        return 1;
    }
    
    @Override
    public int method10940() {
        return 3;
    }
    
    @Override
    public boolean method10854(final PlayerEntity playerEntity) {
        return this.field16209.method2162(playerEntity);
    }
    
    @Override
    public ItemStack method10858(final PlayerEntity playerEntity, final int n) {
        ItemStack class513 = ItemStack.field34174;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                if (n != 2) {
                    if (n != 1 && n != 0) {
                        if (!this.method10946(method20053)) {
                            if (!this.method10947(method20053)) {
                                if (n >= 3 && n < 30) {
                                    if (!this.method10888(method20053, 30, 39, false)) {
                                        return ItemStack.field34174;
                                    }
                                }
                                else if (n >= 30) {
                                    if (n < 39) {
                                        if (!this.method10888(method20053, 3, 30, false)) {
                                            return ItemStack.field34174;
                                        }
                                    }
                                }
                            }
                            else if (!this.method10888(method20053, 1, 2, false)) {
                                return ItemStack.field34174;
                            }
                        }
                        else if (!this.method10888(method20053, 0, 1, false)) {
                            return ItemStack.field34174;
                        }
                    }
                    else if (!this.method10888(method20053, 3, 39, false)) {
                        return ItemStack.field34174;
                    }
                }
                else {
                    if (!this.method10888(method20053, 3, 39, true)) {
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
                class514.method20047(playerEntity, method20053);
            }
        }
        return class513;
    }
    
    public boolean method10946(final ItemStack class8321) {
        return this.field16211.method6792().method6378((Class8976<Class3662>)this.field16212, new Class443(new ItemStack[] { class8321 }), this.field16211).isPresent();
    }
    
    public boolean method10947(final ItemStack class8321) {
        return Class466.method2400(class8321);
    }
    
    public int method10948() {
        final int method23902 = this.field16210.method23902(2);
        final int method23903 = this.field16210.method23902(3);
        return (method23903 != 0 && method23902 != 0) ? (method23902 * 24 / method23903) : 0;
    }
    
    public int method10949() {
        int method23902 = this.field16210.method23902(1);
        if (method23902 == 0) {
            method23902 = 200;
        }
        return this.field16210.method23902(0) * 13 / method23902;
    }
    
    public boolean method10950() {
        return this.field16210.method23902(0) > 0;
    }
}
