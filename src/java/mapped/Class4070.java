// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4070 extends Class3820
{
    private static String[] field18164;
    
    public Class4070(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class8321 method11707(final Class8321 class8321, final Class1847 class8322, final Class511 class8323) {
        final Class8321 method11707 = super.method11707(class8321, class8322, class8323);
        if (!class8322.field10067) {
            final double method11708 = class8323.method1938();
            final double method11709 = class8323.method1941();
            final double method11710 = class8323.method1945();
            for (int i = 0; i < 16; ++i) {
                final double n = class8323.method1938() + (class8323.method2633().nextDouble() - 0.5) * 16.0;
                final double method11711 = Class9546.method35654(class8323.method1941() + (class8323.method2633().nextInt(16) - 8), 0.0, class8322.method6778() - 1);
                final double n2 = class8323.method1945() + (class8323.method2633().nextDouble() - 0.5) * 16.0;
                if (class8323.method1805()) {
                    class8323.method1784();
                }
                if (class8323.method2775(n, method11711, n2, true)) {
                    class8322.method6706(null, method11708, method11709, method11710, Class8520.field35075, Class286.field1585, 1.0f, 1.0f);
                    class8323.method1695(Class8520.field35075, 1.0f, 1.0f);
                    break;
                }
            }
            if (class8323 instanceof Class512) {
                ((Class512)class8323).method2906().method25772(this, 20);
            }
        }
        return method11707;
    }
}
