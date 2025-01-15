// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;

public class Class9169
{
    public static Class1974 method33472(final int i, final boolean b) {
        Optional<Class1974> optional;
        if (!b) {
            optional = Class1974.method7983(i);
        }
        else {
            optional = Class2184.method8349(i);
        }
        if (optional.isPresent()) {
            return (Class1974)optional.get();
        }
        Class8563.method28793().method34742().severe("Could not find type id " + i + " isObject=" + b);
        return Class1974.field10859;
    }
}
