// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public final class Class6426 extends Class6404
{
    private static String[] field25523;
    
    @Override
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        final Class179 class5493 = class5491.method16765().method21772((Class7111<Class179>)Class3955.field17859);
        final Class5488 method12072 = Class3955.method12072(class5491);
        final double n = method12072.method16760() + class5493.method785() * 0.3f;
        final double n2 = method12072.method16761() + class5493.method786() * 0.3f;
        final double n3 = method12072.method16762() + class5493.method787() * 0.3f;
        final Class1847 method12073 = class5491.method16763();
        final Random field10062 = method12073.field10062;
        method12073.method6886(Class8349.method27851(new Class418(method12073, n, n2, n3, field10062.nextGaussian() * 0.05 + class5493.method785(), field10062.nextGaussian() * 0.05 + class5493.method786(), field10062.nextGaussian() * 0.05 + class5493.method787()), class5495 -> class5495.method2029(class5494)));
        class5492.method27693(1);
        return class5492;
    }
    
    @Override
    public void method19088(final Class5491 class5491) {
        class5491.method16763().method6955(1018, class5491.method16764(), 0);
    }
}
