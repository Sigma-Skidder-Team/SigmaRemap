// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.function.Predicate;
import java.util.Random;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class Class7775
{
    @Nullable
    public static Vec3d method24900(final Class787 class787, final int n, final int n2) {
        return method24910(class787, n, n2, 0, null, true, 1.5707963705062866, class787::method4345, false, 0, 0, true);
    }
    
    @Nullable
    public static Vec3d method24901(final Class787 class787, final int n, final int n2, final int n3, final Vec3d class788, final double n4) {
        return method24910(class787, n, n2, n3, class788, true, n4, class787::method4345, true, 0, 0, false);
    }
    
    @Nullable
    public static Vec3d method24902(final Class787 class787, final int n, final int n2) {
        return method24903(class787, n, n2, class787::method4345);
    }
    
    @Nullable
    public static Vec3d method24903(final Class787 class787, final int n, final int n2, final ToDoubleFunction<BlockPos> toDoubleFunction) {
        return method24910(class787, n, n2, 0, null, false, 0.0, toDoubleFunction, true, 0, 0, true);
    }
    
    @Nullable
    public static Vec3d method24904(final Class787 class787, final int n, final int n2, final Vec3d class788, final float n3, final int n4, final int n5) {
        return method24910(class787, n, n2, 0, class788, false, n3, class787::method4345, true, n4, n5, true);
    }
    
    @Nullable
    public static Vec3d method24905(final Class787 class787, final int n, final int n2, final Vec3d class788) {
        return method24910(class787, n, n2, 0, class788.subtract(class787.getPosX(), class787.getPosY(), class787.getPosZ()), true, 1.5707963705062866, class787::method4345, false, 0, 0, true);
    }
    
    @Nullable
    public static Vec3d method24906(final Class787 class787, final int n, final int n2, final Vec3d class788, final double n3) {
        return method24910(class787, n, n2, 0, class788.subtract(class787.getPosX(), class787.getPosY(), class787.getPosZ()), true, n3, class787::method4345, false, 0, 0, true);
    }
    
    @Nullable
    public static Vec3d method24907(final Class787 class787, final int n, final int n2, final int n3, final Vec3d class788, final double n4) {
        return method24910(class787, n, n2, n3, class788.subtract(class787.getPosX(), class787.getPosY(), class787.getPosZ()), false, n4, class787::method4345, true, 0, 0, false);
    }
    
    @Nullable
    public static Vec3d method24908(final Class787 class787, final int n, final int n2, final Vec3d class788) {
        return method24910(class787, n, n2, 0, class787.method1934().subtract(class788), true, 1.5707963705062866, class787::method4345, false, 0, 0, true);
    }
    
    @Nullable
    public static Vec3d method24909(final Class787 class787, final int n, final int n2, final Vec3d class788) {
        return method24910(class787, n, n2, 0, class787.method1934().subtract(class788), false, 1.5707963705062866, class787::method4345, true, 0, 0, true);
    }
    
    @Nullable
    private static Vec3d method24910(final Class787 class787, final int n, final int n2, final int n3, final Vec3d class788, final boolean b, final double n4, final ToDoubleFunction<BlockPos> toDoubleFunction, final boolean b2, final int n5, final int n6, final boolean b3) {
        final Class7746 method4150 = class787.method4150();
        final Random method4151 = class787.method2633();
        final boolean b4 = class787.method4201() && class787.method4199().withinDistance(class787.method1934(), class787.method4200() + n + 1.0);
        boolean b5 = false;
        double n7 = Double.NEGATIVE_INFINITY;
        BlockPos class789 = new BlockPos(class787);
        for (int i = 0; i < 10; ++i) {
            final BlockPos method4152 = method24911(method4151, n, n2, n3, class788, n4);
            if (method4152 != null) {
                int method4153 = method4152.getX();
                final int method4154 = method4152.getY();
                int method4155 = method4152.getZ();
                if (class787.method4201()) {
                    if (n > 1) {
                        final BlockPos method4156 = class787.method4199();
                        if (class787.getPosX() <= method4156.getX()) {
                            method4153 += method4151.nextInt(n / 2);
                        }
                        else {
                            method4153 -= method4151.nextInt(n / 2);
                        }
                        if (class787.getPosZ() <= method4156.getZ()) {
                            method4155 += method4151.nextInt(n / 2);
                        }
                        else {
                            method4155 -= method4151.nextInt(n / 2);
                        }
                    }
                }
                BlockPos method4157 = new BlockPos(method4153 + class787.getPosX(), method4154 + class787.getPosY(), method4155 + class787.getPosZ());
                if (method4157.getY() >= 0) {
                    if (method4157.getY() <= class787.world.getHeight()) {
                        if (!b4 || class787.method4197(method4157)) {
                            if (!b3 || method4150.method24739(method4157)) {
                                if (b2) {
                                    method4157 = method24912(method4157, method4151.nextInt(n5 + 1) + n6, class787.world.getHeight(), class791 -> class790.field2391.method6701(class791).method21697().method26439());
                                }
                                if (b || !class787.world.getFluidState(method4157).isTagged(Class7324.field28319)) {
                                    if (class787.method4144(Class4651.method13914(class787.world, method4157.getX(), method4157.getY(), method4157.getZ())) == 0.0f) {
                                        final double applyAsDouble = toDoubleFunction.applyAsDouble(method4157);
                                        if (applyAsDouble > n7) {
                                            n7 = applyAsDouble;
                                            class789 = method4157;
                                            b5 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (!b5) ? null : new Vec3d(class789);
    }
    
    @Nullable
    private static BlockPos method24911(final Random random, final int n, final int n2, final int n3, final Vec3d class5487, final double n4) {
        if (class5487 == null || n4 >= 3.141592653589793) {
            return new BlockPos(random.nextInt(2 * n + 1) - n, random.nextInt(2 * n2 + 1) - n2 + n3, random.nextInt(2 * n + 1) - n);
        }
        final double n5 = MathHelper.method35693(class5487.z, class5487.x) - 1.5707963705062866 + (2.0f * random.nextFloat() - 1.0f) * n4;
        final double n6 = Math.sqrt(random.nextDouble()) * MathHelper.field41094 * n;
        final double a = -n6 * Math.sin(n5);
        final double a2 = n6 * Math.cos(n5);
        if (Math.abs(a) <= n && Math.abs(a2) <= n) {
            return new BlockPos(a, random.nextInt(2 * n2 + 1) - n2 + n3, a2);
        }
        return null;
    }
    
    public static BlockPos method24912(final BlockPos class354, final int i, final int n, final Predicate<BlockPos> predicate) {
        if (i < 0) {
            throw new IllegalArgumentException("aboveSolidAmount was " + i + ", expected >= 0");
        }
        if (predicate.test(class354)) {
            BlockPos class355;
            for (class355 = class354.method1137(); class355.getY() < n && predicate.test(class355); class355 = class355.method1137()) {}
            BlockPos class356;
            BlockPos method1137;
            for (class356 = class355; class356.getY() < n; class356 = method1137) {
                if (class356.getY() - class355.getY() >= i) {
                    break;
                }
                method1137 = class356.method1137();
                if (predicate.test(method1137)) {
                    break;
                }
            }
            return class356;
        }
        return class354;
    }
}
