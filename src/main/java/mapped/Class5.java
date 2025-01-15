// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class5 implements Serializable, Cloneable
{
    public static final long field11 = -732740491767276200L;
    public int field12;
    public int field13;
    public int field14;
    
    public Class5(final int field12, final int field13, final int field14) {
        this.field12 = field12;
        this.field13 = field13;
        this.field14 = field14;
    }
    
    public Class5(final int[] array) {
        this.field12 = array[0];
        this.field13 = array[1];
        this.field14 = array[2];
    }
    
    public Class5(final Class5 class5) {
        this.field12 = class5.field12;
        this.field13 = class5.field13;
        this.field14 = class5.field14;
    }
    
    public Class5() {
        this.field12 = 0;
        this.field13 = 0;
        this.field14 = 0;
    }
    
    public final void method14(final int field12, final int field13, final int field14) {
        this.field12 = field12;
        this.field13 = field13;
        this.field14 = field14;
    }
    
    public final void method15(final int[] array) {
        this.field12 = array[0];
        this.field13 = array[1];
        this.field14 = array[2];
    }
    
    public final void method16(final Class5 class5) {
        this.field12 = class5.field12;
        this.field13 = class5.field13;
        this.field14 = class5.field14;
    }
    
    public final void method17(final int[] array) {
        array[0] = this.field12;
        array[1] = this.field13;
        array[2] = this.field14;
    }
    
    public final void method18(final Class5 class5) {
        class5.field12 = this.field12;
        class5.field13 = this.field13;
        class5.field14 = this.field14;
    }
    
    public final void method19(final Class5 class5, final Class5 class6) {
        this.field12 = class5.field12 + class6.field12;
        this.field13 = class5.field13 + class6.field13;
        this.field14 = class5.field14 + class6.field14;
    }
    
    public final void method20(final Class5 class5) {
        this.field12 += class5.field12;
        this.field13 += class5.field13;
        this.field14 += class5.field14;
    }
    
    public final void method21(final Class5 class5, final Class5 class6) {
        this.field12 = class5.field12 - class6.field12;
        this.field13 = class5.field13 - class6.field13;
        this.field14 = class5.field14 - class6.field14;
    }
    
    public final void method22(final Class5 class5) {
        this.field12 -= class5.field12;
        this.field13 -= class5.field13;
        this.field14 -= class5.field14;
    }
    
    public final void method23(final Class5 class5) {
        this.field12 = -class5.field12;
        this.field13 = -class5.field13;
        this.field14 = -class5.field14;
    }
    
    public final void method24() {
        this.field12 = -this.field12;
        this.field13 = -this.field13;
        this.field14 = -this.field14;
    }
    
    public final void method25(final int n, final Class5 class5) {
        this.field12 = n * class5.field12;
        this.field13 = n * class5.field13;
        this.field14 = n * class5.field14;
    }
    
    public final void method26(final int n) {
        this.field12 *= n;
        this.field13 *= n;
        this.field14 *= n;
    }
    
    public final void method27(final int n, final Class5 class5, final Class5 class6) {
        this.field12 = n * class5.field12 + class6.field12;
        this.field13 = n * class5.field13 + class6.field13;
        this.field14 = n * class5.field14 + class6.field14;
    }
    
    public final void method28(final int n, final Class5 class5) {
        this.field12 = n * this.field12 + class5.field12;
        this.field13 = n * this.field13 + class5.field13;
        this.field14 = n * this.field14 + class5.field14;
    }
    
    @Override
    public String toString() {
        return "(" + this.field12 + ", " + this.field13 + ", " + this.field14 + ")";
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class5 class5 = (Class5)o;
            return this.field12 == class5.field12 && this.field13 == class5.field13 && this.field14 == class5.field14;
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
        final long n = 31L * (31L * (31L * 1L + this.field12) + this.field13) + this.field14;
        return (int)(n ^ n >> 32);
    }
    
    public final void method29(final int field14, final int field15, final Class5 class5) {
        if (class5.field12 <= field15) {
            if (class5.field12 >= field14) {
                this.field12 = class5.field12;
            }
            else {
                this.field12 = field14;
            }
        }
        else {
            this.field12 = field15;
        }
        if (class5.field13 <= field15) {
            if (class5.field13 >= field14) {
                this.field13 = class5.field13;
            }
            else {
                this.field13 = field14;
            }
        }
        else {
            this.field13 = field15;
        }
        if (class5.field14 <= field15) {
            if (class5.field14 >= field14) {
                this.field14 = class5.field14;
            }
            else {
                this.field14 = field14;
            }
        }
        else {
            this.field14 = field15;
        }
    }
    
    public final void method30(final int field14, final Class5 class5) {
        if (class5.field12 >= field14) {
            this.field12 = class5.field12;
        }
        else {
            this.field12 = field14;
        }
        if (class5.field13 >= field14) {
            this.field13 = class5.field13;
        }
        else {
            this.field13 = field14;
        }
        if (class5.field14 >= field14) {
            this.field14 = class5.field14;
        }
        else {
            this.field14 = field14;
        }
    }
    
    public final void method31(final int field14, final Class5 class5) {
        if (class5.field12 <= field14) {
            this.field12 = class5.field12;
        }
        else {
            this.field12 = field14;
        }
        if (class5.field13 <= field14) {
            this.field13 = class5.field13;
        }
        else {
            this.field13 = field14;
        }
        if (class5.field14 <= field14) {
            this.field14 = class5.field14;
        }
        else {
            this.field14 = field14;
        }
    }
    
    public final void method32(final Class5 class5) {
        this.field12 = Math.abs(class5.field12);
        this.field13 = Math.abs(class5.field13);
        this.field14 = Math.abs(class5.field14);
    }
    
    public final void method33(final int field14, final int field15) {
        if (this.field12 <= field15) {
            if (this.field12 < field14) {
                this.field12 = field14;
            }
        }
        else {
            this.field12 = field15;
        }
        if (this.field13 <= field15) {
            if (this.field13 < field14) {
                this.field13 = field14;
            }
        }
        else {
            this.field13 = field15;
        }
        if (this.field14 <= field15) {
            if (this.field14 < field14) {
                this.field14 = field14;
            }
        }
        else {
            this.field14 = field15;
        }
    }
    
    public final void method34(final int field14) {
        if (this.field12 < field14) {
            this.field12 = field14;
        }
        if (this.field13 < field14) {
            this.field13 = field14;
        }
        if (this.field14 < field14) {
            this.field14 = field14;
        }
    }
    
    public final void method35(final int field14) {
        if (this.field12 > field14) {
            this.field12 = field14;
        }
        if (this.field13 > field14) {
            this.field13 = field14;
        }
        if (this.field14 > field14) {
            this.field14 = field14;
        }
    }
    
    public final void method36() {
        this.field12 = Math.abs(this.field12);
        this.field13 = Math.abs(this.field13);
        this.field14 = Math.abs(this.field14);
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final int method37() {
        return this.field12;
    }
    
    public final void method38(final int field12) {
        this.field12 = field12;
    }
    
    public final int method39() {
        return this.field13;
    }
    
    public final void method40(final int field13) {
        this.field13 = field13;
    }
    
    public final int method41() {
        return this.field14;
    }
    
    public final void method42(final int field14) {
        this.field14 = field14;
    }
}
