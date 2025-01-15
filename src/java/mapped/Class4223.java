// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4223 extends Class4211
{
    private final Class8003 field19020;
    
    public Class4223(final Class8003 field19020) {
        super(Class4624.method13779());
        this.field19020 = field19020;
    }
    
    public static Class4223 method12707(final Class8003 class8003) {
        return new Class4223(class8003);
    }
    
    public boolean method12708(final Class513 class513) {
        return this.field19020.method26194(class513);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("effects", this.field19020.method26197());
        return (JsonElement)jsonObject;
    }
}
