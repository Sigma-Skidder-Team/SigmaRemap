// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7034 extends Class7020<Class150>
{
    public Class7034() {
        super(new Class1932("entity_properties"), Class150.class);
    }
    
    public void method21515(final JsonObject jsonObject, final Class150 class150, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("predicate", Class150.method729(class150).method27019());
        jsonObject.add("entity", jsonSerializationContext.serialize((Object)Class150.method730(class150)));
    }
    
    public Class150 method21516(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class150(Class8172.method27017(jsonObject.get("predicate")), Class9583.method35920(jsonObject, "entity", jsonDeserializationContext, (Class<? extends Class2065>)Class2065.class), null);
    }
}
