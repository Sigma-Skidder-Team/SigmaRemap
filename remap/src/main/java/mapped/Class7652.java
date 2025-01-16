// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.List;

public class Class7652
{
    private static final List<Class7388<Class8061>> field30383;
    private static final List<Class7388<Item>> field30384;
    private static final List<Ingredient> field30385;
    private static final Predicate<ItemStack> field30386;
    
    public static boolean method24240(final ItemStack class8321) {
        return method24241(class8321) || method24242(class8321);
    }
    
    public static boolean method24241(final ItemStack class8321) {
        for (int i = 0; i < Class7652.field30384.size(); ++i) {
            if (Class7388.method22689((Class7388<Object>)Class7652.field30384.get(i)).test(class8321)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method24242(final ItemStack class8321) {
        for (int i = 0; i < Class7652.field30383.size(); ++i) {
            if (Class7388.method22689((Class7388<Object>)Class7652.field30383.get(i)).test(class8321)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method24243(final Class8061 class8061) {
        for (int i = 0; i < Class7652.field30383.size(); ++i) {
            if (Class7388.method22690((Class7388<Object>)Class7652.field30383.get(i)) == class8061) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method24244(final ItemStack class8321, final ItemStack class8322) {
        return Class7652.field30386.test(class8321) && (method24245(class8321, class8322) || method24246(class8321, class8322));
    }
    
    public static boolean method24245(final ItemStack class8321, final ItemStack class8322) {
        final Item method27622 = class8321.getItem();
        for (int i = 0; i < Class7652.field30384.size(); ++i) {
            final Class7388 class8323 = Class7652.field30384.get(i);
            if (Class7388.method22691(class8323) == method27622 && Class7388.method22689(class8323).test(class8322)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method24246(final ItemStack class8321, final ItemStack class8322) {
        final Class8061 method16474 = Class5333.method16474(class8321);
        for (int i = 0; i < Class7652.field30383.size(); ++i) {
            final Class7388 class8323 = Class7652.field30383.get(i);
            if (Class7388.method22691(class8323) == method16474 && Class7388.method22689(class8323).test(class8322)) {
                return true;
            }
        }
        return false;
    }
    
    public static ItemStack method24247(final ItemStack class8321, final ItemStack class8322) {
        if (!class8322.method27620()) {
            final Class8061 method16474 = Class5333.method16474(class8322);
            final Item method16475 = class8322.getItem();
            for (int i = 0; i < Class7652.field30384.size(); ++i) {
                final Class7388 class8323 = Class7652.field30384.get(i);
                if (Class7388.method22691(class8323) == method16475 && Class7388.method22689(class8323).test(class8321)) {
                    return Class5333.method16476(new ItemStack((Class3832)Class7388.method22690(class8323)), method16474);
                }
            }
            for (int j = 0; j < Class7652.field30383.size(); ++j) {
                final Class7388 class8324 = Class7652.field30383.get(j);
                if (Class7388.method22691(class8324) == method16474 && Class7388.method22689(class8324).test(class8321)) {
                    return Class5333.method16476(new ItemStack(method16475), (Class8061)Class7388.method22690(class8324));
                }
            }
        }
        return class8322;
    }
    
    public static void method24248() {
        method24250(Items.field31441);
        method24250(Items.field31579);
        method24250(Items.field31582);
        method24249(Items.field31441, Items.field31308, Items.field31579);
        method24249(Items.field31579, Items.field31578, Items.field31582);
        method24251(Class8644.field36251, Items.field31450, Class8644.field36252);
        method24251(Class8644.field36251, Items.field31438, Class8644.field36252);
        method24251(Class8644.field36251, Items.field31544, Class8644.field36252);
        method24251(Class8644.field36251, Items.field31445, Class8644.field36252);
        method24251(Class8644.field36251, Items.field31443, Class8644.field36252);
        method24251(Class8644.field36251, Items.field31406, Class8644.field36252);
        method24251(Class8644.field36251, Items.field31446, Class8644.field36252);
        method24251(Class8644.field36251, Items.field31378, Class8644.field36253);
        method24251(Class8644.field36251, Items.field31354, Class8644.field36252);
        method24251(Class8644.field36251, Items.field31440, Class8644.field36254);
        method24251(Class8644.field36254, Items.field31522, Class8644.field36255);
        method24251(Class8644.field36255, Items.field31354, Class8644.field36256);
        method24251(Class8644.field36255, Items.field31444, Class8644.field36257);
        method24251(Class8644.field36256, Items.field31444, Class8644.field36258);
        method24251(Class8644.field36257, Items.field31354, Class8644.field36258);
        method24251(Class8644.field36254, Items.field31446, Class8644.field36262);
        method24251(Class8644.field36262, Items.field31354, Class8644.field36263);
        method24251(Class8644.field36254, Items.field31544, Class8644.field36259);
        method24251(Class8644.field36259, Items.field31354, Class8644.field36260);
        method24251(Class8644.field36259, Items.field31378, Class8644.field36261);
        method24251(Class8644.field36259, Items.field31444, Class8644.field36267);
        method24251(Class8644.field36260, Items.field31444, Class8644.field36268);
        method24251(Class8644.field36267, Items.field31354, Class8644.field36268);
        method24251(Class8644.field36267, Items.field31378, Class8644.field36269);
        method24251(Class8644.field36254, Items.field31272, Class8644.field36270);
        method24251(Class8644.field36270, Items.field31354, Class8644.field36271);
        method24251(Class8644.field36270, Items.field31378, Class8644.field36272);
        method24251(Class8644.field36264, Items.field31444, Class8644.field36267);
        method24251(Class8644.field36265, Items.field31444, Class8644.field36268);
        method24251(Class8644.field36254, Items.field31406, Class8644.field36264);
        method24251(Class8644.field36264, Items.field31354, Class8644.field36265);
        method24251(Class8644.field36264, Items.field31378, Class8644.field36266);
        method24251(Class8644.field36254, Items.field31382, Class8644.field36273);
        method24251(Class8644.field36273, Items.field31354, Class8644.field36274);
        method24251(Class8644.field36254, Items.field31450, Class8644.field36275);
        method24251(Class8644.field36275, Items.field31378, Class8644.field36276);
        method24251(Class8644.field36275, Items.field31444, Class8644.field36277);
        method24251(Class8644.field36276, Items.field31444, Class8644.field36278);
        method24251(Class8644.field36277, Items.field31378, Class8644.field36278);
        method24251(Class8644.field36279, Items.field31444, Class8644.field36277);
        method24251(Class8644.field36280, Items.field31444, Class8644.field36277);
        method24251(Class8644.field36281, Items.field31444, Class8644.field36278);
        method24251(Class8644.field36254, Items.field31443, Class8644.field36279);
        method24251(Class8644.field36279, Items.field31354, Class8644.field36280);
        method24251(Class8644.field36279, Items.field31378, Class8644.field36281);
        method24251(Class8644.field36254, Items.field31438, Class8644.field36282);
        method24251(Class8644.field36282, Items.field31354, Class8644.field36283);
        method24251(Class8644.field36282, Items.field31378, Class8644.field36284);
        method24251(Class8644.field36254, Items.field31445, Class8644.field36285);
        method24251(Class8644.field36285, Items.field31354, Class8644.field36286);
        method24251(Class8644.field36285, Items.field31378, Class8644.field36287);
        method24251(Class8644.field36251, Items.field31444, Class8644.field36288);
        method24251(Class8644.field36288, Items.field31354, Class8644.field36289);
        method24251(Class8644.field36254, Items.field31608, Class8644.field36291);
        method24251(Class8644.field36291, Items.field31354, Class8644.field36292);
    }
    
    private static void method24249(final Item class3820, final Item class3821, final Item class3822) {
        if (!(class3820 instanceof Class4089)) {
            throw new IllegalArgumentException("Expected a potion, got: " + Registry.field211.getKey(class3820));
        }
        if (class3822 instanceof Class4089) {
            Class7652.field30384.add(new Class7388<Item>(class3820, Ingredient.method618(class3821), class3822));
            return;
        }
        throw new IllegalArgumentException("Expected a potion, got: " + Registry.field211.getKey(class3822));
    }
    
    private static void method24250(final Item class3820) {
        if (class3820 instanceof Class4089) {
            Class7652.field30385.add(Ingredient.method618(class3820));
            return;
        }
        throw new IllegalArgumentException("Expected a potion, got: " + Registry.field211.getKey(class3820));
    }
    
    private static void method24251(final Class8061 class8061, final Item class8062, final Class8061 class8063) {
        Class7652.field30383.add(new Class7388<Class8061>(class8061, Ingredient.method618(class8062), class8063));
    }
    
    static {
        field30383 = Lists.newArrayList();
        field30384 = Lists.newArrayList();
        field30385 = Lists.newArrayList();
        field30386 = (class8321 -> {
            Class7652.field30385.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                if (!iterator.next().test(class8321)) {
                    continue;
                }
                else {
                    return true;
                }
            }
            return false;
        });
    }
}
