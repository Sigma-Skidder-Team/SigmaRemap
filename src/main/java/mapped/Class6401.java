// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6401 extends Class6397
{
    private static String[] field25519;
    
    @Override
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        this.field25515 = false;
        final Class3820 method27622 = class5492.method27622();
        if (method27622 instanceof Class4036) {
            final Class179 class5493 = class5491.method16765().method21772((Class7111<Class179>)Class3955.field17859);
            final Class354 method27623 = class5491.method16764().method1149(class5493);
            this.field25515 = (((Class4036)method27622).method12229(new Class7073(class5491.method16763(), method27623, class5493, class5492, class5491.method16763().method6961(method27623.method1139()) ? class5493 : Class179.field512)) == Class2201.field13400);
        }
        return class5492;
    }
}
