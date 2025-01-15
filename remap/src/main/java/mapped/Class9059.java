// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;

public class Class9059
{
    public static Class2148 method32624(final int i, final boolean b) {
        Optional<Class2148> optional;
        if (!b) {
            optional = Class2148.method8313(i);
        }
        else {
            optional = Class2015.method8056(i);
        }
        if (optional.isPresent()) {
            return (Class2148)optional.get();
        }
        Class8563.method28793().method34742().severe("Could not find type id " + i + " isObject=" + b);
        return Class2148.field12648;
    }
}
