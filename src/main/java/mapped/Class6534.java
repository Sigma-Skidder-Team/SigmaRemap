// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6534 extends Class6528<Class6376>
{
    public Class6534() {
        super(new Class1932("tag"), Class6376.class);
    }
    
    public void method19763(final JsonObject jsonObject, final Class6376 class6376, final JsonSerializationContext jsonSerializationContext) {
        super.method19750(jsonObject, class6376, jsonSerializationContext);
        jsonObject.addProperty("name", Class6376.method19043(class6376).method25621().toString());
        jsonObject.addProperty("expand", Boolean.valueOf(Class6376.method19044(class6376)));
    }
    
    public Class6376 method19764(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final int n, final int n2, final Class122[] array, final Class125[] array2) {
        final Class1932 obj = new Class1932(Class9583.method35895(jsonObject, "name"));
        final Class7909<Class3820> method18460 = Class7855.method25402().method18460(obj);
        if (method18460 != null) {
            return new Class6376(method18460, Class9583.method35900(jsonObject, "expand"), n, n2, array, array2, null);
        }
        throw new JsonParseException("Can't find tag: " + obj);
    }
}
