// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;

import java.util.function.Function;

public class Class4570 extends Class4535<Class5122>
{
    private static final ResourceLocation field20042;
    private static final ResourceLocation field20043;
    private static final ResourceLocation field20044;
    private static final ResourceLocation field20045;
    private static final ResourceLocation field20046;
    private static final ResourceLocation field20047;
    private static final ResourceLocation field20048;
    private static final ResourceLocation field20049;
    private static final ResourceLocation field20050;
    private static final ResourceLocation field20051;
    private static final ResourceLocation field20052;
    private static final ResourceLocation field20053;
    private static final ResourceLocation field20054;
    private static final ResourceLocation field20055;
    private static final ResourceLocation field20056;
    private static final ResourceLocation field20057;
    private static final ResourceLocation[] field20058;
    private static final ResourceLocation[] field20059;
    
    public Class4570(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        final Random method6790 = class1851.method6790();
        final Class2052[] values = Class2052.values();
        final Class2052 class1855 = values[method6790.nextInt(values.length)];
        final int nextInt = method6790.nextInt(Class4570.field20058.length);
        final Class1795 method6791 = ((Class1849)class1851.method6744()).method6917().method29399();
        final Class6585 method6792 = method6791.method6518(Class4570.field20058[nextInt]);
        final Class6585 method6793 = method6791.method6518(Class4570.field20059[nextInt]);
        final ChunkPos class1856 = new ChunkPos(class1853);
        final Class9092 method6794 = new Class9092().method32845(class1855).method32849(new MutableBoundingBox(class1856.method25426(), 0, class1856.method25427(), class1856.method25428(), 256, class1856.method25429())).method32850(method6790).method32853(Class4106.field18209);
        final BlockPos method6795 = method6792.method19961(class1855);
        final int nextInt2 = method6790.nextInt(16 - method6795.getX());
        final int nextInt3 = method6790.nextInt(16 - method6795.getZ());
        int min = 256;
        for (int i = 0; i < method6795.getX(); ++i) {
            for (int j = 0; j < method6795.getZ(); ++j) {
                min = Math.min(min, class1851.method6699(HeightmapType.field11523, class1853.getX() + i + nextInt2, class1853.getZ() + j + nextInt3));
            }
        }
        final BlockPos method6796 = method6792.method19964(class1853.add(nextInt2, Math.max(min - 15 - method6790.nextInt(10), 10), nextInt3), Class2181.field12917, class1855);
        final Class4108 class1857 = new Class4108(0.9f);
        method6794.method32852().method32853(class1857);
        method6792.method19956(class1851, method6796, method6794, 4);
        method6794.method32854(class1857);
        method6794.method32852().method32853(new Class4108(0.1f));
        method6793.method19956(class1851, method6796, method6794, 4);
        return true;
    }
    
    static {
        field20042 = new ResourceLocation("fossil/spine_1");
        field20043 = new ResourceLocation("fossil/spine_2");
        field20044 = new ResourceLocation("fossil/spine_3");
        field20045 = new ResourceLocation("fossil/spine_4");
        field20046 = new ResourceLocation("fossil/spine_1_coal");
        field20047 = new ResourceLocation("fossil/spine_2_coal");
        field20048 = new ResourceLocation("fossil/spine_3_coal");
        field20049 = new ResourceLocation("fossil/spine_4_coal");
        field20050 = new ResourceLocation("fossil/skull_1");
        field20051 = new ResourceLocation("fossil/skull_2");
        field20052 = new ResourceLocation("fossil/skull_3");
        field20053 = new ResourceLocation("fossil/skull_4");
        field20054 = new ResourceLocation("fossil/skull_1_coal");
        field20055 = new ResourceLocation("fossil/skull_2_coal");
        field20056 = new ResourceLocation("fossil/skull_3_coal");
        field20057 = new ResourceLocation("fossil/skull_4_coal");
        field20058 = new ResourceLocation[] { Class4570.field20042, Class4570.field20043, Class4570.field20044, Class4570.field20045, Class4570.field20050, Class4570.field20051, Class4570.field20052, Class4570.field20053 };
        field20059 = new ResourceLocation[] { Class4570.field20046, Class4570.field20047, Class4570.field20048, Class4570.field20049, Class4570.field20054, Class4570.field20055, Class4570.field20056, Class4570.field20057 };
    }
}
