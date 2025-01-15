// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7021 extends Class7020<Class158>
{
    public Class7021() {
        super(new Class1932("location_check"), Class158.class);
    }
    
    public void method21486(final JsonObject jsonObject, final Class158 class158, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("predicate", Class158.method752(class158).method29813());
        if (Class158.method753(class158).method1074() != 0) {
            jsonObject.addProperty("offsetX", (Number)Class158.method753(class158).method1074());
        }
        if (Class158.method753(class158).method1075() != 0) {
            jsonObject.addProperty("offsetY", (Number)Class158.method753(class158).method1075());
        }
        if (Class158.method753(class158).method1076() != 0) {
            jsonObject.addProperty("offsetZ", (Number)Class158.method753(class158).method1076());
        }
    }
    
    public Class158 method21487(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class158(Class8697.method29814(jsonObject.get("predicate")), new Class354(Class9583.method35910(jsonObject, "offsetX", 0), Class9583.method35910(jsonObject, "offsetY", 0), Class9583.method35910(jsonObject, "offsetZ", 0)));
    }
}
