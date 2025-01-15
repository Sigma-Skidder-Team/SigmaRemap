// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;

public class Class3678 extends Class3666
{
    private static final Class120 field16964;
    private static final Class120 field16965;
    private static final Class120 field16966;
    private static final Map<Item, Class2141> field16967;
    private static final Class120 field16968;
    
    public Class3678(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        int n = 0;
        boolean b = false;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (!Class3678.field16964.test(method2157)) {
                    if (!Class3678.field16966.test(method2157)) {
                        if (!Class3678.field16965.test(method2157)) {
                            if (!Class3678.field16968.test(method2157)) {
                                if (!(method2157.getItem() instanceof Class3829)) {
                                    return false;
                                }
                                b = true;
                            }
                            else {
                                if (n != 0) {
                                    return false;
                                }
                                n = 1;
                            }
                        }
                        else {
                            if (n3 != 0) {
                                return false;
                            }
                            n3 = 1;
                        }
                    }
                    else {
                        if (n4 != 0) {
                            return false;
                        }
                        n4 = 1;
                    }
                }
                else {
                    if (n2 != 0) {
                        return false;
                    }
                    n2 = 1;
                }
            }
        }
        return n != 0 && b;
    }
    
    public ItemStack method11303(final Class473 class473) {
        final ItemStack class474 = new ItemStack(Items.field31533);
        final Class51 method27659 = class474.method27659("Explosion");
        Class2141 field12605 = Class2141.field12605;
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method27660 = class473.method2157(i);
            if (!method27660.method27620()) {
                if (!Class3678.field16964.test(method27660)) {
                    if (!Class3678.field16966.test(method27660)) {
                        if (!Class3678.field16965.test(method27660)) {
                            if (method27660.getItem() instanceof Class3829) {
                                arrayList.add(((Class3829)method27660.getItem()).method11767().method817());
                            }
                        }
                        else {
                            method27659.method312("Trail", true);
                        }
                    }
                    else {
                        method27659.method312("Flicker", true);
                    }
                }
                else {
                    field12605 = Class3678.field16967.get(method27660.getItem());
                }
            }
        }
        method27659.method309("Colors", arrayList);
        method27659.method296("Type", (byte)field12605.method8300());
        return class474;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n * n2 >= 2;
    }
    
    @Override
    public ItemStack method11292() {
        return new ItemStack(Items.field31533);
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24740;
    }
    
    static {
        field16964 = Class120.method618(Items.field31511, Items.field31307, Items.field31439, Items.field31523, Items.field31524, Items.field31527, Items.field31525, Items.field31528, Items.field31526);
        field16965 = Class120.method618(Items.field31283);
        field16966 = Class120.method618(Items.field31378);
        field16967 = Class8349.method27851(Maps.newHashMap(), hashMap -> {
            hashMap.put(Items.field31511, Class2141.field12606);
            hashMap.put(Items.field31307, Class2141.field12609);
            hashMap.put(Items.field31439, Class2141.field12607);
            hashMap.put(Items.field31523, Class2141.field12608);
            hashMap.put(Items.field31524, Class2141.field12608);
            hashMap.put(Items.field31527, Class2141.field12608);
            hashMap.put(Items.field31525, Class2141.field12608);
            hashMap.put(Items.field31528, Class2141.field12608);
            hashMap.put(Items.field31526, Class2141.field12608);
            return;
        });
        field16968 = Class120.method618(Items.field31308);
    }
}
