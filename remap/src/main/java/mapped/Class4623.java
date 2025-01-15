// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4623 extends Class4611<Class4214>
{
    private static final Class1932 field20089;
    
    @Override
    public Class1932 method13717() {
        return Class4623.field20089;
    }
    
    public Class4214 method13772(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4214(Class8172.method27017(jsonObject.get("entity")));
    }
    
    public void method13773(final Class513 class513, final Class789 class514) {
        this.method13726(class513.method2957(), class517 -> class517.method12690(class515, class516));
    }
    
    static {
        field20089 = new Class1932("tame_animal");
    }
}
