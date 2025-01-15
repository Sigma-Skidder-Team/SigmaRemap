// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.util.math.MathHelper;

import java.util.List;
import java.util.Random;

public class Class7968
{
    private static final Class1932[] field32738;
    private static final Class1932[] field32739;
    private static final Class1932[] field32740;
    private static final Class1932[] field32741;
    private static final Class1932[] field32742;
    private static final Class1932[] field32743;
    private static final Class1932[] field32744;
    private static final Class1932[] field32745;
    
    private static Class1932 method25818(final Random random) {
        return Class7968.field32738[random.nextInt(Class7968.field32738.length)];
    }
    
    private static Class1932 method25819(final Random random) {
        return Class7968.field32745[random.nextInt(Class7968.field32745.length)];
    }
    
    public static void method25820(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797, final List<Class4473> list, final Random random, final Class5130 class1798) {
        final boolean b = random.nextFloat() <= class1798.field22098;
        method25823(class1795, class1796, class1797, list, random, class1798, b, b ? 0.9f : 0.8f);
        if (b) {
            if (random.nextFloat() <= class1798.field22099) {
                method25821(class1795, random, class1797, class1796, class1798, list);
            }
        }
    }
    
    private static void method25821(final Class1795 class1795, final Random random, final Class2052 class1796, final BlockPos class1797, final Class5130 class1798, final List<Class4473> list) {
        final int method1074 = class1797.getX();
        final int method1075 = class1797.getZ();
        final BlockPos method1076 = Class6585.method19962(new BlockPos(15, 0, 15), Class2181.field12917, class1796, BlockPos.ZERO).method1134(method1074, 0, method1075);
        final Class6997 method1077 = Class6997.method21409(method1074, 0, method1075, method1076.getX(), 0, method1076.getZ());
        final BlockPos class1799 = new BlockPos(Math.min(method1074, method1076.getX()), 0, Math.min(method1075, method1076.getZ()));
        final List<BlockPos> method1078 = method25822(random, class1799.getX(), class1799.getZ());
        for (int method1079 = MathHelper.method35658(random, 4, 8), i = 0; i < method1079; ++i) {
            if (!method1078.isEmpty()) {
                final BlockPos class1800 = method1078.remove(random.nextInt(method1078.size()));
                final int method1080 = class1800.getX();
                final int method1081 = class1800.getZ();
                final Class2052 class1801 = Class2052.values()[random.nextInt(Class2052.values().length)];
                final BlockPos method1082 = Class6585.method19962(new BlockPos(5, 0, 6), Class2181.field12917, class1801, BlockPos.ZERO).method1134(method1080, 0, method1081);
                if (!Class6997.method21409(method1080, 0, method1081, method1082.getX(), 0, method1082.getZ()).method21410(method1077)) {
                    method25823(class1795, class1800, class1801, list, random, class1798, false, 0.8f);
                }
            }
        }
    }
    
