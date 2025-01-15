// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4630 extends Class4611<Class4218>
{
    private static final Class1932 field20096;
    
    @Override
    public Class1932 method13717() {
        return Class4630.field20096;
    }
    
    public Class4218 method13803(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4218(Class8172.method27017(jsonObject.get("parent")), Class8172.method27017(jsonObject.get("partner")), Class8172.method27017(jsonObject.get("child")));
    }
    
    public void method13804(final Class513 class513, final Class789 class514, final Class789 class515, final Class788 class516) {
        this.method13726(class513.method2957(), class521 -> class521.method12701(class517, class518, class519, class520));
    }
    
    static {
        field20096 = new Class1932("bred_animals");
    }
}
