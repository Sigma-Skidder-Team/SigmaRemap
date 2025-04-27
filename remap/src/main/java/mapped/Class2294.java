// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class2294 implements Serializable, Cloneable
{
    public static final long field13927 = 8064614250942616720L;
    public int field13928;
    public int field13929;
    public int field13930;
    public int field13931;
    
    public Class2294(final int field13928, final int field13929, final int field13930, final int field13931) {
        this.field13928 = field13928;
        this.field13929 = field13929;
        this.field13930 = field13930;
        this.field13931 = field13931;
    }
    
    public Class2294(final int[] array) {
        this.field13928 = array[0];
        this.field13929 = array[1];
        this.field13930 = array[2];
        this.field13931 = array[3];
    }
    
    public Class2294(final Class2294 class2294) {
        this.field13928 = class2294.field13928;
        this.field13929 = class2294.field13929;
        this.field13930 = class2294.field13930;
        this.field13931 = class2294.field13931;
    }
    
    public Class2294() {
        this.field13928 = 0;
        this.field13929 = 0;
        this.field13930 = 0;
        this.field13931 = 0;
    }
    
    public final void method9031(final int field13928, final int field13929, final int field13930, final int field13931) {
        this.field13928 = field13928;
        this.field13929 = field13929;
        this.field13930 = field13930;
        this.field13931 = field13931;
    }
    
    public final void method9032(final int[] array) {
        this.field13928 = array[0];
        this.field13929 = array[1];
        this.field13930 = array[2];
        this.field13931 = array[3];
    }
    
    public final void method9033(final Class2294 class2294) {
        this.field13928 = class2294.field13928;
        this.field13929 = class2294.field13929;
        this.field13930 = class2294.field13930;
        this.field13931 = class2294.field13931;
    }
    
    public final void method9034(final int[] array) {
        array[0] = this.field13928;
        array[1] = this.field13929;
        array[2] = this.field13930;
        array[3] = this.field13931;
    }
    
    public final void method9035(final Class2294 class2294) {
        class2294.field13928 = this.field13928;
        class2294.field13929 = this.field13929;
        class2294.field13930 = this.field13930;
        class2294.field13931 = this.field13931;
    }
    
    public final void method9036(final Class2294 class2294, final Class2294 class2295) {
        this.field13928 = class2294.field13928 + class2295.field13928;
        this.field13929 = class2294.field13929 + class2295.field13929;
        this.field13930 = class2294.field13930 + class2295.field13930;
        this.field13931 = class2294.field13931 + class2295.field13931;
    }
    
    public final void method9037(final Class2294 class2294) {
        this.field13928 += class2294.field13928;
        this.field13929 += class2294.field13929;
        this.field13930 += class2294.field13930;
        this.field13931 += class2294.field13931;
    }
    
    public final void method9038(final Class2294 class2294, final Class2294 class2295) {
        this.field13928 = class2294.field13928 - class2295.field13928;
        this.field13929 = class2294.field13929 - class2295.field13929;
        this.field13930 = class2294.field13930 - class2295.field13930;
        this.field13931 = class2294.field13931 - class2295.field13931;
    }
    
    public final void method9039(final Class2294 class2294) {
        this.field13928 -= class2294.field13928;
        this.field13929 -= class2294.field13929;
        this.field13930 -= class2294.field13930;
        this.field13931 -= class2294.field13931;
    }
    
    public final void method9040(final Class2294 class2294) {
        this.field13928 = -class2294.field13928;
        this.field13929 = -class2294.field13929;
        this.field13930 = -class2294.field13930;
        this.field13931 = -class2294.field13931;
    }
    
    public final void method9041() {
        this.field13928 = -this.field13928;
        this.field13929 = -this.field13929;
        this.field13930 = -this.field13930;
        this.field13931 = -this.field13931;
    }
    
    public final void method9042(final int n, final Class2294 class2294) {
        this.field13928 = n * class2294.field13928;
        this.field13929 = n * class2294.field13929;
        this.field13930 = n * class2294.field13930;
        this.field13931 = n * class2294.field13931;
    }
    
    public final void method9043(final int n) {
        this.field13928 *= n;
        this.field13929 *= n;
        this.field13930 *= n;
        this.field13931 *= n;
    }
    
    public final void method9044(final int n, final Class2294 class2294, final Class2294 class2295) {
        this.field13928 = n * class2294.field13928 + class2295.field13928;
        this.field13929 = n * class2294.field13929 + class2295.field13929;
        this.field13930 = n * class2294.field13930 + class2295.field13930;
        this.field13931 = n * class2294.field13931 + class2295.field13931;
    }
    
    public final void method9045(final int n, final Class2294 class2294) {
        this.field13928 = n * this.field13928 + class2294.field13928;
        this.field13929 = n * this.field13929 + class2294.field13929;
        this.field13930 = n * this.field13930 + class2294.field13930;
        this.field13931 = n * this.field13931 + class2294.field13931;
    }
    
    @Override
    public String toString() {
        return "(" + this.field13928 + ", " + this.field13929 + ", " + this.field13930 + ", " + this.field13931 + ")";
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2294 class2294 = (Class2294)o;
            return this.field13928 == class2294.field13928 && this.field13929 == class2294.field13929 && this.field13930 == class2294.field13930 && this.field13931 == class2294.field13931;
        }
        catch (final NullPointerException ex) {
            return false;
        }
        catch (final ClassCastException ex2) {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * (31L + this.field13928) + this.field13929) + this.field13930) + this.field13931;
        return (int)(n ^ n >> 32);
    }
    
    public final void method9046(final int n, final int n2, final Class2294 class2294) {
        if (class2294.field13928 <= n2) {
            if (class2294.field13928 >= n) {
                this.field13928 = class2294.field13928;
            }
            else {
                this.field13928 = n;
            }
        }
        else {
            this.field13928 = n2;
        }
        if (class2294.field13929 <= n2) {
            if (class2294.field13929 >= n) {
                this.field13929 = class2294.field13929;
            }
            else {
                this.field13929 = n;
            }
        }
        else {
            this.field13929 = n2;
        }
        if (class2294.field13930 <= n2) {
            if (class2294.field13930 >= n) {
                this.field13930 = class2294.field13930;
            }
            else {
                this.field13930 = n;
            }
        }
        else {
            this.field13930 = n2;
        }
        if (class2294.field13931 <= n2) {
            if (class2294.field13931 >= n) {
                this.field13931 = class2294.field13931;
            }
            else {
                this.field13931 = n;
            }
        }
        else {
            this.field13931 = n2;
        }
    }
    
    public final void method9047(final int n, final Class2294 class2294) {
        if (class2294.field13928 >= n) {
            this.field13928 = class2294.field13928;
        }
        else {
            this.field13928 = n;
        }
        if (class2294.field13929 >= n) {
            this.field13929 = class2294.field13929;
        }
        else {
            this.field13929 = n;
        }
        if (class2294.field13930 >= n) {
            this.field13930 = class2294.field13930;
        }
        else {
            this.field13930 = n;
        }
        if (class2294.field13931 >= n) {
            this.field13931 = class2294.field13931;
        }
        else {
            this.field13931 = n;
        }
    }
    
    public final void method9048(final int n, final Class2294 class2294) {
        if (class2294.field13928 <= n) {
            this.field13928 = class2294.field13928;
        }
        else {
            this.field13928 = n;
        }
        if (class2294.field13929 <= n) {
            this.field13929 = class2294.field13929;
        }
        else {
            this.field13929 = n;
        }
        if (class2294.field13930 <= n) {
            this.field13930 = class2294.field13930;
        }
        else {
            this.field13930 = n;
        }
        if (class2294.field13931 <= n) {
            this.field13931 = class2294.field13930;
        }
        else {
            this.field13931 = n;
        }
    }
    
    public final void method9049(final Class2294 class2294) {
        this.field13928 = Math.abs(class2294.field13928);
        this.field13929 = Math.abs(class2294.field13929);
        this.field13930 = Math.abs(class2294.field13930);
        this.field13931 = Math.abs(class2294.field13931);
    }
    
    public final void method9050(final int n, final int n2) {
        if (this.field13928 <= n2) {
            if (this.field13928 < n) {
                this.field13928 = n;
            }
        }
        else {
            this.field13928 = n2;
        }
        if (this.field13929 <= n2) {
            if (this.field13929 < n) {
                this.field13929 = n;
            }
        }
        else {
            this.field13929 = n2;
        }
        if (this.field13930 <= n2) {
            if (this.field13930 < n) {
                this.field13930 = n;
            }
        }
        else {
            this.field13930 = n2;
        }
        if (this.field13931 <= n2) {
            if (this.field13931 < n) {
                this.field13931 = n;
            }
        }
        else {
            this.field13931 = n2;
        }
    }
    
    public final void method9051(final int n) {
        if (this.field13928 < n) {
            this.field13928 = n;
        }
        if (this.field13929 < n) {
            this.field13929 = n;
        }
        if (this.field13930 < n) {
            this.field13930 = n;
        }
        if (this.field13931 < n) {
            this.field13931 = n;
        }
    }
    
    public final void method9052(final int n) {
        if (this.field13928 > n) {
            this.field13928 = n;
        }
        if (this.field13929 > n) {
            this.field13929 = n;
        }
        if (this.field13930 > n) {
            this.field13930 = n;
        }
        if (this.field13931 > n) {
            this.field13931 = n;
        }
    }
    
    public final void method9053() {
        this.field13928 = Math.abs(this.field13928);
        this.field13929 = Math.abs(this.field13929);
        this.field13930 = Math.abs(this.field13930);
        this.field13931 = Math.abs(this.field13931);
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final int method9054() {
        return this.field13928;
    }
    
    public final void method9055(final int field13928) {
        this.field13928 = field13928;
    }
    
    public final int method9056() {
        return this.field13929;
    }
    
    public final void method9057(final int field13929) {
        this.field13929 = field13929;
    }
    
    public final int method9058() {
        return this.field13930;
    }
    
    public final void method9059(final int field13930) {
        this.field13930 = field13930;
    }
    
    public final int method9060() {
        return this.field13931;
    }
    
    public final void method9061(final int field13931) {
        this.field13931 = field13931;
    }
}
