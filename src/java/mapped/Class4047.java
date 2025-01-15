// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4047 extends Class3820
{
    public Class4047(final Class8959 class8959) {
        super(class8959);
        this.method11705(new Class1932("cast"), (class8321, class8322, class8323) -> {
            if (class8323 != null) {
                final boolean b = class8323.method2713() == class8321;
                boolean b2 = class8323.method2714() == class8321;
                if (class8323.method2713().method27622() instanceof Class4047) {
                    b2 = false;
                }
                if (b || b2) {
                    if (class8323 instanceof Class512) {
                        if (((Class512)class8323).field3036 != null) {
                            return 1.0f;
                        }
                    }
                }
                return 0.0f;
            }
            return 0.0f;
        });
    }
    
    @Override
    public Class9355<Class8321> method11695(final Class1847 class1847, final Class512 class1848, final Class316 class1849) {
        final Class8321 method2715 = class1848.method2715(class1849);
        if (class1848.field3036 == null) {
            class1847.method6706(null, class1848.method1938(), class1848.method1941(), class1848.method1945(), Class8520.field35038, Class286.field1584, 0.5f, 0.4f / (Class4047.field17363.nextFloat() * 0.4f + 0.8f));
            if (!class1847.field10067) {
                class1847.method6886(new Class425(class1848, class1847, Class8742.method30212(method2715), Class8742.method30213(method2715)));
            }
            class1848.method2859(Class8276.field33981.method8449(this));
        }
        else {
            if (!class1847.field10067) {
                method2715.method27636(class1848.field3036.method2077(method2715), class1848, class1851 -> class1851.method2795(class1850));
            }
            class1847.method6706(null, class1848.method1938(), class1848.method1941(), class1848.method1945(), Class8520.field35036, Class286.field1584, 1.0f, 0.4f / (Class4047.field17363.nextFloat() * 0.4f + 0.8f));
        }
        return Class9355.method34674(method2715);
    }
    
    @Override
    public int method11734() {
        return 1;
    }
}
