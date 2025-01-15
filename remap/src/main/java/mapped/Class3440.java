// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class Class3440 extends Class3418
{
    private final Class446 field16248;
    private final Class446 field16249;
    private final Class7318 field16250;
    
    public Class3440(final int n, final Class464 class464) {
        this(n, class464, Class7318.field28308);
    }
    
    public Class3440(final int n, final Class464 class464, final Class7318 field16250) {
        super(Class8471.field34769, n);
        this.field16248 = new Class470();
        this.field16249 = new Class484(this, 2);
        this.field16250 = field16250;
        this.method10870(new Class6626(this, this.field16249, 0, 49, 19));
        this.method10870(new Class6611(this, this.field16249, 1, 49, 40));
        this.method10870(new Class6618(this, this.field16248, 2, 129, 34, field16250));
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
    public void method10855(final Class446 class446) {
        super.method10855(class446);
        if (class446 == this.field16249) {
            this.method10989();
        }
    }
    
    private void method10989() {
        final ItemStack method2157 = this.field16249.method2157(0);
        final ItemStack method2158 = this.field16249.method2157(1);
        final boolean b = !method2157.method27620() || !method2158.method27620();
        final boolean b2 = !method2157.method27620() && !method2158.method27620();
        Label_0471: {
            if (b) {
                boolean b3 = false;
                Label_0184: {
                    Label_0144: {
                        if (!method2157.method27620()) {
                            if (method2157.getItem() != Items.field31534) {
                                if (!method2157.method27675()) {
                                    break Label_0144;
                                }
                            }
                        }
                        if (!method2158.method27620()) {
                            if (method2158.getItem() != Items.field31534) {
                                if (!method2158.method27675()) {
                                    break Label_0144;
                                }
                            }
                        }
                        b3 = false;
                        break Label_0184;
                    }
                    b3 = true;
                }
                final boolean b4 = b3;
                if (method2157.method27690() <= 1) {
                    if (method2158.method27690() <= 1) {
                        if (b2 || !b4) {
                            int n = 1;
                            int max;
                            ItemStack method2159;
                            if (!b2) {
                                final boolean b5 = !method2157.method27620();
                                max = (b5 ? method2157.method27632() : method2158.method27632());
                                method2159 = (b5 ? method2157 : method2158);
                            }
                            else {
                                if (method2157.getItem() != method2158.getItem()) {
                                    this.field16248.method2160(0, ItemStack.field34174);
                                    this.method10876();
                                    return;
                                }
                                final Item method2160 = method2157.getItem();
                                max = Math.max(method2160.method11709() - (method2160.method11709() - method2157.method27632() + (method2160.method11709() - method2158.method27632()) + method2160.method11709() * 5 / 100), 0);
                                method2159 = this.method10990(method2157, method2158);
                                if (!method2159.method27630()) {
                                    if (!ItemStack.method27643(method2157, method2158)) {
                                        this.field16248.method2160(0, ItemStack.field34174);
                                        this.method10876();
                                        return;
                                    }
                                    n = 2;
                                }
                            }
                            this.field16248.method2160(0, this.method10991(method2159, max, n));
                            break Label_0471;
                        }
                    }
                }
                this.field16248.method2160(0, ItemStack.field34174);
                this.method10876();
                return;
            }
            this.field16248.method2160(0, ItemStack.field34174);
        }
        this.method10876();
    }
    
    private ItemStack method10990(final ItemStack class8321, final ItemStack class8322) {
        final ItemStack method27641 = class8321.method27641();
        for (final Map.Entry<Class6257, V> entry : Class8742.method30196(class8322).entrySet()) {
            final Class6257 class8323 = entry.getKey();
            if (class8323.method18604() && Class8742.method30195(class8323, method27641) != 0) {
                continue;
            }
            method27641.method27674(class8323, (int)entry.getValue());
        }
        return method27641;
    }
    
    private ItemStack method10991(final ItemStack class8321, final int n, final int n2) {
        ItemStack method27641 = class8321.method27641();
        method27641.method27661("Enchantments");
        method27641.method27661("StoredEnchantments");
        if (n <= 0) {
            method27641.method27661("Damage");
        }
        else {
            method27641.method27633(n);
        }
        method27641.method27691(n2);
        final Map<Object, Object> map = Class8742.method30196(class8321).entrySet().stream().filter(entry -> entry.getKey().method18604()).collect(Collectors.toMap((Function<? super Object, ?>)Map.Entry::getKey, (Function<? super Object, ?>)Map.Entry::getValue));
        Class8742.method30198((Map<Class6257, Integer>)map, method27641);
        method27641.method27681(0);
        if (method27641.getItem() == Items.field31534) {
            if (map.size() == 0) {
                method27641 = new ItemStack(Items.field31370);
                if (class8321.method27667()) {
                    method27641.method27665(class8321.method27664());
                }
            }
        }
        for (int i = 0; i < map.size(); ++i) {
            method27641.method27681(Class3441.method10996(method27641.method27680()));
        }
        return method27641;
    }
    
    @Override
    public void method10859(final Class512 class512) {
        super.method10859(class512);
        this.field16250.method22437((class514, p2) -> this.method10881(class513, class514, this.field16249));
    }
    
    @Override
    public boolean method10854(final Class512 class512) {
        return Class3418.method10866(this.field16250, class512, Class7521.field29812);
    }
    
    @Override
    public ItemStack method10858(final Class512 class512, final int n) {
        ItemStack class513 = ItemStack.field34174;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                final ItemStack method20054 = this.field16249.method2157(0);
                final ItemStack method20055 = this.field16249.method2157(1);
                if (n != 2) {
                    if (n != 0 && n != 1) {
                        if (!method20054.method27620() && !method20055.method27620()) {
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
                        else if (!this.method10888(method20053, 0, 2, false)) {
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
                class514.method20047(class512, method20053);
            }
        }
        return class513;
    }
}
