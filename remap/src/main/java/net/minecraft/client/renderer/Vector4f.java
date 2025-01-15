// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.client.renderer;

import mapped.Class6789;
import mapped.Vector3f;
import mapped.Quaternion;
import net.minecraft.util.math.MathHelper;

public class Vector4f
{
    private float field35795;
    private float field35796;
    private float field35797;
    private float field35798;
    
    public Vector4f() {
    }
    
    public Vector4f(final float field35795, final float field35796, final float field35797, final float field35798) {
        this.field35795 = field35795;
        this.field35796 = field35796;
        this.field35797 = field35797;
        this.field35798 = field35798;
    }
    
    public Vector4f(final Vector3f class9138) {
        this(class9138.method33311(), class9138.method33312(), class9138.method33313(), 1.0f);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Vector4f class8526 = (Vector4f)o;
            return Float.compare(class8526.field35795, this.field35795) == 0 && Float.compare(class8526.field35796, this.field35796) == 0 && Float.compare(class8526.field35797, this.field35797) == 0 && Float.compare(class8526.field35798, this.field35798) == 0;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * Float.floatToIntBits(this.field35795) + Float.floatToIntBits(this.field35796)) + Float.floatToIntBits(this.field35797)) + Float.floatToIntBits(this.field35798);
    }
    
    public float method28595() {
        return this.field35795;
    }
    
    public float method28596() {
        return this.field35796;
    }
    
    public float method28597() {
        return this.field35797;
    }
    
    public float method28598() {
        return this.field35798;
    }
    
    public void method28599(final Vector3f class9138) {
        this.field35795 *= class9138.method33311();
        this.field35796 *= class9138.method33312();
        this.field35797 *= class9138.method33313();
    }
    
    public void method28600(final float field35795, final float field35796, final float field35797, final float field35798) {
        this.field35795 = field35795;
        this.field35796 = field35796;
        this.field35797 = field35797;
        this.field35798 = field35798;
    }
    
    public float method28601(final Vector4f class8526) {
        return this.field35795 * class8526.field35795 + this.field35796 * class8526.field35796 + this.field35797 * class8526.field35797 + this.field35798 * class8526.field35798;
    }
    
    public boolean method28602() {
        final float n = this.field35795 * this.field35795 + this.field35796 * this.field35796 + this.field35797 * this.field35797 + this.field35798 * this.field35798;
        if (n >= 1.0E-5) {
            final float method35694 = MathHelper.method35694(n);
            this.field35795 *= method35694;
            this.field35796 *= method35694;
            this.field35797 *= method35694;
            this.field35798 *= method35694;
            return true;
        }
        return false;
    }
    
    public void method28603(final Class6789 class6789) {
        final float field35795 = this.field35795;
        final float field35796 = this.field35796;
        final float field35797 = this.field35797;
        final float field35798 = this.field35798;
        this.field35795 = class6789.field26689 * field35795 + class6789.field26690 * field35796 + class6789.field26691 * field35797 + class6789.field26692 * field35798;
        this.field35796 = class6789.field26693 * field35795 + class6789.field26694 * field35796 + class6789.field26695 * field35797 + class6789.field26696 * field35798;
        this.field35797 = class6789.field26697 * field35795 + class6789.field26698 * field35796 + class6789.field26699 * field35797 + class6789.field26700 * field35798;
        this.field35798 = class6789.field26701 * field35795 + class6789.field26702 * field35796 + class6789.field26703 * field35797 + class6789.field26704 * field35798;
    }
    
    public void method28604(final Quaternion class9389) {
        final Quaternion class9390 = new Quaternion(class9389);
        class9390.multiply(new Quaternion(this.method28595(), this.method28596(), this.method28597(), 0.0f));
        final Quaternion class9391 = new Quaternion(class9389);
        class9391.method34905();
        class9390.multiply(class9391);
        this.method28600(class9390.method34899(), class9390.method34900(), class9390.method34901(), this.method28598());
    }
    
    public void method28605() {
        this.field35795 /= this.field35798;
        this.field35796 /= this.field35798;
        this.field35797 /= this.field35798;
        this.field35798 = 1.0f;
    }
    
    @Override
    public String toString() {
        return "[" + this.field35795 + ", " + this.field35796 + ", " + this.field35797 + ", " + this.field35798 + "]";
    }
}
