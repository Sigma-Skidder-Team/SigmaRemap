// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4638 extends Class4611<Class4215>
{
    private static final Class1932 field20105;
    
    @Override
    public Class1932 method13717() {
        return Class4638.field20105;
    }
    
    public Class4215 method13841(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4215(Class9342.method34628(jsonObject.get("item")));
    }
    
    public void method13842(final Class513 class513, final Class8321 class514) {
        this.method13726(class513.method2957(), class516 -> class516.method12692(class515));
    }
    
    static {
        field20105 = new Class1932("shot_crossbow");
    }
}
