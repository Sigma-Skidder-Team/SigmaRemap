// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6427 extends Class6397
{
    private static String[] field25535;
    
    @Override
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        final Class1847 method16763 = class5491.method16763();
        final Class179 class5493 = class5491.method16765().method21772((Class7111<Class179>)Class3955.field17859);
        final Class354 method16764 = class5491.method16764().method1149(class5493);
        if (method16763.method6961(method16764) && Class3938.method12052(method16763, method16764, class5492)) {
            method16763.method6688(method16764, ((Class7097<O, Class7096>)Class7521.field29455.method11878()).method21773((Class7111<Comparable>)Class3936.field17819, (class5493.method790() != Class111.field352) ? (class5493.method782().method780() * 4) : 0), 3);
            final Class436 method16765 = method16763.method6727(method16764);
            if (method16765 instanceof Class493) {
                Class3938.method12051(method16763, method16764, (Class493)method16765);
            }
            class5492.method27693(1);
            this.field25515 = true;
        }
        else {
            this.field25515 = Class4055.method12256(class5491, class5492);
        }
        return class5492;
    }
}
