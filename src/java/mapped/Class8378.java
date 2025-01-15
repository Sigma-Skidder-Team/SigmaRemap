// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;

public class Class8378
{
    private static String field34352;
    private static final Set<String> field34353;
    
    public static void method27917(final Class5207 class5207) {
        Class8378.field34352 = "ViaVersion|" + class5207.getClass().getSimpleName();
        class5207.method16316(Class2044.field11648, 20, -1, new Class2951());
        class5207.method16316(Class2044.field11648, 21, 20, new Class2987());
        class5207.method16316(Class2044.field11648, 23, 22, new Class2981());
        class5207.method16316(Class2044.field11648, 25, 24, new Class2785());
        class5207.method16316(Class2044.field11648, 66, 70, new Class2949());
        class5207.method16316(Class2044.field11648, 84, 90, new Class2952());
        class5207.method16313(Class2044.field11648, 8, 9, new Class3069());
        class5207.method16313(Class2044.field11648, 31, 33, new Class2928());
        class5207.method16313(Class2044.field11648, 36, 38, new Class2829());
    }
    
    public static void method27918(final Class7562 class7562) {
        if (class7562 != null) {
            class7562.method23744(method27919(class7562.method23740()));
            final Class74 method23743;
            if ((method23743 = class7562.method23743()) != null) {
                final Class61 method23744 = method23743.method419("display");
                if (method23744 instanceof Class74) {
                    final Class74 class7563 = (Class74)method23744;
                    final Class61 method23745 = class7563.method419("Lore");
                    if (method23745 instanceof Class60) {
                        final Class60 class7564 = (Class60)method23745;
                        class7563.method420(Class7185.method22027(Class8378.field34352 + "|Lore", Class7185.method22026(class7564)));
                        for (final Class61 class7565 : class7564) {
                            if (!(class7565 instanceof Class71)) {
                                continue;
                            }
                            ((Class71)class7565).method407(Class8672.method29685(((Class71)class7565).method406()));
                        }
                    }
                }
            }
        }
    }
    
    public static int method27919(final int n) {
        final Integer n2 = (Integer)Class7504.field29088.get((Object)n);
        if (n2 != null) {
            return n2;
        }
        Class8563.method28793().method34742().warning("Missing 1.14 item for 1.13.2 item " + n);
        return 1;
    }
    
    public static void method27920(final Class7562 class7562) {
        if (class7562 != null) {
            class7562.method23744(method27921(class7562.method23740()));
            final Class74 method23743;
            if ((method23743 = class7562.method23743()) != null) {
                final Class61 method23744 = method23743.method419("display");
                if (method23744 instanceof Class74) {
                    final Class74 class7563 = (Class74)method23744;
                    final Class61 method23745 = class7563.method419("Lore");
                    if (method23745 instanceof Class60) {
                        final Class60 class7564 = (Class60)method23745;
                        final Class60 class7565 = class7563.method419(Class8378.field34352 + "|Lore");
                        if (class7565 == null) {
                            for (final Class61 class7566 : class7564) {
                                if (!(class7566 instanceof Class71)) {
                                    continue;
                                }
                                ((Class71)class7566).method407(Class8672.method29686(((Class71)class7566).method406()));
                            }
                        }
                        else {
                            class7563.method420(Class7185.method22027("Lore", Class7185.method22026(class7565)));
                        }
                        class7563.method421(Class8378.field34352 + "|Lore");
                    }
                }
            }
        }
    }
    
    public static int method27921(final int i) {
        final Integer n = (Integer)Class7504.field29088.inverse().get((Object)i);
        return (n == null) ? 1 : n;
    }
    
    static {
        field34353 = Sets.newHashSet((Object[])new String[] { "crafting_special_banneraddpattern", "crafting_special_repairitem" });
    }
}
