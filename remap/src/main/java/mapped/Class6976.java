// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class6976 extends Class6977
{
    private static String[] field27273;
    
    public Class6976() {
        super(Class3969.class);
    }
    
    @Override
    public Set<Class9488> method21398(final Class354 class354, final Class7096 class355, final Class7614 class356) {
        final HashSet set = new HashSet();
        if (class355.method21772(Class3969.field17935) == Class182.field565) {
            final Class7096 method23927 = class356.method23927(class354.method1137());
            if (method23927.method21696() instanceof Class3969) {
                final Class7096 class357 = ((Class7097<O, Class7096>)class355).method21773(Class3969.field17933, (Comparable)((Class7097<Object, Class7096>)method23927).method21772((Class7111<V>)Class3969.field17933));
                set.add(new Class9488(class354, class357));
                set.add(new Class9488(class354.method1137(), (Class7096)((Class7097<Object, Object>)((Class7097<Object, Class7096>)method23927).method21773((Class7111<Comparable>)Class3969.field17931, (Comparable)class357.method21772((Class7111<V>)Class3969.field17931))).method21773((Class7111<Comparable>)Class3969.field17932, (Comparable)class357.method21772((Class7111<V>)Class3969.field17932))));
            }
        }
        if (class355.method21772(Class3969.field17935) == Class182.field564) {
            final Class7096 method23928 = class356.method23927(class354.method1139());
            if (method23928.method21696() instanceof Class3969) {
                final Class7096 class358 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)class355).method21773((Class7111<Comparable>)Class3969.field17931, (Comparable)((Class7097<Object, Class7096>)method23928).method21772((Class7111<V>)Class3969.field17931))).method21773((Class7111<Comparable>)Class3969.field17932, (Comparable)((Class7097<Object, Class7096>)method23928).method21772((Class7111<V>)Class3969.field17932));
                set.add(new Class9488(class354, class358));
                set.add(new Class9488(class354.method1139(), ((Class7097<Object, Class7096>)method23928).method21773(Class3969.field17933, (Comparable)class358.method21772((Class7111<V>)Class3969.field17933))));
            }
        }
        return set;
    }
}
