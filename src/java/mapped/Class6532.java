// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6532 extends Class6528<Class6374>
{
    public Class6532() {
        super(new Class1932("dynamic"), Class6374.class);
    }
    
    public void method19759(final JsonObject jsonObject, final Class6374 class6374, final JsonSerializationContext jsonSerializationContext) {
        super.method19750(jsonObject, class6374, jsonSerializationContext);
        jsonObject.addProperty("name", Class6374.method19035(class6374).toString());
    }
    
    public Class6374 method19760(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final int n, final int n2, final Class122[] array, final Class125[] array2) {
        return new Class6374(new Class1932(Class9583.method35895(jsonObject, "name")), n, n2, array, array2, null);
    }
}
