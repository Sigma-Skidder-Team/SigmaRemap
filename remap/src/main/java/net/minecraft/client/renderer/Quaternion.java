// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.client.renderer;

import net.minecraft.util.math.MathHelper;

public final class Quaternion
{
    public static final Quaternion ONE;
    private float field40292;
    private float field40293;
    private float field40294;
    private float field40295;
    
    public Quaternion(final float field40292, final float field40293, final float field40294, final float field40295) {
        this.field40292 = field40292;
        this.field40293 = field40293;
        this.field40294 = field40294;
        this.field40295 = field40295;
    }
    
    public Quaternion(final Vector3f class9138, float n, final boolean b) {
        if (b) {
            n *= 0.017453292f;
        }
        final float method34908 = method34908(n / 2.0f);
        this.field40292 = class9138.getX() * method34908;
        this.field40293 = class9138.getY() * method34908;
        this.field40294 = class9138.getZ() * method34908;
        this.field40295 = method34907(n / 2.0f);
    }
    
    public Quaternion(float n, float n2, float n3, final boolean b) {
        if (b) {
            n *= 0.017453292f;
            n2 *= 0.017453292f;
            n3 *= 0.017453292f;
        }
        final float method34908 = method34908(0.5f * n);
        final float method34909 = method34907(0.5f * n);
        final float method34910 = method34908(0.5f * n2);
        final float method34911 = method34907(0.5f * n2);
        final float method34912 = method34908(0.5f * n3);
        final float method34913 = method34907(0.5f * n3);
        this.field40292 = method34908 * method34911 * method34913 + method34909 * method34910 * method34912;
        this.field40293 = method34909 * method34910 * method34913 - method34908 * method34911 * method34912;
        this.field40294 = method34908 * method34910 * method34913 + method34909 * method34911 * method34912;
        this.field40295 = method34909 * method34911 * method34913 - method34908 * method34910 * method34912;
    }
    
    public Quaternion(final Quaternion class9389) {
        this.field40292 = class9389.field40292;
        this.field40293 = class9389.field40293;
        this.field40294 = class9389.field40294;
        this.field40295 = class9389.field40295;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Quaternion class9389 = (Quaternion)o;
            return Float.compare(class9389.field40292, this.field40292) == 0 && Float.compare(class9389.field40293, this.field40293) == 0 && Float.compare(class9389.field40294, this.field40294) == 0 && Float.compare(class9389.field40295, this.field40295) == 0;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * Float.floatToIntBits(this.field40292) + Float.floatToIntBits(this.field40293)) + Float.floatToIntBits(this.field40294)) + Float.floatToIntBits(this.field40295);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Quaternion[").append(this.getW()).append(" + ");
        sb.append(this.getX()).append("i + ");
        sb.append(this.getY()).append("j + ");
        sb.append(this.getZ()).append("k]");
        return sb.toString();
    }
    
    public float getX() {
        return this.field40292;
    }
    
    public float getY() {
        return this.field40293;
    }
    
    public float getZ() {
        return this.field40294;
    }
    
    public float getW() {
        return this.field40295;
    }
    
    public void multiply(final Quaternion class9389) {
        final float method34899 = this.getX();
        final float method34900 = this.getY();
        final float method34901 = this.getZ();
        final float method34902 = this.getW();
        final float method34903 = class9389.getX();
        final float method34904 = class9389.getY();
        final float method34905 = class9389.getZ();
        final float method34906 = class9389.getW();
        this.field40292 = method34902 * method34903 + method34899 * method34906 + method34900 * method34905 - method34901 * method34904;
        this.field40293 = method34902 * method34904 - method34899 * method34905 + method34900 * method34906 + method34901 * method34903;
        this.field40294 = method34902 * method34905 + method34899 * method34904 - method34900 * method34903 + method34901 * method34906;
        this.field40295 = method34902 * method34906 - method34899 * method34903 - method34900 * method34904 - method34901 * method34905;
    }
    
    public void multiply(final float n) {
        this.field40292 *= n;
        this.field40293 *= n;
        this.field40294 *= n;
        this.field40295 *= n;
    }
    
    public void conjugate() {
        this.field40292 = -this.field40292;
        this.field40293 = -this.field40293;
        this.field40294 = -this.field40294;
    }
    
    public void method34906(final float field40292, final float field40293, final float field40294, final float field40295) {
        this.field40292 = field40292;
        this.field40293 = field40293;
        this.field40294 = field40294;
        this.field40295 = field40295;
    }
    
    private static float method34907(final float n) {
        return (float)Math.cos(n);
    }
    
    private static float method34908(final float n) {
        return (float)Math.sin(n);
    }
    
    public void normalize() {
        final float n = this.getX() * this.getX() + this.getY() * this.getY() + this.getZ() * this.getZ() + this.getW() * this.getW();
        if (n <= 1.0E-6f) {
            this.field40292 = 0.0f;
            this.field40293 = 0.0f;
            this.field40294 = 0.0f;
            this.field40295 = 0.0f;
        }
        else {
            final float method35694 = MathHelper.fastInvSqrt(n);
            this.field40292 *= method35694;
            this.field40293 *= method35694;
            this.field40294 *= method35694;
            this.field40295 *= method35694;
        }
    }
    
    public Quaternion copy() {
        return new Quaternion(this);
    }
    
    static {
        ONE = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
