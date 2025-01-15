// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.item.ItemStack;

public class Class4227 extends Class4211
{
    private final Class7854 field19026;
    private final Class9357 field19027;
    private final Class9342 field19028;
    
    public Class4227(final Class1932 class1932, final Class7854 field19026, final Class9357 field19027, final Class9342 field19028) {
        super(class1932);
        this.field19026 = field19026;
        this.field19027 = field19027;
        this.field19028 = field19028;
    }
    
    public static Class4227 method12715(final Class9021 class9021, final Class9425 class9022) {
        return new Class4227(Class4621.method13767(Class7770.field31810), class9021.method32320(), Class9357.field40141, class9022.method35029());
    }
    
    public boolean method12716(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final ItemStack class7099) {
        return this.field19026.method25398(class7097, class7098) && this.field19027.method34689(class7096) && this.field19028.method34627(class7099);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("block", this.field19026.method25400());
        jsonObject.add("state", this.field19027.method34693());
        jsonObject.add("item", this.field19028.method34629());
        return (JsonElement)jsonObject;
    }
}
