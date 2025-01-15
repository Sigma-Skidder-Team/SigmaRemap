// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.item.ItemStack;

public class Class4241 extends Class4211
{
    private final Class3833 field19057;
    private final Class9342 field19058;
    private final Class8685 field19059;
    
    public Class4241(final Class3833 field19057, final Class9342 field19058, final Class8685 field19059) {
        super(Class4643.method13860());
        this.field19057 = field19057;
        this.field19058 = field19058;
        this.field19059 = field19059;
    }
    
    public static Class4241 method12747(final Class3833 class3833, final Class9425 class3834, final Class8685 class3835) {
        return new Class4241(class3833, class3834.method35029(), class3835);
    }
    
    public boolean method12748(final Class3833 class3833, final ItemStack class3834, final int n) {
        return (this.field19057 == null || class3833 == this.field19057) && this.field19058.method34627(class3834) && this.field19059.method29755(n);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        if (this.field19057 != null) {
            jsonObject.addProperty("block", Class90.field208.method503(this.field19057).toString());
        }
        jsonObject.add("item", this.field19058.method34629());
        jsonObject.add("num_bees_inside", this.field19059.method29745());
        return (JsonElement)jsonObject;
    }
}
