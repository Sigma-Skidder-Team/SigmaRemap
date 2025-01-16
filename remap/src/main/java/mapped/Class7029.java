// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7029 extends Class7020<Class153>
{
    public Class7029() {
        super(new ResourceLocation("match_tool"), Class153.class);
    }
    
    public void method21503(final JsonObject jsonObject, final Class153 class153, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("predicate", Class153.method738(class153).method34629());
    }
    
    public Class153 method21504(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class153(Class9342.method34628(jsonObject.get("predicate")));
    }
}
