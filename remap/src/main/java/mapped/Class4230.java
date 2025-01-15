// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4230 extends Class4211
{
    private final Class9342 field19034;
    private final Class8685 field19035;
    private final Class8685 field19036;
    
    public Class4230(final Class9342 field19034, final Class8685 field19035, final Class8685 field19036) {
        super(Class4616.method13748());
        this.field19034 = field19034;
        this.field19035 = field19035;
        this.field19036 = field19036;
    }
    
    public static Class4230 method12722(final Class9342 class9342, final Class8685 class9343) {
        return new Class4230(class9342, class9343, Class8685.field36500);
    }
    
    public boolean method12723(final ItemStack class8321, final int n) {
        return this.field19034.method34627(class8321) && this.field19035.method29755(class8321.method27634() - n) && this.field19036.method29755(class8321.method27632() - n);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("item", this.field19034.method34629());
        jsonObject.add("durability", this.field19035.method29745());
        jsonObject.add("delta", this.field19036.method29745());
        return (JsonElement)jsonObject;
    }
}
