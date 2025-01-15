// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonObject;

public class Class6022<T>
{
    private static String[] field24510;
    private final T field24511;
    
    public Class6022(final T field24511) {
        this.field24511 = field24511;
    }
    
    public Class6022(final T field24511, final JsonObject jsonObject) {
        this.field24511 = field24511;
    }
    
    @Nullable
    public T method17942() {
        return this.field24511;
    }
    
    public boolean method17943() {
        return false;
    }
    
    public void method17944(final JsonObject jsonObject) {
    }
}
