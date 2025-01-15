// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4633 extends Class4611<Class4224>
{
    private static final Class1932 field20099;
    
    @Override
    public Class1932 method13717() {
        return Class4633.field20099;
    }
    
    public Class4224 method13818(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4224(Class9342.method34628(jsonObject.get("item")));
    }
    
    public void method13819(final Class513 class513, final Class8321 class514) {
        this.method13726(class513.method2957(), class516 -> class516.method12711(class515));
    }
    
    static {
        field20099 = new Class1932("consume_item");
    }
}
