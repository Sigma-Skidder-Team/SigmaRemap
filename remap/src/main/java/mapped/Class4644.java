// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4644 extends Class4611<Class4243>
{
    private static final Class1932 field20110;
    
    @Override
    public Class1932 method13717() {
        return Class4644.field20110;
    }
    
    public Class4243 method13861(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4243(Class9342.method34628(jsonObject.get("item")));
    }
    
    public void method13862(final Class513 class513, final ItemStack class514) {
        this.method13726(class513.method2957(), class516 -> class516.method12750(class515));
    }
    
    static {
        field20110 = new Class1932("filled_bucket");
    }
}
