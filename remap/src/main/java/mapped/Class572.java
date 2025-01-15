// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Maps;
import net.minecraft.util.math.MathHelper;

import java.util.Map;

public class Class572 extends Class565
{
    private static String[] field3402;
    private final Class869 field3403;
    private final Class557 field3404;
    private final Class239 field3405;
    private final int field3406;
    private final Class8863 field3407;
    private final Class7339 field3408;
    private final Class8321 field3409;
    private final String field3410;
    private final Class683 field3411;
    private final Map<Class8863, Class683> field3412;
    private double field3413;
    private double field3414;
    private int field3415;
    private int field3416;
    private int field3417;
    private int field3418;
    private float field3419;
    private boolean field3420;
    
    public Class572(final Class869 field3403, final Class557 field3404, final Class239 field3405, final int field3406, final Class8863 field3407, final Class7339 field3408) {
        this.field3412 = Maps.newLinkedHashMap();
        this.field3415 = Integer.MAX_VALUE;
        this.field3416 = Integer.MAX_VALUE;
        this.field3417 = Integer.MIN_VALUE;
        this.field3418 = Integer.MIN_VALUE;
        this.field3403 = field3403;
        this.field3404 = field3404;
        this.field3405 = field3405;
        this.field3406 = field3406;
        this.field3407 = field3407;
        this.field3408 = field3408;
        this.field3409 = field3408.method22529();
        this.field3410 = field3408.method22527().method8461();
        this.method3347(this.field3411 = new Class683(this, field3403, field3407, field3408), field3407);
    }
    
    public Class8863 method3337() {
        return this.field3407;
    }
    
    public String method3338() {
        return this.field3410;
    }
    
    public void method3339(final int n, final int n2, final boolean b) {
        this.field3405.method883(this, n, n2, b, this.field3406);
    }
    
    public void method3340(final int n, final int n2, final Class1796 class1796) {
        this.field3405.method884(n, n2, this.field3406, class1796, this.field3409);
    }
    
    public void method3341() {
        if (!this.field3420) {
            this.field3413 = 117 - (this.field3417 + this.field3415) / 2;
            this.field3414 = 56 - (this.field3418 + this.field3416) / 2;
            this.field3420 = true;
        }
        Class8726.method30059();
        Class8726.method30008();
        Class8726.method30065(0.0f, 0.0f, 950.0f);
        Class8726.method30049(false, false, false, false);
        Class565.method3293(4680, 2260, -4680, -2260, -16777216);
        Class8726.method30049(true, true, true, true);
        Class8726.method30065(0.0f, 0.0f, -950.0f);
        Class8726.method30009(518);
        Class565.method3293(234, 113, 0, 0, -16777216);
        Class8726.method30009(515);
        final Class1932 method22530 = this.field3408.method22530();
        if (method22530 == null) {
            this.field3403.method5290().method5849(Class1663.field9428);
        }
        else {
            this.field3403.method5290().method5849(method22530);
        }
        final int method22531 = MathHelper.floor(this.field3413);
        final int method22532 = MathHelper.floor(this.field3414);
        final int n = method22531 % 16;
        final int n2 = method22532 % 16;
        for (int i = -1; i <= 15; ++i) {
            for (int j = -1; j <= 8; ++j) {
                Class565.method3188(n + 16 * i, n2 + 16 * j, 0.0f, 0.0f, 16, 16, 16, 16);
            }
        }
        this.field3411.method3746(method22531, method22532, true);
        this.field3411.method3746(method22531, method22532, false);
        this.field3411.method3747(method22531, method22532);
        Class8726.method30009(518);
        Class8726.method30065(0.0f, 0.0f, -950.0f);
        Class8726.method30049(false, false, false, false);
        Class565.method3293(4680, 2260, -4680, -2260, -16777216);
        Class8726.method30049(true, true, true, true);
        Class8726.method30065(0.0f, 0.0f, 950.0f);
        Class8726.method30009(515);
        Class8726.method30060();
    }
    
    public void method3342(final int n, final int n2, final int n3, final int n4) {
        Class8726.method30059();
        Class8726.method30065(0.0f, 0.0f, 200.0f);
        Class565.method3293(0, 0, 234, 113, MathHelper.method35642(this.field3419 * 255.0f) << 24);
        int n5 = 0;
        final int method35644 = MathHelper.floor(this.field3413);
        final int method35645 = MathHelper.floor(this.field3414);
        if (n > 0) {
            if (n < 234) {
                if (n2 > 0) {
                    if (n2 < 113) {
                        for (final Class683 class683 : this.field3412.values()) {
                            if (!class683.method3753(method35644, method35645, n, n2)) {
                                continue;
                            }
                            n5 = 1;
                            class683.method3750(method35644, method35645, this.field3419, n3, n4);
                            break;
                        }
                    }
                }
            }
        }
        Class8726.method30060();
        if (n5 == 0) {
            this.field3419 = MathHelper.method35653(this.field3419 - 0.04f, 0.0f, 1.0f);
        }
        else {
            this.field3419 = MathHelper.method35653(this.field3419 + 0.02f, 0.0f, 0.3f);
        }
    }
    
    public boolean method3343(final int n, final int n2, final double n3, final double n4) {
        return this.field3405.method887(n, n2, this.field3406, n3, n4);
    }
    
    @Nullable
    public static Class572 method3344(final Class869 class869, final Class557 class870, int n, final Class8863 class871) {
        if (class871.method31036() != null) {
            for (final Class239 class872 : Class239.values()) {
                if (n < class872.method882()) {
                    return new Class572(class869, class870, class872, n, class871, class871.method31036());
                }
                n -= class872.method882();
            }
            return null;
        }
        return null;
    }
    
    public void method3345(final double n, final double n2) {
        if (this.field3417 - this.field3415 > 234) {
            this.field3413 = MathHelper.method35654(this.field3413 + n, -(this.field3417 - 234), 0.0);
        }
        if (this.field3418 - this.field3416 > 113) {
            this.field3414 = MathHelper.method35654(this.field3414 + n2, -(this.field3418 - 113), 0.0);
        }
    }
    
    public void method3346(final Class8863 class8863) {
        if (class8863.method31036() != null) {
            this.method3347(new Class683(this, this.field3403, class8863, class8863.method31036()), class8863);
        }
    }
    
    private void method3347(final Class683 class683, final Class8863 class684) {
        this.field3412.put(class684, class683);
        final int method3756 = class683.method3756();
        final int b = method3756 + 28;
        final int method3757 = class683.method3755();
        final int b2 = method3757 + 27;
        this.field3415 = Math.min(this.field3415, method3756);
        this.field3417 = Math.max(this.field3417, b);
        this.field3416 = Math.min(this.field3416, method3757);
        this.field3418 = Math.max(this.field3418, b2);
        final Iterator<Class683> iterator = this.field3412.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method3754();
        }
    }
    
    @Nullable
    public Class683 method3348(final Class8863 class8863) {
        return this.field3412.get(class8863);
    }
    
    public Class557 method3349() {
        return this.field3404;
    }
}