    private static List<BlockPos> method25822(final Random random, final int n, final int n2) {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new BlockPos(n - 16 + MathHelper.method35658(random, 1, 8), 90, n2 + 16 + MathHelper.method35658(random, 1, 7)));
        arrayList.add(new BlockPos(n - 16 + MathHelper.method35658(random, 1, 8), 90, n2 + MathHelper.method35658(random, 1, 7)));
        arrayList.add(new BlockPos(n - 16 + MathHelper.method35658(random, 1, 8), 90, n2 - 16 + MathHelper.method35658(random, 4, 8)));
        arrayList.add(new BlockPos(n + MathHelper.method35658(random, 1, 7), 90, n2 + 16 + MathHelper.method35658(random, 1, 7)));
        arrayList.add(new BlockPos(n + MathHelper.method35658(random, 1, 7), 90, n2 - 16 + MathHelper.method35658(random, 4, 6)));
        arrayList.add(new BlockPos(n + 16 + MathHelper.method35658(random, 1, 7), 90, n2 + 16 + MathHelper.method35658(random, 3, 8)));
        arrayList.add(new BlockPos(n + 16 + MathHelper.method35658(random, 1, 7), 90, n2 + MathHelper.method35658(random, 1, 7)));
        arrayList.add(new BlockPos(n + 16 + MathHelper.method35658(random, 1, 7), 90, n2 - 16 + MathHelper.method35658(random, 4, 8)));
        return arrayList;
    }
    
    private static void method25823(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797, final List<Class4473> list, final Random random, final Class5130 class1798, final boolean b, final float n) {
        if (class1798.field22097 != Class1957.field10666) {
            if (class1798.field22097 == Class1957.field10667) {
                final Class1932[] array = b ? Class7968.field32742 : Class7968.field32739;
                final Class1932[] array2 = b ? Class7968.field32744 : Class7968.field32740;
                final Class1932[] array3 = b ? Class7968.field32743 : Class7968.field32741;
                final int nextInt = random.nextInt(array.length);
                list.add(new Class4518(class1795, array[nextInt], class1796, class1797, n, class1798.field22097, b));
                list.add(new Class4518(class1795, array2[nextInt], class1796, class1797, 0.7f, class1798.field22097, b));
                list.add(new Class4518(class1795, array3[nextInt], class1796, class1797, 0.5f, class1798.field22097, b));
            }
        }
        else {
            list.add(new Class4518(class1795, b ? method25819(random) : method25818(random), class1796, class1797, n, class1798.field22097, b));
        }
    }
    
    static {
        field32738 = new Class1932[] { new Class1932("underwater_ruin/warm_1"), new Class1932("underwater_ruin/warm_2"), new Class1932("underwater_ruin/warm_3"), new Class1932("underwater_ruin/warm_4"), new Class1932("underwater_ruin/warm_5"), new Class1932("underwater_ruin/warm_6"), new Class1932("underwater_ruin/warm_7"), new Class1932("underwater_ruin/warm_8") };
        field32739 = new Class1932[] { new Class1932("underwater_ruin/brick_1"), new Class1932("underwater_ruin/brick_2"), new Class1932("underwater_ruin/brick_3"), new Class1932("underwater_ruin/brick_4"), new Class1932("underwater_ruin/brick_5"), new Class1932("underwater_ruin/brick_6"), new Class1932("underwater_ruin/brick_7"), new Class1932("underwater_ruin/brick_8") };
        field32740 = new Class1932[] { new Class1932("underwater_ruin/cracked_1"), new Class1932("underwater_ruin/cracked_2"), new Class1932("underwater_ruin/cracked_3"), new Class1932("underwater_ruin/cracked_4"), new Class1932("underwater_ruin/cracked_5"), new Class1932("underwater_ruin/cracked_6"), new Class1932("underwater_ruin/cracked_7"), new Class1932("underwater_ruin/cracked_8") };
        field32741 = new Class1932[] { new Class1932("underwater_ruin/mossy_1"), new Class1932("underwater_ruin/mossy_2"), new Class1932("underwater_ruin/mossy_3"), new Class1932("underwater_ruin/mossy_4"), new Class1932("underwater_ruin/mossy_5"), new Class1932("underwater_ruin/mossy_6"), new Class1932("underwater_ruin/mossy_7"), new Class1932("underwater_ruin/mossy_8") };
        field32742 = new Class1932[] { new Class1932("underwater_ruin/big_brick_1"), new Class1932("underwater_ruin/big_brick_2"), new Class1932("underwater_ruin/big_brick_3"), new Class1932("underwater_ruin/big_brick_8") };
        field32743 = new Class1932[] { new Class1932("underwater_ruin/big_mossy_1"), new Class1932("underwater_ruin/big_mossy_2"), new Class1932("underwater_ruin/big_mossy_3"), new Class1932("underwater_ruin/big_mossy_8") };
        field32744 = new Class1932[] { new Class1932("underwater_ruin/big_cracked_1"), new Class1932("underwater_ruin/big_cracked_2"), new Class1932("underwater_ruin/big_cracked_3"), new Class1932("underwater_ruin/big_cracked_8") };
        field32745 = new Class1932[] { new Class1932("underwater_ruin/big_warm_4"), new Class1932("underwater_ruin/big_warm_5"), new Class1932("underwater_ruin/big_warm_6"), new Class1932("underwater_ruin/big_warm_7") };
    }
}
