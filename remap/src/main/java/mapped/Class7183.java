// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7183
{
    public static final Class7183 field27857;
    public static final Class7183 field27858;
    public static final Class7183 field27859;
    public static final Class7183 field27860;
    public final double field27861;
    public final double field27862;
    
    public Class7183(final double field27861, final double field27862) {
        this.field27861 = field27861;
        this.field27862 = field27862;
    }
    
    public Class7183(final int n, final int n2) {
        this.field27861 = n;
        this.field27862 = n2;
    }
    
    public Class7183(final float n, final float n2) {
        this.field27861 = n;
        this.field27862 = n2;
    }
    
    public Class7183(final Class7183 class7183) {
        this.field27861 = class7183.field27861;
        this.field27862 = class7183.field27862;
    }
    
    public Class7183() {
        this.field27861 = 0.0;
        this.field27862 = 0.0;
    }
    
    public double method21976() {
        return this.field27861;
    }
    
    public int method21977() {
        return (int)Math.round(this.field27861);
    }
    
    public Class7183 method21978(final double n) {
        return new Class7183(n, this.field27862);
    }
    
    public Class7183 method21979(final int n) {
        return new Class7183(n, this.field27862);
    }
    
    public double method21980() {
        return this.field27862;
    }
    
    public int method21981() {
        return (int)Math.round(this.field27862);
    }
    
    public Class7183 method21982(final double n) {
        return new Class7183(this.field27861, n);
    }
    
    public Class7183 method21983(final int n) {
        return new Class7183(this.field27861, n);
    }
    
    public Class7183 method21984(final Class7183 class7183) {
        return new Class7183(this.field27861 + class7183.field27861, this.field27862 + class7183.field27862);
    }
    
    public Class7183 method21985(final double n, final double n2) {
        return new Class7183(this.field27861 + n, this.field27862 + n2);
    }
    
    public Class7183 method21986(final int n, final int n2) {
        return new Class7183(this.field27861 + n, this.field27862 + n2);
    }
    
    public Class7183 method21987(final Class7183... array) {
        double field27861 = this.field27861;
        double field27862 = this.field27862;
        for (final Class7183 class7183 : array) {
            field27861 += class7183.field27861;
            field27862 += class7183.field27862;
        }
        return new Class7183(field27861, field27862);
    }
    
    public Class7183 method21988(final Class7183 class7183) {
        return new Class7183(this.field27861 - class7183.field27861, this.field27862 - class7183.field27862);
    }
    
    public Class7183 method21989(final double n, final double n2) {
        return new Class7183(this.field27861 - n, this.field27862 - n2);
    }
    
    public Class7183 method21990(final int n, final int n2) {
        return new Class7183(this.field27861 - n, this.field27862 - n2);
    }
    
    public Class7183 method21991(final Class7183... array) {
        double field27861 = this.field27861;
        double field27862 = this.field27862;
        for (final Class7183 class7183 : array) {
            field27861 -= class7183.field27861;
            field27862 -= class7183.field27862;
        }
        return new Class7183(field27861, field27862);
    }
    
    public Class7183 method21992(final Class7183 class7183) {
        return new Class7183(this.field27861 * class7183.field27861, this.field27862 * class7183.field27862);
    }
    
    public Class7183 method21993(final double n, final double n2) {
        return new Class7183(this.field27861 * n, this.field27862 * n2);
    }
    
    public Class7183 method21994(final int n, final int n2) {
        return new Class7183(this.field27861 * n, this.field27862 * n2);
    }
    
    public Class7183 method21995(final Class7183... array) {
        double field27861 = this.field27861;
        double field27862 = this.field27862;
        for (final Class7183 class7183 : array) {
            field27861 *= class7183.field27861;
            field27862 *= class7183.field27862;
        }
        return new Class7183(field27861, field27862);
    }
    
    public Class7183 method21996(final double n) {
        return new Class7183(this.field27861 * n, this.field27862 * n);
    }
    
    public Class7183 method21997(final float n) {
        return new Class7183(this.field27861 * n, this.field27862 * n);
    }
    
    public Class7183 method21998(final int n) {
        return new Class7183(this.field27861 * n, this.field27862 * n);
    }
    
    public Class7183 method21999(final Class7183 class7183) {
        return new Class7183(this.field27861 / class7183.field27861, this.field27862 / class7183.field27862);
    }
    
    public Class7183 method22000(final double n, final double n2) {
        return new Class7183(this.field27861 / n, this.field27862 / n2);
    }
    
    public Class7183 method22001(final int n, final int n2) {
        return new Class7183(this.field27861 / n, this.field27862 / n2);
    }
    
    public Class7183 method22002(final int n) {
        return new Class7183(this.field27861 / n, this.field27862 / n);
    }
    
    public Class7183 method22003(final double n) {
        return new Class7183(this.field27861 / n, this.field27862 / n);
    }
    
    public Class7183 method22004(final float n) {
        return new Class7183(this.field27861 / n, this.field27862 / n);
    }
    
    public double method22005() {
        return Math.sqrt(this.field27861 * this.field27861 + this.field27862 * this.field27862);
    }
    
    public double method22006() {
        return this.field27861 * this.field27861 + this.field27862 * this.field27862;
    }
    
    public double method22007(final Class7183 class7183) {
        return Math.sqrt(Math.pow(class7183.field27861 - this.field27861, 2.0) + Math.pow(class7183.field27862 - this.field27862, 2.0));
    }
    
    public double method22008(final Class7183 class7183) {
        return Math.pow(class7183.field27861 - this.field27861, 2.0) + Math.pow(class7183.field27862 - this.field27862, 2.0);
    }
    
    public Class7183 method22009() {
        return this.method22003(this.method22005());
    }
    
    public double method22010(final Class7183 class7183) {
        return this.field27861 * class7183.field27861 + this.field27862 * class7183.field27862;
    }
    
    public boolean method22011(final Class7183 class7183, final Class7183 class7184) {
        if (this.field27861 >= class7183.field27861) {
            if (this.field27861 <= class7184.field27861) {
                if (this.field27862 >= class7183.field27862) {
                    return this.field27862 <= class7184.field27862;
                }
            }
        }
        return false;
    }
    
    public boolean method22012(final Class7183 class7183, final Class7183 class7184) {
        if (this.method21977() >= class7183.method21977()) {
            if (this.method21977() <= class7184.method21977()) {
                if (this.method21981() >= class7183.method21981()) {
                    return this.method21981() <= class7184.method21981();
                }
            }
        }
        return false;
    }
    
    public Class7183 method22013() {
        return new Class7183(Math.floor(this.field27861), Math.floor(this.field27862));
    }
    
    public Class7183 method22014() {
        return new Class7183(Math.ceil(this.field27861), Math.ceil(this.field27862));
    }
    
    public Class7183 method22015() {
        return new Class7183(Math.floor(this.field27861 + 0.5), Math.floor(this.field27862 + 0.5));
    }
    
    public Class7183 method22016() {
        return new Class7183(Math.abs(this.field27861), Math.abs(this.field27862));
    }
    
    public Class7183 method22017(double radians, final double n, final double n2, final double n3, final double n4) {
        radians = Math.toRadians(radians);
        final double n5 = this.field27861 - n;
        final double n6 = this.field27862 - n2;
        return new Class7183(n5 * Math.cos(radians) - n6 * Math.sin(radians) + n + n3, n5 * Math.sin(radians) + n6 * Math.cos(radians) + n2 + n4);
    }
    
    public boolean method22018(final Class7183 class7183) {
        if (this.field27861 == 0.0 && this.field27862 == 0.0) {
            return true;
        }
        final double field27861 = class7183.field27861;
        final double field27862 = class7183.field27862;
        if (field27861 == 0.0 && field27862 == 0.0) {
            return true;
        }
        if (this.field27861 == 0.0 != (field27861 == 0.0)) {
            return false;
        }
        if (this.field27862 == 0.0 != (field27862 == 0.0)) {
            return false;
        }
        final double v = field27861 / this.field27861;
        if (!Double.isNaN(v)) {
            return class7183.equals(this.method21996(v));
        }
        final double v2 = field27862 / this.field27862;
        if (Double.isNaN(v2)) {
            throw new RuntimeException("This should not happen");
        }
        return class7183.equals(this.method21996(v2));
    }
    
    public Class7184 method22019() {
        return new Class7184(this);
    }
    
    public Class1941 method22020() {
        return new Class1941(this.field27861, 0.0, this.field27862);
    }
    
    public Class1941 method22021(final double n) {
        return new Class1941(this.field27861, n, this.field27862);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class7183) {
            final Class7183 class7183 = (Class7183)o;
            return class7183.field27861 == this.field27861 && class7183.field27862 == this.field27862;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return new Double(this.field27861).hashCode() >> 13 ^ new Double(this.field27862).hashCode();
    }
    
    @Override
    public String toString() {
        return "(" + this.field27861 + ", " + this.field27862 + ")";
    }
    
    public static Class7183 method22022(final Class7183 class7183, final Class7183 class7184) {
        return new Class7183(Math.min(class7183.field27861, class7184.field27861), Math.min(class7183.field27862, class7184.field27862));
    }
    
    public static Class7183 method22023(final Class7183 class7183, final Class7183 class7184) {
        return new Class7183(Math.max(class7183.field27861, class7184.field27861), Math.max(class7183.field27862, class7184.field27862));
    }
    
    static {
        field27857 = new Class7183(0, 0);
        field27858 = new Class7183(1, 0);
        field27859 = new Class7183(0, 1);
        field27860 = new Class7183(1, 1);
    }
}
