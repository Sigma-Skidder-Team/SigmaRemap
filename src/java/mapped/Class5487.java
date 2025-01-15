// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class5487 implements Class5488
{
    public static final Class5487 field22769;
    public double field22770;
    public double field22771;
    public double field22772;
    
    public Class5487(final double field22770, final double field22771, final double field22772) {
        this.field22770 = field22770;
        this.field22771 = field22771;
        this.field22772 = field22772;
    }
    
    public Class5487(final Class9138 class9138) {
        this(class9138.method33311(), class9138.method33312(), class9138.method33313());
    }
    
    public Class5487(final Class352 class352) {
        this(class352.method1074(), class352.method1075(), class352.method1076());
    }
    
    public Class5487 method16737(final Class5487 class5487) {
        return new Class5487(class5487.field22770 - this.field22770, class5487.field22771 - this.field22771, class5487.field22772 - this.field22772);
    }
    
    public Class5487 method16738() {
        final double n = Class9546.method35641(this.field22770 * this.field22770 + this.field22771 * this.field22771 + this.field22772 * this.field22772);
        return (n >= 1.0E-4) ? new Class5487(this.field22770 / n, this.field22771 / n, this.field22772 / n) : Class5487.field22769;
    }
    
    public double method16739(final Class5487 class5487) {
        return this.field22770 * class5487.field22770 + this.field22771 * class5487.field22771 + this.field22772 * class5487.field22772;
    }
    
    public Class5487 method16740(final Class5487 class5487) {
        return new Class5487(this.field22771 * class5487.field22772 - this.field22772 * class5487.field22771, this.field22772 * class5487.field22770 - this.field22770 * class5487.field22772, this.field22770 * class5487.field22771 - this.field22771 * class5487.field22770);
    }
    
    public Class5487 method16741(final Class5487 class5487) {
        return this.method16742(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public Class5487 method16742(final double n, final double n2, final double n3) {
        return this.method16744(-n, -n2, -n3);
    }
    
    public Class5487 method16743(final Class5487 class5487) {
        return this.method16744(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public Class5487 method16744(final double n, final double n2, final double n3) {
        return new Class5487(this.field22770 + n, this.field22771 + n2, this.field22772 + n3);
    }
    
    public double method16745(final Class5487 class5487) {
        final double n = class5487.field22770 - this.field22770;
        final double n2 = class5487.field22771 - this.field22771;
        final double n3 = class5487.field22772 - this.field22772;
        return Class9546.method35641(n * n + n2 * n2 + n3 * n3);
    }
    
    public double method16746(final Class5487 class5487) {
        final double n = class5487.field22770 - this.field22770;
        final double n2 = class5487.field22771 - this.field22771;
        final double n3 = class5487.field22772 - this.field22772;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public double method16747(final double n, final double n2, final double n3) {
        final double n4 = n - this.field22770;
        final double n5 = n2 - this.field22771;
        final double n6 = n3 - this.field22772;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }
    
    public Class5487 method16748(final double n) {
        return this.method16751(n, n, n);
    }
    
    public Class5487 method16749() {
        return this.method16748(-1.0);
    }
    
    public Class5487 method16750(final Class5487 class5487) {
        return this.method16751(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public Class5487 method16751(final double n, final double n2, final double n3) {
        return new Class5487(this.field22770 * n, this.field22771 * n2, this.field22772 * n3);
    }
    
    public double method16752() {
        return Class9546.method35641(this.field22770 * this.field22770 + this.field22771 * this.field22771 + this.field22772 * this.field22772);
    }
    
    public double method16753() {
        return this.field22770 * this.field22770 + this.field22771 * this.field22771 + this.field22772 * this.field22772;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class5487) {
            final Class5487 class5487 = (Class5487)o;
            return Double.compare(class5487.field22770, this.field22770) == 0 && Double.compare(class5487.field22771, this.field22771) == 0 && Double.compare(class5487.field22772, this.field22772) == 0;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.field22770);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.field22771);
        final int n2 = 31 * n + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32);
        final long doubleToLongBits3 = Double.doubleToLongBits(this.field22772);
        return 31 * n2 + (int)(doubleToLongBits3 ^ doubleToLongBits3 >>> 32);
    }
    
    @Override
    public String toString() {
        return "(" + this.field22770 + ", " + this.field22771 + ", " + this.field22772 + ")";
    }
    
    public Class5487 method16754(final float n) {
        final float method35639 = Class9546.method35639(n);
        final float method35640 = Class9546.method35638(n);
        return new Class5487(this.field22770, this.field22771 * method35639 + this.field22772 * method35640, this.field22772 * method35639 - this.field22771 * method35640);
    }
    
    public Class5487 method16755(final float n) {
        final float method35639 = Class9546.method35639(n);
        final float method35640 = Class9546.method35638(n);
        return new Class5487(this.field22770 * method35639 + this.field22772 * method35640, this.field22771, this.field22772 * method35639 - this.field22770 * method35640);
    }
    
    public static Class5487 method16756(final Class9544 class9544) {
        return method16757(class9544.field41091, class9544.field41092);
    }
    
    public static Class5487 method16757(final float n, final float n2) {
        final float method35639 = Class9546.method35639(-n2 * 0.017453292f - 3.1415927f);
        final float method35640 = Class9546.method35638(-n2 * 0.017453292f - 3.1415927f);
        final float n3 = -Class9546.method35639(-n * 0.017453292f);
        return new Class5487(method35640 * n3, Class9546.method35638(-n * 0.017453292f), method35639 * n3);
    }
    
    public Class5487 method16758(final EnumSet<Class111> set) {
        return new Class5487(set.contains(Class111.field351) ? Class9546.method35644(this.field22770) : this.field22770, set.contains(Class111.field352) ? Class9546.method35644(this.field22771) : this.field22771, set.contains(Class111.field353) ? Class9546.method35644(this.field22772) : this.field22772);
    }
    
    public double method16759(final Class111 class111) {
        return class111.method605(this.field22770, this.field22771, this.field22772);
    }
    
    @Override
    public final double method16760() {
        return this.field22770;
    }
    
    @Override
    public final double method16761() {
        return this.field22771;
    }
    
    @Override
    public final double method16762() {
        return this.field22772;
    }
    
    static {
        field22769 = new Class5487(0.0, 0.0, 0.0);
    }
}
