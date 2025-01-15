// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4235 extends Class4211
{
    private final Class3833 field19045;
    private final Class9357 field19046;
    private final Class8697 field19047;
    private final Class9342 field19048;
    
    public Class4235(final Class3833 field19045, final Class9357 field19046, final Class8697 field19047, final Class9342 field19048) {
        super(Class4637.method13840());
        this.field19045 = field19045;
        this.field19046 = field19046;
        this.field19047 = field19047;
        this.field19048 = field19048;
    }
    
    public static Class4235 method12735(final Class3833 class3833) {
        return new Class4235(class3833, Class9357.field40141, Class8697.field36544, Class9342.field40107);
    }
    
    public boolean method12736(final Class7096 class7096, final BlockPos class7097, final Class1849 class7098, final Class8321 class7099) {
        return (this.field19045 == null || class7096.method21696() == this.field19045) && this.field19046.method34689(class7096) && this.field19047.method29812(class7098, (float)class7097.getX(), (float)class7097.getY(), (float)class7097.getZ()) && this.field19048.method34627(class7099);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        if (this.field19045 != null) {
            jsonObject.addProperty("block", Class90.field208.method503(this.field19045).toString());
        }
        jsonObject.add("state", this.field19046.method34693());
        jsonObject.add("location", this.field19047.method29813());
        jsonObject.add("item", this.field19048.method34629());
        return (JsonElement)jsonObject;
    }
}
