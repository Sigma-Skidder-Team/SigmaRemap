// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.Optional;

public class Class6221
{
    public final double field25073;
    public final double field25074;
    public final double field25075;
    public final double field25076;
    public final double field25077;
    public final double field25078;
    
    public Class6221(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this.field25073 = Math.min(n, n4);
        this.field25074 = Math.min(n2, n5);
        this.field25075 = Math.min(n3, n6);
        this.field25076 = Math.max(n, n4);
        this.field25077 = Math.max(n2, n5);
        this.field25078 = Math.max(n3, n6);
    }
    
    public Class6221(final Class354 class354) {
        this(class354.method1074(), class354.method1075(), class354.method1076(), class354.method1074() + 1, class354.method1075() + 1, class354.method1076() + 1);
    }
    
    public Class6221(final Class354 class354, final Class354 class355) {
        this(class354.method1074(), class354.method1075(), class354.method1076(), class355.method1074(), class355.method1075(), class355.method1076());
    }
    
    public Class6221(final Class5487 class5487, final Class5487 class5488) {
        this(class5487.field22770, class5487.field22771, class5487.field22772, class5488.field22770, class5488.field22771, class5488.field22772);
    }
    
    public static Class6221 method18489(final Class6997 class6997) {
        return new Class6221(class6997.field27293, class6997.field27294, class6997.field27295, class6997.field27296 + 1, class6997.field27297 + 1, class6997.field27298 + 1);
    }
    
    public double method18490(final Class111 class111) {
        return class111.method605(this.field25073, this.field25074, this.field25075);
    }
    
