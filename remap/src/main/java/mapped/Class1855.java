// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.function.Function;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public interface Class1855
{
    @Nullable
    Class436 method6727(final BlockPos p0);
    
    Class7096 method6701(final BlockPos p0);
    
    Class7099 method6702(final BlockPos p0);
    
    default int method6984(final BlockPos class354) {
        return this.method6701(class354).method21704();
    }
    
    default int method6985() {
        return 15;
    }
    
    default int method6986() {
        return 256;
    }
    
    default Class7005 method6987(final Class8478 class8478) {
        return method6989(class8478, (class8480, class8482) -> {
            this.method6701(class8482);
            this.method6702(class8482);
            class8480.method28308();
            class8480.method28307();
            final Vec3d class8483;
            final Vec3d class8484;
            final Class7096 class8485;
            this.method6988(class8483, class8484, class8482, class8480.method28309(class8485, this, class8482), class8485);
            final Class7099 class8486;
            class8480.method28310(class8486, this, class8482).method24550(class8483, class8484, class8482);
            final Class7005 class8487;
            final Class7005 class8488;
            return (((class8487 != null) ? class8480.method28308().squareDistanceTo(class8487.method21451()) : Double.MAX_VALUE) > ((class8488 != null) ? class8480.method28308().squareDistanceTo(class8488.method21451()) : Double.MAX_VALUE)) ? class8488 : class8487;
        }, class8489 -> {
            class8489.method28308().subtract(class8489.method28307());
            final Vec3d class8491;
            return Class7005.method21445(class8489.method28307(), Direction.getFacingFromVector(class8491.x, class8491.y, class8491.z), new BlockPos(class8489.method28307()));
        });
    }
    
    @Nullable
    default Class7005 method6988(final Vec3d class5487, final Vec3d class5488, final BlockPos class5489, final Class7702 class5490, final Class7096 class5491) {
        final Class7005 method24550 = class5490.method24550(class5487, class5488, class5489);
        if (method24550 != null) {
            final Class7005 method24551 = class5491.method21730(this, class5489).method24550(class5487, class5488, class5489);
            if (method24551 != null) {
                if (method24551.method21451().subtract(class5487).lengthSquared() < method24550.method21451().subtract(class5487).lengthSquared()) {
                    return method24550.method21446(method24551.method21448());
                }
            }
        }
        return method24550;
    }
    
    default <T> T method6989(final Class8478 class8478, final BiFunction<Class8478, BlockPos, T> biFunction, final Function<Class8478, T> function) {
        final Vec3d method28308 = class8478.method28308();
        final Vec3d method28309 = class8478.method28307();
        if (method28308.equals(method28309)) {
            return function.apply(class8478);
        }
        final double method28310 = MathHelper.method35701(-1.0E-7, method28309.x, method28308.x);
        final double method28311 = MathHelper.method35701(-1.0E-7, method28309.y, method28308.y);
        final double method28312 = MathHelper.method35701(-1.0E-7, method28309.z, method28308.z);
        final double method28313 = MathHelper.method35701(-1.0E-7, method28308.x, method28309.x);
        final double method28314 = MathHelper.method35701(-1.0E-7, method28308.y, method28309.y);
        final double method28315 = MathHelper.method35701(-1.0E-7, method28308.z, method28309.z);
        int method28316 = MathHelper.floor(method28313);
        int method28317 = MathHelper.floor(method28314);
        int method28318 = MathHelper.floor(method28315);
        final Class385 class8479 = new Class385(method28316, method28317, method28318);
        final T apply = biFunction.apply(class8478, class8479);
        if (apply != null) {
            return apply;
        }
        final double n = method28310 - method28313;
        final double n2 = method28311 - method28314;
        final double n3 = method28312 - method28315;
        final int method28319 = MathHelper.method35705(n);
        final int method28320 = MathHelper.method35705(n2);
        final int method28321 = MathHelper.method35705(n3);
        final double n4 = (method28319 != 0) ? (method28319 / n) : Double.MAX_VALUE;
        final double n5 = (method28320 != 0) ? (method28320 / n2) : Double.MAX_VALUE;
        final double n6 = (method28321 != 0) ? (method28321 / n3) : Double.MAX_VALUE;
        double n7 = n4 * ((method28319 <= 0) ? MathHelper.method35687(method28313) : (1.0 - MathHelper.method35687(method28313)));
        double n8 = n5 * ((method28320 <= 0) ? MathHelper.method35687(method28314) : (1.0 - MathHelper.method35687(method28314)));
        double n9 = n6 * ((method28321 <= 0) ? MathHelper.method35687(method28315) : (1.0 - MathHelper.method35687(method28315)));
        while (true) {
            if (n7 > 1.0) {
                if (n8 > 1.0) {
                    if (n9 > 1.0) {
                        return function.apply(class8478);
                    }
                }
            }
            if (n7 >= n8) {
                if (n8 >= n9) {
                    method28318 += method28321;
                    n9 += n6;
                }
                else {
                    method28317 += method28320;
                    n8 += n5;
                }
            }
            else if (n7 >= n9) {
                method28318 += method28321;
                n9 += n6;
            }
            else {
                method28316 += method28319;
                n7 += n4;
            }
            final T apply2 = biFunction.apply(class8478, class8479.method1284(method28316, method28317, method28318));
            if (apply2 == null) {
                continue;
            }
            return apply2;
        }
    }
}
