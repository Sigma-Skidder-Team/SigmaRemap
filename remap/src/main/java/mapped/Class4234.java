// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4234 extends Class4211
{
    private final Class3833 field19043;
    private final Class9357 field19044;
    
    public Class4234(final Class3833 field19043, final Class9357 field19044) {
        super(Class4625.method13786());
        this.field19043 = field19043;
        this.field19044 = field19044;
    }
    
    public static Class4234 method12733(final Class3833 class3833) {
        return new Class4234(class3833, Class9357.field40141);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        if (this.field19043 != null) {
            jsonObject.addProperty("block", Class90.field208.method503(this.field19043).toString());
        }
        jsonObject.add("state", this.field19044.method34693());
        return (JsonElement)jsonObject;
    }
    
    public boolean method12734(final BlockState class7096) {
        return (this.field19043 == null || class7096.method21696() == this.field19043) && this.field19044.method34689(class7096);
    }
}
