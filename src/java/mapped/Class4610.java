// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4610 extends Class4611<Class4238>
{
    private static final Class1932 field20076;
    
    @Override
    public Class1932 method13717() {
        return Class4610.field20076;
    }
    
    public Class4238 method13718(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4238(Class8172.method27018(jsonObject.get("victims")));
    }
    
    public void method13719(final Class513 class513, final Collection<? extends Class399> collection) {
        this.method13726(class513.method2957(), class515 -> class515.method12742(class514, collection2));
    }
    
    static {
        field20076 = new Class1932("channeled_lightning");
    }
}
