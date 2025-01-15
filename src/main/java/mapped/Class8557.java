// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

public final class Class8557
{
    private static final Gson field35934;
    
    public static Gson method28750() {
        return Class8557.field35934;
    }
    
    public static GsonBuilder method28751() {
        return new GsonBuilder();
    }
    
    private Class8557() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
    
    static {
        field35934 = method28751().create();
    }
}
