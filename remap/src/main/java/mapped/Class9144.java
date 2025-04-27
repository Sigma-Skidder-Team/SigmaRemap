// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.Random;
import java.util.BitSet;
import java.util.List;

public class Class9144
{
    private static final ThreadLocal<Class7533> field38730;
    private static float field38731;
    private static boolean field38732;
    private static final Class7781 field38733;
    private static final Class6332[] field38734;
    private final boolean field38735;
    
    private void method33350(final Class1856 class1856, final BlockState class1857, final BlockPos class1858, final MatrixStack class1859, final Class4150 class1860, final List<Class8754> list, final float[] array, final BitSet set, final Class9436 class1861, final int n) {
        for (final Class8754 class1862 : list) {
            this.method33361(class1856, class1857, class1858, class1862.method30291(), class1862.method30294(), array, set);
            class1861.method35062(class1856, class1857, class1858, class1862.method30294(), array, set);
        }
    }
    
    private void method33351(final Class1856 class1856, final BlockState class1857, final BlockPos class1858, final Class4150 class1859, final Class8996 class1860, final Class8754 class1861, final float n, final float n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        float n10;
        float n11;
        float n12;
        if (!class1861.method30292()) {
            n10 = 1.0f;
            n11 = 1.0f;
            n12 = 1.0f;
        }
        class1859.method12443(class1860, class1861, new float[] { n, n2, n3, n4 }, n10, n11, n12, new int[] { n5, n6, n7, n8 }, n9, true);
    }
    
    private void method33352(final Class1856 class1856, final BlockState class1857, final BlockPos class1858, int method5777, final int n, final boolean b, final MatrixStack class1859, final Class4150 class1860, final List<Class8754> list, final BitSet set) {
        for (final Class8754 class1861 : list) {
            if (b) {
                this.method33361(class1856, class1857, class1858, class1861.method30291(), class1861.method30294(), null, set);
                method5777 = Class1656.method5777(class1856, class1857, set.get(0) ? class1858.method1149(class1861.method30294()) : class1858);
            }
            this.method33351(class1856, class1857, class1858, class1860, class1859.getLast(), class1861, 1.0f, 1.0f, 1.0f, 1.0f, method5777, method5777, method5777, method5777, n);
        }
    }
    
    public Class9144(final Class7860 field38729) {
        this.field38735 = Class9570.field41282.method22623();
        this.field38729 = field38729;
    }
    
    public boolean method33353(final Class1856 class1856, final Class6313 class1857, final BlockState class1858, final BlockPos class1859, final MatrixStack class1860, final Class4150 class1861, final boolean b, final Random random, final long n, final int n2) {
        return this.method33354(class1856, class1857, class1858, class1859, class1860, class1861, b, random, n, n2, Class6350.field25397);
    }
    
    public boolean method33354(final Class1856 class1856, Class6313 method32832, final BlockState class1857, final BlockPos class1858, final MatrixStack class1859, final Class4150 class1860, final boolean b, final Random random, long n, final int n2, Class6349 method32833) {
        final boolean b2 = Minecraft.method5272() && Class7667.method24306(class1857, class1856, class1858) == 0 && method32832.method18692();
        if (this.field38735) {
            method32833 = method32832.method18703(class1856, class1858, class1857, method32833);
        }
        final Vec3d method32834 = class1857.method21732(class1856, class1858);
        class1859.method22564(method32834.x, method32834.y, method32834.z);
        try {
            if (Config.method28955()) {
                Class8900.method31337(class1857, class1860);
            }
            if (!Config.method28975()) {
                n = 0L;
            }
            final Class9145 method32835 = class1860.method12414(class1857, class1858);
            method32832 = Class9087.method32832(method32832, class1857, method32835);
            final boolean b3 = b2 ? this.method33356(class1856, method32832, class1857, class1858, class1859, class1860, b, random, n, n2, method32833) : this.method33358(class1856, method32832, class1857, class1858, class1859, class1860, b, random, n, n2, method32833);
            if (b3) {
                this.method33370(class1856, method32832, class1857, class1858, class1859, class1860, n2, b, random, n, method32835, b2, method32834);
            }
            if (Config.method28955()) {
                Class8900.method31338(class1860);
            }
            return b3;
        }
        catch (final Throwable t) {
            final CrashReport method32836 = CrashReport.makeCrashReport(t, "Tesselating block model");
            final CrashReportCategory method32837 = method32836.makeCategory("Block model being tesselated");
            CrashReportCategory.method16304(method32837, class1858, class1857);
            method32837.addDetail("Using AO", b2);
            throw new ReportedException(method32836);
        }
    }
    
