// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class2297 implements Serializable, Cloneable
{
    public static final long field13945 = 6205762482756093838L;
    public double field13946;
    public double field13947;
    
    public Class2297(final double field13946, final double field13947) {
        this.field13946 = field13946;
        this.field13947 = field13947;
    }
    
    public Class2297(final double[] array) {
        this.field13946 = array[0];
        this.field13947 = array[1];
    }
    
    public Class2297(final Class2297 class2297) {
        this.field13946 = class2297.field13946;
        this.field13947 = class2297.field13947;
    }
    
    public Class2297(final Class2290 class2290) {
        this.field13946 = class2290.field13920;
        this.field13947 = class2290.field13921;
    }
    
    public Class2297() {
        this.field13946 = 0.0;
        this.field13947 = 0.0;
    }
    
    public final void method9140(final double field13946, final double field13947) {
        this.field13946 = field13946;
        this.field13947 = field13947;
    }
    
    public final void method9141(final double[] array) {
        this.field13946 = array[0];
        this.field13947 = array[1];
    }
    
    public final void method9142(final Class2297 class2297) {
        this.field13946 = class2297.field13946;
        this.field13947 = class2297.field13947;
    }
    
    public final void method9143(final Class2290 class2290) {
        this.field13946 = class2290.field13920;
        this.field13947 = class2290.field13921;
    }
    
    public final void method9144(final double[] array) {
        array[0] = this.field13946;
        array[1] = this.field13947;
    }
    
    public final void method9145(final Class2297 class2297, final Class2297 class2298) {
        this.field13946 = class2297.field13946 + class2298.field13946;
        this.field13947 = class2297.field13947 + class2298.field13947;
    }
    
    public final void method9146(final Class2297 class2297) {
        this.field13946 += class2297.field13946;
        this.field13947 += class2297.field13947;
    }
    
    public final void method9147(final Class2297 class2297, final Class2297 class2298) {
        this.field13946 = class2297.field13946 - class2298.field13946;
        this.field13947 = class2297.field13947 - class2298.field13947;
    }
    
    public final void method9148(final Class2297 class2297) {
        this.field13946 -= class2297.field13946;
        this.field13947 -= class2297.field13947;
    }
    
    public final void method9149(final Class2297 class2297) {
        this.field13946 = -class2297.field13946;
        this.field13947 = -class2297.field13947;
    }
    
    public final void method9150() {
        this.field13946 = -this.field13946;
        this.field13947 = -this.field13947;
    }
    
    public final void method9151(final double n, final Class2297 class2297) {
        this.field13946 = n * class2297.field13946;
        this.field13947 = n * class2297.field13947;
    }
    
    public final void method9152(final double n) {
        this.field13946 *= n;
        this.field13947 *= n;
    }
    
    public final void method9153(final double n, final Class2297 class2297, final Class2297 class2298) {
        this.field13946 = n * class2297.field13946 + class2298.field13946;
        this.field13947 = n * class2297.field13947 + class2298.field13947;
    }
    
    public final void method9154(final double n, final Class2297 class2297) {
        this.field13946 = n * this.field13946 + class2297.field13946;
        this.field13947 = n * this.field13947 + class2297.field13947;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L + Class9427.method35031(this.field13946)) + Class9427.method35031(this.field13947);
        return (int)(n ^ n >> 32);
    }
    
    public boolean equals(final Class2297 class2297) {
        try {
            return this.field13946 == class2297.field13946 && this.field13947 == class2297.field13947;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2297 class2297 = (Class2297)o;
            return this.field13946 == class2297.field13946 && this.field13947 == class2297.field13947;
        }
        catch (final NullPointerException ex) {
            return false;
        }
        catch (final ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean method9155(final Class2297 class2297, final double n) {
        final double v = this.field13946 - class2297.field13946;
        if (Double.isNaN(v)) {
            return false;
        }
        if (((v >= 0.0) ? v : (-v)) <= n) {
            final double v2 = this.field13947 - class2297.field13947;
            return !Double.isNaN(v2) && ((v2 >= 0.0) ? v2 : (-v2)) <= n;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "(" + this.field13946 + ", " + this.field13947 + ")";
    }
    
    public final void method9156(final double n, final double n2, final Class2297 class2297) {
        if (class2297.field13946 <= n2) {
            if (class2297.field13946 >= n) {
                this.field13946 = class2297.field13946;
            }
            else {
                this.field13946 = n;
            }
        }
        else {
            this.field13946 = n2;
        }
        if (class2297.field13947 <= n2) {
            if (class2297.field13947 >= n) {
                this.field13947 = class2297.field13947;
            }
            else {
                this.field13947 = n;
            }
        }
        else {
            this.field13947 = n2;
        }
    }
    
    public final void method9157(final double n, final Class2297 class2297) {
        if (class2297.field13946 >= n) {
            this.field13946 = class2297.field13946;
        }
        else {
            this.field13946 = n;
        }
        if (class2297.field13947 >= n) {
            this.field13947 = class2297.field13947;
        }
        else {
            this.field13947 = n;
        }
    }
    
    public final void method9158(final double n, final Class2297 class2297) {
        if (class2297.field13946 <= n) {
            this.field13946 = class2297.field13946;
        }
        else {
            this.field13946 = n;
        }
        if (class2297.field13947 <= n) {
            this.field13947 = class2297.field13947;
        }
        else {
            this.field13947 = n;
        }
    }
    
    public final void method9159(final Class2297 class2297) {
        this.field13946 = Math.abs(class2297.field13946);
        this.field13947 = Math.abs(class2297.field13947);
    }
    
    public final void method9160(final double n, final double n2) {
        if (this.field13946 <= n2) {
            if (this.field13946 < n) {
                this.field13946 = n;
            }
        }
        else {
            this.field13946 = n2;
        }
        if (this.field13947 <= n2) {
            if (this.field13947 < n) {
                this.field13947 = n;
            }
        }
        else {
            this.field13947 = n2;
        }
    }
    
    public final void method9161(final double n) {
        if (this.field13946 < n) {
            this.field13946 = n;
        }
        if (this.field13947 < n) {
            this.field13947 = n;
        }
    }
    
    public final void method9162(final double n) {
        if (this.field13946 > n) {
            this.field13946 = n;
        }
        if (this.field13947 > n) {
            this.field13947 = n;
        }
    }
    
    public final void method9163() {
        this.field13946 = Math.abs(this.field13946);
        this.field13947 = Math.abs(this.field13947);
    }
    
    public final void method9164(final Class2297 class2297, final Class2297 class2298, final double n) {
        this.field13946 = (1.0 - n) * class2297.field13946 + n * class2298.field13946;
        this.field13947 = (1.0 - n) * class2297.field13947 + n * class2298.field13947;
    }
    
    public final void method9165(final Class2297 class2297, final double n) {
        this.field13946 = (1.0 - n) * this.field13946 + n * class2297.field13946;
        this.field13947 = (1.0 - n) * this.field13947 + n * class2297.field13947;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final double method9166() {
        return this.field13946;
    }
    
    public final void method9167(final double field13946) {
        this.field13946 = field13946;
    }
    
    public final double method9168() {
        return this.field13947;
    }
    
    public final void method9169(final double field13947) {
        this.field13947 = field13947;
    }
}
