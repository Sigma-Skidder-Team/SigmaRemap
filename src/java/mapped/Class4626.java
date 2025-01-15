// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4626 extends Class4611<Class4216>
{
    private static final Class1932 field20092;
    
    @Override
    public Class1932 method13717() {
        return Class4626.field20092;
    }
    
    public Class4216 method13787(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4216(Class8172.method27017(jsonObject.get("entity")));
    }
    
    public void method13788(final Class513 class513, final Class399 class514) {
        this.method13726(class513.method2957(), class517 -> class517.method12694(class515, class516));
    }
    
    static {
        field20092 = new Class1932("summoned_entity");
    }
}
