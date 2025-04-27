// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;

public class Class7889
{
    public static Class1989 method25541(final int i) {
        final Optional<Class1989> method8004 = Class1989.method8004(i);
        if (method8004.isPresent()) {
            return method8004.get();
        }
        Class8563.method28793().method34742().severe("Could not find type id " + i);
        return Class1989.field10999;
    }
}
