// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9560
{
    public static void method35771(final Class5207 class5207) {
        class5207.method16316(Class2044.field11648, 20, 21, new Class3053());
        class5207.method16316(Class2044.field11648, 39, 40, new Class3000());
        class5207.method16316(Class2044.field11648, 22, 23, new Class2996());
        class5207.method16316(Class2044.field11648, 70, 71, new Class2874());
        class5207.method16316(Class2044.field11648, 90, 91, new Class3067());
        class5207.method16313(Class2044.field11648, 9, 9, new Class3013());
        class5207.method16313(Class2044.field11648, 38, 38, new Class2907());
    }
    
    public static void method35772(final Class7562 class7562) {
        if (class7562 != null) {
            class7562.method23744(method35774(class7562.method23740()));
        }
    }
    
    public static void method35773(final Class7562 class7562) {
        if (class7562 != null) {
            class7562.method23744(method35775(class7562.method23740()));
        }
    }
    
    public static int method35774(final int n) {
        final Integer n2 = (Integer)Class9262.field39729.get((Object)n);
        if (n2 != null) {
            return n2;
        }
        Class8563.method28793().method34742().warning("Missing 1.15 item for 1.14 item " + n);
        return 1;
    }
    
    public static int method35775(final int i) {
        final Integer n = (Integer)Class9262.field39729.inverse().get((Object)i);
        return (n == null) ? 1 : n;
    }
}
