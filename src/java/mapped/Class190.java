// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public enum Class190
{
    field622("http/1.0"), 
    field623("http/1.1"), 
    @Deprecated
    field624("spdy/3.1"), 
    field625("h2");
    
    private final String field626;
    
    private Class190(final String field626) {
        this.field626 = field626;
    }
    
    public static Class190 method831(final String str) throws IOException {
        if (str.equals(Class190.field622.field626)) {
            return Class190.field622;
        }
        if (str.equals(Class190.field623.field626)) {
            return Class190.field623;
        }
        if (str.equals(Class190.field625.field626)) {
            return Class190.field625;
        }
        if (!str.equals(Class190.field624.field626)) {
            throw new IOException("Unexpected protocol: " + str);
        }
        return Class190.field624;
    }
    
    @Override
    public String toString() {
        return this.field626;
    }
}
