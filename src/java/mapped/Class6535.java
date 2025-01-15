// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6535 extends Class6528<Class6377>
{
    public Class6535() {
        super(new Class1932("item"), Class6377.class);
    }
    
    public void method19765(final JsonObject jsonObject, final Class6377 class6377, final JsonSerializationContext jsonSerializationContext) {
        super.method19750(jsonObject, class6377, jsonSerializationContext);
        final Class1932 method503 = Class90.field211.method503(Class6377.method19047(class6377));
        if (method503 != null) {
            jsonObject.addProperty("name", method503.toString());
            return;
        }
        throw new IllegalArgumentException("Can't serialize unknown item " + Class6377.method19047(class6377));
    }
    
    public Class6377 method19766(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final int n, final int n2, final Class122[] array, final Class125[] array2) {
        return new Class6377(Class9583.method35898(jsonObject, "name"), n, n2, array, array2, null);
    }
}
