// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7033 extends Class7020<Class162>
{
    public Class7033() {
        super(new ResourceLocation("damage_source_properties"), Class162.class);
    }
    
    public void method21513(final JsonObject jsonObject, final Class162 class162, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("predicate", Class162.method765(class162).method32840());
    }
    
    public Class162 method21514(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class162(Class9089.method32838(jsonObject.get("predicate")), null);
    }
}
