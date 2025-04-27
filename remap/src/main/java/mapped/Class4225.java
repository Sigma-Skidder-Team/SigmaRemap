// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.world.dimension.DimensionType;

public class Class4225 extends Class4211
{
    private final DimensionType field19022;
    private final DimensionType field19023;
    
    public Class4225(final DimensionType field19022, final DimensionType field19023) {
        super(Class4628.method13798());
        this.field19022 = field19022;
        this.field19023 = field19023;
    }
    
    public static Class4225 method12712(final DimensionType class383) {
        return new Class4225(null, class383);
    }
    
    public boolean method12713(final DimensionType class383, final DimensionType class384) {
        return (this.field19022 == null || this.field19022 == class383) && (this.field19023 == null || this.field19023 == class384);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        if (this.field19022 != null) {
            jsonObject.addProperty("from", DimensionType.method1276(this.field19022).toString());
        }
        if (this.field19023 != null) {
            jsonObject.addProperty("to", DimensionType.method1276(this.field19023).toString());
        }
        return jsonObject;
    }
}
