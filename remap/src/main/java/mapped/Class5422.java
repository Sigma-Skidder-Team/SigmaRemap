// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class Class5422 extends Class5419<Class824>
{
    private static String[] field22606;
    private Set<Item> field22607;
    
    public Class5422() {
        super((Map)ImmutableMap.of((Object)Class8233.field33811, (Object)Class1952.field10628, (Object)Class8233.field33805, (Object)Class1952.field10628));
        this.field22607 = (Set<Item>)ImmutableSet.of();
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        return Class6793.method20786(class1850.method2618(), Class8233.field33811, EntityType.field29042);
    }
    
    public boolean method16560(final Class1849 class1849, final Class824 class1850, final long n) {
        return this.method16559(class1849, class1850);
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        final Class824 class1851 = class1850.method2618().method1198((Class8233<Class824>)Class8233.field33811).get();
        Class6793.method20784(class1850, class1851);
        this.field22607 = method16564(class1850, class1851);
    }
    
    public void method16562(final Class1849 class1849, final Class824 class1850, final long n) {
        final Class824 class1851 = class1850.method2618().method1198((Class8233<Class824>)Class8233.field33811).get();
        if (class1850.method1734(class1851) <= 5.0) {
            Class6793.method20784(class1850, class1851);
            class1850.method4889(class1851, n);
            if (class1850.method4884()) {
                if (class1850.method4870().method28781() == Class9334.field40065 || class1851.method4885()) {
                    method16565(class1850, Class824.field4400.keySet(), class1851);
                }
            }
            if (!this.field22607.isEmpty()) {
                if (class1850.method4837().method2266(this.field22607)) {
                    method16565(class1850, this.field22607, class1851);
                }
            }
        }
    }
    
    public void method16563(final Class1849 class1849, final Class824 class1850, final long n) {
        class1850.method2618().method1195(Class8233.field33811);
    }
    
    private static Set<Item> method16564(final Class824 class824, final Class824 class825) {
        return class825.method4870().method28781().method34576().stream().filter(class827 -> {
            class826.method4870().method28781().method34576();
            return !set.contains((Object)class827);
        }).collect((Collector<? super Object, ?, Set<Item>>)Collectors.toSet());
    }
    
    private static void method16565(final Class824 class824, final Set<Item> set, final LivingEntity class825) {
        final Class443 method4837 = class824.method4837();
        ItemStack field34174 = ItemStack.field34174;
        for (int i = 0; i < method4837.method2239(); ++i) {
            final ItemStack method4838 = method4837.method2157(i);
            if (!method4838.method27620()) {
                final Item method4839 = method4838.getItem();
                if (set.contains(method4839)) {
                    int n;
                    if (method4838.method27690() <= method4838.method27628() / 2) {
                        if (method4838.method27690() <= 24) {
                            continue;
                        }
                        n = method4838.method27690() - 24;
                    }
                    else {
                        n = method4838.method27690() / 2;
                    }
                    method4838.method27693(n);
                    field34174 = new ItemStack(method4839, n);
                    break;
                }
            }
        }
        if (!field34174.method27620()) {
            Class6793.method20791(class824, field34174, class825);
        }
    }
}
