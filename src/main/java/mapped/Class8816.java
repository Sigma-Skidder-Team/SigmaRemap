// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;

public class Class8816
{
    public static Class266 method30754(final int i) {
        final Optional<Class266> method907 = Class266.method907(i);
        if (method907.isPresent()) {
            return (Class266)method907.get();
        }
        Class8563.method28793().method34742().severe("Could not find type id " + i);
        return Class266.field1294;
    }
}
