// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;

public class Class5093 implements Class5092<Class8545>
{
    public Class8545 method15970(final JsonObject jsonObject) {
        final Class2250 method17872 = Class5953.method17872(jsonObject.get("description"));
        if (method17872 != null) {
            return new Class8545(method17872, Class9583.method35909(jsonObject, "pack_format"));
        }
        throw new JsonParseException("Invalid/missing description!");
    }
    
    @Override
    public String method15968() {
        return "pack";
    }
}
