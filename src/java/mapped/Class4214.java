// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4214 extends Class4211
{
    private final Class8172 field19008;
    
    public Class4214(final Class8172 field19008) {
        super(Class4623.method13775());
        this.field19008 = field19008;
    }
    
    public static Class4214 method12688() {
        return new Class4214(Class8172.field33663);
    }
    
    public static Class4214 method12689(final Class8172 class8172) {
        return new Class4214(class8172);
    }
    
    public boolean method12690(final Class513 class513, final Class789 class514) {
        return this.field19008.method27015(class513, class514);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("entity", this.field19008.method27019());
        return (JsonElement)jsonObject;
    }
}