    public boolean method33355(final Class1856 class1856, final Class6313 class1857, final BlockState class1858, final BlockPos class1859, final MatrixStack class1860, final Class4150 class1861, final boolean b, final Random random, final long n, final int n2) {
        return this.method33356(class1856, class1857, class1858, class1859, class1860, class1861, b, random, n, n2, Class6350.field25397);
    }
    
    public boolean method33356(final Class1856 class1856, final Class6313 class1857, final BlockState class1858, final BlockPos class1859, final MatrixStack class1860, final Class4150 class1861, final boolean b, final Random random, final long n, final int n2, final Class6349 class1862) {
        boolean b2 = false;
        final Class9145 method12414 = class1861.method12414(class1858, class1859);
        final Class6332 method12415 = class1861.method12415();
        for (final Direction class1863 : Direction.VALUES) {
            if (!b || BlockUtils.shouldSideBeRendered(class1858, class1856, class1859, class1863, method12414)) {
                random.setSeed(n);
                this.method33359(class1856, class1858, class1859, class1860, class1861, Class9087.method32833(this.field38735 ? class1857.method18700(class1858, class1863, random, class1862) : class1857.method18691(class1858, class1863, random), class1856, class1858, class1859, class1863, method12415, n, method12414), n2, method12414);
                b2 = true;
            }
        }
        random.setSeed(n);
        final List<Class8754> list = this.field38735 ? class1857.method18700(class1858, null, random, class1862) : class1857.method18691(class1858, null, random);
        if (!list.isEmpty()) {
            this.method33359(class1856, class1858, class1859, class1860, class1861, Class9087.method32833(list, class1856, class1858, class1859, null, method12415, n, method12414), n2, method12414);
            b2 = true;
        }
        return b2;
    }
    
    public boolean method33357(final Class1856 class1856, final Class6313 class1857, final BlockState class1858, final BlockPos class1859, final MatrixStack class1860, final Class4150 class1861, final boolean b, final Random random, final long n, final int n2) {
        return this.method33358(class1856, class1857, class1858, class1859, class1860, class1861, b, random, n, n2, Class6350.field25397);
    }
    
    public boolean method33358(final Class1856 class1856, final Class6313 class1857, final BlockState class1858, final BlockPos class1859, final MatrixStack class1860, final Class4150 class1861, final boolean b, final Random random, final long n, final int n2, final Class6349 class1862) {
        boolean b2 = false;
        final Class9145 method12414 = class1861.method12414(class1858, class1859);
        final Class6332 method12415 = class1861.method12415();
        for (final Direction class1863 : Direction.VALUES) {
            if (!b || BlockUtils.shouldSideBeRendered(class1858, class1856, class1859, class1863, method12414)) {
                random.setSeed(n);
                this.method33362(class1856, class1858, class1859, Class1656.method5777(class1856, class1858, class1859.method1149(class1863)), n2, false, class1860, class1861, Class9087.method32833(this.field38735 ? class1857.method18700(class1858, class1863, random, class1862) : class1857.method18691(class1858, class1863, random), class1856, class1858, class1859, class1863, method12415, n, method12414), method12414);
                b2 = true;
            }
        }
        random.setSeed(n);
        final List<Class8754> list = this.field38735 ? class1857.method18700(class1858, null, random, class1862) : class1857.method18691(class1858, null, random);
        if (!list.isEmpty()) {
            this.method33362(class1856, class1858, class1859, -1, n2, true, class1860, class1861, Class9087.method32833(list, class1856, class1858, class1859, null, method12415, n, method12414), method12414);
            b2 = true;
        }
        return b2;
    }
    
