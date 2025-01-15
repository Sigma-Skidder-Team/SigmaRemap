// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;
import javax.annotation.concurrent.Immutable;

@Immutable
public class Class352 implements Comparable<Class352>
{
    public static final Class352 field2166;
    @Deprecated
    private final int field2167;
    @Deprecated
    private final int field2168;
    @Deprecated
    private final int field2169;
    
    public Class352(final int field2167, final int field2168, final int field2169) {
        this.field2167 = field2167;
        this.field2168 = field2168;
        this.field2169 = field2169;
    }
    
    public Class352(final double n, final double n2, final double n3) {
        this(Class9546.method35644(n), Class9546.method35644(n2), Class9546.method35644(n3));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class352) {
            final Class352 class352 = (Class352)o;
            return this.method1074() == class352.method1074() && this.method1075() == class352.method1075() && this.method1076() == class352.method1076();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.method1075() + this.method1076() * 31) * 31 + this.method1074();
    }
    
    @Override
    public int compareTo(final Class352 class352) {
        if (this.method1075() != class352.method1075()) {
            return this.method1075() - class352.method1075();
        }
        return (this.method1076() != class352.method1076()) ? (this.method1076() - class352.method1076()) : (this.method1074() - class352.method1074());
    }
    
    public int method1074() {
        return this.field2167;
    }
    
    public int method1075() {
        return this.field2168;
    }
    
    public int method1076() {
        return this.field2169;
    }
    
    public Class352 method1077() {
        return this.method1078(1);
    }
    
    public Class352 method1078(final int n) {
        return this.method1079(Class179.field511, n);
    }
    
    public Class352 method1079(final Class179 class179, final int n) {
        return (n != 0) ? new Class352(this.method1074() + class179.method785() * n, this.method1075() + class179.method786() * n, this.method1076() + class179.method787() * n) : this;
    }
    
    public Class352 method1080(final Class352 class352) {
        return new Class352(this.method1075() * class352.method1076() - this.method1076() * class352.method1075(), this.method1076() * class352.method1074() - this.method1074() * class352.method1076(), this.method1074() * class352.method1075() - this.method1075() * class352.method1074());
    }
    
    public boolean method1081(final Class352 class352, final double n) {
        return this.method1085(class352.method1074(), class352.method1075(), class352.method1076(), false) < n * n;
    }
    
    public boolean method1082(final Class5488 class5488, final double n) {
        return this.method1085(class5488.method16760(), class5488.method16761(), class5488.method16762(), true) < n * n;
    }
    
    public double method1083(final Class352 class352) {
        return this.method1085(class352.method1074(), class352.method1075(), class352.method1076(), true);
    }
    
    public double method1084(final Class5488 class5488, final boolean b) {
        return this.method1085(class5488.method16760(), class5488.method16761(), class5488.method16762(), b);
    }
    
    public double method1085(final double n, final double n2, final double n3, final boolean b) {
        final double n4 = b ? 0.5 : 0.0;
        final double n5 = this.method1074() + n4 - n;
        final double n6 = this.method1075() + n4 - n2;
        final double n7 = this.method1076() + n4 - n3;
        return n5 * n5 + n6 * n6 + n7 * n7;
    }
    
    public int method1086(final Class352 class352) {
        return (int)(Math.abs(class352.method1074() - this.method1074()) + (float)Math.abs(class352.method1075() - this.method1075()) + Math.abs(class352.method1076() - this.method1076()));
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x", this.method1074()).add("y", this.method1075()).add("z", this.method1076()).toString();
    }
    
    public String method1087() {
        return "" + this.method1074() + ", " + this.method1075() + ", " + this.method1076();
    }
    
    static {
        field2166 = new Class352(0, 0, 0);
    }
}
