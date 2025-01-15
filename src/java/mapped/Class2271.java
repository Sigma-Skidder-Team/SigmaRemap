// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class2271 implements Serializable, Cloneable
{
    public static final long field13838 = 5542096614926168415L;
    public double field13839;
    public double field13840;
    public double field13841;
    
    public Class2271(final double field13839, final double field13840, final double field13841) {
        this.field13839 = field13839;
        this.field13840 = field13840;
        this.field13841 = field13841;
    }
    
    public Class2271(final double[] array) {
        this.field13839 = array[0];
        this.field13840 = array[1];
        this.field13841 = array[2];
    }
    
    public Class2271(final Class2271 class2271) {
        this.field13839 = class2271.field13839;
        this.field13840 = class2271.field13840;
        this.field13841 = class2271.field13841;
    }
    
    public Class2271(final Class2285 class2285) {
        this.field13839 = class2285.field13909;
        this.field13840 = class2285.field13910;
        this.field13841 = class2285.field13911;
    }
    
    public Class2271() {
        this.field13839 = 0.0;
        this.field13840 = 0.0;
        this.field13841 = 0.0;
    }
    
    public final void method8509(final double field13839, final double field13840, final double field13841) {
        this.field13839 = field13839;
        this.field13840 = field13840;
        this.field13841 = field13841;
    }
    
    public final void method8510(final double[] array) {
        this.field13839 = array[0];
        this.field13840 = array[1];
        this.field13841 = array[2];
    }
    
    public final void method8511(final Class2271 class2271) {
        this.field13839 = class2271.field13839;
        this.field13840 = class2271.field13840;
        this.field13841 = class2271.field13841;
    }
    
    public final void method8512(final Class2285 class2285) {
        this.field13839 = class2285.field13909;
        this.field13840 = class2285.field13910;
        this.field13841 = class2285.field13911;
    }
    
    public final void method8513(final double[] array) {
        array[0] = this.field13839;
        array[1] = this.field13840;
        array[2] = this.field13841;
    }
    
    public final void method8514(final Class2271 class2271) {
        class2271.field13839 = this.field13839;
        class2271.field13840 = this.field13840;
        class2271.field13841 = this.field13841;
    }
    
    public final void method8515(final Class2271 class2271, final Class2271 class2272) {
        this.field13839 = class2271.field13839 + class2272.field13839;
        this.field13840 = class2271.field13840 + class2272.field13840;
        this.field13841 = class2271.field13841 + class2272.field13841;
    }
    
    public final void method8516(final Class2271 class2271) {
        this.field13839 += class2271.field13839;
        this.field13840 += class2271.field13840;
        this.field13841 += class2271.field13841;
    }
    
    public final void method8517(final Class2271 class2271, final Class2271 class2272) {
        this.field13839 = class2271.field13839 - class2272.field13839;
        this.field13840 = class2271.field13840 - class2272.field13840;
        this.field13841 = class2271.field13841 - class2272.field13841;
    }
    
    public final void method8518(final Class2271 class2271) {
        this.field13839 -= class2271.field13839;
        this.field13840 -= class2271.field13840;
        this.field13841 -= class2271.field13841;
    }
    
    public final void method8519(final Class2271 class2271) {
        this.field13839 = -class2271.field13839;
        this.field13840 = -class2271.field13840;
        this.field13841 = -class2271.field13841;
    }
    
    public final void method8520() {
        this.field13839 = -this.field13839;
        this.field13840 = -this.field13840;
        this.field13841 = -this.field13841;
    }
    
    public final void method8521(final double n, final Class2271 class2271) {
        this.field13839 = n * class2271.field13839;
        this.field13840 = n * class2271.field13840;
        this.field13841 = n * class2271.field13841;
    }
    
    public final void method8522(final double n) {
        this.field13839 *= n;
        this.field13840 *= n;
        this.field13841 *= n;
    }
    
    public final void method8523(final double n, final Class2271 class2271, final Class2271 class2272) {
        this.field13839 = n * class2271.field13839 + class2272.field13839;
        this.field13840 = n * class2271.field13840 + class2272.field13840;
        this.field13841 = n * class2271.field13841 + class2272.field13841;
    }
    
    @Deprecated
    public final void method8524(final double n, final Class2285 class2285) {
        this.method8525(n, new Class2272(class2285));
    }
    
    public final void method8525(final double n, final Class2271 class2271) {
        this.field13839 = n * this.field13839 + class2271.field13839;
        this.field13840 = n * this.field13840 + class2271.field13840;
        this.field13841 = n * this.field13841 + class2271.field13841;
    }
    
    @Override
    public String toString() {
        return "(" + this.field13839 + ", " + this.field13840 + ", " + this.field13841 + ")";
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * 1L + Class9427.method35031(this.field13839)) + Class9427.method35031(this.field13840)) + Class9427.method35031(this.field13841);
        return (int)(n ^ n >> 32);
    }
    
    public boolean equals(final Class2271 class2271) {
        try {
            return this.field13839 == class2271.field13839 && this.field13840 == class2271.field13840 && this.field13841 == class2271.field13841;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2271 class2271 = (Class2271)o;
            return this.field13839 == class2271.field13839 && this.field13840 == class2271.field13840 && this.field13841 == class2271.field13841;
        }
        catch (final ClassCastException ex) {
            return false;
        }
        catch (final NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean method8526(final Class2271 class2271, final double n) {
        final double v = this.field13839 - class2271.field13839;
        if (Double.isNaN(v)) {
            return false;
        }
        if (((v >= 0.0) ? v : (-v)) > n) {
            return false;
        }
        final double v2 = this.field13840 - class2271.field13840;
        if (Double.isNaN(v2)) {
            return false;
        }
        if (((v2 >= 0.0) ? v2 : (-v2)) <= n) {
            final double v3 = this.field13841 - class2271.field13841;
            return !Double.isNaN(v3) && ((v3 >= 0.0) ? v3 : (-v3)) <= n;
        }
        return false;
    }
    
    @Deprecated
    public final void method8527(final float n, final float n2, final Class2271 class2271) {
        this.method8528(n, n2, class2271);
    }
    
    public final void method8528(final double field13841, final double field13842, final Class2271 class2271) {
        if (class2271.field13839 <= field13842) {
            if (class2271.field13839 >= field13841) {
                this.field13839 = class2271.field13839;
            }
            else {
                this.field13839 = field13841;
            }
        }
        else {
            this.field13839 = field13842;
        }
        if (class2271.field13840 <= field13842) {
            if (class2271.field13840 >= field13841) {
                this.field13840 = class2271.field13840;
            }
            else {
                this.field13840 = field13841;
            }
        }
        else {
            this.field13840 = field13842;
        }
        if (class2271.field13841 <= field13842) {
            if (class2271.field13841 >= field13841) {
                this.field13841 = class2271.field13841;
            }
            else {
                this.field13841 = field13841;
            }
        }
        else {
            this.field13841 = field13842;
        }
    }
    
    @Deprecated
    public final void method8529(final float n, final Class2271 class2271) {
        this.method8530(n, class2271);
    }
    
    public final void method8530(final double field13841, final Class2271 class2271) {
        if (class2271.field13839 >= field13841) {
            this.field13839 = class2271.field13839;
        }
        else {
            this.field13839 = field13841;
        }
        if (class2271.field13840 >= field13841) {
            this.field13840 = class2271.field13840;
        }
        else {
            this.field13840 = field13841;
        }
        if (class2271.field13841 >= field13841) {
            this.field13841 = class2271.field13841;
        }
        else {
            this.field13841 = field13841;
        }
    }
    
    @Deprecated
    public final void method8531(final float n, final Class2271 class2271) {
        this.method8532(n, class2271);
    }
    
    public final void method8532(final double field13841, final Class2271 class2271) {
        if (class2271.field13839 <= field13841) {
            this.field13839 = class2271.field13839;
        }
        else {
            this.field13839 = field13841;
        }
        if (class2271.field13840 <= field13841) {
            this.field13840 = class2271.field13840;
        }
        else {
            this.field13840 = field13841;
        }
        if (class2271.field13841 <= field13841) {
            this.field13841 = class2271.field13841;
        }
        else {
            this.field13841 = field13841;
        }
    }
    
    public final void method8533(final Class2271 class2271) {
        this.field13839 = Math.abs(class2271.field13839);
        this.field13840 = Math.abs(class2271.field13840);
        this.field13841 = Math.abs(class2271.field13841);
    }
    
    @Deprecated
    public final void method8534(final float n, final float n2) {
        this.method8535(n, n2);
    }
    
    public final void method8535(final double field13841, final double field13842) {
        if (this.field13839 <= field13842) {
            if (this.field13839 < field13841) {
                this.field13839 = field13841;
            }
        }
        else {
            this.field13839 = field13842;
        }
        if (this.field13840 <= field13842) {
            if (this.field13840 < field13841) {
                this.field13840 = field13841;
            }
        }
        else {
            this.field13840 = field13842;
        }
        if (this.field13841 <= field13842) {
            if (this.field13841 < field13841) {
                this.field13841 = field13841;
            }
        }
        else {
            this.field13841 = field13842;
        }
    }
    
    @Deprecated
    public final void method8536(final float n) {
        this.method8537(n);
    }
    
    public final void method8537(final double field13841) {
        if (this.field13839 < field13841) {
            this.field13839 = field13841;
        }
        if (this.field13840 < field13841) {
            this.field13840 = field13841;
        }
        if (this.field13841 < field13841) {
            this.field13841 = field13841;
        }
    }
    
    @Deprecated
    public final void method8538(final float n) {
        this.method8539(n);
    }
    
    public final void method8539(final double field13841) {
        if (this.field13839 > field13841) {
            this.field13839 = field13841;
        }
        if (this.field13840 > field13841) {
            this.field13840 = field13841;
        }
        if (this.field13841 > field13841) {
            this.field13841 = field13841;
        }
    }
    
    public final void method8540() {
        this.field13839 = Math.abs(this.field13839);
        this.field13840 = Math.abs(this.field13840);
        this.field13841 = Math.abs(this.field13841);
    }
    
    @Deprecated
    public final void method8541(final Class2271 class2271, final Class2271 class2272, final float n) {
        this.method8542(class2271, class2272, n);
    }
    
    public final void method8542(final Class2271 class2271, final Class2271 class2272, final double n) {
        this.field13839 = (1.0 - n) * class2271.field13839 + n * class2272.field13839;
        this.field13840 = (1.0 - n) * class2271.field13840 + n * class2272.field13840;
        this.field13841 = (1.0 - n) * class2271.field13841 + n * class2272.field13841;
    }
    
    @Deprecated
    public final void method8543(final Class2271 class2271, final float n) {
        this.method8544(class2271, n);
    }
    
    public final void method8544(final Class2271 class2271, final double n) {
        this.field13839 = (1.0 - n) * this.field13839 + n * class2271.field13839;
        this.field13840 = (1.0 - n) * this.field13840 + n * class2271.field13840;
        this.field13841 = (1.0 - n) * this.field13841 + n * class2271.field13841;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final double method8545() {
        return this.field13839;
    }
    
    public final void method8546(final double field13839) {
        this.field13839 = field13839;
    }
    
    public final double method8547() {
        return this.field13840;
    }
    
    public final void method8548(final double field13840) {
        this.field13840 = field13840;
    }
    
    public final double method8549() {
        return this.field13841;
    }
    
    public final void method8550(final double field13841) {
        this.field13841 = field13841;
    }
}
