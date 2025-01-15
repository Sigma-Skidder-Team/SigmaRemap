// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1941 implements Comparable<Class1941>
{
    public static final Class1941 field10577;
    public static final Class1941 field10578;
    public static final Class1941 field10579;
    public static final Class1941 field10580;
    public static final Class1941 field10581;
    public final double field10582;
    public final double field10583;
    public final double field10584;
    
    public Class1941(final double field10582, final double field10583, final double field10584) {
        this.field10582 = field10582;
        this.field10583 = field10583;
        this.field10584 = field10584;
    }
    
    public Class1941(final int n, final int n2, final int n3) {
        this.field10582 = n;
        this.field10583 = n2;
        this.field10584 = n3;
    }
    
    public Class1941(final float n, final float n2, final float n3) {
        this.field10582 = n;
        this.field10583 = n2;
        this.field10584 = n3;
    }
    
    public Class1941(final Class1941 class1941) {
        this.field10582 = class1941.field10582;
        this.field10583 = class1941.field10583;
        this.field10584 = class1941.field10584;
    }
    
    public Class1941() {
        this.field10582 = 0.0;
        this.field10583 = 0.0;
        this.field10584 = 0.0;
    }
    
    public double method7835() {
        return this.field10582;
    }
    
    public int method7836() {
        return (int)Math.round(this.field10582);
    }
    
    public Class1941 method7837(final double n) {
        return new Class1941(n, this.field10583, this.field10584);
    }
    
    public Class1941 method7838(final int n) {
        return new Class1941(n, this.field10583, this.field10584);
    }
    
    public double method7839() {
        return this.field10583;
    }
    
    public int method7840() {
        return (int)Math.round(this.field10583);
    }
    
    public Class1941 method7841(final double n) {
        return new Class1941(this.field10582, n, this.field10584);
    }
    
    public Class1941 method7842(final int n) {
        return new Class1941(this.field10582, n, this.field10584);
    }
    
    public double method7843() {
        return this.field10584;
    }
    
    public int method7844() {
        return (int)Math.round(this.field10584);
    }
    
    public Class1941 method7845(final double n) {
        return new Class1941(this.field10582, this.field10583, n);
    }
    
    public Class1941 method7846(final int n) {
        return new Class1941(this.field10582, this.field10583, n);
    }
    
    public Class1941 method7847(final Class1941 class1941) {
        return new Class1941(this.field10582 + class1941.field10582, this.field10583 + class1941.field10583, this.field10584 + class1941.field10584);
    }
    
    public Class1941 method7848(final double n, final double n2, final double n3) {
        return new Class1941(this.field10582 + n, this.field10583 + n2, this.field10584 + n3);
    }
    
    public Class1941 method7849(final int n, final int n2, final int n3) {
        return new Class1941(this.field10582 + n, this.field10583 + n2, this.field10584 + n3);
    }
    
    public Class1941 method7850(final Class1941... array) {
        double field10582 = this.field10582;
        double field10583 = this.field10583;
        double field10584 = this.field10584;
        for (final Class1941 class1941 : array) {
            field10582 += class1941.field10582;
            field10583 += class1941.field10583;
            field10584 += class1941.field10584;
        }
        return new Class1941(field10582, field10583, field10584);
    }
    
    public Class1941 method7851(final Class1941 class1941) {
        return new Class1941(this.field10582 - class1941.field10582, this.field10583 - class1941.field10583, this.field10584 - class1941.field10584);
    }
    
    public Class1941 method7852(final double n, final double n2, final double n3) {
        return new Class1941(this.field10582 - n, this.field10583 - n2, this.field10584 - n3);
    }
    
    public Class1941 method7853(final int n, final int n2, final int n3) {
        return new Class1941(this.field10582 - n, this.field10583 - n2, this.field10584 - n3);
    }
    
    public Class1941 method7854(final Class1941... array) {
        double field10582 = this.field10582;
        double field10583 = this.field10583;
        double field10584 = this.field10584;
        for (final Class1941 class1941 : array) {
            field10582 -= class1941.field10582;
            field10583 -= class1941.field10583;
            field10584 -= class1941.field10584;
        }
        return new Class1941(field10582, field10583, field10584);
    }
    
    public Class1941 method7855(final Class1941 class1941) {
        return new Class1941(this.field10582 * class1941.field10582, this.field10583 * class1941.field10583, this.field10584 * class1941.field10584);
    }
    
    public Class1941 method7856(final double n, final double n2, final double n3) {
        return new Class1941(this.field10582 * n, this.field10583 * n2, this.field10584 * n3);
    }
    
    public Class1941 method7857(final int n, final int n2, final int n3) {
        return new Class1941(this.field10582 * n, this.field10583 * n2, this.field10584 * n3);
    }
    
    public Class1941 method7858(final Class1941... array) {
        double field10582 = this.field10582;
        double field10583 = this.field10583;
        double field10584 = this.field10584;
        for (final Class1941 class1941 : array) {
            field10582 *= class1941.field10582;
            field10583 *= class1941.field10583;
            field10584 *= class1941.field10584;
        }
        return new Class1941(field10582, field10583, field10584);
    }
    
    public Class1941 method7859(final double n) {
        return new Class1941(this.field10582 * n, this.field10583 * n, this.field10584 * n);
    }
    
    public Class1941 method7860(final float n) {
        return new Class1941(this.field10582 * n, this.field10583 * n, this.field10584 * n);
    }
    
    public Class1941 method7861(final int n) {
        return new Class1941(this.field10582 * n, this.field10583 * n, this.field10584 * n);
    }
    
    public Class1941 method7862(final Class1941 class1941) {
        return new Class1941(this.field10582 / class1941.field10582, this.field10583 / class1941.field10583, this.field10584 / class1941.field10584);
    }
    
    public Class1941 method7863(final double n, final double n2, final double n3) {
        return new Class1941(this.field10582 / n, this.field10583 / n2, this.field10584 / n3);
    }
    
    public Class1941 method7864(final int n, final int n2, final int n3) {
        return new Class1941(this.field10582 / n, this.field10583 / n2, this.field10584 / n3);
    }
    
    public Class1941 method7865(final int n) {
        return new Class1941(this.field10582 / n, this.field10583 / n, this.field10584 / n);
    }
    
    public Class1941 method7866(final double n) {
        return new Class1941(this.field10582 / n, this.field10583 / n, this.field10584 / n);
    }
    
    public Class1941 method7867(final float n) {
        return new Class1941(this.field10582 / n, this.field10583 / n, this.field10584 / n);
    }
    
    public double method7868() {
        return Math.sqrt(this.field10582 * this.field10582 + this.field10583 * this.field10583 + this.field10584 * this.field10584);
    }
    
    public double method7869() {
        return this.field10582 * this.field10582 + this.field10583 * this.field10583 + this.field10584 * this.field10584;
    }
    
    public double method7870(final Class1941 class1941) {
        return Math.sqrt(Math.pow(class1941.field10582 - this.field10582, 2.0) + Math.pow(class1941.field10583 - this.field10583, 2.0) + Math.pow(class1941.field10584 - this.field10584, 2.0));
    }
    
    public double method7871(final Class1941 class1941) {
        return Math.pow(class1941.field10582 - this.field10582, 2.0) + Math.pow(class1941.field10583 - this.field10583, 2.0) + Math.pow(class1941.field10584 - this.field10584, 2.0);
    }
    
    public Class1941 method7872() {
        return this.method7866(this.method7868());
    }
    
    public double method7873(final Class1941 class1941) {
        return this.field10582 * class1941.field10582 + this.field10583 * class1941.field10583 + this.field10584 * class1941.field10584;
    }
    
    public Class1941 method7874(final Class1941 class1941) {
        return new Class1941(this.field10583 * class1941.field10584 - this.field10584 * class1941.field10583, this.field10584 * class1941.field10582 - this.field10582 * class1941.field10584, this.field10582 * class1941.field10583 - this.field10583 * class1941.field10582);
    }
    
    public boolean method7875(final Class1941 class1941, final Class1941 class1942) {
        if (this.field10582 >= class1941.field10582) {
            if (this.field10582 <= class1942.field10582) {
                if (this.field10583 >= class1941.field10583) {
                    if (this.field10583 <= class1942.field10583) {
                        if (this.field10584 >= class1941.field10584) {
                            if (this.field10584 <= class1942.field10584) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method7876(final Class1941 class1941, final Class1941 class1942) {
        if (this.method7836() >= class1941.method7836()) {
            if (this.method7836() <= class1942.method7836()) {
                if (this.method7840() >= class1941.method7840()) {
                    if (this.method7840() <= class1942.method7840()) {
                        if (this.method7844() >= class1941.method7844()) {
                            if (this.method7844() <= class1942.method7844()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public Class1941 method7877(final int n, final int n2) {
        return new Class1941(this.field10582, Math.max(n, Math.min(n2, this.field10583)), this.field10584);
    }
    
    public Class1941 method7878() {
        return new Class1941(Math.floor(this.field10582), Math.floor(this.field10583), Math.floor(this.field10584));
    }
    
    public Class1941 method7879() {
        return new Class1941(Math.ceil(this.field10582), Math.ceil(this.field10583), Math.ceil(this.field10584));
    }
    
    public Class1941 method7880() {
        return new Class1941(Math.floor(this.field10582 + 0.5), Math.floor(this.field10583 + 0.5), Math.floor(this.field10584 + 0.5));
    }
    
    public Class1941 method7881() {
        return new Class1941(Math.abs(this.field10582), Math.abs(this.field10583), Math.abs(this.field10584));
    }
    
    public Class1941 method7882(double radians, final double n, final double n2, final double n3, final double n4) {
        radians = Math.toRadians(radians);
        final double n5 = this.field10582 - n;
        final double n6 = this.field10584 - n2;
        return new Class1941(n5 * Math.cos(radians) - n6 * Math.sin(radians) + n + n3, this.field10583, n5 * Math.sin(radians) + n6 * Math.cos(radians) + n2 + n4);
    }
    
    public boolean method7883(final Class1941 class1941) {
        if (this.field10582 == 0.0) {
            if (this.field10583 == 0.0) {
                if (this.field10584 == 0.0) {
                    return true;
                }
            }
        }
        final double field10582 = class1941.field10582;
        final double field10583 = class1941.field10583;
        final double field10584 = class1941.field10584;
        if (field10582 == 0.0) {
            if (field10583 == 0.0) {
                if (field10584 == 0.0) {
                    return true;
                }
            }
        }
        if (this.field10582 == 0.0 != (field10582 == 0.0)) {
            return false;
        }
        if (this.field10583 == 0.0 != (field10583 == 0.0)) {
            return false;
        }
        if (this.field10584 == 0.0 != (field10584 == 0.0)) {
            return false;
        }
        final double v = field10582 / this.field10582;
        if (!Double.isNaN(v)) {
            return class1941.equals(this.method7859(v));
        }
        final double v2 = field10583 / this.field10583;
        if (!Double.isNaN(v2)) {
            return class1941.equals(this.method7859(v2));
        }
        final double v3 = field10584 / this.field10584;
        if (Double.isNaN(v3)) {
            throw new RuntimeException("This should not happen");
        }
        return class1941.equals(this.method7859(v3));
    }
    
    public float method7884() {
        final double method7835 = this.method7835();
        final double method7836 = this.method7843();
        if (method7835 == 0.0 && method7836 == 0.0) {
            return (this.method7839() <= 0.0) ? 90.0f : -90.0f;
        }
        return (float)Math.toDegrees(Math.atan(-this.method7839() / Math.sqrt(method7835 * method7835 + method7836 * method7836)));
    }
    
    public float method7885() {
        final double atan2 = Math.atan2(-this.method7835(), this.method7843());
        final double n = 6.283185307179586;
        return (float)Math.toDegrees((atan2 + n) % n);
    }
    
    public static Class1942 method7886(final double a, final double a2, final double a3) {
        return new Class1942(Math.floor(a), Math.floor(a2), Math.floor(a3));
    }
    
    public Class1942 method7887() {
        return new Class1942(Math.floor(this.field10582), Math.floor(this.field10583), Math.floor(this.field10584));
    }
    
    public Class1942 method7888() {
        return new Class1942(this);
    }
    
    public Class7183 method7889() {
        return new Class7183(this.field10582, this.field10584);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class1941) {
            final Class1941 class1941 = (Class1941)o;
            if (class1941.field10582 == this.field10582) {
                if (class1941.field10583 == this.field10583) {
                    if (class1941.field10584 == this.field10584) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int compareTo(final Class1941 class1941) {
        if (class1941 == null) {
            throw new IllegalArgumentException("null not supported");
        }
        if (this.field10583 != class1941.field10583) {
            return Double.compare(this.field10583, class1941.field10583);
        }
        if (this.field10584 != class1941.field10584) {
            return Double.compare(this.field10584, class1941.field10584);
        }
        if (this.field10582 == class1941.field10582) {
            return 0;
        }
        return Double.compare(this.field10582, class1941.field10582);
    }
    
    @Override
    public int hashCode() {
        return 79 * (79 * (79 * 7 + (int)(Double.doubleToLongBits(this.field10582) ^ Double.doubleToLongBits(this.field10582) >>> 32)) + (int)(Double.doubleToLongBits(this.field10583) ^ Double.doubleToLongBits(this.field10583) >>> 32)) + (int)(Double.doubleToLongBits(this.field10584) ^ Double.doubleToLongBits(this.field10584) >>> 32);
    }
    
    @Override
    public String toString() {
        return "(" + this.field10582 + ", " + this.field10583 + ", " + this.field10584 + ")";
    }
    
    public static Class1941 method7890(final Class1941 class1941, final Class1941 class1942) {
        return new Class1941(Math.min(class1941.field10582, class1942.field10582), Math.min(class1941.field10583, class1942.field10583), Math.min(class1941.field10584, class1942.field10584));
    }
    
    public static Class1941 method7891(final Class1941 class1941, final Class1941 class1942) {
        return new Class1941(Math.max(class1941.field10582, class1942.field10582), Math.max(class1941.field10583, class1942.field10583), Math.max(class1941.field10584, class1942.field10584));
    }
    
    public static Class1941 method7892(final Class1941 class1941, final Class1941 class1942) {
        return new Class1941((class1941.field10582 + class1942.field10582) / 2.0, (class1941.field10583 + class1942.field10583) / 2.0, (class1941.field10584 + class1942.field10584) / 2.0);
    }
    
    static {
        field10577 = new Class1941(0, 0, 0);
        field10578 = new Class1941(1, 0, 0);
        field10579 = new Class1941(0, 1, 0);
        field10580 = new Class1941(0, 0, 1);
        field10581 = new Class1941(1, 1, 1);
    }
}
