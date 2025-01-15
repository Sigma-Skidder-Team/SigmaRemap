// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public abstract class Class8260
{
    private static final Axis[] field33918;
    public final int field33919;
    public final int field33920;
    public final int field33921;
    
    public Class8260(final int field33919, final int field33920, final int field33921) {
        this.field33919 = field33919;
        this.field33920 = field33920;
        this.field33921 = field33921;
    }
    
    public boolean method27425(final Class309 class309, final int n, final int n2, final int n3) {
        return this.method27426(class309.method982(n, n2, n3, Axis.X), class309.method982(n, n2, n3, Axis.Y), class309.method982(n, n2, n3, Axis.Z));
    }
    
    public boolean method27426(final int n, final int n2, final int n3) {
        if (n >= 0) {
            if (n2 >= 0) {
                if (n3 >= 0) {
                    if (n < this.field33919) {
                        if (n2 < this.field33920) {
                            if (n3 < this.field33921) {
                                return this.method27414(n, n2, n3);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    public boolean method27427(final Class309 class309, final int n, final int n2, final int n3) {
        return this.method27414(class309.method982(n, n2, n3, Axis.X), class309.method982(n, n2, n3, Axis.Y), class309.method982(n, n2, n3, Axis.Z));
    }
    
    public abstract boolean method27414(final int p0, final int p1, final int p2);
    
    public abstract void method27415(final int p0, final int p1, final int p2, final boolean p3, final boolean p4);
    
    public boolean method27416() {
        for (final Axis class111 : Class8260.field33918) {
            if (this.method27417(class111) >= this.method27418(class111)) {
                return true;
            }
        }
        return false;
    }
    
    public abstract int method27417(final Axis p0);
    
    public abstract int method27418(final Axis p0);
    
    public int method27428(final Axis class111, final int n, final int n2) {
        final int method27430 = this.method27430(class111);
        if (n < 0 || n2 < 0) {
            return method27430;
        }
        final Axis method27431 = Class309.field1838.method983(class111);
        final Axis method27432 = Class309.field1839.method983(class111);
        if (n < this.method27430(method27431) && n2 < this.method27430(method27432)) {
            final Class309 method27433 = Class309.method985(Axis.X, class111);
            for (int i = 0; i < method27430; ++i) {
                if (this.method27427(method27433, i, n, n2)) {
                    return i;
                }
            }
            return method27430;
        }
        return method27430;
    }
    
    public int method27429(final Axis class111, final int n, final int n2) {
        if (n < 0 || n2 < 0) {
            return 0;
        }
        final Axis method983 = Class309.field1838.method983(class111);
        final Axis method984 = Class309.field1839.method983(class111);
        if (n < this.method27430(method983) && n2 < this.method27430(method984)) {
            final int method985 = this.method27430(class111);
            final Class309 method986 = Class309.method985(Axis.X, class111);
            for (int i = method985 - 1; i >= 0; --i) {
                if (this.method27427(method986, i, n, n2)) {
                    return i + 1;
                }
            }
            return 0;
        }
        return 0;
    }
    
    public int method27430(final Axis class111) {
        return class111.getCoordinate(this.field33919, this.field33920, this.field33921);
    }
    
    public int method27431() {
        return this.method27430(Axis.X);
    }
    
    public int method27432() {
        return this.method27430(Axis.Y);
    }
    
    public int method27433() {
        return this.method27430(Axis.Z);
    }
    
    public void method27434(final Class8670 class8670, final boolean b) {
        this.method27435(class8670, Class309.field1837, b);
        this.method27435(class8670, Class309.field1838, b);
        this.method27435(class8670, Class309.field1839, b);
    }
    
    private void method27435(final Class8670 class8670, final Class309 class8671, final boolean b) {
        final Class309 method984 = class8671.method984();
        final int method985 = this.method27430(method984.method983(Axis.X));
        final int method986 = this.method27430(method984.method983(Axis.Y));
        final int method987 = this.method27430(method984.method983(Axis.Z));
        for (int i = 0; i <= method985; ++i) {
            for (int j = 0; j <= method986; ++j) {
                int n = -1;
                for (int k = 0; k <= method987; ++k) {
                    int n2 = 0;
                    int n3 = 0;
                    for (int l = 0; l <= 1; ++l) {
                        for (int n4 = 0; n4 <= 1; ++n4) {
                            if (this.method27425(method984, i + l - 1, j + n4 - 1, k)) {
                                ++n2;
                                n3 ^= (l ^ n4);
                            }
                        }
                    }
                    if (n2 != 1) {
                        if (n2 != 3) {
                            if (n2 != 2 || (n3 & 0x1) != 0x0) {
                                if (n == -1) {
                                    continue;
                                }
                                class8670.method29679(method984.method982(i, j, n, Axis.X), method984.method982(i, j, n, Axis.Y), method984.method982(i, j, n, Axis.Z), method984.method982(i, j, k, Axis.X), method984.method982(i, j, k, Axis.Y), method984.method982(i, j, k, Axis.Z));
                                n = -1;
                                continue;
                            }
                        }
                    }
                    if (!b) {
                        class8670.method29679(method984.method982(i, j, k, Axis.X), method984.method982(i, j, k, Axis.Y), method984.method982(i, j, k, Axis.Z), method984.method982(i, j, k + 1, Axis.X), method984.method982(i, j, k + 1, Axis.Y), method984.method982(i, j, k + 1, Axis.Z));
                    }
                    else if (n == -1) {
                        n = k;
                    }
                }
            }
        }
    }
    
    public boolean method27419(final int n, final int n2, final int n3, final int n4) {
        for (int i = n; i < n2; ++i) {
            if (!this.method27426(n3, n4, i)) {
                return false;
            }
        }
        return true;
    }
    
    public void method27420(final int n, final int n2, final int n3, final int n4, final boolean b) {
        for (int i = n; i < n2; ++i) {
            this.method27415(n3, n4, i, false, b);
        }
    }
    
    public boolean method27436(final int n, final int n2, final int n3, final int n4, final int n5) {
        for (int i = n; i < n2; ++i) {
            if (!this.method27419(n3, n4, i, n5)) {
                return false;
            }
        }
        return true;
    }
    
    public void method27437(final Class8670 class8670, final boolean b) {
        final Class8259 class8671 = new Class8259(this);
        for (int i = 0; i <= this.field33919; ++i) {
            for (int j = 0; j <= this.field33920; ++j) {
                int n = -1;
                for (int k = 0; k <= this.field33921; ++k) {
                    if (!class8671.method27426(i, j, k)) {
                        if (n != -1) {
                            int n2 = i;
                            int n3 = i;
                            int n4 = j;
                            int n5 = j;
                            class8671.method27420(n, k, i, j, false);
                            while (class8671.method27419(n, k, n2 - 1, n4)) {
                                class8671.method27420(n, k, n2 - 1, n4, false);
                                --n2;
                            }
                            while (class8671.method27419(n, k, n3 + 1, n4)) {
                                class8671.method27420(n, k, n3 + 1, n4, false);
                                ++n3;
                            }
                            while (class8671.method27436(n2, n3 + 1, n, k, n4 - 1)) {
                                for (int l = n2; l <= n3; ++l) {
                                    class8671.method27420(n, k, l, n4 - 1, false);
                                }
                                --n4;
                            }
                            while (class8671.method27436(n2, n3 + 1, n, k, n5 + 1)) {
                                for (int n6 = n2; n6 <= n3; ++n6) {
                                    class8671.method27420(n, k, n6, n5 + 1, false);
                                }
                                ++n5;
                            }
                            class8670.method29679(n2, n4, n, n3 + 1, n5 + 1, k);
                            n = -1;
                        }
                    }
                    else if (!b) {
                        class8670.method29679(i, j, k, i + 1, j + 1, k + 1);
                    }
                    else if (n == -1) {
                        n = k;
                    }
                }
            }
        }
    }
    
    public void method27438(final Class8466 class8466) {
        this.method27439(class8466, Class309.field1837);
        this.method27439(class8466, Class309.field1838);
        this.method27439(class8466, Class309.field1839);
    }
    
    private void method27439(final Class8466 class8466, final Class309 class8467) {
        final Class309 method984 = class8467.method984();
        final Axis method985 = method984.method983(Axis.Z);
        final int method986 = this.method27430(method984.method983(Axis.X));
        final int method987 = this.method27430(method984.method983(Axis.Y));
        final int method988 = this.method27430(method985);
        final Direction method989 = Direction.getFacingFromAxisDirection(method985, AxisDirection.NEGATIVE);
        final Direction method990 = Direction.getFacingFromAxisDirection(method985, AxisDirection.POSITIVE);
        for (int i = 0; i < method986; ++i) {
            for (int j = 0; j < method987; ++j) {
                boolean b = false;
                for (int k = 0; k <= method988; ++k) {
                    final boolean b2 = k != method988 && this.method27427(method984, i, j, k);
                    if (!b) {
                        if (b2) {
                            class8466.method28259(method989, method984.method982(i, j, k, Axis.X), method984.method982(i, j, k, Axis.Y), method984.method982(i, j, k, Axis.Z));
                        }
                    }
                    if (b) {
                        if (!b2) {
                            class8466.method28259(method990, method984.method982(i, j, k - 1, Axis.X), method984.method982(i, j, k - 1, Axis.Y), method984.method982(i, j, k - 1, Axis.Z));
                        }
                    }
                    b = b2;
                }
            }
        }
    }
    
    static {
        field33918 = Axis.values();
    }
}
