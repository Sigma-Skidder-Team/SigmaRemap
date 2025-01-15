// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Comparator;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3i;

import java.util.function.Function;

public abstract class Class4592<T extends Class5127> extends Class4535<T>
{
    public Class4592(final Function<Dynamic<?>, ? extends T> function) {
        super(function);
    }
    
    public static boolean method13608(final Class1877 class1877, final BlockPos class1878) {
        return class1877.method6791(class1878, class1879 -> {
            class1879.method21696();
            final boolean b;
            if (!class1879.method21706()) {
                if (!class1879.method21755(Class7188.field27907)) {
                    final Class3833 class1880;
                    if (!Class4535.method13533(class1880)) {
                        if (!class1880.method11785(Class7188.field27893)) {
                            if (!class1880.method11785(Class7188.field27892)) {
                                if (class1880 != Class7521.field29388) {
                                    return b;
                                }
                            }
                        }
                    }
                }
            }
            return b;
        });
    }
    
    public static boolean method13609(final Class1877 class1877, final BlockPos class1878) {
        return class1877.method6791(class1878, BlockState::method21706);
    }
    
    public static boolean method13610(final Class1877 class1877, final BlockPos class1878) {
        return class1877.method6791(class1878, class1879 -> {
            class1879.method21696();
            final Class3833 class1880;
            final boolean b;
            if (!(!Class4535.method13533(class1880))) {
                if (class1880 != Class7521.field29155) {
                    if (class1880 != Class7521.field29392) {
                        return b;
                    }
                }
            }
            return b;
        });
    }
    
    public static boolean method13611(final Class1877 class1877, final BlockPos class1878) {
        return class1877.method6791(class1878, class1879 -> class1879.method21696() == Class7521.field29388);
    }
    
    public static boolean method13612(final Class1877 class1877, final BlockPos class1878) {
        return class1877.method6791(class1878, class1879 -> class1879.method21696() == Class7521.field29173);
    }
    
    public static boolean method13613(final Class1877 class1877, final BlockPos class1878) {
        return class1877.method6791(class1878, class1879 -> class1879.method21706() || class1879.method21755(Class7188.field27907));
    }
    
    public static boolean method13614(final Class1877 class1877, final BlockPos class1878) {
        return class1877.method6791(class1878, class1879 -> Class4535.method13533(class1879.method21696()));
    }
    
    public static boolean method13615(final Class1877 class1877, final BlockPos class1878) {
        return class1877.method6791(class1878, class1879 -> {
            class1879.method21696();
            final Class3833 class1880;
            return Class4535.method13533(class1880) || class1880 == Class7521.field29298;
        });
    }
    
    public static boolean method13616(final Class1877 class1877, final BlockPos class1878) {
        return class1877.method6791(class1878, class1879 -> class1879.method21697() == Class8059.field33159);
    }
    
    public void method13617(final Class1875 class1875, final BlockPos class1876) {
        if (!method13610(class1875, class1876)) {
            this.method13529(class1875, class1876, Class7521.field29156.method11878());
        }
    }
    
    public boolean method13618(final Class1875 class1875, final Random random, final BlockPos class1876, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5127 class1878) {
        if (!method13613(class1875, class1876)) {
            if (!method13616(class1875, class1876)) {
                if (!method13612(class1875, class1876)) {
                    return false;
                }
            }
        }
        this.method13620(class1875, class1876, class1878.field22079.method1164(random, class1876), class1877);
        set.add(class1876.toImmutable());
        return true;
    }
    
    public boolean method13619(final Class1875 class1875, final Random random, final BlockPos class1876, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5127 class1878) {
        if (!method13613(class1875, class1876)) {
            if (!method13616(class1875, class1876)) {
                if (!method13612(class1875, class1876)) {
                    return false;
                }
            }
        }
        this.method13620(class1875, class1876, class1878.field22080.method1164(random, class1876), class1877);
        set.add(class1876.toImmutable());
        return true;
    }
    
    @Override
    public void method13529(final Class1876 class1876, final BlockPos class1877, final BlockState class1878) {
        this.method13621(class1876, class1877, class1878);
    }
    
    public final void method13620(final Class1876 class1876, final BlockPos class1877, final BlockState class1878, final MutableBoundingBox class1879) {
        this.method13621(class1876, class1877, class1878);
        class1879.expandTo(new MutableBoundingBox(class1877, class1877));
    }
    
    private void method13621(final Class1876 class1876, final BlockPos class1877, final BlockState class1878) {
        class1876.method6688(class1877, class1878, 19);
    }
    
