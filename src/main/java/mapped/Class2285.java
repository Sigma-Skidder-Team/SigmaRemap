// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class2285 implements Serializable, Cloneable
{
    public static final long field13908 = 5019834619484343712L;
    public float field13909;
    public float field13910;
    public float field13911;
    
    public Class2285(final float field13909, final float field13910, final float field13911) {
        this.field13909 = field13909;
        this.field13910 = field13910;
        this.field13911 = field13911;
    }
    
    public Class2285(final float[] array) {
        this.field13909 = array[0];
        this.field13910 = array[1];
        this.field13911 = array[2];
    }
    
    public Class2285(final Class2285 class2285) {
        this.field13909 = class2285.field13909;
        this.field13910 = class2285.field13910;
        this.field13911 = class2285.field13911;
    }
    
    public Class2285(final Class2271 class2271) {
        this.field13909 = (float)class2271.field13839;
        this.field13910 = (float)class2271.field13840;
        this.field13911 = (float)class2271.field13841;
    }
    
    public Class2285() {
        this.field13909 = 0.0f;
        this.field13910 = 0.0f;
        this.field13911 = 0.0f;
    }
    
    @Override
    public String toString() {
        return "(" + this.field13909 + ", " + this.field13910 + ", " + this.field13911 + ")";
    }
    
    public final void method8944(final float field13909, final float field13910, final float field13911) {
        this.field13909 = field13909;
        this.field13910 = field13910;
        this.field13911 = field13911;
    }
    
    public final void method8945(final float[] array) {
        this.field13909 = array[0];
        this.field13910 = array[1];
        this.field13911 = array[2];
    }
    
    public final void method8946(final Class2285 class2285) {
        this.field13909 = class2285.field13909;
        this.field13910 = class2285.field13910;
        this.field13911 = class2285.field13911;
    }
    
    public final void method8947(final Class2271 class2271) {
        this.field13909 = (float)class2271.field13839;
        this.field13910 = (float)class2271.field13840;
        this.field13911 = (float)class2271.field13841;
    }
    
    public final void method8948(final float[] array) {
        array[0] = this.field13909;
        array[1] = this.field13910;
        array[2] = this.field13911;
    }
    
    public final void method8949(final Class2285 class2285) {
        class2285.field13909 = this.field13909;
        class2285.field13910 = this.field13910;
        class2285.field13911 = this.field13911;
    }
    
    public final void method8950(final Class2285 class2285, final Class2285 class2286) {
        this.field13909 = class2285.field13909 + class2286.field13909;
        this.field13910 = class2285.field13910 + class2286.field13910;
        this.field13911 = class2285.field13911 + class2286.field13911;
    }
    
    public final void method8951(final Class2285 class2285) {
        this.field13909 += class2285.field13909;
        this.field13910 += class2285.field13910;
        this.field13911 += class2285.field13911;
    }
    
    public final void method8952(final Class2285 class2285, final Class2285 class2286) {
        this.field13909 = class2285.field13909 - class2286.field13909;
        this.field13910 = class2285.field13910 - class2286.field13910;
        this.field13911 = class2285.field13911 - class2286.field13911;
    }
    
    public final void method8953(final Class2285 class2285) {
        this.field13909 -= class2285.field13909;
        this.field13910 -= class2285.field13910;
        this.field13911 -= class2285.field13911;
    }
    
    public final void method8954(final Class2285 class2285) {
        this.field13909 = -class2285.field13909;
        this.field13910 = -class2285.field13910;
        this.field13911 = -class2285.field13911;
    }
    
    public final void method8955() {
        this.field13909 = -this.field13909;
        this.field13910 = -this.field13910;
        this.field13911 = -this.field13911;
    }
    
    public final void method8956(final float n, final Class2285 class2285) {
        this.field13909 = n * class2285.field13909;
        this.field13910 = n * class2285.field13910;
        this.field13911 = n * class2285.field13911;
    }
    
    public final void method8957(final float n) {
        this.field13909 *= n;
        this.field13910 *= n;
        this.field13911 *= n;
    }
    
    public final void method8958(final float n, final Class2285 class2285, final Class2285 class2286) {
        this.field13909 = n * class2285.field13909 + class2286.field13909;
        this.field13910 = n * class2285.field13910 + class2286.field13910;
        this.field13911 = n * class2285.field13911 + class2286.field13911;
    }
    
    public final void method8959(final float n, final Class2285 class2285) {
        this.field13909 = n * this.field13909 + class2285.field13909;
        this.field13910 = n * this.field13910 + class2285.field13910;
        this.field13911 = n * this.field13911 + class2285.field13911;
    }
    
    public boolean equals(final Class2285 class2285) {
        try {
            return this.field13909 == class2285.field13909 && this.field13910 == class2285.field13910 && this.field13911 == class2285.field13911;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2285 class2285 = (Class2285)o;
            return this.field13909 == class2285.field13909 && this.field13910 == class2285.field13910 && this.field13911 == class2285.field13911;
        }
        catch (final NullPointerException ex) {
            return false;
        }
        catch (final ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean method8960(final Class2285 class2285, final float n) {
        final float v = this.field13909 - class2285.field13909;
        if (Float.isNaN(v)) {
            return false;
        }
        if (((v >= 0.0f) ? v : (-v)) > n) {
            return false;
        }
        final float v2 = this.field13910 - class2285.field13910;
        if (Float.isNaN(v2)) {
            return false;
        }
        if (((v2 >= 0.0f) ? v2 : (-v2)) <= n) {
            final float v3 = this.field13911 - class2285.field13911;
            return !Float.isNaN(v3) && ((v3 >= 0.0f) ? v3 : (-v3)) <= n;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * 1L + Class9427.method35030(this.field13909)) + Class9427.method35030(this.field13910)) + Class9427.method35030(this.field13911);
        return (int)(n ^ n >> 32);
    }
    
    public final void method8961(final float field13911, final float field13912, final Class2285 class2285) {
        if (class2285.field13909 <= field13912) {
            if (class2285.field13909 >= field13911) {
                this.field13909 = class2285.field13909;
            }
            else {
                this.field13909 = field13911;
            }
        }
        else {
            this.field13909 = field13912;
        }
        if (class2285.field13910 <= field13912) {
            if (class2285.field13910 >= field13911) {
                this.field13910 = class2285.field13910;
            }
            else {
                this.field13910 = field13911;
            }
        }
        else {
            this.field13910 = field13912;
        }
        if (class2285.field13911 <= field13912) {
            if (class2285.field13911 >= field13911) {
                this.field13911 = class2285.field13911;
            }
            else {
                this.field13911 = field13911;
            }
        }
        else {
            this.field13911 = field13912;
        }
    }
    
    public final void method8962(final float field13911, final Class2285 class2285) {
        if (class2285.field13909 >= field13911) {
            this.field13909 = class2285.field13909;
        }
        else {
            this.field13909 = field13911;
        }
        if (class2285.field13910 >= field13911) {
            this.field13910 = class2285.field13910;
        }
        else {
            this.field13910 = field13911;
        }
        if (class2285.field13911 >= field13911) {
            this.field13911 = class2285.field13911;
        }
        else {
            this.field13911 = field13911;
        }
    }
    
    public final void method8963(final float field13911, final Class2285 class2285) {
        if (class2285.field13909 <= field13911) {
            this.field13909 = class2285.field13909;
        }
        else {
            this.field13909 = field13911;
        }
        if (class2285.field13910 <= field13911) {
            this.field13910 = class2285.field13910;
        }
        else {
            this.field13910 = field13911;
        }
        if (class2285.field13911 <= field13911) {
            this.field13911 = class2285.field13911;
        }
        else {
            this.field13911 = field13911;
        }
    }
    
    public final void method8964(final Class2285 class2285) {
        this.field13909 = Math.abs(class2285.field13909);
        this.field13910 = Math.abs(class2285.field13910);
        this.field13911 = Math.abs(class2285.field13911);
    }
    
    public final void method8965(final float field13911, final float field13912) {
        if (this.field13909 <= field13912) {
            if (this.field13909 < field13911) {
                this.field13909 = field13911;
            }
        }
        else {
            this.field13909 = field13912;
        }
        if (this.field13910 <= field13912) {
            if (this.field13910 < field13911) {
                this.field13910 = field13911;
            }
        }
        else {
            this.field13910 = field13912;
        }
        if (this.field13911 <= field13912) {
            if (this.field13911 < field13911) {
                this.field13911 = field13911;
            }
        }
        else {
            this.field13911 = field13912;
        }
    }
    
    public final void method8966(final float field13911) {
        if (this.field13909 < field13911) {
            this.field13909 = field13911;
        }
        if (this.field13910 < field13911) {
            this.field13910 = field13911;
        }
        if (this.field13911 < field13911) {
            this.field13911 = field13911;
        }
    }
    
    public final void method8967(final float field13911) {
        if (this.field13909 > field13911) {
            this.field13909 = field13911;
        }
        if (this.field13910 > field13911) {
            this.field13910 = field13911;
        }
        if (this.field13911 > field13911) {
            this.field13911 = field13911;
        }
    }
    
    public final void method8968() {
        this.field13909 = Math.abs(this.field13909);
        this.field13910 = Math.abs(this.field13910);
        this.field13911 = Math.abs(this.field13911);
    }
    
    public final void method8969(final Class2285 class2285, final Class2285 class2286, final float n) {
        this.field13909 = (1.0f - n) * class2285.field13909 + n * class2286.field13909;
        this.field13910 = (1.0f - n) * class2285.field13910 + n * class2286.field13910;
        this.field13911 = (1.0f - n) * class2285.field13911 + n * class2286.field13911;
    }
    
    public final void method8970(final Class2285 class2285, final float n) {
        this.field13909 = (1.0f - n) * this.field13909 + n * class2285.field13909;
        this.field13910 = (1.0f - n) * this.field13910 + n * class2285.field13910;
        this.field13911 = (1.0f - n) * this.field13911 + n * class2285.field13911;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final float method8971() {
        return this.field13909;
    }
    
    public final void method8972(final float field13909) {
        this.field13909 = field13909;
    }
    
    public final float method8973() {
        return this.field13910;
    }
    
    public final void method8974(final float field13910) {
        this.field13910 = field13910;
    }
    
    public final float method8975() {
        return this.field13911;
    }
    
    public final void method8976(final float field13911) {
        this.field13911 = field13911;
    }
}
