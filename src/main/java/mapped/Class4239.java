// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4239 extends Class4211
{
    private final Class8172 field19053;
    private final Class8172 field19054;
    
    public Class4239(final Class8172 field19053, final Class8172 field19054) {
        super(Class4613.method13736());
        this.field19053 = field19053;
        this.field19054 = field19054;
    }
    
    public static Class4239 method12743() {
        return new Class4239(Class8172.field33663, Class8172.field33663);
    }
    
    public boolean method12744(final Class513 class513, final Class827 class514, final Class824 class515) {
        return this.field19053.method27015(class513, class514) && this.field19054.method27015(class513, class515);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("zombie", this.field19053.method27019());
        jsonObject.add("villager", this.field19054.method27019());
        return (JsonElement)jsonObject;
    }
}
