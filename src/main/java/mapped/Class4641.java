// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4641 implements Class4640<Class4242>
{
    private static final Class1932 field20107;
    
    @Override
    public Class1932 method13717() {
        return Class4641.field20107;
    }
    
    @Override
    public void method13723(final Class7012 class7012, final Class8803<Class4242> class7013) {
    }
    
    @Override
    public void method13724(final Class7012 class7012, final Class8803<Class4242> class7013) {
    }
    
    @Override
    public void method13725(final Class7012 class7012) {
    }
    
    public Class4242 method13849(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4242();
    }
    
    static {
        field20107 = new Class1932("impossible");
    }
}