    public final boolean method13622(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final T t) {
        final HashSet hashSet = Sets.newHashSet();
        final HashSet hashSet2 = Sets.newHashSet();
        final HashSet hashSet3 = Sets.newHashSet();
        final MutableBoundingBox method21407 = MutableBoundingBox.getNewBoundingBox();
        final boolean method21408 = this.method13624(class1851, random, class1853, hashSet, hashSet2, method21407, t);
        if (method21407.minX <= method21407.maxX) {
            if (method21408) {
                if (!hashSet.isEmpty()) {
                    if (!t.field22081.isEmpty()) {
                        final ArrayList arrayList = Lists.newArrayList((Iterable)hashSet);
                        final ArrayList arrayList2 = Lists.newArrayList((Iterable)hashSet2);
                        arrayList.sort(Comparator.comparingInt(Vec3i::getY));
                        arrayList2.sort(Comparator.comparingInt(Vec3i::getY));
                        t.field22081.forEach(class1856 -> class1856.method1241(class1854, random2, list, list2, set, class1855));
                    }
                    Class6585.method19957(class1851, 3, this.method13623(class1851, method21407, hashSet, hashSet3), method21407.minX, method21407.minY, method21407.minZ);
                    return true;
                }
            }
        }
        return false;
    }
    
    private Class8260 method13623(final Class1851 class1851, final MutableBoundingBox class1852, final Set<BlockPos> set, final Set<BlockPos> set2) {
        final ArrayList arrayList = Lists.newArrayList();
        final Class8259 class1853 = new Class8259(class1852.getXSize(), class1852.getYSize(), class1852.getZSize());
        for (int i = 0; i < 6; ++i) {
            arrayList.add(Sets.newHashSet());
        }
        try (final Class386 method1296 = Class386.method1296()) {
            for (final BlockPos class1854 : Lists.newArrayList((Iterable)set2)) {
                if (class1852.isVecInside(class1854)) {
                    class1853.method27415(class1854.getX() - class1852.minX, class1854.getY() - class1852.minY, class1854.getZ() - class1852.minZ, true, true);
                }
            }
            for (final BlockPos class1855 : Lists.newArrayList((Iterable)set)) {
                if (class1852.isVecInside(class1855)) {
                    class1853.method27415(class1855.getX() - class1852.minX, class1855.getY() - class1852.minY, class1855.getZ() - class1852.minZ, true, true);
                }
                final Direction[] values = Direction.values();
                for (int length = values.length, j = 0; j < length; ++j) {
                    method1296.method1303(class1855).method1304(values[j]);
                    if (!set.contains(method1296)) {
                        final BlockState method1297 = class1851.method6701(method1296);
                        if (((Class7097<Object, Object>)method1297).method21771((Class7111<Comparable>)Class8970.field37778)) {
                            ((Set)arrayList.get(0)).add(method1296.toImmutable());
                            this.method13621(class1851, method1296, ((Class7097<Object, BlockState>)method1297).method21773((Class7111<Comparable>)Class8970.field37778, 1));
                            if (class1852.isVecInside(method1296)) {
                                class1853.method27415(method1296.getX() - class1852.minX, method1296.getY() - class1852.minY, method1296.getZ() - class1852.minZ, true, true);
                            }
                        }
                    }
                }
            }
            for (int k = 1; k < 6; ++k) {
                final Set set3 = (Set)arrayList.get(k - 1);
                final Set set4 = (Set)arrayList.get(k);
                for (final BlockPos class1856 : set3) {
                    if (class1852.isVecInside(class1856)) {
                        class1853.method27415(class1856.getX() - class1852.minX, class1856.getY() - class1852.minY, class1856.getZ() - class1852.minZ, true, true);
                    }
                    final Direction[] values2 = Direction.values();
                    for (int length2 = values2.length, l = 0; l < length2; ++l) {
                        method1296.method1303(class1856).method1304(values2[l]);
                        if (!set3.contains(method1296) && !set4.contains(method1296)) {
                            final BlockState method1298 = class1851.method6701(method1296);
                            if (((Class7097<Object, Object>)method1298).method21771((Class7111<Comparable>)Class8970.field37778) && ((Class7097<Object, BlockState>)method1298).method21772((Class7111<Integer>)Class8970.field37778) > k + 1) {
                                this.method13621(class1851, method1296, ((Class7097<Object, BlockState>)method1298).method21773((Class7111<Comparable>)Class8970.field37778, k + 1));
                                if (class1852.isVecInside(method1296)) {
                                    class1853.method27415(method1296.getX() - class1852.minX, method1296.getY() - class1852.minY, method1296.getZ() - class1852.minZ, true, true);
                                }
                                set4.add(method1296.toImmutable());
                            }
                        }
                    }
                }
            }
        }
        return class1853;
    }
    
    public abstract boolean method13624(final Class1875 p0, final Random p1, final BlockPos p2, final Set<BlockPos> p3, final Set<BlockPos> p4, final MutableBoundingBox p5, final T p6);
}