    private void method33359(final Class1856 class1856, final BlockState class1857, final BlockPos class1858, final MatrixStack class1859, final Class4150 class1860, final List<Class8754> list, final int n, final Class9145 class1861) {
        final float[] method33376 = class1861.method33376();
        final BitSet method33377 = class1861.method33377();
        final Class9436 method33378 = class1861.method33378();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Class8754 class1862 = list.get(i);
            this.method33361(class1856, class1857, class1858, class1862.method30291(), class1862.method30294(), method33376, method33377);
            method33378.method35062(class1856, class1857, class1858, class1862.method30294(), method33376, method33377);
            if (class1862.method30295().field10395) {
                method33378.method35061();
            }
            this.method33360(class1856, class1857, class1858, class1860, class1859.getLast(), class1862, Class9436.method35065(method33378)[0], Class9436.method35065(method33378)[1], Class9436.method35065(method33378)[2], Class9436.method35065(method33378)[3], Class9436.method35066(method33378)[0], Class9436.method35066(method33378)[1], Class9436.method35066(method33378)[2], Class9436.method35066(method33378)[3], n, class1861);
        }
    }
    
    private void method33360(final Class1856 class1856, final BlockState class1857, final BlockPos class1858, final Class4150 class1859, final Class8996 class1860, final Class8754 class1861, final float n, final float n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final int n9, final Class9145 class1862) {
        float n10;
        float n11;
        float n12;
        if (!class1861.method30292()) {
            n10 = 1.0f;
            n11 = 1.0f;
            n12 = 1.0f;
        }
        class1859.method12443(class1860, class1861, class1859.method12421(n, n2, n3, n4), n10, n11, n12, class1859.method12422(n5, n6, n7, n8), n9, true);
    }
    
    private void method33361(final Class1856 class1856, final BlockState class1857, final BlockPos class1858, final int[] array, final Direction class1859, final float[] array2, final BitSet set) {
        float min = 32.0f;
        float min2 = 32.0f;
        float min3 = 32.0f;
        float max = -32.0f;
        float max2 = -32.0f;
        float max3 = -32.0f;
        final int n = array.length / 4;
        for (int i = 0; i < 4; ++i) {
            final float intBitsToFloat = Float.intBitsToFloat(array[i * n]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array[i * n + 1]);
            final float intBitsToFloat3 = Float.intBitsToFloat(array[i * n + 2]);
            min = Math.min(min, intBitsToFloat);
            min2 = Math.min(min2, intBitsToFloat2);
            min3 = Math.min(min3, intBitsToFloat3);
            max = Math.max(max, intBitsToFloat);
            max2 = Math.max(max2, intBitsToFloat2);
            max3 = Math.max(max3, intBitsToFloat3);
        }
        if (array2 != null) {
            array2[Direction.WEST.getIndex()] = min;
            array2[Direction.EAST.getIndex()] = max;
            array2[Direction.DOWN.getIndex()] = min2;
            array2[Direction.UP.getIndex()] = max2;
            array2[Direction.NORTH.getIndex()] = min3;
            array2[Direction.SOUTH.getIndex()] = max3;
            final int length = Direction.VALUES.length;
            array2[Direction.WEST.getIndex() + length] = 1.0f - min;
            array2[Direction.EAST.getIndex() + length] = 1.0f - max;
            array2[Direction.DOWN.getIndex() + length] = 1.0f - min2;
            array2[Direction.UP.getIndex() + length] = 1.0f - max2;
            array2[Direction.NORTH.getIndex() + length] = 1.0f - min3;
            array2[Direction.SOUTH.getIndex() + length] = 1.0f - max3;
        }
        switch (Class6537.field25985[class1859.ordinal()]) {
            case 1: {
                set.set(1, min >= 1.0E-4f || min3 >= 1.0E-4f || max <= 0.9999f || max3 <= 0.9999f);
                set.set(0, min2 == max2 && (min2 < 1.0E-4f || class1857.isCollisionShapeOpaque(class1856, class1858)));
                break;
            }
            case 2: {
                set.set(1, min >= 1.0E-4f || min3 >= 1.0E-4f || max <= 0.9999f || max3 <= 0.9999f);
                set.set(0, min2 == max2 && (max2 > 0.9999f || class1857.isCollisionShapeOpaque(class1856, class1858)));
                break;
            }
            case 3: {
                set.set(1, min >= 1.0E-4f || min2 >= 1.0E-4f || max <= 0.9999f || max2 <= 0.9999f);
                set.set(0, min3 == max3 && (min3 < 1.0E-4f || class1857.isCollisionShapeOpaque(class1856, class1858)));
                break;
            }
            case 4: {
                set.set(1, min >= 1.0E-4f || min2 >= 1.0E-4f || max <= 0.9999f || max2 <= 0.9999f);
                set.set(0, min3 == max3 && (max3 > 0.9999f || class1857.isCollisionShapeOpaque(class1856, class1858)));
                break;
            }
            case 5: {
                set.set(1, min2 >= 1.0E-4f || min3 >= 1.0E-4f || max2 <= 0.9999f || max3 <= 0.9999f);
                set.set(0, min == max && (min < 1.0E-4f || class1857.isCollisionShapeOpaque(class1856, class1858)));
                break;
            }
            case 6: {
                set.set(1, min2 >= 1.0E-4f || min3 >= 1.0E-4f || max2 <= 0.9999f || max3 <= 0.9999f);
                set.set(0, min == max && (max > 0.9999f || class1857.isCollisionShapeOpaque(class1856, class1858)));
                break;
            }
        }
    }
    
    private void method33362(final Class1856 class1856, final BlockState class1857, final BlockPos class1858, int method5777, final int n, final boolean b, final MatrixStack class1859, final Class4150 class1860, final List<Class8754> list, final Class9145 class1861) {
        final BitSet method5778 = class1861.method33377();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Class8754 class1862 = list.get(i);
            if (b) {
                this.method33361(class1856, class1857, class1858, class1862.method30291(), class1862.method30294(), null, method5778);
                method5777 = Class1656.method5777(class1856, class1857, method5778.get(0) ? class1858.method1149(class1862.method30294()) : class1858);
                if (class1862.method30295().field10395) {
                    method5777 |= 0xF0;
                }
            }
            this.method33360(class1856, class1857, class1858, class1860, class1859.getLast(), class1862, 1.0f, 1.0f, 1.0f, 1.0f, method5777, method5777, method5777, method5777, n, class1861);
        }
    }
    
    public void method33363(final Class8996 class8996, final Class4150 class8997, final BlockState class8998, final Class6313 class8999, final float n, final float n2, final float n3, final int n4, final int n5) {
        this.method33364(class8996, class8997, class8998, class8999, n, n2, n3, n4, n5, Class6350.field25397);
    }
    
    public void method33364(final Class8996 class8996, final Class4150 class8997, final BlockState class8998, final Class6313 class8999, final float n, final float n2, final float n3, final int n4, final int n5, final Class6349 class9000) {
        final Random random = new Random();
        for (final Direction class9001 : Direction.VALUES) {
            random.setSeed(42L);
            if (!this.field38735) {
                method33365(class8996, class8997, n, n2, n3, class8999.method18691(class8998, class9001, random), n4, n5);
            }
            else {
                method33365(class8996, class8997, n, n2, n3, class8999.method18700(class8998, class9001, random, class9000), n4, n5);
            }
        }
        random.setSeed(42L);
        if (!this.field38735) {
            method33365(class8996, class8997, n, n2, n3, class8999.method18691(class8998, null, random), n4, n5);
        }
        else {
            method33365(class8996, class8997, n, n2, n3, class8999.method18700(class8998, null, random, class9000), n4, n5);
        }
    }
    
    private static void method33365(final Class8996 class8996, final Class4150 class8997, final float n, final float n2, final float n3, final List<Class8754> list, final int n4, final int n5) {
        for (final Class8754 class8998 : list) {
            float method35653;
            float method35654;
            float method35655;
            if (!class8998.method30292()) {
                method35653 = 1.0f;
                method35654 = 1.0f;
                method35655 = 1.0f;
            }
            else {
                method35653 = MathHelper.clamp(n, 0.0f, 1.0f);
                method35654 = MathHelper.clamp(n2, 0.0f, 1.0f);
                method35655 = MathHelper.clamp(n3, 0.0f, 1.0f);
            }
            class8997.method12442(class8996, class8998, method35653, method35654, method35655, n4, n5);
        }
    }
    
    public static void method33366() {
        Class9144.field38730.get().method23606();
    }
    
    public static void method33367() {
        Class9144.field38730.get().method23607();
    }
    
    public static float method33368(final float n) {
        return (n != 0.2f) ? n : Class9144.field38731;
    }
    
    public static void method33369() {
        Class9144.field38731 = 1.0f - Config.method28885() * 0.8f;
        Class9144.field38732 = (Config.method28955() && Class9216.method33759());
    }
    
    private void method33370(final Class1856 class1856, final Class6313 class1857, final BlockState class1858, final BlockPos class1859, final MatrixStack class1860, final Class4150 class1861, final int n, final boolean b, final Random random, final long n2, final Class9145 class1862, final boolean b2, final Vec3d class1863) {
        if (class1862.method33399()) {
            for (int i = 0; i < Class9144.field38734.length; ++i) {
                final Class6332 class1864 = Class9144.field38734[i];
                final Class8040 method33398 = class1862.method33398(class1864);
                if (method33398.method26377() > 0) {
                    final Class9226 method33399 = class1862.method33396();
                    if (method33399 != null) {
                        final BufferBuilder method33400 = method33399.method34024(class1864);
                        if (!method33400.method12405()) {
                            method33400.begin(7, DefaultVertexFormats.field39607);
                        }
                        for (int j = 0; j < method33398.method26377(); ++j) {
                            final Class8754 method33401 = method33398.method26378(j);
                            final List<Class8754> method33402 = method33398.method26380(method33401);
                            final BlockState method33403 = method33398.method26379(j);
                            if (method33401.method30312() != null) {
                                method33398.method26376(method33401.method30312(), method33403);
                            }
                            class1862.method33373(method33403, class1859);
                            if (!b2) {
                                this.method33362(class1856, method33403, class1859, Class1656.method5777(class1856, method33403, class1859.method1149(method33401.method30294())), n, false, class1860, method33400, method33402, class1862);
                            }
                            else {
                                this.method33359(class1856, method33403, class1859, class1860, method33400, method33402, n, class1862);
                            }
                        }
                    }
                    method33398.method26381();
                }
            }
        }
        if (Config.method28932()) {
            if (!class1862.method33381()) {
                if (Class8979.method31925(class1856, class1858, class1859)) {
                    final Class6313 method33404 = Class8979.method31923();
                    final BlockState method33405 = Class8979.method31924();
                    class1860.method22564(-class1863.x, -class1863.y, -class1863.z);
                    this.method33353(class1856, method33404, method33405, class1859, class1860, class1861, b, random, n2, n);
                }
            }
        }
    }
    
    static {
        field38730 = ThreadLocal.withInitial(() -> new Class7533(null));
        Class9144.field38731 = 0.2f;
        Class9144.field38732 = false;
        field38733 = new Class7781();
        field38734 = new Class6332[] { Class9484.field40761, Class9484.field40760, Class9484.field40762 };
    }
}
