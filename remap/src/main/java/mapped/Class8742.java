// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class8742
{
    public static int method30195(final Class6257 class6257, final ItemStack class6258) {
        if (!class6258.method27620()) {
            final ResourceLocation method503 = Registry.field209.getKey(class6257);
            final ListNBT method504 = class6258.method27662();
            for (int i = 0; i < method504.size(); ++i) {
                final CompoundNBT method505 = method504.method346(i);
                final ResourceLocation method506 = ResourceLocation.method7795(method505.getString("id"));
                if (method506 != null && method506.equals(method503)) {
                    return MathHelper.method35651(method505.getInt("lvl"), 0, 255);
                }
            }
            return 0;
        }
        return 0;
    }
    
    public static Map<Class6257, Integer> method30196(final ItemStack class8321) {
        return method30197((class8321.getItem() != Items.field31534) ? class8321.method27662() : Class4034.method12225(class8321));
    }
    
    public static Map<Class6257, Integer> method30197(final ListNBT class52) {
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        for (int i = 0; i < class52.size(); ++i) {
            Registry.field209.method506(ResourceLocation.method7795(class52.method346(i).getString("id"))).ifPresent(class54 -> {
                final Integer n = map.put(class54, class53.method319("lvl"));
                return;
            });
        }
        return linkedHashMap;
    }
    
    public static void method30198(final Map<Class6257, Integer> map, final ItemStack class8321) {
        final ListNBT class8322 = new ListNBT();
        for (final Map.Entry<Class6257, V> entry : map.entrySet()) {
            final Class6257 class8323 = entry.getKey();
            if (class8323 == null) {
                continue;
            }
            final int intValue = (int)entry.getValue();
            final CompoundNBT e = new CompoundNBT();
            e.putString("id", String.valueOf(Registry.field209.getKey(class8323)));
            e.putShort("lvl", (short)intValue);
            ((AbstractList<CompoundNBT>)class8322).add(e);
            if (class8321.getItem() != Items.field31534) {
                continue;
            }
            Class4034.method12226(class8321, new Class6827(class8323, intValue));
        }
        if (!class8322.isEmpty()) {
            if (class8321.getItem() != Items.field31534) {
                class8321.method27676("Enchantments", class8322);
            }
        }
        else {
            class8321.method27661("Enchantments");
        }
    }
    
    private static void method30199(final Class7311 class7311, final ItemStack class7312) {
        if (!class7312.method27620()) {
            final ListNBT class7315 = class7312.method27662();
            for (int n2 = 0; n2 < class7315.size(); ++n2) {
                Registry.field209.method506(ResourceLocation.method7795(class7315.method346(n2).getString("id"))).ifPresent(class7314 -> {
                    final ListNBT class7315;
                    final int n2;
                    class7315.method346(n2).getInt("lvl");
                    class7313.method22427(class7314, n);
                    return;
                });
            }
        }
    }
    
    private static void method30200(final Class7311 class7311, final Iterable<ItemStack> iterable) {
        final Iterator<ItemStack> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            method30199(class7311, iterator.next());
        }
    }
    
    public static int method30201(final Iterable<ItemStack> iterable, final DamageSource class7929) {
        final MutableInt mutableInt = new MutableInt();
        method30200((class7930, n) -> mutableInt.add(class7930.method18594(n, class7929)), iterable);
        return mutableInt.intValue();
    }
    
    public static float method30202(final ItemStack class8321, final Class6363 class8322) {
        final MutableFloat mutableFloat = new MutableFloat();
        method30199((class6364, n) -> mutableFloat.add(class6364.method18595(n, class8322)), class8321);
        return mutableFloat.floatValue();
    }
    
    public static float method30203(final LivingEntity class511) {
        final int method30206 = method30206(Class7882.field32364, class511);
        return (method30206 <= 0) ? 0.0f : Class6267.method18606(method30206);
    }
    
    public static void method30204(final LivingEntity class511, final Entity class512) {
        final Class7311 class513 = (class513, n) -> class513.method18602(class511, class512, n);
        if (class511 != null) {
            method30200(class513, class511.method1802());
        }
        if (class512 instanceof PlayerEntity) {
            method30199(class513, class511.getHeldItemMainhand());
        }
    }
    
    public static void method30205(final LivingEntity class511, final Entity class512) {
        final Class7311 class513 = (class513, n) -> class513.method18601(class511, class512, n);
        if (class511 != null) {
            method30200(class513, class511.method1802());
        }
        if (class511 instanceof PlayerEntity) {
            method30199(class513, class511.getHeldItemMainhand());
        }
    }
    
    public static int method30206(final Class6257 class6257, final LivingEntity class6258) {
        final Collection<ItemStack> values = class6257.method18591(class6258).values();
        if (values != null) {
            int n = 0;
            final Iterator<Object> iterator = values.iterator();
            while (iterator.hasNext()) {
                final int method30195 = method30195(class6257, iterator.next());
                if (method30195 <= n) {
                    continue;
                }
                n = method30195;
            }
            return n;
        }
        return 0;
    }
    
    public static int method30207(final LivingEntity class511) {
        return method30206(Class7882.field32361, class511);
    }
    
    public static int method30208(final LivingEntity class511) {
        return method30206(Class7882.field32362, class511);
    }
    
    public static int method30209(final LivingEntity class511) {
        return method30206(Class7882.field32352, class511);
    }
    
    public static int method30210(final LivingEntity class511) {
        return method30206(Class7882.field32355, class511);
    }
    
    public static int method30211(final LivingEntity class511) {
        return method30206(Class7882.field32365, class511);
    }
    
    public static int method30212(final ItemStack class8321) {
        return method30195(Class7882.field32373, class8321);
    }
    
    public static int method30213(final ItemStack class8321) {
        return method30195(Class7882.field32374, class8321);
    }
    
    public static int method30214(final LivingEntity class511) {
        return method30206(Class7882.field32363, class511);
    }
    
    public static boolean method30215(final LivingEntity class511) {
        return method30206(Class7882.field32353, class511) > 0;
    }
    
    public static boolean method30216(final LivingEntity class511) {
        return method30206(Class7882.field32356, class511) > 0;
    }
    
    public static boolean method30217(final ItemStack class8321) {
        return method30195(Class7882.field32357, class8321) > 0;
    }
    
    public static boolean method30218(final ItemStack class8321) {
        return method30195(Class7882.field32383, class8321) > 0;
    }
    
    public static int method30219(final ItemStack class8321) {
        return method30195(Class7882.field32375, class8321);
    }
    
    public static int method30220(final ItemStack class8321) {
        return method30195(Class7882.field32377, class8321);
    }
    
    public static boolean method30221(final ItemStack class8321) {
        return method30195(Class7882.field32378, class8321) > 0;
    }
    
    @Nullable
    public static Map.Entry<Class2215, ItemStack> method30222(final Class6257 class6257, final LivingEntity class6258) {
        final Map<Class2215, ItemStack> method18591 = class6257.method18591(class6258);
        if (!method18591.isEmpty()) {
            final ArrayList arrayList = Lists.newArrayList();
            for (final Map.Entry<K, ItemStack> entry : method18591.entrySet()) {
                final ItemStack class6259 = entry.getValue();
                if (class6259.method27620()) {
                    continue;
                }
                if (method30195(class6257, class6259) <= 0) {
                    continue;
                }
                arrayList.add(entry);
            }
            return arrayList.isEmpty() ? null : ((Map.Entry)arrayList.get(class6258.method2633().nextInt(arrayList.size())));
        }
        return null;
    }
    
    public static int method30223(final Random random, final int n, int n2, final ItemStack class8321) {
        if (class8321.getItem().method11734() <= 0) {
            return 0;
        }
        if (n2 > 15) {
            n2 = 15;
        }
        final int a = random.nextInt(8) + 1 + (n2 >> 1) + random.nextInt(n2 + 1);
        if (n != 0) {
            return (n != 1) ? Math.max(a, n2 * 2) : (a * 2 / 3 + 1);
        }
        return Math.max(a / 3, 1);
    }
    
    public static ItemStack method30224(final Random random, ItemStack class8321, final int n, final boolean b) {
        final List<Class6827> method30225 = method30225(random, class8321, n, b);
        final boolean b2 = class8321.getItem() == Items.field31370;
        if (b2) {
            class8321 = new ItemStack(Items.field31534);
        }
        for (final Class6827 class8322 : method30225) {
            if (!b2) {
                class8321.method27674(class8322.field26818, class8322.field26819);
            }
            else {
                Class4034.method12226(class8321, class8322);
            }
        }
        return class8321;
    }
    
    public static List<Class6827> method30225(final Random random, final ItemStack class8321, int method35651, final boolean b) {
        final ArrayList arrayList = Lists.newArrayList();
        final int method35652 = class8321.getItem().method11734();
        if (method35652 > 0) {
            method35651 = method35651 + 1 + random.nextInt(method35652 / 4 + 1) + random.nextInt(method35652 / 4 + 1);
            method35651 = MathHelper.method35651(Math.round(method35651 + method35651 * ((random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f)), 1, Integer.MAX_VALUE);
            final List<Class6827> method35653 = method30228(method35651, class8321, b);
            if (!method35653.isEmpty()) {
                arrayList.add(Class8223.method27251(random, (List<Object>)method35653));
                while (random.nextInt(50) <= method35651) {
                    method30226(method35653, Util.method27847((List<Class6827>)arrayList));
                    if (method35653.isEmpty()) {
                        break;
                    }
                    arrayList.add(Class8223.method27251(random, (List<Object>)method35653));
                    method35651 /= 2;
                }
            }
            return arrayList;
        }
        return arrayList;
    }
    
    public static void method30226(final List<Class6827> list, final Class6827 class6827) {
        final Iterator<Class6827> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (class6827.field26818.method18596(iterator.next().field26818)) {
                continue;
            }
            iterator.remove();
        }
    }
    
    public static boolean method30227(final Collection<Class6257> collection, final Class6257 class6257) {
        final Iterator<Class6257> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method18596(class6257)) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public static List<Class6827> method30228(final int n, final ItemStack class8321, final boolean b) {
        final ArrayList arrayList = Lists.newArrayList();
        final Item method27622 = class8321.getItem();
        final boolean b2 = class8321.getItem() == Items.field31370;
        for (final Class6257 class8322 : Registry.field209) {
            if (class8322.method18603() && !b) {
                continue;
            }
            if (!class8322.field25118.method894(method27622) && !b2) {
                continue;
            }
            for (int i = class8322.method18588(); i > class8322.method18593() - 1; --i) {
                if (n >= class8322.method18586(i) && n <= class8322.method18587(i)) {
                    arrayList.add(new Class6827(class8322, i));
                    break;
                }
            }
        }
        return arrayList;
    }
}
