// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;

import java.util.function.BiFunction;
import java.util.Map;

public class Class7463
{
    private static final Map<ResourceLocation, Class6230<?>> field28817;
    private static final Map<Class<? extends Class125>, Class6230<?>> field28818;
    public static final BiFunction<ItemStack, Class7529, ItemStack> field28819;
    
    public static <T extends Class125> void method22988(final Class6230<? extends T> class6230) {
        final ResourceLocation method18545 = class6230.method18545();
        final Class method18546 = class6230.method18546();
        if (Class7463.field28817.containsKey(method18545)) {
            throw new IllegalArgumentException("Can't re-register item function name " + method18545);
        }
        if (!Class7463.field28818.containsKey(method18546)) {
            Class7463.field28817.put(method18545, class6230);
            Class7463.field28818.put(method18546, class6230);
            return;
        }
        throw new IllegalArgumentException("Can't re-register item function class " + method18546.getName());
    }
    
    public static Class6230<?> method22989(final ResourceLocation obj) {
        final Class6230 class6230 = Class7463.field28817.get(obj);
        if (class6230 != null) {
            return class6230;
        }
        throw new IllegalArgumentException("Unknown loot item function '" + obj + "'");
    }
    
    public static <T extends Class125> Class6230<T> method22990(final T obj) {
        final Class6230 class6230 = Class7463.field28818.get(obj.getClass());
        if (class6230 != null) {
            return class6230;
        }
        throw new IllegalArgumentException("Unknown loot item function " + obj);
    }
    
    public static BiFunction<ItemStack, Class7529, ItemStack> method22991(final BiFunction<ItemStack, Class7529, ItemStack>[] array2) {
        switch (array2.length) {
            case 0: {
                return Class7463.field28819;
            }
            case 1: {
                return array2[0];
            }
            case 2: {
                return (class8323, class8324) -> {
                    final Object o = array2[1];
                    final Object o2 = array2[0];
                    return (ItemStack)biFunction.apply(biFunction2.apply(class8323, class8324), class8324);
                };
            }
            default: {
                return (class8326, class8328) -> {
                    int i = 0;
                    for (int length = array3.length; i < length; ++i) {
                        class8326 = (ItemStack)array3[i].apply(class8326, class8328);
                    }
                    return class8326;
                };
            }
        }
    }
    
    static {
        field28817 = Maps.newHashMap();
        field28818 = Maps.newHashMap();
        field28819 = ((class8321, p1) -> class8321);
        method22988((Class6230<? extends Class125>)new Class6245());
        method22988((Class6230<? extends Class125>)new Class6233());
        method22988((Class6230<? extends Class125>)new Class6239());
        method22988((Class6230<? extends Class125>)new Class6243());
        method22988((Class6230<? extends Class125>)new Class6246());
        method22988((Class6230<? extends Class125>)new Class6229());
        method22988((Class6230<? extends Class125>)new Class6228());
        method22988((Class6230<? extends Class125>)new Class6240());
        method22988((Class6230<? extends Class125>)new Class6238());
        method22988((Class6230<? extends Class125>)new Class6248());
        method22988((Class6230<? extends Class125>)new Class6231());
        method22988((Class6230<? extends Class125>)new Class6242());
        method22988((Class6230<? extends Class125>)new Class6241());
        method22988((Class6230<? extends Class125>)new Class6244());
        method22988((Class6230<? extends Class125>)new Class6226());
        method22988((Class6230<? extends Class125>)new Class6234());
        method22988((Class6230<? extends Class125>)new Class6237());
        method22988((Class6230<? extends Class125>)new Class6232());
        method22988((Class6230<? extends Class125>)new Class6236());
        method22988((Class6230<? extends Class125>)new Class6247());
        method22988((Class6230<? extends Class125>)new Class6235());
    }
}
