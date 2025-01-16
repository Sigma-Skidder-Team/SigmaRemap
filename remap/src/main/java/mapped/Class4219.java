// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4219 extends Class4211
{
    private final ResourceLocation field19016;
    
    public Class4219(final ResourceLocation field19016) {
        super(Class4620.method13763());
        this.field19016 = field19016;
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("recipe", this.field19016.toString());
        return (JsonElement)jsonObject;
    }
    
    public boolean method12702(final IRecipe<?> class3662) {
        return this.field19016.equals(class3662.method11298());
    }
}
