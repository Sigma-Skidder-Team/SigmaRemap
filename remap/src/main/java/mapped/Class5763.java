// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import net.minecraft.item.crafting.IRecipeSerializer;

public interface Class5763
{
    void method17153(final JsonObject p0);
    
    default JsonObject method17154() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", Registry.field237.getKey(this.method17156()).toString());
        this.method17153(jsonObject);
        return jsonObject;
    }
    
    ResourceLocation method17155();
    
    IRecipeSerializer<?> method17156();
    
    @Nullable
    JsonObject method17157();
    
    @Nullable
    ResourceLocation method17158();
}
