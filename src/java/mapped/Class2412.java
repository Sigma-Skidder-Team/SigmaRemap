// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public strictfp class Class2412 implements Serializable
{
    private static final long field14277 = 1339934L;
    public float field14278;
    public float field14279;
    
    public Class2412() {
    }
    
    public Class2412(final float[] array) {
        this.field14278 = array[0];
        this.field14279 = array[1];
    }
    
    public Class2412(final double n) {
        this.field14278 = 1.0f;
        this.field14279 = 0.0f;
        this.method9627(n);
    }
    
    public strictfp void method9627(double n) {
        if (n < -360.0 || n > 360.0) {
            n %= 360.0;
        }
        if (n < 0.0) {
            n += 360.0;
        }
        double method9630 = this.method9630();
        if (n < -360.0 || n > 360.0) {
            method9630 %= 360.0;
        }
        if (n >= 0.0) {}
        final float method9631 = this.method9646();
        this.field14278 = method9631 * (float)Class6882.method21086(StrictMath.toRadians(n));
        this.field14279 = method9631 * (float)Class6882.method21085(StrictMath.toRadians(n));
    }
    
    public strictfp Class2412 method9628(final double n) {
        this.method9627(this.method9630() + n);
        return this;
    }
    
    public strictfp Class2412 method9629(final double n) {
        this.method9627(this.method9630() - n);
        return this;
    }
    
    public strictfp double method9630() {
        double degrees = StrictMath.toDegrees(StrictMath.atan2(this.field14279, this.field14278));
        if (degrees < -360.0 || degrees > 360.0) {
            degrees %= 360.0;
        }
        if (degrees < 0.0) {
            degrees += 360.0;
        }
        return degrees;
    }
    
    public strictfp float method9631() {
        return this.field14278;
    }
    
    public strictfp float method9632() {
        return this.field14279;
    }
    
    public Class2412(final Class2412 class2412) {
        this(class2412.method9631(), class2412.method9632());
    }
    
    public Class2412(final float field14278, final float field14279) {
        this.field14278 = field14278;
        this.field14279 = field14279;
    }
    
    public strictfp void method9633(final Class2412 class2412) {
        this.method9635(class2412.method9631(), class2412.method9632());
    }
    
    public strictfp float method9634(final Class2412 class2412) {
        return this.field14278 * class2412.method9631() + this.field14279 * class2412.method9632();
    }
    
    public strictfp Class2412 method9635(final float field14278, final float field14279) {
        this.field14278 = field14278;
        this.field14279 = field14279;
        return this;
    }
    
    public strictfp Class2412 method9636() {
        return new Class2412(-this.field14279, this.field14278);
    }
    
    public strictfp Class2412 method9637(final float[] array) {
        return this.method9635(array[0], array[1]);
    }
    
    public strictfp Class2412 method9638() {
        return new Class2412(-this.field14278, -this.field14279);
    }
    
    public strictfp Class2412 method9639() {
        this.field14278 = -this.field14278;
        this.field14279 = -this.field14279;
        return this;
    }
    
    public strictfp Class2412 method9640(final Class2412 class2412) {
        this.field14278 += class2412.method9631();
        this.field14279 += class2412.method9632();
        return this;
    }
    
    public strictfp Class2412 method9641(final Class2412 class2412) {
        this.field14278 -= class2412.method9631();
        this.field14279 -= class2412.method9632();
        return this;
    }
    
    public strictfp Class2412 method9642(final float n) {
        this.field14278 *= n;
        this.field14279 *= n;
        return this;
    }
    
    public strictfp Class2412 method9643() {
        final float method9646 = this.method9646();
        if (method9646 != 0.0f) {
            this.field14278 /= method9646;
            this.field14279 /= method9646;
            return this;
        }
        return this;
    }
    
    public strictfp Class2412 method9644() {
        final Class2412 method9648 = this.method9648();
        method9648.method9643();
        return method9648;
    }
    
    public strictfp float method9645() {
        return this.field14278 * this.field14278 + this.field14279 * this.field14279;
    }
    
    public strictfp float method9646() {
        return (float)Math.sqrt(this.method9645());
    }
    
    public strictfp void method9647(final Class2412 class2412, final Class2412 class2413) {
        final float method9634 = class2412.method9634(this);
        class2413.field14278 = method9634 * class2412.method9631();
        class2413.field14279 = method9634 * class2412.method9632();
    }
    
    public strictfp Class2412 method9648() {
        return new Class2412(this.field14278, this.field14279);
    }
    
    @Override
    public strictfp String toString() {
        return "[Vector2f " + this.field14278 + "," + this.field14279 + " (" + this.method9646() + ")]";
    }
    
    public strictfp float method9649(final Class2412 class2412) {
        return (float)Math.sqrt(this.method9650(class2412));
    }
    
    public strictfp float method9650(final Class2412 class2412) {
        final float n = class2412.method9631() - this.method9631();
        final float n2 = class2412.method9632() - this.method9632();
        return n * n + n2 * n2;
    }
    
    @Override
    public strictfp int hashCode() {
        return 997 * (int)this.field14278 ^ 991 * (int)this.field14279;
    }
    
    @Override
    public strictfp boolean equals(final Object o) {
        if (!(o instanceof Class2412)) {
            return false;
        }
        final Class2412 class2412 = (Class2412)o;
        return class2412.field14278 == this.field14278 && class2412.field14279 == this.field14279;
    }
}
