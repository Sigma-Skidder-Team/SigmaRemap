// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4078 extends Class3820
{
    private static String[] field18183;
    
    public Class4078(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class8321 method11707(final Class8321 class8321, final Class1847 class8322, final Class511 class8323) {
        if (class8323 instanceof Class513) {
            final Class513 class8324 = (Class513)class8323;
            Class7770.field31800.method13819(class8324, class8321);
            class8324.method2859(Class8276.field33981.method8449(this));
        }
        if (class8323 instanceof Class512) {
            if (!((Class512)class8323).field3025.field27304) {
                class8321.method27693(1);
            }
        }
        if (!class8322.field10067) {
            class8323.method2650();
        }
        return class8321.method27620() ? new Class8321(Class7739.field31349) : class8321;
    }
    
    @Override
    public int method11726(final Class8321 class8321) {
        return 32;
    }
    
    @Override
    public Class1992 method11725(final Class8321 class8321) {
        return Class1992.field11156;
    }
    
    @Override
    public Class9355<Class8321> method11695(final Class1847 class1847, final Class512 class1848, final Class316 class1849) {
        class1848.method2762(class1849);
        return Class9355.method34674(class1848.method2715(class1849));
    }
}
