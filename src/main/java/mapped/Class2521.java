// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Class2521 extends Class2466
{
    public final /* synthetic */ Class2865 field14526;
    
    public Class2521(final Class2865 field14526) {
        this.field14526 = field14526;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final String s = class8699.method29818(Class5260.field22308, 0);
        try {
            final JsonObject jsonObject = (JsonObject)Class8557.method28750().fromJson(s, (Class)JsonObject.class);
            if (jsonObject.has("favicon")) {
                jsonObject.addProperty("favicon", jsonObject.get("favicon").getAsString().replace("\n", ""));
            }
            class8699.method29821(Class5260.field22308, 0, Class8557.method28750().toJson((JsonElement)jsonObject));
        }
        catch (final JsonParseException ex) {
            ex.printStackTrace();
        }
    }
}
