// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;

public class Class9211
{
    public static Class2137 method33689(final int i, final boolean b) {
        Optional<Class2137> optional;
        if (!b) {
            optional = Class2137.method8292(i);
        }
        else {
            optional = Class2162.method8331(i);
        }
        if (optional.isPresent()) {
            return (Class2137)optional.get();
        }
        Class8563.method28793().method34742().severe("Could not find type id " + i + " isObject=" + b);
        return Class2137.field12474;
    }
}
