// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4059 extends Class3820
{
    private static String[] field18154;
    
    public Class4059(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final Class1847 method21654 = class7075.method21654();
        final Class354 method21655 = class7075.method21639();
        final Class7096 method21656 = method21654.method6701(method21655);
        if (method21656.method21696() != Class7521.field29286 && method21656.method21696() != Class7521.field29172) {
            return Class2201.field13403;
        }
        final Class354 method21657 = method21655.method1137();
        if (!method21654.method6961(method21657)) {
            return Class2201.field13403;
        }
        final double n = method21657.method1074();
        final double n2 = method21657.method1075();
        final double n3 = method21657.method1076();
        if (method21654.method7127(null, new Class6221(n, n2, n3, n + 1.0, n2 + 2.0, n3 + 1.0)).isEmpty()) {
            if (!method21654.field10067) {
                final Class858 class7076 = new Class858(method21654, n + 0.5, n2, n3 + 0.5);
                class7076.method5184(false);
                method21654.method6886(class7076);
                if (method21654.field10063 instanceof Class6738) {
                    ((Class6738)method21654.field10063).method20509().method29253();
                }
            }
            class7075.method21651().method27693(1);
            return Class2201.field13400;
        }
        return Class2201.field13403;
    }
    
    @Override
    public boolean method11730(final Class8321 class8321) {
        return true;
    }
}
