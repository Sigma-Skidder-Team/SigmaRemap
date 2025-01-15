// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4643 extends Class4611<Class4241>
{
    private static final Class1932 field20109;
    
    @Override
    public Class1932 method13717() {
        return Class4643.field20109;
    }
    
    public Class4241 method13855(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4241(method13856(jsonObject), Class9342.method34628(jsonObject.get("item")), Class8685.method29756(jsonObject.get("num_bees_inside")));
    }
    
    @Nullable
    private static Class3833 method13856(final JsonObject jsonObject) {
        if (!jsonObject.has("block")) {
            return null;
        }
        return Class90.field208.method506(new Class1932(Class9583.method35895(jsonObject, "block"))).orElseThrow(() -> {
            new JsonSyntaxException("Unknown block type '" + obj + "'");
            return;
        });
    }
    
    public void method13857(final Class513 class513, final Class3833 class514, final ItemStack class515, final int n) {
        this.method13726(class513.method2957(), class518 -> class518.method12748(class516, class517, n2));
    }
    
    static {
        field20109 = new Class1932("bee_nest_destroyed");
    }
}
