// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2281 implements Serializable, Cloneable
{
    private int field13879;
    public double[] field13880;
    public static final long field13881 = 1398850036893875112L;
    
    public Class2281(final int field13879) {
        this.field13879 = field13879;
        this.field13880 = new double[field13879];
        for (int i = 0; i < field13879; ++i) {
            this.field13880[i] = 0.0;
        }
    }
    
    public Class2281(final double[] array) {
        this.field13879 = array.length;
        this.field13880 = new double[array.length];
        System.arraycopy(array, 0, this.field13880, 0, this.field13879);
    }
    
    public Class2281(final Class2281 class2281) {
        this.field13880 = new double[class2281.field13879];
        this.field13879 = class2281.field13879;
        System.arraycopy(class2281.field13880, 0, this.field13880, 0, this.field13879);
    }
    
    public Class2281(final Class2290 class2290) {
        (this.field13880 = new double[2])[0] = class2290.field13920;
        this.field13880[1] = class2290.field13921;
        this.field13879 = 2;
    }
    
    public Class2281(final Class2285 class2285) {
        (this.field13880 = new double[3])[0] = class2285.field13909;
        this.field13880[1] = class2285.field13910;
        this.field13880[2] = class2285.field13911;
        this.field13879 = 3;
    }
    
    public Class2281(final Class2271 class2271) {
        (this.field13880 = new double[3])[0] = class2271.field13839;
        this.field13880[1] = class2271.field13840;
        this.field13880[2] = class2271.field13841;
        this.field13879 = 3;
    }
    
    public Class2281(final Class2275 class2275) {
        (this.field13880 = new double[4])[0] = class2275.field13863;
        this.field13880[1] = class2275.field13864;
        this.field13880[2] = class2275.field13865;
        this.field13880[3] = class2275.field13866;
        this.field13879 = 4;
    }
    
    public Class2281(final Class7 class7) {
        (this.field13880 = new double[4])[0] = class7.field18;
        this.field13880[1] = class7.field19;
        this.field13880[2] = class7.field20;
        this.field13880[3] = class7.field21;
        this.field13879 = 4;
    }
    
    public Class2281(final double[] array, final int field13879) {
        this.field13879 = field13879;
        this.field13880 = new double[field13879];
        System.arraycopy(array, 0, this.field13880, 0, field13879);
    }
    
    public final double method8723() {
        double a = 0.0;
        for (int i = 0; i < this.field13879; ++i) {
            a += this.field13880[i] * this.field13880[i];
        }
        return Math.sqrt(a);
    }
    
    public final double method8724() {
        double n = 0.0;
        for (int i = 0; i < this.field13879; ++i) {
            n += this.field13880[i] * this.field13880[i];
        }
        return n;
    }
    
    public final void method8725(final Class2281 class2281) {
        double a = 0.0;
        if (this.field13879 == class2281.field13879) {
            for (int i = 0; i < this.field13879; ++i) {
                a += class2281.field13880[i] * class2281.field13880[i];
            }
            final double n = 1.0 / Math.sqrt(a);
            for (int j = 0; j < this.field13879; ++j) {
                this.field13880[j] = class2281.field13880[j] * n;
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector0"));
    }
    
    public final void method8726() {
        double a = 0.0;
        for (int i = 0; i < this.field13879; ++i) {
            a += this.field13880[i] * this.field13880[i];
        }
        final double n = 1.0 / Math.sqrt(a);
        for (int j = 0; j < this.field13879; ++j) {
            this.field13880[j] *= n;
        }
    }
    
    public final void method8727(final double n, final Class2281 class2281) {
        if (this.field13879 == class2281.field13879) {
            for (int i = 0; i < this.field13879; ++i) {
                this.field13880[i] = class2281.field13880[i] * n;
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector1"));
    }
    
    public final void method8728(final double n) {
        for (int i = 0; i < this.field13879; ++i) {
            this.field13880[i] *= n;
        }
    }
    
    public final void method8729(final double n, final Class2281 class2281, final Class2281 class2282) {
        if (class2282.field13879 != class2281.field13879) {
            throw new Class2363(Class9531.method35584("GVector2"));
        }
        if (this.field13879 == class2281.field13879) {
            for (int i = 0; i < this.field13879; ++i) {
                this.field13880[i] = class2281.field13880[i] * n + class2282.field13880[i];
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector3"));
    }
    
    public final void method8730(final Class2281 class2281) {
        if (this.field13879 == class2281.field13879) {
            for (int i = 0; i < this.field13879; ++i) {
                final double[] field13880 = this.field13880;
                final int n = i;
                field13880[n] += class2281.field13880[i];
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector4"));
    }
    
    public final void method8731(final Class2281 class2281, final Class2281 class2282) {
        if (class2281.field13879 != class2282.field13879) {
            throw new Class2363(Class9531.method35584("GVector5"));
        }
        if (this.field13879 == class2281.field13879) {
            for (int i = 0; i < this.field13879; ++i) {
                this.field13880[i] = class2281.field13880[i] + class2282.field13880[i];
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector6"));
    }
    
    public final void method8732(final Class2281 class2281) {
        if (this.field13879 == class2281.field13879) {
            for (int i = 0; i < this.field13879; ++i) {
                final double[] field13880 = this.field13880;
                final int n = i;
                field13880[n] -= class2281.field13880[i];
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector7"));
    }
    
    public final void method8733(final Class2281 class2281, final Class2281 class2282) {
        if (class2281.field13879 != class2282.field13879) {
            throw new Class2363(Class9531.method35584("GVector8"));
        }
        if (this.field13879 == class2281.field13879) {
            for (int i = 0; i < this.field13879; ++i) {
                this.field13880[i] = class2281.field13880[i] - class2282.field13880[i];
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector9"));
    }
    
    public final void method8734(final Class2282 class2282, final Class2281 class2283) {
        if (class2282.method8781() != class2283.field13879) {
            throw new Class2363(Class9531.method35584("GVector10"));
        }
        if (this.field13879 == class2282.method8780()) {
            double[] field13880;
            if (class2283 == this) {
                field13880 = this.field13880.clone();
            }
            else {
                field13880 = class2283.field13880;
            }
            for (int i = this.field13879 - 1; i >= 0; --i) {
                this.field13880[i] = 0.0;
                for (int j = class2283.field13879 - 1; j >= 0; --j) {
                    final double[] field13881 = this.field13880;
                    final int n = i;
                    field13881[n] += class2282.field13886[i][j] * field13880[j];
                }
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector11"));
    }
    
    public final void method8735(final Class2281 class2281, final Class2282 class2282) {
        if (class2282.method8780() != class2281.field13879) {
            throw new Class2363(Class9531.method35584("GVector12"));
        }
        if (this.field13879 == class2282.method8781()) {
            double[] field13880;
            if (class2281 == this) {
                field13880 = this.field13880.clone();
            }
            else {
                field13880 = class2281.field13880;
            }
            for (int i = this.field13879 - 1; i >= 0; --i) {
                this.field13880[i] = 0.0;
                for (int j = class2281.field13879 - 1; j >= 0; --j) {
                    final double[] field13881 = this.field13880;
                    final int n = i;
                    field13881[n] += class2282.field13886[j][i] * field13880[j];
                }
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector13"));
    }
    
    public final void method8736() {
        for (int i = this.field13879 - 1; i >= 0; --i) {
            final double[] field13880 = this.field13880;
            final int n = i;
            field13880[n] *= -1.0;
        }
    }
    
    public final void method8737() {
        for (int i = 0; i < this.field13879; ++i) {
            this.field13880[i] = 0.0;
        }
    }
    
    public final void method8738(final int field13879) {
        final double[] field13880 = new double[field13879];
        int field13881;
        if (this.field13879 >= field13879) {
            field13881 = field13879;
        }
        else {
            field13881 = this.field13879;
        }
        if (field13881 >= 0) System.arraycopy(this.field13880, 0, field13880, 0, field13881);
        this.field13879 = field13879;
        this.field13880 = field13880;
    }
    
    public final void method8739(final double[] array) {
        if (this.field13879 - 1 + 1 >= 0) System.arraycopy(array, 0, this.field13880, 0, this.field13879 - 1 + 1);
    }
    
    public final void method8740(final Class2281 class2281) {
        if (this.field13879 >= class2281.field13879) {
            if (class2281.field13879 >= 0)
                System.arraycopy(class2281.field13880, 0, this.field13880, 0, class2281.field13879);
            for (int j = class2281.field13879; j < this.field13879; ++j) {
                this.field13880[j] = 0.0;
            }
        }
        else {
            this.field13879 = class2281.field13879;
            this.field13880 = new double[this.field13879];
            System.arraycopy(class2281.field13880, 0, this.field13880, 0, this.field13879);
        }
    }
    
    public final void method8741(final Class2290 class2290) {
        if (this.field13879 < 2) {
            this.field13879 = 2;
            this.field13880 = new double[2];
        }
        this.field13880[0] = class2290.field13920;
        this.field13880[1] = class2290.field13921;
        for (int i = 2; i < this.field13879; ++i) {
            this.field13880[i] = 0.0;
        }
    }
    
    public final void method8742(final Class2285 class2285) {
        if (this.field13879 < 3) {
            this.field13879 = 3;
            this.field13880 = new double[3];
        }
        this.field13880[0] = class2285.field13909;
        this.field13880[1] = class2285.field13910;
        this.field13880[2] = class2285.field13911;
        for (int i = 3; i < this.field13879; ++i) {
            this.field13880[i] = 0.0;
        }
    }
    
    public final void method8743(final Class2271 class2271) {
        if (this.field13879 < 3) {
            this.field13879 = 3;
            this.field13880 = new double[3];
        }
        this.field13880[0] = class2271.field13839;
        this.field13880[1] = class2271.field13840;
        this.field13880[2] = class2271.field13841;
        for (int i = 3; i < this.field13879; ++i) {
            this.field13880[i] = 0.0;
        }
    }
    
    public final void method8744(final Class2275 class2275) {
        if (this.field13879 < 4) {
            this.field13879 = 4;
            this.field13880 = new double[4];
        }
        this.field13880[0] = class2275.field13863;
        this.field13880[1] = class2275.field13864;
        this.field13880[2] = class2275.field13865;
        this.field13880[3] = class2275.field13866;
        for (int i = 4; i < this.field13879; ++i) {
            this.field13880[i] = 0.0;
        }
    }
    
    public final void method8745(final Class7 class7) {
        if (this.field13879 < 4) {
            this.field13879 = 4;
            this.field13880 = new double[4];
        }
        this.field13880[0] = class7.field18;
        this.field13880[1] = class7.field19;
        this.field13880[2] = class7.field20;
        this.field13880[3] = class7.field21;
        for (int i = 4; i < this.field13879; ++i) {
            this.field13880[i] = 0.0;
        }
    }
    
    public final int method8746() {
        return this.field13880.length;
    }
    
    public final double method8747(final int n) {
        return this.field13880[n];
    }
    
    public final void method8748(final int n, final double n2) {
        this.field13880[n] = n2;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.field13879 * 8);
        for (int i = 0; i < this.field13879; ++i) {
            sb.append(this.field13880[i]).append(" ");
        }
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        long n = 1L;
        for (int i = 0; i < this.field13879; ++i) {
            n = 31L * n + Class9427.method35031(this.field13880[i]);
        }
        return (int)(n ^ n >> 32);
    }
    
    public boolean equals(final Class2281 class2281) {
        try {
            if (this.field13879 != class2281.field13879) {
                return false;
            }
            for (int i = 0; i < this.field13879; ++i) {
                if (this.field13880[i] != class2281.field13880[i]) {
                    return false;
                }
            }
            return true;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2281 class2281 = (Class2281)o;
            if (this.field13879 != class2281.field13879) {
                return false;
            }
            for (int i = 0; i < this.field13879; ++i) {
                if (this.field13880[i] != class2281.field13880[i]) {
                    return false;
                }
            }
            return true;
        }
        catch (final ClassCastException ex) {
            return false;
        }
        catch (final NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean method8749(final Class2281 class2281, final double n) {
        if (this.field13879 == class2281.field13879) {
            for (int i = 0; i < this.field13879; ++i) {
                final double n2 = this.field13880[i] - class2281.field13880[i];
                if (((n2 >= 0.0) ? n2 : (-n2)) > n) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final double method8750(final Class2281 class2281) {
        if (this.field13879 == class2281.field13879) {
            double n = 0.0;
            for (int i = 0; i < this.field13879; ++i) {
                n += this.field13880[i] * class2281.field13880[i];
            }
            return n;
        }
        throw new Class2363(Class9531.method35584("GVector14"));
    }
    
    public final void method8751(final Class2282 class2282, final Class2282 class2283, final Class2282 class2284, final Class2281 class2285) {
        if (class2282.field13884 == class2285.method8746()) {
            if (class2282.field13884 == class2282.field13885) {
                if (class2282.field13884 == class2283.field13884) {
                    if (class2283.field13885 == this.field13880.length) {
                        if (class2283.field13885 == class2284.field13885) {
                            if (class2283.field13885 == class2284.field13884) {
                                final Class2282 class2286 = new Class2282(class2282.field13884, class2283.field13885);
                                class2286.method8759(class2282, class2284);
                                class2286.method8798(class2282, class2283);
                                class2286.method8770();
                                this.method8734(class2286, class2285);
                                return;
                            }
                        }
                    }
                    throw new Class2363(Class9531.method35584("GVector23"));
                }
            }
        }
        throw new Class2363(Class9531.method35584("GVector15"));
    }
    
    public final void method8752(final Class2282 class2282, final Class2281 class2283, final Class2281 class2284) {
        final int n = class2282.field13884 * class2282.field13885;
        final double[] array = new double[n];
        final double[] array2 = new double[n];
        final int[] array3 = new int[class2283.method8746()];
        if (class2282.field13884 != class2283.method8746()) {
            throw new Class2363(Class9531.method35584("GVector16"));
        }
        if (class2282.field13884 != class2284.method8746()) {
            throw new Class2363(Class9531.method35584("GVector24"));
        }
        if (class2282.field13884 == class2282.field13885) {
            for (int i = 0; i < class2282.field13884; ++i) {
                System.arraycopy(class2282.field13886[i], 0, array, i * class2282.field13885 + 0, class2282.field13885);
            }
            for (int k = 0; k < n; ++k) {
                array2[k] = 0.0;
            }
            for (int l = 0; l < class2282.field13884; ++l) {
                array2[l * class2282.field13885] = class2283.field13880[l];
            }
            for (int n2 = 0; n2 < class2282.field13885; ++n2) {
                array3[n2] = (int)class2284.field13880[n2];
            }
            Class2282.method8811(class2282.field13884, array, array3, array2);
            for (int n3 = 0; n3 < class2282.field13884; ++n3) {
                this.field13880[n3] = array2[n3 * class2282.field13885];
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector25"));
    }
    
    public final double method8753(final Class2281 class2281) {
        return Math.acos(this.method8750(class2281) / (this.method8723() * class2281.method8723()));
    }
    
    @Deprecated
    public final void method8754(final Class2281 class2281, final Class2281 class2282, final float n) {
        this.method8756(class2281, class2282, n);
    }
    
    @Deprecated
    public final void method8755(final Class2281 class2281, final float n) {
        this.method8757(class2281, n);
    }
    
    public final void method8756(final Class2281 class2281, final Class2281 class2282, final double n) {
        if (class2282.field13879 != class2281.field13879) {
            throw new Class2363(Class9531.method35584("GVector20"));
        }
        if (this.field13879 == class2281.field13879) {
            for (int i = 0; i < this.field13879; ++i) {
                this.field13880[i] = (1.0 - n) * class2281.field13880[i] + n * class2282.field13880[i];
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector21"));
    }
    
    public final void method8757(final Class2281 class2281, final double n) {
        if (class2281.field13879 == this.field13879) {
            for (int i = 0; i < this.field13879; ++i) {
                this.field13880[i] = (1.0 - n) * this.field13880[i] + n * class2281.field13880[i];
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GVector22"));
    }
    
    public Object clone() {
        Class2281 class2281;
        try {
            class2281 = (Class2281)super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
        class2281.field13880 = new double[this.field13879];
        System.arraycopy(this.field13880, 0, class2281.field13880, 0, this.field13879);
        return class2281;
    }
}
