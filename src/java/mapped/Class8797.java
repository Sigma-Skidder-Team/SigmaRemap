// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8797
{
    private static String[] field36987;
    private double field36988;
    private double field36989;
    private double field36990;
    public static Class869 field36991;
    public Class8733 field36992;
    private static Class8422[] field36993;
    
    public Class8797(final double n, final double n2, final double n3, final Class8733 field36992) {
        this.method30678(n, n2, n3);
        this.field36992 = field36992;
    }
    
    public Class8797(final double n, final double n2, final double n3) {
        this.method30678(n, n2, n3);
    }
    
    public Class8797(final Class354 class354) {
        this.method30678(class354.method1074(), class354.method1075(), class354.method1076());
    }
    
    public void method30678(final double field36988, final double field36989, final double field36990) {
        this.field36988 = field36988;
        this.field36989 = field36989;
        this.field36990 = field36990;
    }
    
    public Class8797 method30679(final double n, final double n2, final double n3) {
        return new Class8797(this.field36988 + n, this.field36989 + n2, this.field36990 + n3);
    }
    
    public void method30680(final float n) {
        this.field36988 = n;
    }
    
    public void method30681(final float n) {
        this.field36989 = n;
    }
    
    public void method30682(final float n) {
        this.field36990 = n;
    }
    
    public double method30683() {
        return this.field36988;
    }
    
    public double method30684() {
        return this.field36989;
    }
    
    public double method30685() {
        return this.field36990;
    }
    
    public Class5487 method30686() {
        return new Class5487(this.method30683(), this.method30684(), this.method30685()).method16744(0.5, 0.0, 0.5);
    }
    
    public float method30687(final Class399 class399) {
        final double n = class399.field2395 - this.method30683();
        final double n2 = class399.field2396 - this.method30684();
        final double n3 = class399.field2397 - this.method30685();
        return Class9546.method35641(n * n + n2 * n2 + n3 * n3);
    }
    
    public float method30688(final Class8797 class8797) {
        final double n = class8797.method30683() - this.method30683();
        final double n2 = class8797.method30684() - this.method30684();
        final double n3 = class8797.method30685() - this.method30685();
        return Class9546.method35641(n * n + n2 * n2 + n3 * n3);
    }
    
    public double method30689(final Class8797 class8797) {
        final double n = class8797.method30683() - this.method30683();
        final double n2 = class8797.method30684() - this.method30684();
        final double n3 = class8797.method30685() - this.method30685();
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public Class8797 method30690(final float n, final float n2, final float n3) {
        return new Class8797(this.method30683() + n, this.method30684() + n2, this.method30685() + n3, this.field36992);
    }
    
    public double method30691(final Class8797 class8797) {
        return Math.abs(class8797.method30683() - this.method30683()) + Math.abs(class8797.method30685() - this.method30685()) + Math.abs(class8797.method30684() - this.method30684());
    }
    
    public Class354 method30692() {
        return new Class354(this.method30683(), this.method30684(), this.method30685());
    }
    
    public boolean method30693() {
        return Class8797.field36991.field4683.method6701(this.method30692()).method21696() != Class7521.field29174 && Class8797.field36991.field4683.method6701(this.method30692()).method21696() != Class7521.field29173 && this.method30699(this.method30692()) && this.method30699(this.method30692().method1137());
    }
    
    public boolean method30694() {
        if (Class8797.field36991.field4683.method6701(this.method30692()).method21696() == Class7521.field29174) {
            return false;
        }
        if (Class8797.field36991.field4683.method6701(this.method30692()).method21696() != Class7521.field29173) {
            if (this.method30699(this.method30692())) {
                if (this.method30699(this.method30692().method1137())) {
                    if (!this.method30699(this.method30692().method1139())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public static boolean method30695(final Class354 class354) {
        for (final Class8422 class355 : Class8797.field36993) {
            final Class7096 method6701 = Class8797.field36991.field4683.method6701(class354.method1133(class355.field34567, class355.field34568, class355.field34569));
            if (method6701.method21696() == Class7521.field29173 || method6701.method21696() == Class7521.field29174) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method30696(final Class354 class354) {
        for (final Class8422 class355 : Class8797.field36993) {
            if (Class8797.field36991.field4683.method6701(class354.method1133(class355.field34567, class355.field34568, class355.field34569)).method21706()) {
                return false;
            }
        }
        return true;
    }
    
    public boolean method30697() {
        for (final Class8422 class8422 : Class8797.field36993) {
            final Class7096 method6701 = Class8797.field36991.field4683.method6701(this.method30692().method1133(class8422.field34567, class8422.field34568, class8422.field34569));
            if (method6701.method21696() == Class7521.field29173 || method6701.method21696() == Class7521.field29174) {
                return true;
            }
        }
        for (final Class8422 class8423 : Class8797.field36993) {
            final Class7096 method6702 = Class8797.field36991.field4683.method6701(this.method30692().method1133(class8423.field34567, class8423.field34568 + 1.0, class8423.field34569));
            if (method6702.method21696() == Class7521.field29173 || method6702.method21696() == Class7521.field29174) {
                return true;
            }
        }
        return Class8797.field36991.field4683.method6701(this.method30692().method1138(2)).method21696() instanceof Class3986 && !this.field36992.field36694.contains(this.method30692().method1138(2).method1132());
    }
    
    public boolean method30698() {
        if (!this.method30697()) {
            if (Class8797.field36991.field4683.method6701(this.method30692()).method21696() != Class7521.field29172) {
                if (Class8797.field36991.field4683.method6701(this.method30692().method1137()).method21696() != Class7521.field29172) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean method30699(final Class354 class354) {
        return this.field36992.field36694.contains(class354.method1132()) || Class869.method5277().field4683.method6701(class354).method21727(Class8797.field36991.field4683, class354).method24540();
    }
    
    public boolean method30700() {
        final Class354 method30692 = this.method30692();
        return !this.field36992.field36694.contains(this.method30692().method1132()) && !Class869.method5277().field4683.method6701(method30692).method21727(Class8797.field36991.field4683, method30692).method24540() && Class869.method5277().field4683.method6701(method30692).method21727(Class8797.field36991.field4683, method30692).method24537().method18507() == 1.0;
    }
    
    static {
        Class8797.field36991 = Class869.method5277();
        Class8797.field36993 = new Class8422[] { new Class8422(1.0, 0.0, 0.0), new Class8422(-1.0, 0.0, 0.0), new Class8422(0.0, 0.0, 1.0), new Class8422(0.0, 0.0, -1.0), new Class8422(0.0, -1.0, 0.0), new Class8422(0.0, 1.0, 0.0) };
    }
}
