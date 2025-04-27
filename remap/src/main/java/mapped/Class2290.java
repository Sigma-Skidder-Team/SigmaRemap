// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class2290 implements Serializable, Cloneable
{
    public static final long field13919 = 9011180388985266884L;
    public float field13920;
    public float field13921;
    
    public Class2290(final float field13920, final float field13921) {
        this.field13920 = field13920;
        this.field13921 = field13921;
    }
    
    public Class2290(final float[] array) {
        this.field13920 = array[0];
        this.field13921 = array[1];
    }
    
    public Class2290(final Class2290 class2290) {
        this.field13920 = class2290.field13920;
        this.field13921 = class2290.field13921;
    }
    
    public Class2290(final Class2297 class2297) {
        this.field13920 = (float)class2297.field13946;
        this.field13921 = (float)class2297.field13947;
    }
    
    public Class2290() {
        this.field13920 = 0.0f;
        this.field13921 = 0.0f;
    }
    
    public final void method8991(final float field13920, final float field13921) {
        this.field13920 = field13920;
        this.field13921 = field13921;
    }
    
    public final void method8992(final float[] array) {
        this.field13920 = array[0];
        this.field13921 = array[1];
    }
    
    public final void method8993(final Class2290 class2290) {
        this.field13920 = class2290.field13920;
        this.field13921 = class2290.field13921;
    }
    
    public final void method8994(final Class2297 class2297) {
        this.field13920 = (float)class2297.field13946;
        this.field13921 = (float)class2297.field13947;
    }
    
    public final void method8995(final float[] array) {
        array[0] = this.field13920;
        array[1] = this.field13921;
    }
    
    public final void method8996(final Class2290 class2290, final Class2290 class2291) {
        this.field13920 = class2290.field13920 + class2291.field13920;
        this.field13921 = class2290.field13921 + class2291.field13921;
    }
    
    public final void method8997(final Class2290 class2290) {
        this.field13920 += class2290.field13920;
        this.field13921 += class2290.field13921;
    }
    
    public final void method8998(final Class2290 class2290, final Class2290 class2291) {
        this.field13920 = class2290.field13920 - class2291.field13920;
        this.field13921 = class2290.field13921 - class2291.field13921;
    }
    
    public final void method8999(final Class2290 class2290) {
        this.field13920 -= class2290.field13920;
        this.field13921 -= class2290.field13921;
    }
    
    public final void method9000(final Class2290 class2290) {
        this.field13920 = -class2290.field13920;
        this.field13921 = -class2290.field13921;
    }
    
    public final void method9001() {
        this.field13920 = -this.field13920;
        this.field13921 = -this.field13921;
    }
    
    public final void method9002(final float n, final Class2290 class2290) {
        this.field13920 = n * class2290.field13920;
        this.field13921 = n * class2290.field13921;
    }
    
    public final void method9003(final float n) {
        this.field13920 *= n;
        this.field13921 *= n;
    }
    
    public final void method9004(final float n, final Class2290 class2290, final Class2290 class2291) {
        this.field13920 = n * class2290.field13920 + class2291.field13920;
        this.field13921 = n * class2290.field13921 + class2291.field13921;
    }
    
    public final void method9005(final float n, final Class2290 class2290) {
        this.field13920 = n * this.field13920 + class2290.field13920;
        this.field13921 = n * this.field13921 + class2290.field13921;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L + Class9427.method35030(this.field13920)) + Class9427.method35030(this.field13921);
        return (int)(n ^ n >> 32);
    }
    
    public boolean equals(final Class2290 class2290) {
        try {
            return this.field13920 == class2290.field13920 && this.field13921 == class2290.field13921;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2290 class2290 = (Class2290)o;
            return this.field13920 == class2290.field13920 && this.field13921 == class2290.field13921;
        }
        catch (final NullPointerException ex) {
            return false;
        }
        catch (final ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean method9006(final Class2290 class2290, final float n) {
        final float v = this.field13920 - class2290.field13920;
        if (Float.isNaN(v)) {
            return false;
        }
        if (((v >= 0.0f) ? v : (-v)) <= n) {
            final float v2 = this.field13921 - class2290.field13921;
            return !Float.isNaN(v2) && ((v2 >= 0.0f) ? v2 : (-v2)) <= n;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "(" + this.field13920 + ", " + this.field13921 + ")";
    }
    
    public final void method9007(final float n, final float n2, final Class2290 class2290) {
        if (class2290.field13920 <= n2) {
            if (class2290.field13920 >= n) {
                this.field13920 = class2290.field13920;
            }
            else {
                this.field13920 = n;
            }
        }
        else {
            this.field13920 = n2;
        }
        if (class2290.field13921 <= n2) {
            if (class2290.field13921 >= n) {
                this.field13921 = class2290.field13921;
            }
            else {
                this.field13921 = n;
            }
        }
        else {
            this.field13921 = n2;
        }
    }
    
    public final void method9008(final float n, final Class2290 class2290) {
        if (class2290.field13920 >= n) {
            this.field13920 = class2290.field13920;
        }
        else {
            this.field13920 = n;
        }
        if (class2290.field13921 >= n) {
            this.field13921 = class2290.field13921;
        }
        else {
            this.field13921 = n;
        }
    }
    
    public final void method9009(final float n, final Class2290 class2290) {
        if (class2290.field13920 <= n) {
            this.field13920 = class2290.field13920;
        }
        else {
            this.field13920 = n;
        }
        if (class2290.field13921 <= n) {
            this.field13921 = class2290.field13921;
        }
        else {
            this.field13921 = n;
        }
    }
    
    public final void method9010(final Class2290 class2290) {
        this.field13920 = Math.abs(class2290.field13920);
        this.field13921 = Math.abs(class2290.field13921);
    }
    
    public final void method9011(final float n, final float n2) {
        if (this.field13920 <= n2) {
            if (this.field13920 < n) {
                this.field13920 = n;
            }
        }
        else {
            this.field13920 = n2;
        }
        if (this.field13921 <= n2) {
            if (this.field13921 < n) {
                this.field13921 = n;
            }
        }
        else {
            this.field13921 = n2;
        }
    }
    
    public final void method9012(final float n) {
        if (this.field13920 < n) {
            this.field13920 = n;
        }
        if (this.field13921 < n) {
            this.field13921 = n;
        }
    }
    
    public final void method9013(final float n) {
        if (this.field13920 > n) {
            this.field13920 = n;
        }
        if (this.field13921 > n) {
            this.field13921 = n;
        }
    }
    
    public final void method9014() {
        this.field13920 = Math.abs(this.field13920);
        this.field13921 = Math.abs(this.field13921);
    }
    
    public final void method9015(final Class2290 class2290, final Class2290 class2291, final float n) {
        this.field13920 = (1.0f - n) * class2290.field13920 + n * class2291.field13920;
        this.field13921 = (1.0f - n) * class2290.field13921 + n * class2291.field13921;
    }
    
    public final void method9016(final Class2290 class2290, final float n) {
        this.field13920 = (1.0f - n) * this.field13920 + n * class2290.field13920;
        this.field13921 = (1.0f - n) * this.field13921 + n * class2290.field13921;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final float method9017() {
        return this.field13920;
    }
    
    public final void method9018(final float field13920) {
        this.field13920 = field13920;
    }
    
    public final float method9019() {
        return this.field13921;
    }
    
    public final void method9020(final float field13921) {
        this.field13921 = field13921;
    }
}
