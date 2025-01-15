// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6242 extends Class6227<Class144>
{
    public Class6242() {
        super(new Class1932("copy_name"), Class144.class);
    }
    
    public void method18573(final JsonObject jsonObject, final Class144 class144, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class144, jsonSerializationContext);
        jsonObject.addProperty("source", Class144.method701(class144).field1569);
    }
    
    public Class144 method18574(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class144(array, Class284.method931(Class9583.method35895(jsonObject, "source")), null);
    }
}
