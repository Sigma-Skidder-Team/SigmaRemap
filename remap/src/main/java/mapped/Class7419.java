// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7419 implements Class7420
{
    @Override
    public Class51 method22833(final String s, final Class51 class51) {
        return s.startsWith("data/minecraft/structures/") ? method22835(method22834(class51)) : class51;
    }
    
    private static Class51 method22834(final Class51 class51) {
        if (!class51.method316("DataVersion", 99)) {
            class51.method298("DataVersion", 500);
        }
        return class51;
    }
    
    private static Class51 method22835(final Class51 class51) {
        final Class6585 class52 = new Class6585();
        class52.method19969(Class9346.method34651(Class5494.method16768(), Class1959.field10680, class51, class51.method319("DataVersion")));
        return class52.method19968(new Class51());
    }
}
