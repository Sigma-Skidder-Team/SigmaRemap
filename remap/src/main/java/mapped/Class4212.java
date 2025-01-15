// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4212 extends Class4211
{
    private final Class8172 field19004;
    private final Class9342 field19005;
    
    public Class4212(final Class8172 field19004, final Class9342 field19005) {
        super(Class4619.method13759());
        this.field19004 = field19004;
        this.field19005 = field19005;
    }
    
    public static Class4212 method12684() {
        return new Class4212(Class8172.field33663, Class9342.field40107);
    }
    
    public boolean method12685(final Class513 class513, final Class819 class514, final ItemStack class515) {
        return this.field19004.method27015(class513, class514) && this.field19005.method34627(class515);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("item", this.field19005.method34629());
        jsonObject.add("villager", this.field19004.method27019());
        return (JsonElement)jsonObject;
    }
}
