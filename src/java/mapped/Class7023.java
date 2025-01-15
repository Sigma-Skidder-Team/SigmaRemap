// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7023 extends Class7020<Class157>
{
    public Class7023() {
        super(new Class1932("table_bonus"), Class157.class);
    }
    
    public void method21490(final JsonObject jsonObject, final Class157 class157, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("enchantment", Class90.field209.method503(Class157.method748(class157)).toString());
        jsonObject.add("chances", jsonSerializationContext.serialize((Object)Class157.method749(class157)));
    }
    
    public Class157 method21491(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class157(Class90.field209.method506(new Class1932(Class9583.method35895(jsonObject, "enchantment"))).orElseThrow(() -> {
            new JsonParseException("Invalid enchantment id: " + obj);
            return;
        }), Class9583.method35920(jsonObject, "chances", jsonDeserializationContext, (Class<? extends float[]>)float[].class), null);
    }
}
