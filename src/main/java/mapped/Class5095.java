// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;

public class Class5095 implements Class5092<Class9413>
{
    public Class9413 method15972(final JsonObject jsonObject) {
        return new Class9413(Class9583.method35901(jsonObject, "blur", false), Class9583.method35901(jsonObject, "clamp", false));
    }
    
    @Override
    public String method15968() {
        return "texture";
    }
}
