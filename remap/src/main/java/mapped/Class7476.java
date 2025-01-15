// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public final class Class7476
{
    private static String[] field28874;
    
    public static Class7006 method23092(final Entity class399, final boolean b, final boolean b2, final Entity class400, final Class2040 class401) {
        return method23095(class399, b, b2, class400, class401, true, class403 -> {
            final boolean b4;
            if (!class403.method1639()) {
                if (!(!class403.method1749())) {
                    if (b3 || !class403.method1843(class402)) {
                        if (!class403.field2421) {
                            return b4;
                        }
                    }
                }
            }
            return b4;
        }, class399.method1886().method18493(class399.method1935()).method18496(1.0));
    }
    
    public static Class7006 method23093(final Entity class399, final AxisAlignedBB class400, final Predicate<Entity> predicate, final Class2040 class401, final boolean b) {
        return method23095(class399, b, false, null, class401, false, predicate, class400);
    }
    
    @Nullable
    public static Class7007 method23094(final Class1847 class1847, final Entity class1848, final Vec3d class1849, final Vec3d class1850, final AxisAlignedBB class1851, final Predicate<Entity> predicate) {
        return method23097(class1847, class1848, class1849, class1850, class1851, predicate, Double.MAX_VALUE);
    }
    
    private static Class7006 method23095(final Entity class399, final boolean b, final boolean b2, final Entity class400, final Class2040 class401, final boolean b3, final Predicate<Entity> predicate, final AxisAlignedBB class402) {
        final Vec3d method1935 = class399.method1935();
        final Class1847 field2391 = class399.field2391;
        final Vec3d method1936 = class399.method1934();
        if (b3 && !field2391.method6979(class399, class399.method1886(), (Set<Entity>)((!b2 && class400 != null) ? method23098(class400) : ImmutableSet.of()))) {
            return new Class7005(method1936, Direction.getFacingFromVector(method1935.x, method1935.y, method1935.z), new BlockPos(class399), false);
        }
        Vec3d class403 = method1936.add(method1935);
        Class7005 method1937 = field2391.method6987(new Class8478(method1936, class403, class401, Class2191.field13325, class399));
        if (b) {
            if (method1937.method21449() != Class2165.field12880) {
                class403 = method1937.method21451();
            }
            final Class7007 method1938 = method23094(field2391, class399, method1936, class403, class402, predicate);
            if (method1938 != null) {
                method1937 = (Class7005)method1938;
            }
        }
        return method1937;
    }
    
    @Nullable
    public static Class7007 method23096(final Entity class399, final Vec3d other, final Vec3d class400, final AxisAlignedBB class401, final Predicate<Entity> predicate, final double n) {
        final Class1847 field2391 = class399.field2391;
        double n2 = n;
        Entity class402 = null;
        Vec3d class403 = null;
        for (final Entity class404 : field2391.method6737(class399, class401, predicate)) {
            final AxisAlignedBB method18496 = class404.method1886().method18496(class404.method1790());
            final Optional<Vec3d> method18497 = method18496.method18512(other, class400);
            if (!method18496.method18505(other)) {
                if (!method18497.isPresent()) {
                    continue;
                }
                final Vec3d class405 = method18497.get();
                final double method18498 = other.squareDistanceTo(class405);
                if (method18498 >= n2 && n2 != 0.0) {
                    continue;
                }
                if (class404.method1915() != class399.method1915()) {
                    class402 = class404;
                    class403 = class405;
                    n2 = method18498;
                }
                else {
                    if (n2 != 0.0) {
                        continue;
                    }
                    class402 = class404;
                    class403 = class405;
                }
            }
            else {
                if (n2 < 0.0) {
                    continue;
                }
                class402 = class404;
                class403 = method18497.orElse(other);
                n2 = 0.0;
            }
        }
        return (class402 != null) ? new Class7007(class402, class403) : null;
    }
    
    @Nullable
    public static Class7007 method23097(final Class1847 class1847, final Entity class1848, final Vec3d class1849, final Vec3d class1850, final AxisAlignedBB class1851, final Predicate<Entity> predicate, final double n) {
        double n2 = n;
        Entity class1852 = null;
        for (final Entity class1853 : class1847.method6737(class1848, class1851, predicate)) {
            final Optional<Vec3d> method18512 = class1853.method1886().method18496(0.30000001192092896).method18512(class1849, class1850);
            if (!method18512.isPresent()) {
                continue;
            }
            final double method18513 = class1849.squareDistanceTo(method18512.get());
            if (method18513 >= n2) {
                continue;
            }
            class1852 = class1853;
            n2 = method18513;
        }
        return (class1852 != null) ? new Class7007(class1852) : null;
    }
    
    private static Set<Entity> method23098(final Entity class399) {
        final Entity method1920 = class399.method1920();
        return (Set<Entity>)((method1920 == null) ? ImmutableSet.of((Object)class399) : ImmutableSet.of((Object)class399, (Object)method1920));
    }
    
    public static final void method23099(final Entity class399, final float n) {
        final Vec3d method1935 = class399.method1935();
        final float method1936 = MathHelper.sqrt(Entity.method1680(method1935));
        class399.field2399 = (float)(MathHelper.method35693(method1935.z, method1935.x) * 57.2957763671875) + 90.0f;
        class399.field2400 = (float)(MathHelper.method35693(method1936, method1935.y) * 57.2957763671875) - 90.0f;
        while (class399.field2400 - class399.field2402 < -180.0f) {
            class399.field2402 -= 360.0f;
        }
        while (class399.field2400 - class399.field2402 >= 180.0f) {
            class399.field2402 += 360.0f;
        }
        while (class399.field2399 - class399.field2401 < -180.0f) {
            class399.field2401 -= 360.0f;
        }
        while (class399.field2399 - class399.field2401 >= 180.0f) {
            class399.field2401 += 360.0f;
        }
        class399.field2400 = MathHelper.method35700(n, class399.field2402, class399.field2400);
        class399.field2399 = MathHelper.method35700(n, class399.field2401, class399.field2399);
    }
    
    public static Class316 method23100(final Class511 class511, final Class3820 class512) {
        return (class511.method2713().method27622() != class512) ? Class316.field1878 : Class316.field1877;
    }
    
    public static Class402 method23101(final Class511 class511, final Class8321 class512, final float n) {
        final Class402 method11758 = ((Class3824)((class512.method27622() instanceof Class3824) ? class512.method27622() : Class7739.field31280)).method11758(class511.field2391, class512, class511);
        method11758.method1984(class511, n);
        if (class512.method27622() == Class7739.field31581) {
            if (method11758 instanceof Class405) {
                ((Class405)method11758).method1992(class512);
            }
        }
        return method11758;
    }
}
