// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class7 implements Serializable, Cloneable
{
    public static final long field17 = -4748953690425311052L;
    public double field18;
    public double field19;
    public double field20;
    public double field21;
    
    public Class7(final double field18, final double field19, final double field20, final double field21) {
        this.field18 = field18;
        this.field19 = field19;
        this.field20 = field20;
        this.field21 = field21;
    }
    
    public Class7(final double[] array) {
        this.field18 = array[0];
        this.field19 = array[1];
        this.field20 = array[2];
        this.field21 = array[3];
    }
    
    public Class7(final Class7 class7) {
        this.field18 = class7.field18;
        this.field19 = class7.field19;
        this.field20 = class7.field20;
        this.field21 = class7.field21;
    }
    
    public Class7(final Class2275 class2275) {
        this.field18 = class2275.field13863;
        this.field19 = class2275.field13864;
        this.field20 = class2275.field13865;
        this.field21 = class2275.field13866;
    }
    
    public Class7() {
        this.field18 = 0.0;
        this.field19 = 0.0;
        this.field20 = 0.0;
        this.field21 = 0.0;
    }
    
    public final void method43(final double field18, final double field19, final double field20, final double field21) {
        this.field18 = field18;
        this.field19 = field19;
        this.field20 = field20;
        this.field21 = field21;
    }
    
    public final void method44(final double[] array) {
        this.field18 = array[0];
        this.field19 = array[1];
        this.field20 = array[2];
        this.field21 = array[3];
    }
    
    public final void method45(final Class7 class7) {
        this.field18 = class7.field18;
        this.field19 = class7.field19;
        this.field20 = class7.field20;
        this.field21 = class7.field21;
    }
    
    public final void method46(final Class2275 class2275) {
        this.field18 = class2275.field13863;
        this.field19 = class2275.field13864;
        this.field20 = class2275.field13865;
        this.field21 = class2275.field13866;
    }
    
    public final void method47(final double[] array) {
        array[0] = this.field18;
        array[1] = this.field19;
        array[2] = this.field20;
        array[3] = this.field21;
    }
    
    public final void method48(final Class7 class7) {
        class7.field18 = this.field18;
        class7.field19 = this.field19;
        class7.field20 = this.field20;
        class7.field21 = this.field21;
    }
    
    public final void method49(final Class7 class7, final Class7 class8) {
        this.field18 = class7.field18 + class8.field18;
        this.field19 = class7.field19 + class8.field19;
        this.field20 = class7.field20 + class8.field20;
        this.field21 = class7.field21 + class8.field21;
    }
    
    public final void method50(final Class7 class7) {
        this.field18 += class7.field18;
        this.field19 += class7.field19;
        this.field20 += class7.field20;
        this.field21 += class7.field21;
    }
    
    public final void method51(final Class7 class7, final Class7 class8) {
        this.field18 = class7.field18 - class8.field18;
        this.field19 = class7.field19 - class8.field19;
        this.field20 = class7.field20 - class8.field20;
        this.field21 = class7.field21 - class8.field21;
    }
    
    public final void method52(final Class7 class7) {
        this.field18 -= class7.field18;
        this.field19 -= class7.field19;
        this.field20 -= class7.field20;
        this.field21 -= class7.field21;
    }
    
    public final void method53(final Class7 class7) {
        this.field18 = -class7.field18;
        this.field19 = -class7.field19;
        this.field20 = -class7.field20;
        this.field21 = -class7.field21;
    }
    
    public final void method54() {
        this.field18 = -this.field18;
        this.field19 = -this.field19;
        this.field20 = -this.field20;
        this.field21 = -this.field21;
    }
    
    public final void method55(final double n, final Class7 class7) {
        this.field18 = n * class7.field18;
        this.field19 = n * class7.field19;
        this.field20 = n * class7.field20;
        this.field21 = n * class7.field21;
    }
    
    public final void method56(final double n) {
        this.field18 *= n;
        this.field19 *= n;
        this.field20 *= n;
        this.field21 *= n;
    }
    
    public final void method57(final double n, final Class7 class7, final Class7 class8) {
        this.field18 = n * class7.field18 + class8.field18;
        this.field19 = n * class7.field19 + class8.field19;
        this.field20 = n * class7.field20 + class8.field20;
        this.field21 = n * class7.field21 + class8.field21;
    }
    
    @Deprecated
    public final void method58(final float n, final Class7 class7) {
        this.method59(n, class7);
    }
    
    public final void method59(final double n, final Class7 class7) {
        this.field18 = n * this.field18 + class7.field18;
        this.field19 = n * this.field19 + class7.field19;
        this.field20 = n * this.field20 + class7.field20;
        this.field21 = n * this.field21 + class7.field21;
    }
    
    @Override
    public String toString() {
        return "(" + this.field18 + ", " + this.field19 + ", " + this.field20 + ", " + this.field21 + ")";
    }
    
    public boolean equals(final Class7 class7) {
        try {
            return this.field18 == class7.field18 && this.field19 == class7.field19 && this.field20 == class7.field20 && this.field21 == class7.field21;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class7 class7 = (Class7)o;
            return this.field18 == class7.field18 && this.field19 == class7.field19 && this.field20 == class7.field20 && this.field21 == class7.field21;
        }
        catch (final NullPointerException ex) {
            return false;
        }
        catch (final ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean method60(final Class7 class7, final double n) {
        final double v = this.field18 - class7.field18;
        if (Double.isNaN(v)) {
            return false;
        }
        if (((v >= 0.0) ? v : (-v)) > n) {
            return false;
        }
        final double v2 = this.field19 - class7.field19;
        if (Double.isNaN(v2)) {
            return false;
        }
        if (((v2 >= 0.0) ? v2 : (-v2)) > n) {
            return false;
        }
        final double v3 = this.field20 - class7.field20;
        if (Double.isNaN(v3)) {
            return false;
        }
        if (((v3 >= 0.0) ? v3 : (-v3)) <= n) {
            final double v4 = this.field21 - class7.field21;
            return !Double.isNaN(v4) && ((v4 >= 0.0) ? v4 : (-v4)) <= n;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * (31L * 1L + Class9427.method35031(this.field18)) + Class9427.method35031(this.field19)) + Class9427.method35031(this.field20)) + Class9427.method35031(this.field21);
        return (int)(n ^ n >> 32);
    }
    
    @Deprecated
    public final void method61(final float n, final float n2, final Class7 class7) {
        this.method62(n, n2, class7);
    }
    
    public final void method62(final double n, final double n2, final Class7 class7) {
        if (class7.field18 <= n2) {
            if (class7.field18 >= n) {
                this.field18 = class7.field18;
            }
            else {
                this.field18 = n;
            }
        }
        else {
            this.field18 = n2;
        }
        if (class7.field19 <= n2) {
            if (class7.field19 >= n) {
                this.field19 = class7.field19;
            }
            else {
                this.field19 = n;
            }
        }
        else {
            this.field19 = n2;
        }
        if (class7.field20 <= n2) {
            if (class7.field20 >= n) {
                this.field20 = class7.field20;
            }
            else {
                this.field20 = n;
            }
        }
        else {
            this.field20 = n2;
        }
        if (class7.field21 <= n2) {
            if (class7.field21 >= n) {
                this.field21 = class7.field21;
            }
            else {
                this.field21 = n;
            }
        }
        else {
            this.field21 = n2;
        }
    }
    
    @Deprecated
    public final void method63(final float n, final Class7 class7) {
        this.method64(n, class7);
    }
    
    public final void method64(final double n, final Class7 class7) {
        if (class7.field18 >= n) {
            this.field18 = class7.field18;
        }
        else {
            this.field18 = n;
        }
        if (class7.field19 >= n) {
            this.field19 = class7.field19;
        }
        else {
            this.field19 = n;
        }
        if (class7.field20 >= n) {
            this.field20 = class7.field20;
        }
        else {
            this.field20 = n;
        }
        if (class7.field21 >= n) {
            this.field21 = class7.field21;
        }
        else {
            this.field21 = n;
        }
    }
    
    @Deprecated
    public final void method65(final float n, final Class7 class7) {
        this.method66(n, class7);
    }
    
    public final void method66(final double n, final Class7 class7) {
        if (class7.field18 <= n) {
            this.field18 = class7.field18;
        }
        else {
            this.field18 = n;
        }
        if (class7.field19 <= n) {
            this.field19 = class7.field19;
        }
        else {
            this.field19 = n;
        }
        if (class7.field20 <= n) {
            this.field20 = class7.field20;
        }
        else {
            this.field20 = n;
        }
        if (class7.field21 <= n) {
            this.field21 = class7.field20;
        }
        else {
            this.field21 = n;
        }
    }
    
    public final void method67(final Class7 class7) {
        this.field18 = Math.abs(class7.field18);
        this.field19 = Math.abs(class7.field19);
        this.field20 = Math.abs(class7.field20);
        this.field21 = Math.abs(class7.field21);
    }
    
    @Deprecated
    public final void method68(final float n, final float n2) {
        this.method69(n, n2);
    }
    
    public final void method69(final double n, final double n2) {
        if (this.field18 <= n2) {
            if (this.field18 < n) {
                this.field18 = n;
            }
        }
        else {
            this.field18 = n2;
        }
        if (this.field19 <= n2) {
            if (this.field19 < n) {
                this.field19 = n;
            }
        }
        else {
            this.field19 = n2;
        }
        if (this.field20 <= n2) {
            if (this.field20 < n) {
                this.field20 = n;
            }
        }
        else {
            this.field20 = n2;
        }
        if (this.field21 <= n2) {
            if (this.field21 < n) {
                this.field21 = n;
            }
        }
        else {
            this.field21 = n2;
        }
    }
    
    @Deprecated
    public final void method70(final float n) {
        this.method71(n);
    }
    
    public final void method71(final double n) {
        if (this.field18 < n) {
            this.field18 = n;
        }
        if (this.field19 < n) {
            this.field19 = n;
        }
        if (this.field20 < n) {
            this.field20 = n;
        }
        if (this.field21 < n) {
            this.field21 = n;
        }
    }
    
    @Deprecated
    public final void method72(final float n) {
        this.method73(n);
    }
    
    public final void method73(final double n) {
        if (this.field18 > n) {
            this.field18 = n;
        }
        if (this.field19 > n) {
            this.field19 = n;
        }
        if (this.field20 > n) {
            this.field20 = n;
        }
        if (this.field21 > n) {
            this.field21 = n;
        }
    }
    
    public final void method74() {
        this.field18 = Math.abs(this.field18);
        this.field19 = Math.abs(this.field19);
        this.field20 = Math.abs(this.field20);
        this.field21 = Math.abs(this.field21);
    }
    
    @Deprecated
    public void method75(final Class7 class7, final Class7 class8, final float n) {
        this.method76(class7, class8, n);
    }
    
    public void method76(final Class7 class7, final Class7 class8, final double n) {
        this.field18 = (1.0 - n) * class7.field18 + n * class8.field18;
        this.field19 = (1.0 - n) * class7.field19 + n * class8.field19;
        this.field20 = (1.0 - n) * class7.field20 + n * class8.field20;
        this.field21 = (1.0 - n) * class7.field21 + n * class8.field21;
    }
    
    @Deprecated
    public void method77(final Class7 class7, final float n) {
        this.method78(class7, n);
    }
    
    public void method78(final Class7 class7, final double n) {
        this.field18 = (1.0 - n) * this.field18 + n * class7.field18;
        this.field19 = (1.0 - n) * this.field19 + n * class7.field19;
        this.field20 = (1.0 - n) * this.field20 + n * class7.field20;
        this.field21 = (1.0 - n) * this.field21 + n * class7.field21;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final double method79() {
        return this.field18;
    }
    
    public final void method80(final double field18) {
        this.field18 = field18;
    }
    
    public final double method81() {
        return this.field19;
    }
    
    public final void method82(final double field19) {
        this.field19 = field19;
    }
    
    public final double method83() {
        return this.field20;
    }
    
    public final void method84(final double field20) {
        this.field20 = field20;
    }
    
    public final double method85() {
        return this.field21;
    }
    
    public final void method86(final double field21) {
        this.field21 = field21;
    }
}
