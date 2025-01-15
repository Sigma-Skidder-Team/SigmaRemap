// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class2302 implements Serializable, Cloneable
{
    public static final long field13955 = -3555701650170169638L;
    public int field13956;
    public int field13957;
    
    public Class2302(final int field13956, final int field13957) {
        this.field13956 = field13956;
        this.field13957 = field13957;
    }
    
    public Class2302(final int[] array) {
        this.field13956 = array[0];
        this.field13957 = array[1];
    }
    
    public Class2302(final Class2302 class2302) {
        this.field13956 = class2302.field13956;
        this.field13957 = class2302.field13957;
    }
    
    public Class2302() {
        this.field13956 = 0;
        this.field13957 = 0;
    }
    
    public final void method9192(final int field13956, final int field13957) {
        this.field13956 = field13956;
        this.field13957 = field13957;
    }
    
    public final void method9193(final int[] array) {
        this.field13956 = array[0];
        this.field13957 = array[1];
    }
    
    public final void method9194(final Class2302 class2302) {
        this.field13956 = class2302.field13956;
        this.field13957 = class2302.field13957;
    }
    
    public final void method9195(final int[] array) {
        array[0] = this.field13956;
        array[1] = this.field13957;
    }
    
    public final void method9196(final Class2302 class2302) {
        class2302.field13956 = this.field13956;
        class2302.field13957 = this.field13957;
    }
    
    public final void method9197(final Class2302 class2302, final Class2302 class2303) {
        this.field13956 = class2302.field13956 + class2303.field13956;
        this.field13957 = class2302.field13957 + class2303.field13957;
    }
    
    public final void method9198(final Class2302 class2302) {
        this.field13956 += class2302.field13956;
        this.field13957 += class2302.field13957;
    }
    
    public final void method9199(final Class2302 class2302, final Class2302 class2303) {
        this.field13956 = class2302.field13956 - class2303.field13956;
        this.field13957 = class2302.field13957 - class2303.field13957;
    }
    
    public final void method9200(final Class2302 class2302) {
        this.field13956 -= class2302.field13956;
        this.field13957 -= class2302.field13957;
    }
    
    public final void method9201(final Class2302 class2302) {
        this.field13956 = -class2302.field13956;
        this.field13957 = -class2302.field13957;
    }
    
    public final void method9202() {
        this.field13956 = -this.field13956;
        this.field13957 = -this.field13957;
    }
    
    public final void method9203(final int n, final Class2302 class2302) {
        this.field13956 = n * class2302.field13956;
        this.field13957 = n * class2302.field13957;
    }
    
    public final void method9204(final int n) {
        this.field13956 *= n;
        this.field13957 *= n;
    }
    
    public final void method9205(final int n, final Class2302 class2302, final Class2302 class2303) {
        this.field13956 = n * class2302.field13956 + class2303.field13956;
        this.field13957 = n * class2302.field13957 + class2303.field13957;
    }
    
    public final void method9206(final int n, final Class2302 class2302) {
        this.field13956 = n * this.field13956 + class2302.field13956;
        this.field13957 = n * this.field13957 + class2302.field13957;
    }
    
    @Override
    public String toString() {
        return "(" + this.field13956 + ", " + this.field13957 + ")";
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2302 class2302 = (Class2302)o;
            return this.field13956 == class2302.field13956 && this.field13957 == class2302.field13957;
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
        final long n = 31L * (31L * 1L + this.field13956) + this.field13957;
        return (int)(n ^ n >> 32);
    }
    
    public final void method9207(final int n, final int n2, final Class2302 class2302) {
        if (class2302.field13956 <= n2) {
            if (class2302.field13956 >= n) {
                this.field13956 = class2302.field13956;
            }
            else {
                this.field13956 = n;
            }
        }
        else {
            this.field13956 = n2;
        }
        if (class2302.field13957 <= n2) {
            if (class2302.field13957 >= n) {
                this.field13957 = class2302.field13957;
            }
            else {
                this.field13957 = n;
            }
        }
        else {
            this.field13957 = n2;
        }
    }
    
    public final void method9208(final int n, final Class2302 class2302) {
        if (class2302.field13956 >= n) {
            this.field13956 = class2302.field13956;
        }
        else {
            this.field13956 = n;
        }
        if (class2302.field13957 >= n) {
            this.field13957 = class2302.field13957;
        }
        else {
            this.field13957 = n;
        }
    }
    
    public final void method9209(final int n, final Class2302 class2302) {
        if (class2302.field13956 <= n) {
            this.field13956 = class2302.field13956;
        }
        else {
            this.field13956 = n;
        }
        if (class2302.field13957 <= n) {
            this.field13957 = class2302.field13957;
        }
        else {
            this.field13957 = n;
        }
    }
    
    public final void method9210(final Class2302 class2302) {
        this.field13956 = Math.abs(class2302.field13956);
        this.field13957 = Math.abs(class2302.field13957);
    }
    
    public final void method9211(final int n, final int n2) {
        if (this.field13956 <= n2) {
            if (this.field13956 < n) {
                this.field13956 = n;
            }
        }
        else {
            this.field13956 = n2;
        }
        if (this.field13957 <= n2) {
            if (this.field13957 < n) {
                this.field13957 = n;
            }
        }
        else {
            this.field13957 = n2;
        }
    }
    
    public final void method9212(final int n) {
        if (this.field13956 < n) {
            this.field13956 = n;
        }
        if (this.field13957 < n) {
            this.field13957 = n;
        }
    }
    
    public final void method9213(final int n) {
        if (this.field13956 > n) {
            this.field13956 = n;
        }
        if (this.field13957 > n) {
            this.field13957 = n;
        }
    }
    
    public final void method9214() {
        this.field13956 = Math.abs(this.field13956);
        this.field13957 = Math.abs(this.field13957);
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final int method9215() {
        return this.field13956;
    }
    
    public final void method9216(final int field13956) {
        this.field13956 = field13956;
    }
    
    public final int method9217() {
        return this.field13957;
    }
    
    public final void method9218(final int field13957) {
        this.field13957 = field13957;
    }
}
