// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class8290
{
    public static String method27558(final String s) {
        final Class7266[] method17900;
        final Class7266[] array = method17900 = Class5977.method17900(s);
        for (int length = method17900.length, i = 0; i < length; ++i) {
            method27559(method17900[i]);
        }
        if (array.length != 1) {
            return Class5977.toString(array);
        }
        return Class5977.toString(array[0]);
    }
    
    private static void method27559(final Class7266 class7266) {
        if (class7266 != null) {
            if (class7266 instanceof Class7265) {
                final String method22220 = ((Class7265)class7266).method22220();
                if (method22220.startsWith("block.")) {
                    if (method22220.endsWith(".name")) {
                        ((Class7265)class7266).method22222(method22220.substring(0, method22220.length() - 5));
                    }
                }
                if (((Class7265)class7266).method22221() != null) {
                    final Iterator<Class7266> iterator = ((Class7265)class7266).method22221().iterator();
                    while (iterator.hasNext()) {
                        method27559(iterator.next());
                    }
                }
            }
            if (class7266.method22260() != null) {
                final Class7266[] method22221 = class7266.method22260().method23753();
                for (int length = method22221.length, i = 0; i < length; ++i) {
                    method27559(method22221[i]);
                }
            }
            if (class7266.method22258() != null) {
                final Iterator<Class7266> iterator2 = class7266.method22258().iterator();
                while (iterator2.hasNext()) {
                    method27559(iterator2.next());
                }
            }
        }
    }
}
