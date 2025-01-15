// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6238 extends Class6227<Class146>
{
    public Class6238() {
        super(new Class1932("set_name"), Class146.class);
    }
    
    public void method18564(final JsonObject jsonObject, final Class146 class146, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class146, jsonSerializationContext);
        if (Class146.method709(class146) != null) {
            jsonObject.add("name", Class5953.method17870(Class146.method709(class146)));
        }
        if (Class146.method710(class146) != null) {
            jsonObject.add("entity", jsonSerializationContext.serialize((Object)Class146.method710(class146)));
        }
    }
    
    public Class146 method18565(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class146(array, Class5953.method17872(jsonObject.get("name")), Class9583.method35921(jsonObject, "entity", (Class2065)null, jsonDeserializationContext, Class2065.class), null);
    }
}
