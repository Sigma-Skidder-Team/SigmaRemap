// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import javax.annotation.Nullable;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.UUID;
import java.util.List;

public class Class492 extends Class436 implements Class439
{
    private static final Class3833[] field2826;
    public int field2827;
    private float field2828;
    private boolean field2829;
    private boolean field2830;
    private final List<BlockPos> field2831;
    private Class511 field2832;
    private UUID field2833;
    private long field2834;
    
    public Class492() {
        this(Class5412.field22565);
    }
    
    public Class492(final Class5412<?> class5412) {
        super(class5412);
        this.field2831 = Lists.newArrayList();
    }
    
    @Override
    public void method2179(final Class51 class51) {
        super.method2179(class51);
        if (!class51.method315("target_uuid")) {
            this.field2833 = null;
        }
        else {
            this.field2833 = Class9346.method34644(class51.method327("target_uuid"));
        }
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        super.method2180(class51);
        if (this.field2832 != null) {
            class51.method295("target_uuid", Class9346.method34643(this.field2832.method1865()));
        }
        return class51;
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 5, this.method2196());
    }
    
    @Override
    public Class51 method2196() {
        return this.method2180(new Class51());
    }
    
    @Override
    public void method2229() {
        ++this.field2827;
        final long method6754 = this.field2656.method6754();
        if (method6754 % 40L == 0L) {
            this.method2496(this.method2487());
            if (!this.field2656.field10067) {
                if (this.method2494()) {
                    this.method2488();
                    this.method2489();
                }
            }
        }
        if (method6754 % 80L == 0L) {
            if (this.method2494()) {
                this.method2499(Class8520.field35091);
            }
        }
        if (method6754 > this.field2834) {
            if (this.method2494()) {
                this.field2834 = method6754 + 60L + this.field2656.method6790().nextInt(40);
                this.method2499(Class8520.field35092);
            }
        }
        if (this.field2656.field10067) {
            this.method2490();
            this.method2493();
            if (this.method2494()) {
                ++this.field2828;
            }
        }
    }
    
    private boolean method2487() {
        this.field2831.clear();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    if (!this.field2656.method6967(this.field2657.method1134(i, j, k))) {
                        return false;
                    }
                }
            }
        }
        for (int l = -2; l <= 2; ++l) {
            for (int a = -2; a <= 2; ++a) {
                for (int a2 = -2; a2 <= 2; ++a2) {
                    final int abs = Math.abs(l);
                    final int abs2 = Math.abs(a);
                    final int abs3 = Math.abs(a2);
                    if (abs <= 1) {
                        if (abs2 <= 1) {
                            if (abs3 <= 1) {
                                continue;
                            }
                        }
                    }
                    Label_0227: {
                        if (l == 0) {
                            if (abs2 == 2) {
                                break Label_0227;
                            }
                            if (abs3 == 2) {
                                break Label_0227;
                            }
                        }
                        if (a == 0) {
                            if (abs == 2) {
                                break Label_0227;
                            }
                            if (abs3 == 2) {
                                break Label_0227;
                            }
                        }
                        if (a2 != 0) {
                            continue;
                        }
                        if (abs != 2) {
                            if (abs2 != 2) {
                                continue;
                            }
                        }
                    }
                    final BlockPos method1134 = this.field2657.method1134(l, a, a2);
                    final Class7096 method1135 = this.field2656.method6701(method1134);
                    final Class3833[] field2826 = Class492.field2826;
                    for (int length = field2826.length, n = 0; n < length; ++n) {
                        if (method1135.method21696() == field2826[n]) {
                            this.field2831.add(method1134);
                        }
                    }
                }
            }
        }
        this.method2497(this.field2831.size() >= 42);
        return this.field2831.size() >= 16;
    }
    
    private void method2488() {
        final int n = this.field2831.size() / 7 * 16;
        final int method1074 = this.field2657.getX();
        final int method1075 = this.field2657.getY();
        final int method1076 = this.field2657.getZ();
        final List<Entity> method1077 = this.field2656.method7128((Class<? extends Entity>)Class512.class, new AxisAlignedBB(method1074, method1075, method1076, method1074 + 1, method1075 + 1, method1076 + 1).method18496(n).method18494(0.0, this.field2656.method6986(), 0.0));
        if (!method1077.isEmpty()) {
            for (final Class512 class512 : method1077) {
                if (!this.field2657.withinDistance(new BlockPos(class512), n)) {
                    continue;
                }
                if (!class512.method1709()) {
                    continue;
                }
                class512.method2655(new Class1948(Class9439.field40502, 260, 0, true, true));
            }
        }
    }
    
    private void method2489() {
        final Class511 field2832 = this.field2832;
        if (this.field2831.size() >= 42) {
            if (this.field2832 == null && this.field2833 != null) {
                this.field2832 = this.method2492();
                this.field2833 = null;
            }
            else if (this.field2832 != null) {
                if (!this.field2832.method1768() || !this.field2657.withinDistance(new BlockPos(this.field2832), 8.0)) {
                    this.field2832 = null;
                }
            }
            else {
                final List<Entity> method6739 = this.field2656.method6739((Class<? extends Entity>)Class511.class, this.method2491(), class511 -> class511 instanceof Class762 && class511.method1709());
                if (!method6739.isEmpty()) {
                    this.field2832 = (Class511)method6739.get(this.field2656.field10062.nextInt(method6739.size()));
                }
            }
        }
        else {
            this.field2832 = null;
        }
        if (this.field2832 != null) {
            this.field2656.method6706(null, this.field2832.getPosX(), this.field2832.getPosY(), this.field2832.getPosZ(), Class8520.field35093, Class286.field1582, 1.0f, 1.0f);
            this.field2832.method1740(Class7929.field32576, 4.0f);
        }
        if (field2832 != this.field2832) {
            final Class7096 method6740 = this.method2194();
            this.field2656.method6693(this.field2657, method6740, method6740, 2);
        }
    }
    
    private void method2490() {
        if (this.field2833 != null) {
            if (this.field2832 == null || !this.field2832.method1865().equals(this.field2833)) {
                this.field2832 = this.method2492();
                if (this.field2832 == null) {
                    this.field2833 = null;
                }
            }
        }
        else {
            this.field2832 = null;
        }
    }
    
    private AxisAlignedBB method2491() {
        final int method1074 = this.field2657.getX();
        final int method1075 = this.field2657.getY();
        final int method1076 = this.field2657.getZ();
        return new AxisAlignedBB(method1074, method1075, method1076, method1074 + 1, method1075 + 1, method1076 + 1).method18496(8.0);
    }
    
    @Nullable
    private Class511 method2492() {
        final List<Entity> method6739 = this.field2656.method6739((Class<? extends Entity>)Class511.class, this.method2491(), class511 -> class511.method1865().equals(this.field2833));
        return (method6739.size() != 1) ? null : ((Class511)method6739.get(0));
    }
    
    private void method2493() {
        final Random field10062 = this.field2656.field10062;
        final double n = MathHelper.sin((this.field2827 + 35) * 0.1f) / 2.0f + 0.5f;
        final Vec3d class5487 = new Vec3d(this.field2657.getX() + 0.5, this.field2657.getY() + 1.5 + (n * n + n) * 0.30000001192092896, this.field2657.getZ() + 0.5);
        for (final BlockPos class5488 : this.field2831) {
            if (field10062.nextInt(50) != 0) {
                continue;
            }
            final float n2 = -0.5f + field10062.nextFloat();
            final float n3 = -2.0f + field10062.nextFloat();
            final float n4 = -0.5f + field10062.nextFloat();
            final BlockPos method1136 = class5488.method1136(this.field2657);
            final Vec3d method1137 = new Vec3d(n2, n3, n4).add(method1136.getX(), method1136.getY(), method1136.getZ());
            this.field2656.method6709(Class8432.field34651, class5487.x, class5487.y, class5487.z, method1137.x, method1137.y, method1137.z);
        }
        if (this.field2832 != null) {
            final Vec3d class5489 = new Vec3d(this.field2832.getPosX(), this.field2832.method1944(), this.field2832.getPosZ());
            final Vec3d class5490 = new Vec3d((-0.5f + field10062.nextFloat()) * (3.0f + this.field2832.method1930()), -1.0f + field10062.nextFloat() * this.field2832.method1931(), (-0.5f + field10062.nextFloat()) * (3.0f + this.field2832.method1930()));
            this.field2656.method6709(Class8432.field34651, class5489.x, class5489.y, class5489.z, class5490.x, class5490.y, class5490.z);
        }
    }
    
    public boolean method2494() {
        return this.field2829;
    }
    
    public boolean method2495() {
        return this.field2830;
    }
    
    private void method2496(final boolean field2829) {
        if (field2829 != this.field2829) {
            this.method2499(field2829 ? Class8520.field35090 : Class8520.field35094);
        }
        this.field2829 = field2829;
    }
    
    private void method2497(final boolean field2830) {
        this.field2830 = field2830;
    }
    
    public float method2498(final float n) {
        return (this.field2828 + n) * -0.0375f;
    }
    
    public void method2499(final Class7795 class7795) {
        this.field2656.method6705(null, this.field2657, class7795, Class286.field1582, 1.0f, 1.0f);
    }
    
    static {
        field2826 = new Class3833[] { Class7521.field29519, Class7521.field29520, Class7521.field29528, Class7521.field29521 };
    }
}
