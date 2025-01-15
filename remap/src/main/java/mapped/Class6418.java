// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6418 extends Class6404
{
    private static String[] field25523;
    
    @Override
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        final Class179 class5493 = class5491.method16765().method21772((Class7111<Class179>)Class3955.field17859);
        final double n = class5493.method785();
        final double n2 = class5493.method786();
        final double n3 = class5493.method787();
        final Class406 class5494 = new Class406(class5491.method16763(), class5492, class5491.method16760() + n, class5491.method16764().method1075() + 0.2f, class5491.method16762() + n3, true);
        class5494.method1958(n, n2, n3, 0.5f, 1.0f);
        class5491.method16763().method6886(class5494);
        class5492.method27693(1);
        return class5492;
    }
    
    @Override
    public void method19088(final Class5491 class5491) {
        class5491.method16763().method6955(1004, class5491.method16764(), 0);
    }
}
