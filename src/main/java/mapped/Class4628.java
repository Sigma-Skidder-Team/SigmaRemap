// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4628 extends Class4611<Class4225>
{
    private static final Class1932 field20094;
    
    @Override
    public Class1932 method13717() {
        return Class4628.field20094;
    }
    
    public Class4225 method13795(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4225(jsonObject.has("from") ? Class383.method1275(new Class1932(Class9583.method35895(jsonObject, "from"))) : null, jsonObject.has("to") ? Class383.method1275(new Class1932(Class9583.method35895(jsonObject, "to"))) : null);
    }
    
    public void method13796(final Class513 class513, final Class383 class514, final Class383 class515) {
        this.method13726(class513.method2957(), class518 -> class518.method12713(class516, class517));
    }
    
    static {
        field20094 = new Class1932("changed_dimension");
    }
}
