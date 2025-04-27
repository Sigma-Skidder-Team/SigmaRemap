// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class2275 implements Serializable, Cloneable
{
    public static final long field13862 = 7068460319248845763L;
    public float field13863;
    public float field13864;
    public float field13865;
    public float field13866;
    
    public Class2275(final float field13863, final float field13864, final float field13865, final float field13866) {
        this.field13863 = field13863;
        this.field13864 = field13864;
        this.field13865 = field13865;
        this.field13866 = field13866;
    }
    
    public Class2275(final float[] array) {
        this.field13863 = array[0];
        this.field13864 = array[1];
        this.field13865 = array[2];
        this.field13866 = array[3];
    }
    
    public Class2275(final Class2275 class2275) {
        this.field13863 = class2275.field13863;
        this.field13864 = class2275.field13864;
        this.field13865 = class2275.field13865;
        this.field13866 = class2275.field13866;
    }
    
    public Class2275(final Class7 class7) {
        this.field13863 = (float)class7.field18;
        this.field13864 = (float)class7.field19;
        this.field13865 = (float)class7.field20;
        this.field13866 = (float)class7.field21;
    }
    
    public Class2275() {
        this.field13863 = 0.0f;
        this.field13864 = 0.0f;
        this.field13865 = 0.0f;
        this.field13866 = 0.0f;
    }
    
    public final void method8656(final float field13863, final float field13864, final float field13865, final float field13866) {
        this.field13863 = field13863;
        this.field13864 = field13864;
        this.field13865 = field13865;
        this.field13866 = field13866;
    }
    
    public final void method8657(final float[] array) {
        this.field13863 = array[0];
        this.field13864 = array[1];
        this.field13865 = array[2];
        this.field13866 = array[3];
    }
    
    public final void method8658(final Class2275 class2275) {
        this.field13863 = class2275.field13863;
        this.field13864 = class2275.field13864;
        this.field13865 = class2275.field13865;
        this.field13866 = class2275.field13866;
    }
    
    public final void method8659(final Class7 class7) {
        this.field13863 = (float)class7.field18;
        this.field13864 = (float)class7.field19;
        this.field13865 = (float)class7.field20;
        this.field13866 = (float)class7.field21;
    }
    
    public final void method8660(final float[] array) {
        array[0] = this.field13863;
        array[1] = this.field13864;
        array[2] = this.field13865;
        array[3] = this.field13866;
    }
    
    public final void method8661(final Class2275 class2275) {
        class2275.field13863 = this.field13863;
        class2275.field13864 = this.field13864;
        class2275.field13865 = this.field13865;
        class2275.field13866 = this.field13866;
    }
    
    public final void method8662(final Class2275 class2275, final Class2275 class2276) {
        this.field13863 = class2275.field13863 + class2276.field13863;
        this.field13864 = class2275.field13864 + class2276.field13864;
        this.field13865 = class2275.field13865 + class2276.field13865;
        this.field13866 = class2275.field13866 + class2276.field13866;
    }
    
    public final void method8663(final Class2275 class2275) {
        this.field13863 += class2275.field13863;
        this.field13864 += class2275.field13864;
        this.field13865 += class2275.field13865;
        this.field13866 += class2275.field13866;
    }
    
    public final void method8664(final Class2275 class2275, final Class2275 class2276) {
        this.field13863 = class2275.field13863 - class2276.field13863;
        this.field13864 = class2275.field13864 - class2276.field13864;
        this.field13865 = class2275.field13865 - class2276.field13865;
        this.field13866 = class2275.field13866 - class2276.field13866;
    }
    
    public final void method8665(final Class2275 class2275) {
        this.field13863 -= class2275.field13863;
        this.field13864 -= class2275.field13864;
        this.field13865 -= class2275.field13865;
        this.field13866 -= class2275.field13866;
    }
    
    public final void method8666(final Class2275 class2275) {
        this.field13863 = -class2275.field13863;
        this.field13864 = -class2275.field13864;
        this.field13865 = -class2275.field13865;
        this.field13866 = -class2275.field13866;
    }
    
    public final void method8667() {
        this.field13863 = -this.field13863;
        this.field13864 = -this.field13864;
        this.field13865 = -this.field13865;
        this.field13866 = -this.field13866;
    }
    
    public final void method8668(final float n, final Class2275 class2275) {
        this.field13863 = n * class2275.field13863;
        this.field13864 = n * class2275.field13864;
        this.field13865 = n * class2275.field13865;
        this.field13866 = n * class2275.field13866;
    }
    
    public final void method8669(final float n) {
        this.field13863 *= n;
        this.field13864 *= n;
        this.field13865 *= n;
        this.field13866 *= n;
    }
    
    public final void method8670(final float n, final Class2275 class2275, final Class2275 class2276) {
        this.field13863 = n * class2275.field13863 + class2276.field13863;
        this.field13864 = n * class2275.field13864 + class2276.field13864;
        this.field13865 = n * class2275.field13865 + class2276.field13865;
        this.field13866 = n * class2275.field13866 + class2276.field13866;
    }
    
    public final void method8671(final float n, final Class2275 class2275) {
        this.field13863 = n * this.field13863 + class2275.field13863;
        this.field13864 = n * this.field13864 + class2275.field13864;
        this.field13865 = n * this.field13865 + class2275.field13865;
        this.field13866 = n * this.field13866 + class2275.field13866;
    }
    
    @Override
    public String toString() {
        return "(" + this.field13863 + ", " + this.field13864 + ", " + this.field13865 + ", " + this.field13866 + ")";
    }
    
    public boolean equals(final Class2275 class2275) {
        try {
            return this.field13863 == class2275.field13863 && this.field13864 == class2275.field13864 && this.field13865 == class2275.field13865 && this.field13866 == class2275.field13866;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2275 class2275 = (Class2275)o;
            return this.field13863 == class2275.field13863 && this.field13864 == class2275.field13864 && this.field13865 == class2275.field13865 && this.field13866 == class2275.field13866;
        }
        catch (final NullPointerException ex) {
            return false;
        }
        catch (final ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean method8672(final Class2275 class2275, final float n) {
        final float v = this.field13863 - class2275.field13863;
        if (Float.isNaN(v)) {
            return false;
        }
        if (((v >= 0.0f) ? v : (-v)) > n) {
            return false;
        }
        final float v2 = this.field13864 - class2275.field13864;
        if (Float.isNaN(v2)) {
            return false;
        }
        if (((v2 >= 0.0f) ? v2 : (-v2)) > n) {
            return false;
        }
        final float v3 = this.field13865 - class2275.field13865;
        if (Float.isNaN(v3)) {
            return false;
        }
        if (((v3 >= 0.0f) ? v3 : (-v3)) <= n) {
            final float v4 = this.field13866 - class2275.field13866;
            return !Float.isNaN(v4) && ((v4 >= 0.0f) ? v4 : (-v4)) <= n;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * (31L + Class9427.method35030(this.field13863)) + Class9427.method35030(this.field13864)) + Class9427.method35030(this.field13865)) + Class9427.method35030(this.field13866);
        return (int)(n ^ n >> 32);
    }
    
    public final void method8673(final float n, final float n2, final Class2275 class2275) {
        if (class2275.field13863 <= n2) {
            if (class2275.field13863 >= n) {
                this.field13863 = class2275.field13863;
            }
            else {
                this.field13863 = n;
            }
        }
        else {
            this.field13863 = n2;
        }
        if (class2275.field13864 <= n2) {
            if (class2275.field13864 >= n) {
                this.field13864 = class2275.field13864;
            }
            else {
                this.field13864 = n;
            }
        }
        else {
            this.field13864 = n2;
        }
        if (class2275.field13865 <= n2) {
            if (class2275.field13865 >= n) {
                this.field13865 = class2275.field13865;
            }
            else {
                this.field13865 = n;
            }
        }
        else {
            this.field13865 = n2;
        }
        if (class2275.field13866 <= n2) {
            if (class2275.field13866 >= n) {
                this.field13866 = class2275.field13866;
            }
            else {
                this.field13866 = n;
            }
        }
        else {
            this.field13866 = n2;
        }
    }
    
    public final void method8674(final float n, final Class2275 class2275) {
        if (class2275.field13863 >= n) {
            this.field13863 = class2275.field13863;
        }
        else {
            this.field13863 = n;
        }
        if (class2275.field13864 >= n) {
            this.field13864 = class2275.field13864;
        }
        else {
            this.field13864 = n;
        }
        if (class2275.field13865 >= n) {
            this.field13865 = class2275.field13865;
        }
        else {
            this.field13865 = n;
        }
        if (class2275.field13866 >= n) {
            this.field13866 = class2275.field13866;
        }
        else {
            this.field13866 = n;
        }
    }
    
    public final void method8675(final float n, final Class2275 class2275) {
        if (class2275.field13863 <= n) {
            this.field13863 = class2275.field13863;
        }
        else {
            this.field13863 = n;
        }
        if (class2275.field13864 <= n) {
            this.field13864 = class2275.field13864;
        }
        else {
            this.field13864 = n;
        }
        if (class2275.field13865 <= n) {
            this.field13865 = class2275.field13865;
        }
        else {
            this.field13865 = n;
        }
        if (class2275.field13866 <= n) {
            this.field13866 = class2275.field13865;
        }
        else {
            this.field13866 = n;
        }
    }
    
    public final void method8676(final Class2275 class2275) {
        this.field13863 = Math.abs(class2275.field13863);
        this.field13864 = Math.abs(class2275.field13864);
        this.field13865 = Math.abs(class2275.field13865);
        this.field13866 = Math.abs(class2275.field13866);
    }
    
    public final void method8677(final float n, final float n2) {
        if (this.field13863 <= n2) {
            if (this.field13863 < n) {
                this.field13863 = n;
            }
        }
        else {
            this.field13863 = n2;
        }
        if (this.field13864 <= n2) {
            if (this.field13864 < n) {
                this.field13864 = n;
            }
        }
        else {
            this.field13864 = n2;
        }
        if (this.field13865 <= n2) {
            if (this.field13865 < n) {
                this.field13865 = n;
            }
        }
        else {
            this.field13865 = n2;
        }
        if (this.field13866 <= n2) {
            if (this.field13866 < n) {
                this.field13866 = n;
            }
        }
        else {
            this.field13866 = n2;
        }
    }
    
    public final void method8678(final float n) {
        if (this.field13863 < n) {
            this.field13863 = n;
        }
        if (this.field13864 < n) {
            this.field13864 = n;
        }
        if (this.field13865 < n) {
            this.field13865 = n;
        }
        if (this.field13866 < n) {
            this.field13866 = n;
        }
    }
    
    public final void method8679(final float n) {
        if (this.field13863 > n) {
            this.field13863 = n;
        }
        if (this.field13864 > n) {
            this.field13864 = n;
        }
        if (this.field13865 > n) {
            this.field13865 = n;
        }
        if (this.field13866 > n) {
            this.field13866 = n;
        }
    }
    
    public final void method8680() {
        this.field13863 = Math.abs(this.field13863);
        this.field13864 = Math.abs(this.field13864);
        this.field13865 = Math.abs(this.field13865);
        this.field13866 = Math.abs(this.field13866);
    }
    
    public void method8681(final Class2275 class2275, final Class2275 class2276, final float n) {
        this.field13863 = (1.0f - n) * class2275.field13863 + n * class2276.field13863;
        this.field13864 = (1.0f - n) * class2275.field13864 + n * class2276.field13864;
        this.field13865 = (1.0f - n) * class2275.field13865 + n * class2276.field13865;
        this.field13866 = (1.0f - n) * class2275.field13866 + n * class2276.field13866;
    }
    
    public void method8682(final Class2275 class2275, final float n) {
        this.field13863 = (1.0f - n) * this.field13863 + n * class2275.field13863;
        this.field13864 = (1.0f - n) * this.field13864 + n * class2275.field13864;
        this.field13865 = (1.0f - n) * this.field13865 + n * class2275.field13865;
        this.field13866 = (1.0f - n) * this.field13866 + n * class2275.field13866;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final float method8683() {
        return this.field13863;
    }
    
    public final void method8684(final float field13863) {
        this.field13863 = field13863;
    }
    
    public final float method8685() {
        return this.field13864;
    }
    
    public final void method8686(final float field13864) {
        this.field13864 = field13864;
    }
    
    public final float method8687() {
        return this.field13865;
    }
    
    public final void method8688(final float field13865) {
        this.field13865 = field13865;
    }
    
    public final float method8689() {
        return this.field13866;
    }
    
    public final void method8690(final float field13866) {
        this.field13866 = field13866;
    }
}
