// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.List;

public class Class7699
{
    private static final Class9092 field30601;
    private static final Class9092 field30602;
    private static final Class5817 field30603;
    private static final List<Class8554<Class2052, BlockPos>> field30604;
    private static final Class5817 field30605;
    private static final Class5817 field30606;
    private static final List<Class8554<Class2052, BlockPos>> field30607;
    private static final Class5817 field30608;
    
    private static Class4517 method24512(final Class1795 class1795, final Class4517 class1796, final BlockPos class1797, final String s, final Class2052 class1798, final boolean b) {
        final Class4517 class1799 = new Class4517(class1795, s, class1796.field19920, class1798, b);
        final BlockPos method19952 = class1796.field19918.method19952(class1796.field19919, class1797, class1799.field19919, BlockPos.ZERO);
        class1799.method13454(method19952.getX(), method19952.getY(), method19952.getZ());
        return class1799;
    }
    
    public static void method24513(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797, final List<Class4473> list, final Random random) {
        Class7699.field30608.method17510();
        Class7699.field30603.method17510();
        Class7699.field30606.method17510();
        Class7699.field30605.method17510();
        method24515(class1795, Class7699.field30605, 1, method24514(list, method24512(class1795, method24514(list, method24512(class1795, method24514(list, method24512(class1795, method24514(list, new Class4517(class1795, "base_floor", class1796, class1797, true)), new BlockPos(-1, 0, -1), "second_floor_1", class1797, false)), new BlockPos(-1, 4, -1), "third_floor_1", class1797, false)), new BlockPos(-1, 8, -1), "third_roof", class1797, true)), null, list, random);
    }
    
    private static Class4517 method24514(final List<Class4473> list, final Class4517 class4517) {
        list.add(class4517);
        return class4517;
    }
    
    private static boolean method24515(final Class1795 class1795, final Class5817 class1796, final int n, final Class4517 class1797, final BlockPos class1798, final List<Class4473> list, final Random random) {
        if (n <= 8) {
            final ArrayList arrayList = Lists.newArrayList();
            if (class1796.method17511(class1795, n, class1797, class1798, arrayList, random)) {
                int n2 = 0;
                final int nextInt = random.nextInt();
                for (final Class4473 class1799 : arrayList) {
                    class1799.field19853 = nextInt;
                    final Class4473 method13435 = Class4473.method13435(list, class1799.method13432());
                    if (method13435 != null && method13435.field19853 != class1797.field19853) {
                        n2 = 1;
                        break;
                    }
                }
                if (n2 == 0) {
                    list.addAll(arrayList);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    static {
        field30601 = new Class9092().method32847(true).method32853(Class4106.field18207);
        field30602 = new Class9092().method32847(true).method32853(Class4106.field18209);
        field30603 = new Class5816();
        field30604 = Lists.newArrayList((Object[])new Class8554[] { new Class8554((A)Class2052.field11707, (B)new BlockPos(1, -1, 0)), new Class8554((A)Class2052.field11708, (B)new BlockPos(6, -1, 1)), new Class8554((A)Class2052.field11710, (B)new BlockPos(0, -1, 5)), new Class8554((A)Class2052.field11709, (B)new BlockPos(5, -1, 6)) });
        field30605 = new Class5820();
        field30606 = new Class5818();
        field30607 = Lists.newArrayList((Object[])new Class8554[] { new Class8554((A)Class2052.field11707, (B)new BlockPos(4, -1, 0)), new Class8554((A)Class2052.field11708, (B)new BlockPos(12, -1, 4)), new Class8554((A)Class2052.field11710, (B)new BlockPos(0, -1, 8)), new Class8554((A)Class2052.field11709, (B)new BlockPos(8, -1, 12)) });
        field30608 = new Class5819();
    }
}
