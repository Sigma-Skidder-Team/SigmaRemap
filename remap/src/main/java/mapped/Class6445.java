// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.common.collect.Streams;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;

import java.util.Collection;

public class Class6445
{
    public static Class7107 field25581;
    
    public static void method19222(final Class9083 class9083, final Class8564 class9084) {
        class9083.method32751();
        class9084.method28795(class9083);
        class9083.method32766(new Class7374());
        class9083.method32767(2);
    }
    
    public static Collection<Class9083> method19223(final Collection<Class8928> collection, final BlockPos class354, final Class1849 class355, final Class8564 class356) {
        final Class9061 class357 = new Class9061(collection, class354, class355, class356);
        class357.method32627();
        return class357.method32626();
    }
    
    public static Collection<Class9083> method19224(final Collection<Class6812> collection, final BlockPos class354, final Class1849 class355, final Class8564 class356) {
        return method19223(method19225(collection), class354, class355, class356);
    }
    
    public static Collection<Class8928> method19225(final Collection<Class6812> collection) {
        final HashMap hashMap = Maps.newHashMap();
        collection.forEach(class6812 -> map.computeIfAbsent(class6812.method20853(), p0 -> Lists.newArrayList()).add(class6812));
        return (Collection)hashMap.keySet().stream().flatMap(s2 -> {
            final Collection collection2 = map2.get(s2);
            return Streams.stream(Iterables.partition((Iterable)collection2, 100)).map(p4 -> {
                final Object o3 = new AtomicInteger();
                Class8972.method31857(s2);
                new Class8928(str + ":" + atomicInteger.incrementAndGet(), collection3, consumer);
                return;
            });
        }).collect(Collectors.toList());
    }
    
    private static void method19226(final Class9083 class9083) {
        final Throwable method32765 = class9083.method32765();
        method19230(class9083.method32758(), TextFormatting.RED, class9083.method32754() + " failed! " + Class8349.method27860(method32765));
        if (method32765 instanceof Class2360) {
            final Class2360 class9084 = (Class2360)method32765;
            method19232(class9083.method32758(), class9084.method9497(), class9084.method9496());
        }
        Class6445.field25581.method21823(class9083);
    }
    
    private static void method19227(final Class9083 class9083, final Block class9084) {
        final Class1849 method32758 = class9083.method32758();
        final BlockPos method32759 = class9083.method32755().add(-1, -1, -1);
        method32758.method6692(method32759, Class7521.field29417.getDefaultState());
        method32758.method6692(method32759.add(0, 1, 0), class9084.getDefaultState());
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                method32758.method6692(method32759.add(i, -1, j), Class7521.field29281.getDefaultState());
            }
        }
    }
    
    private static void method19228(final Class9083 class9083, final String s) {
        final Class1849 method32758 = class9083.method32758();
        final BlockPos method32759 = class9083.method32755().add(-1, 1, -1);
        method32758.method6692(method32759, Class7521.field29813.getDefaultState());
        Class3930.method12040(method32758, method32759, method32758.getBlockState(method32759), method19229(class9083.method32754(), class9083.method32768(), s));
    }
    
    private static ItemStack method19229(final String s, final boolean b, final String str) {
        final ItemStack class8321 = new ItemStack(Items.field31512);
        final Class52 class8322 = new Class52();
        final StringBuffer sb = new StringBuffer();
        Arrays.stream(s.split("\\.")).forEach(str2 -> sb2.append(str2).append('\n'));
        if (!b) {
            sb.append("(optional)\n");
        }
        sb.append("-------------------\n");
        ((AbstractList<Class50>)class8322).add(Class50.method290(sb.toString() + str));
        class8321.method27676("pages", class8322);
        return class8321;
    }
    
    private static void method19230(final Class1849 class1849, final TextFormatting class1850, final String s) {
        class1849.method6883(p0 -> true).forEach(class1852 -> class1852.sendMessage(new StringTextComponent(s2).applyTextStyle(class1851)));
    }
    
    public static void method19231(final Class1849 class1849) {
        Class9324.method34530(class1849);
    }
    
    private static void method19232(final Class1849 class1849, final BlockPos class1850, final String s) {
        Class9324.method34529(class1849, class1850, s, -2130771968, Integer.MAX_VALUE);
    }
    
    public static void method19233(final Class1849 class1849, final BlockPos class1850, final Class8564 class1851, final int n) {
        class1851.method28796();
        BlockPos.getAllInBox(class1850.add(-n, 0, -n), class1850.add(n, 0, n)).filter(class1853 -> class1852.method6701(class1853).method21696() == Class7521.field29820).forEach(class1855 -> {
            final Class501 class1856 = (Class501)class1854.method6727(class1855);
            class1856.getPos();
            final BlockPos class1857;
            Class8787.method30578(Class8787.method30579(class1857, class1856.method2562(), 2), class1857.getY(), class1854);
        });
    }
    
    static {
        Class6445.field25581 = new Class7106();
    }
}