    public double method18491(final Class111 class111) {
        return class111.method605(this.field25076, this.field25077, this.field25078);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class6221) {
            final Class6221 class6221 = (Class6221)o;
            return Double.compare(class6221.field25073, this.field25073) == 0 && Double.compare(class6221.field25074, this.field25074) == 0 && Double.compare(class6221.field25075, this.field25075) == 0 && Double.compare(class6221.field25076, this.field25076) == 0 && Double.compare(class6221.field25077, this.field25077) == 0 && Double.compare(class6221.field25078, this.field25078) == 0;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.field25073);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.field25074);
        final int n2 = 31 * n + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32);
        final long doubleToLongBits3 = Double.doubleToLongBits(this.field25075);
        final int n3 = 31 * n2 + (int)(doubleToLongBits3 ^ doubleToLongBits3 >>> 32);
        final long doubleToLongBits4 = Double.doubleToLongBits(this.field25076);
        final int n4 = 31 * n3 + (int)(doubleToLongBits4 ^ doubleToLongBits4 >>> 32);
        final long doubleToLongBits5 = Double.doubleToLongBits(this.field25077);
        final int n5 = 31 * n4 + (int)(doubleToLongBits5 ^ doubleToLongBits5 >>> 32);
        final long doubleToLongBits6 = Double.doubleToLongBits(this.field25078);
        return 31 * n5 + (int)(doubleToLongBits6 ^ doubleToLongBits6 >>> 32);
    }
    
    public Class6221 method18492(final double n, final double n2, final double n3) {
        double field25073 = this.field25073;
        double field25074 = this.field25074;
        double field25075 = this.field25075;
        double field25076 = this.field25076;
        double field25077 = this.field25077;
        double field25078 = this.field25078;
        if (n >= 0.0) {
            if (n > 0.0) {
                field25076 -= n;
            }
        }
        else {
            field25073 -= n;
        }
        if (n2 >= 0.0) {
            if (n2 > 0.0) {
                field25077 -= n2;
            }
        }
        else {
            field25074 -= n2;
        }
        if (n3 >= 0.0) {
            if (n3 > 0.0) {
                field25078 -= n3;
            }
        }
        else {
            field25075 -= n3;
        }
        return new Class6221(field25073, field25074, field25075, field25076, field25077, field25078);
    }
    
    public Class6221 method18493(final Class5487 class5487) {
        return this.method18494(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public Class6221 method18494(final double n, final double n2, final double n3) {
        double field25073 = this.field25073;
        double field25074 = this.field25074;
        double field25075 = this.field25075;
        double field25076 = this.field25076;
        double field25077 = this.field25077;
        double field25078 = this.field25078;
        if (n >= 0.0) {
            if (n > 0.0) {
                field25076 += n;
            }
        }
        else {
            field25073 += n;
        }
        if (n2 >= 0.0) {
            if (n2 > 0.0) {
                field25077 += n2;
            }
        }
        else {
            field25074 += n2;
        }
        if (n3 >= 0.0) {
            if (n3 > 0.0) {
                field25078 += n3;
            }
        }
        else {
            field25075 += n3;
        }
        return new Class6221(field25073, field25074, field25075, field25076, field25077, field25078);
    }
    
    public Class6221 method18495(final double n, final double n2, final double n3) {
        return new Class6221(this.field25073 - n, this.field25074 - n2, this.field25075 - n3, this.field25076 + n, this.field25077 + n2, this.field25078 + n3);
    }
    
    public Class6221 method18496(final double n) {
        return this.method18495(n, n, n);
    }
    
    public Class6221 method18497(final Class6221 class6221) {
        return new Class6221(Math.max(this.field25073, class6221.field25073), Math.max(this.field25074, class6221.field25074), Math.max(this.field25075, class6221.field25075), Math.min(this.field25076, class6221.field25076), Math.min(this.field25077, class6221.field25077), Math.min(this.field25078, class6221.field25078));
    }
    
    public Class6221 method18498(final Class6221 class6221) {
        return new Class6221(Math.min(this.field25073, class6221.field25073), Math.min(this.field25074, class6221.field25074), Math.min(this.field25075, class6221.field25075), Math.max(this.field25076, class6221.field25076), Math.max(this.field25077, class6221.field25077), Math.max(this.field25078, class6221.field25078));
    }
    
    public Class6221 method18499(final double n, final double n2, final double n3) {
        return new Class6221(this.field25073 + n, this.field25074 + n2, this.field25075 + n3, this.field25076 + n, this.field25077 + n2, this.field25078 + n3);
    }
    
    public Class6221 method18500(final Class354 class354) {
        return new Class6221(this.field25073 + class354.method1074(), this.field25074 + class354.method1075(), this.field25075 + class354.method1076(), this.field25076 + class354.method1074(), this.field25077 + class354.method1075(), this.field25078 + class354.method1076());
    }
    
    public Class6221 method18501(final Class5487 class5487) {
        return this.method18499(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public boolean method18502(final Class6221 class6221) {
        return this.method18503(class6221.field25073, class6221.field25074, class6221.field25075, class6221.field25076, class6221.field25077, class6221.field25078);
    }
    
    public boolean method18503(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        if (this.field25073 < n4) {
            if (this.field25076 > n) {
                if (this.field25074 < n5) {
                    if (this.field25077 > n2) {
                        if (this.field25075 < n6) {
                            if (this.field25078 > n3) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method18504(final Class5487 class5487, final Class5487 class5488) {
        return this.method18503(Math.min(class5487.field22770, class5488.field22770), Math.min(class5487.field22771, class5488.field22771), Math.min(class5487.field22772, class5488.field22772), Math.max(class5487.field22770, class5488.field22770), Math.max(class5487.field22771, class5488.field22771), Math.max(class5487.field22772, class5488.field22772));
    }
    
    public boolean method18505(final Class5487 class5487) {
        return this.method18506(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public boolean method18506(final double n, final double n2, final double n3) {
        if (n >= this.field25073) {
            if (n < this.field25076) {
                if (n2 >= this.field25074) {
                    if (n2 < this.field25077) {
                        if (n3 >= this.field25075) {
                            if (n3 < this.field25078) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public double method18507() {
        return (this.method18508() + this.method18509() + this.method18510()) / 3.0;
    }
    
    public double method18508() {
        return this.field25076 - this.field25073;
    }
    
    public double method18509() {
        return this.field25077 - this.field25074;
    }
    
    public double method18510() {
        return this.field25078 - this.field25075;
    }
    
    public Class6221 method18511(final double n) {
        return this.method18496(-n);
    }
    
    public Optional<Class5487> method18512(final Class5487 class5487, final Class5487 class5488) {
        final double[] array = { 1.0 };
        final double n = class5488.field22770 - class5487.field22770;
        final double n2 = class5488.field22771 - class5487.field22771;
        final double n3 = class5488.field22772 - class5487.field22772;
        if (method18514(this, class5487, array, null, n, n2, n3) != null) {
            final double n4 = array[0];
            return Optional.of(class5487.method16744(n4 * n, n4 * n2, n4 * n3));
        }
        return Optional.empty();
    }
    
    @Nullable
    public static Class7005 method18513(final Iterable<Class6221> iterable, final Class5487 class5487, final Class5487 class5488, final Class354 class5489) {
        final double[] array = { 1.0 };
        Class179 method18514 = null;
        final double n = class5488.field22770 - class5487.field22770;
        final double n2 = class5488.field22771 - class5487.field22771;
        final double n3 = class5488.field22772 - class5487.field22772;
        final Iterator<Class6221> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            method18514 = method18514(iterator.next().method18500(class5489), class5487, array, method18514, n, n2, n3);
        }
        if (method18514 != null) {
            final double n4 = array[0];
            return new Class7005(class5487.method16744(n4 * n, n4 * n2, n4 * n3), method18514, class5489, false);
        }
        return null;
    }
    
    @Nullable
    private static Class179 method18514(final Class6221 class6221, final Class5487 class6222, final double[] array, Class179 class6223, final double n, final double n2, final double n3) {
        if (n <= 1.0E-7) {
            if (n < -1.0E-7) {
                class6223 = method18515(array, class6223, n, n2, n3, class6221.field25076, class6221.field25074, class6221.field25077, class6221.field25075, class6221.field25078, Class179.field516, class6222.field22770, class6222.field22771, class6222.field22772);
            }
        }
        else {
            class6223 = method18515(array, class6223, n, n2, n3, class6221.field25073, class6221.field25074, class6221.field25077, class6221.field25075, class6221.field25078, Class179.field515, class6222.field22770, class6222.field22771, class6222.field22772);
        }
        if (n2 <= 1.0E-7) {
            if (n2 < -1.0E-7) {
                class6223 = method18515(array, class6223, n2, n3, n, class6221.field25077, class6221.field25075, class6221.field25078, class6221.field25073, class6221.field25076, Class179.field512, class6222.field22771, class6222.field22772, class6222.field22770);
            }
        }
        else {
            class6223 = method18515(array, class6223, n2, n3, n, class6221.field25074, class6221.field25075, class6221.field25078, class6221.field25073, class6221.field25076, Class179.field511, class6222.field22771, class6222.field22772, class6222.field22770);
        }
        if (n3 <= 1.0E-7) {
            if (n3 < -1.0E-7) {
                class6223 = method18515(array, class6223, n3, n, n2, class6221.field25078, class6221.field25073, class6221.field25076, class6221.field25074, class6221.field25077, Class179.field514, class6222.field22772, class6222.field22770, class6222.field22771);
            }
        }
        else {
            class6223 = method18515(array, class6223, n3, n, n2, class6221.field25075, class6221.field25073, class6221.field25076, class6221.field25074, class6221.field25077, Class179.field513, class6222.field22772, class6222.field22770, class6222.field22771);
        }
        return class6223;
    }
    
    @Nullable
    private static Class179 method18515(final double[] array, final Class179 class179, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final double n8, final Class179 class180, final double n9, final double n10, final double n11) {
        final double n12 = (n4 - n9) / n;
        final double n13 = n10 + n12 * n2;
        final double n14 = n11 + n12 * n3;
        if (0.0 < n12) {
            if (n12 < array[0]) {
                if (n5 - 1.0E-7 < n13) {
                    if (n13 < n6 + 1.0E-7) {
                        if (n7 - 1.0E-7 < n14) {
                            if (n14 < n8 + 1.0E-7) {
                                array[0] = n12;
                                return class180;
                            }
                        }
                    }
                }
            }
        }
        return class179;
    }
    
    @Override
    public String toString() {
        return "box[" + this.field25073 + ", " + this.field25074 + ", " + this.field25075 + "] -> [" + this.field25076 + ", " + this.field25077 + ", " + this.field25078 + "]";
    }
    
    public boolean method18516() {
        if (!Double.isNaN(this.field25073)) {
            if (!Double.isNaN(this.field25074)) {
                if (!Double.isNaN(this.field25075)) {
                    if (!Double.isNaN(this.field25076)) {
                        if (!Double.isNaN(this.field25077)) {
                            if (!Double.isNaN(this.field25078)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public Class5487 method18517() {
        return new Class5487(Class9546.method35701(0.5, this.field25073, this.field25076), Class9546.method35701(0.5, this.field25074, this.field25077), Class9546.method35701(0.5, this.field25075, this.field25078));
    }
}
