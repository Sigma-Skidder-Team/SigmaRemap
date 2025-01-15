// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4222 extends Class4211
{
    private final Class8685 field19019;
    
    public Class4222(final Class8685 field19019) {
        super(Class4642.method13854());
        this.field19019 = field19019;
    }
    
    public static Class4222 method12705(final Class8685 class8685) {
        return new Class4222(class8685);
    }
    
    public boolean method12706(final Class490 class490) {
        return this.field19019.method29755(class490.method2451());
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("level", this.field19019.method29745());
        return (JsonElement)jsonObject;
    }
}
