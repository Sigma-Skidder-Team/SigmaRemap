// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.math.DoubleMath;
import javax.annotation.Nullable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public abstract class Class7702
{
    public final Class8260 field30615;
    private Class7702[] field30616;
    
    public Class7702(final Class8260 field30615) {
        this.field30615 = field30615;
    }
    
    public double method24535(final Axis class111) {
        final int method27417 = this.field30615.method27417(class111);
        return (method27417 < this.field30615.method27430(class111)) ? this.method24538(class111, method27417) : Double.POSITIVE_INFINITY;
    }
    
    public double method24536(final Axis class111) {
        final int method27418 = this.field30615.method27418(class111);
        return (method27418 > 0) ? this.method24538(class111, method27418) : Double.NEGATIVE_INFINITY;
    }
    
    public AxisAlignedBB method24537() {
        if (!this.method24540()) {
            return new AxisAlignedBB(this.method24535(Axis.X), this.method24535(Axis.Y), this.method24535(Axis.Z), this.method24536(Axis.X), this.method24536(Axis.Y), this.method24536(Axis.Z));
        }
        throw Class8349.method27859(new UnsupportedOperationException("No bounds for empty shape."));
    }
    
    public double method24538(final Axis class111, final int n) {
        return this.method24539(class111).getDouble(n);
    }
    
    public abstract DoubleList method24539(final Axis p0);
    
    public boolean method24540() {
        return this.field30615.method27416();
    }
    
    public Class7702 method24541(final double n, final double n2, final double n3) {
        return this.method24540() ? Class7698.method24486() : new Class7704(this.field30615, (DoubleList)new Class87(this.method24539(Axis.X), n), (DoubleList)new Class87(this.method24539(Axis.Y), n2), (DoubleList)new Class87(this.method24539(Axis.Z), n3));
    }
    
    public Class7702 method24542() {
        final Class7702[] array = { Class7698.method24486() };
        this.method24544((n, n2, n3, n4, n5, n6) -> array[0] = Class7698.method24495(array[0], Class7698.method24488(n, n2, n3, n4, n5, n6), Class9306.field39930));
        return array[0];
    }
    
    public void method24543(final Class9252 class9252) {
        this.field30615.method27434((n, n2, n3, n4, n5, n6) -> class9252.method34141(this.method24538(Axis.X, n), this.method24538(Axis.Y, n2), this.method24538(Axis.Z, n3), this.method24538(Axis.X, n4), this.method24538(Axis.Y, n5), this.method24538(Axis.Z, n6)), true);
    }
    
    public void method24544(final Class9252 class9252) {
        this.field30615.method27437((n, n2, n3, n4, n5, n6) -> class9252.method34141(list.getDouble(n), list2.getDouble(n2), list3.getDouble(n3), list.getDouble(n4), list2.getDouble(n5), list3.getDouble(n6)), true);
    }
    
    public List<AxisAlignedBB> method24545() {
        final ArrayList arrayList = Lists.newArrayList();
        this.method24544((n, n2, n3, n4, n5, n6) -> arrayList.add(new AxisAlignedBB(n, n2, n3, n4, n5, n6)));
        return arrayList;
    }
    
    public double method24546(final Axis class111, final double n, final double n2) {
        final int method27428 = this.field30615.method27428(class111, this.method24548(Class309.field1838.method983(class111), n), this.method24548(Class309.field1839.method983(class111), n2));
        return (method27428 < this.field30615.method27430(class111)) ? this.method24538(class111, method27428) : Double.POSITIVE_INFINITY;
    }
    
    public double method24547(final Axis class111, final double n, final double n2) {
        final int method27429 = this.field30615.method27429(class111, this.method24548(Class309.field1838.method983(class111), n), this.method24548(Class309.field1839.method983(class111), n2));
        return (method27429 > 0) ? this.method24538(class111, method27429) : Double.NEGATIVE_INFINITY;
    }
    
    public int method24548(final Axis class111, final double n) {
        return MathHelper.method35699(0, this.field30615.method27430(class111) + 1, n4 -> {
            if (n4 >= 0) {
                if (n4 <= this.field30615.method27430(class112)) {
                    return n3 < this.method24538(class112, n4);
                }
                else {
                    return true;
                }
            }
            else {
                return false;
            }
        }) - 1;
    }
    
    public boolean method24549(final double n, final double n2, final double n3) {
        return this.field30615.method27426(this.method24548(Axis.X, n), this.method24548(Axis.Y, n2), this.method24548(Axis.Z, n3));
    }
    
    @Nullable
    public Class7005 method24550(final Vec3d class5487, final Vec3d class5488, final BlockPos class5489) {
        if (this.method24540()) {
            return null;
        }
        final Vec3d method16741 = class5488.subtract(class5487);
        if (method16741.lengthSquared() >= 1.0E-7) {
            final Vec3d method16742 = class5487.add(method16741.scale(0.001));
            return this.method24549(method16742.x - class5489.getX(), method16742.y - class5489.getY(), method16742.z - class5489.getZ()) ? new Class7005(method16742, Direction.getFacingFromVector(method16741.x, method16741.y, method16741.z).getOpposite(), class5489, true) : AxisAlignedBB.method18513(this.method24545(), class5487, class5488, class5489);
        }
        return null;
    }
    
    public Class7702 method24551(final Direction class179) {
        if (!this.method24540() && this != Class7698.method24487()) {
            if (this.field30616 == null) {
                this.field30616 = new Class7702[6];
            }
            else {
                final Class7702 class180 = this.field30616[class179.ordinal()];
                if (class180 != null) {
                    return class180;
                }
            }
            return this.field30616[class179.ordinal()] = this.method24552(class179);
        }
        return this;
    }
    
    private Class7702 method24552(final Direction class179) {
        final Axis method790 = class179.getAxis();
        final AxisDirection method791 = class179.getAxisDirection();
        final DoubleList method792 = this.method24539(method790);
        if (method792.size() == 2) {
            if (DoubleMath.fuzzyEquals(method792.getDouble(0), 0.0, 1.0E-7)) {
                if (DoubleMath.fuzzyEquals(method792.getDouble(1), 1.0, 1.0E-7)) {
                    return this;
                }
            }
        }
        return new Class7703(this, method790, this.method24548(method790, (method791 != AxisDirection.POSITIVE) ? 1.0E-7 : 0.9999999));
    }
    
    public double method24553(final Axis class111, final AxisAlignedBB class112, final double n) {
        return this.method24554(Class309.method985(class111, Axis.X), class112, n);
    }
    
    public double method24554(final Class309 class309, final AxisAlignedBB class310, double a) {
        if (this.method24540()) {
            return a;
        }
        if (Math.abs(a) >= 1.0E-7) {
            final Class309 method984 = class309.method984();
            final Axis method985 = method984.method983(Axis.X);
            final Axis method986 = method984.method983(Axis.Y);
            final Axis method987 = method984.method983(Axis.Z);
            final double method988 = class310.method18491(method985);
            final double method989 = class310.method18490(method985);
            final int method990 = this.method24548(method985, method989 + 1.0E-7);
            final int method991 = this.method24548(method985, method988 - 1.0E-7);
            final int max = Math.max(0, this.method24548(method986, class310.method18490(method986) + 1.0E-7));
            final int min = Math.min(this.field30615.method27430(method986), this.method24548(method986, class310.method18491(method986) - 1.0E-7) + 1);
            final int max2 = Math.max(0, this.method24548(method987, class310.method18490(method987) + 1.0E-7));
            final int min2 = Math.min(this.field30615.method27430(method987), this.method24548(method987, class310.method18491(method987) - 1.0E-7) + 1);
            final int method992 = this.field30615.method27430(method985);
            if (a <= 0.0) {
                if (a < 0.0) {
                    for (int i = method990 - 1; i >= 0; --i) {
                        for (int j = max; j < min; ++j) {
                            for (int k = max2; k < min2; ++k) {
                                if (this.field30615.method27425(method984, i, j, k)) {
                                    final double b = this.method24538(method985, i + 1) - method989;
                                    if (b <= 1.0E-7) {
                                        a = Math.max(a, b);
                                    }
                                    return a;
                                }
                            }
                        }
                    }
                }
            }
            else {
                for (int l = method991 + 1; l < method992; ++l) {
                    for (int n = max; n < min; ++n) {
                        for (int n2 = max2; n2 < min2; ++n2) {
                            if (this.field30615.method27425(method984, l, n, n2)) {
                                final double b2 = this.method24538(method985, l) - method988;
                                if (b2 >= -1.0E-7) {
                                    a = Math.min(a, b2);
                                }
                                return a;
                            }
                        }
                    }
                }
            }
            return a;
        }
        return 0.0;
    }
    
    @Override
    public String toString() {
        return this.method24540() ? "EMPTY" : ("VoxelShape[" + this.method24537() + "]");
    }
}
