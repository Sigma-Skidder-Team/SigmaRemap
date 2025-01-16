// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4236 extends Class4211
{
    private final Block field19049;
    private final Class9357 field19050;
    
    public Class4236(final Block field19049, final Class9357 field19050) {
        super(Class4632.method13817());
        this.field19049 = field19049;
        this.field19050 = field19050;
    }
    
    public static Class4236 method12737(final Block class3833) {
        return new Class4236(class3833, Class9357.field40141);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        if (this.field19049 != null) {
            jsonObject.addProperty("block", Registry.BLOCK.getKey(this.field19049).toString());
        }
        jsonObject.add("state", this.field19050.method34693());
        return (JsonElement)jsonObject;
    }
    
    public boolean method12738(final BlockState class7096) {
        return (this.field19049 == null || class7096.getBlock() == this.field19049) && this.field19050.method34689(class7096);
    }
}
