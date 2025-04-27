// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;

public class Class9264
{
    public static Class2072 method34174(final int i, final boolean b) {
        Optional<Class2072> optional;
        if (!b) {
            optional = Class2072.method8162(i);
        }
        else {
            optional = Class268.method914(i);
        }
        if (optional.isPresent()) {
            return optional.get();
        }
        Class8563.method28793().method34742().severe("Could not find type id " + i + " isObject=" + b);
        return Class2072.field11855;
    }
}
