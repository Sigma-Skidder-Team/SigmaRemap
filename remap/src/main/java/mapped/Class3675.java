// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class3675 extends Class3666
{
    private static String[] field16962;
    
    public Class3675(final ResourceLocation class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                arrayList.add(method2157);
                if (arrayList.size() > 1) {
                    final ItemStack class475 = (ItemStack)arrayList.get(0);
                    if (method2157.getItem() == class475.getItem()) {
                        if (class475.method27690() == 1) {
                            if (method2157.method27690() == 1) {
                                if (class475.getItem().method11710()) {
                                    continue;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return arrayList.size() == 2;
    }
    
    public ItemStack method11303(final Class473 class473) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                arrayList.add(method2157);
                if (arrayList.size() > 1) {
                    final ItemStack class474 = (ItemStack)arrayList.get(0);
                    if (method2157.getItem() == class474.getItem()) {
                        if (class474.method27690() == 1) {
                            if (method2157.method27690() == 1) {
                                if (class474.getItem().method11710()) {
                                    continue;
                                }
                            }
                        }
                    }
                    return ItemStack.field34174;
                }
            }
        }
        if (arrayList.size() == 2) {
            final ItemStack class475 = (ItemStack)arrayList.get(0);
            final ItemStack class476 = (ItemStack)arrayList.get(1);
            if (class475.getItem() == class476.getItem()) {
                if (class475.method27690() == 1) {
                    if (class476.method27690() == 1) {
                        if (class475.getItem().method11710()) {
                            final Item method2158 = class475.getItem();
                            int n = method2158.method11709() - (method2158.method11709() - class475.method27632() + (method2158.method11709() - class476.method27632()) + method2158.method11709() * 5 / 100);
                            if (n < 0) {
                                n = 0;
                            }
                            final ItemStack class477 = new ItemStack(class475.getItem());
                            class477.method27633(n);
                            return class477;
                        }
                    }
                }
            }
        }
        return ItemStack.field34174;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n * n2 >= 2;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24747;
    }
}