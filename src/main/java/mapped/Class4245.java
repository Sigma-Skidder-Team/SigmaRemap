// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4245 extends Class4211
{
    private final Class8697 field19063;
    private final Class8697 field19064;
    private final Class8817 field19065;
    
    public Class4245(final Class8697 field19063, final Class8697 field19064, final Class8817 field19065) {
        super(Class4629.method13802());
        this.field19063 = field19063;
        this.field19064 = field19064;
        this.field19065 = field19065;
    }
    
    public static Class4245 method12751(final Class8817 class8817) {
        return new Class4245(Class8697.field36544, Class8697.field36544, class8817);
    }
    
    public boolean method12752(final Class1849 class1849, final Class5487 class1850, final double n, final double n2, final double n3) {
        return this.field19063.method29811(class1849, class1850.field22770, class1850.field22771, class1850.field22772) && this.field19064.method29811(class1849, n, n2, n3) && this.field19065.method30757(class1850.field22770, class1850.field22771, class1850.field22772, n, n2, n3);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("entered", this.field19063.method29813());
        jsonObject.add("exited", this.field19064.method29813());
        jsonObject.add("distance", this.field19065.method30759());
        return (JsonElement)jsonObject;
    }
}
