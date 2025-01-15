// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class7349 implements Class7345
{
    private final int field28365 = 7110;
    private final int field28366 = 7173;
    private final int field28367 = 6854;
    private final int field28368 = 7109;
    
    @Override
    public int method22560(final Class6108 class6108, final Class74 class6109) {
        final Class6647 class6110 = class6108.method18207(Class6647.class);
        final Class8322 class6111 = new Class8322(this.method22563(class6109.method419("x")), this.method22563(class6109.method419("y")), this.method22563(class6109.method419("z")));
        if (class6110.method20193(class6111)) {
            int method18137 = class6110.method20194(class6111).method18137();
            final Class61 method18138 = class6109.method419("Base");
            int intValue = 0;
            if (method18138 != null) {
                intValue = ((Number)class6109.method419("Base").method374()).intValue();
            }
            if (method18137 >= 6854 && method18137 <= 7109) {
                method18137 += (15 - intValue) * 16;
            }
            else if (method18137 >= 7110 && method18137 <= 7173) {
                method18137 += (15 - intValue) * 4;
            }
            else {
                Class8563.method28793().method34742().warning("Why does this block have the banner block entity? :(" + class6109);
            }
            if (class6109.method419("Patterns") instanceof Class60) {
                for (final Class61 class6112 : class6109.method419("Patterns")) {
                    if (!(class6112 instanceof Class74)) {
                        continue;
                    }
                    final Class61 method18139 = ((Class74)class6112).method419("Color");
                    if (!(method18139 instanceof Class68)) {
                        continue;
                    }
                    ((Class68)method18139).method401(15 - (int)method18139.method374());
                }
            }
            final Class71 method18140 = class6109.method419("CustomName");
            if (method18140 instanceof Class71) {
                method18140.method407(Class8672.method29685(method18140.method406()));
            }
            return method18137;
        }
        Class8563.method28793().method34742().warning("Received an banner color update packet, but there is no banner! O_o " + class6109);
        return -1;
    }
    
    private long method22563(final Class61 class61) {
        return (long)class61.method374();
    }
}
