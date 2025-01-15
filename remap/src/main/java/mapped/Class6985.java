// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class6985 extends Class6977
{
    private static String[] field27274;
    
    public Class6985() {
        super(Class3871.class);
    }
    
    @Override
    public Set<Class9488> method21398(final BlockPos class354, final BlockState class355, final Class7614 class356) {
        final HashSet set = new HashSet();
        if (class355.method21772(Class3870.field17513) == Class182.field564) {
            final BlockState method23927 = class356.method23927(class354.method1139());
            if (method23927.method21696() instanceof Class3871) {
                set.add(new Class9488(class354, ((Class7097<O, BlockState>)method23927).method21773(Class3871.field17513, Class182.field564)));
            }
        }
        return set;
    }
}
