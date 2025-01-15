// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public final class Class6398 extends Class6397
{
    private static String[] field25516;
    
    @Override
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        final Class1847 method16763 = class5491.method16763();
        if (!method16763.method6678()) {
            this.field25515 = false;
            final Class354 method16764 = class5491.method16764().method1149(class5491.method16765().method21772((Class7111<Class179>)Class3955.field17859));
            for (final Class802 class5493 : method16763.method7128((Class<? extends Class802>)Class802.class, new Class6221(method16764))) {
                if (!class5493.method1768()) {
                    continue;
                }
                if (class5493.method4636()) {
                    continue;
                }
                if (class5493.method2625()) {
                    continue;
                }
                class5493.method4633();
                if (class5492.method27635(1, method16763.field10062, null)) {
                    class5492.method27691(0);
                }
                this.field25515 = true;
                break;
            }
            if (!this.field25515) {
                final Class7096 method16765 = method16763.method6701(method16764);
                if (method16765.method21755(Class7188.field27931)) {
                    if (method16765.method21772((Class7111<Integer>)Class3961.field17902) >= 5) {
                        if (class5492.method27635(1, method16763.field10062, null)) {
                            class5492.method27691(0);
                        }
                        Class3961.method12083(method16763, method16764);
                        ((Class3961)method16765.method21696()).method12085(method16763, method16765, method16764, null, Class2144.field12625);
                        this.field25515 = true;
                    }
                }
            }
        }
        return class5492;
    }
}
