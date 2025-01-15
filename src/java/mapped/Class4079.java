// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class4079 extends Class3820
{
    private static String[] field18184;
    
    public Class4079(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final Class1847 method21654 = class7075.method21654();
        final Class354 method21655 = class7075.method21639();
        if (!method21654.method6701(method21655).method21696().method11785(Class7188.field27911)) {
            return Class2201.field13402;
        }
        final Class512 method21656 = class7075.method21652();
        if (!method21654.field10067) {
            if (method21656 != null) {
                method12284(method21656, method21654, method21655);
            }
        }
        return Class2201.field13400;
    }
    
    public static Class2201 method12284(final Class512 class512, final Class1847 class513, final Class354 class514) {
        Class399 method5205 = null;
        boolean b = false;
        final int method5206 = class514.method1074();
        final int method5207 = class514.method1075();
        final int method5208 = class514.method1076();
        for (final Class759 class515 : class513.method7128((Class<? extends Class759>)Class759.class, new Class6221(method5206 - 7.0, method5207 - 7.0, method5208 - 7.0, method5206 + 7.0, method5207 + 7.0, method5208 + 7.0))) {
            if (class515.method4206() != class512) {
                continue;
            }
            if (method5205 == null) {
                method5205 = Class863.method5205(class513, class514);
            }
            class515.method4207(method5205, true);
            b = true;
        }
        return (!b) ? Class2201.field13402 : Class2201.field13400;
    }
}
