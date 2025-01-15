// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.Iterator;
import com.google.gson.JsonElement;
import java.io.Reader;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.InputStreamReader;
import com.google.common.base.Charsets;
import java.util.HashMap;
import java.util.Map;

public class Class7519 implements Class7518
{
    private final Map<String, String> field29126;
    
    public Class7519(final String name) throws IOException {
        this.field29126 = new HashMap<String, String>();
        try (final InputStreamReader inputStreamReader = new InputStreamReader(Class7519.class.getResourceAsStream(name), Charsets.UTF_8)) {
            for (final Map.Entry<String, V> entry : ((JsonObject)new Gson().fromJson((Reader)inputStreamReader, (Class)JsonObject.class)).entrySet()) {
                this.field29126.put(entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
            }
        }
    }
    
    @Override
    public String method23447(final String s) {
        return this.field29126.get(s);
    }
    
    public Map<String, String> method23450() {
        return this.field29126;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class7519)) {
            return false;
        }
        final Class7519 class7519 = (Class7519)o;
        if (class7519.method23451(this)) {
            final Map<String, String> method23450 = this.method23450();
            final Map<String, String> method23451 = class7519.method23450();
            if (method23450 != null) {
                if (!method23450.equals(method23451)) {
                    return false;
                }
            }
            else if (method23451 != null) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public boolean method23451(final Object o) {
        return o instanceof Class7519;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final Map<String, String> method23450 = this.method23450();
        return n * 59 + ((method23450 != null) ? method23450.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "TranslationRegistry.JsonProvider()";
    }
}
