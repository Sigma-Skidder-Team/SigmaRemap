// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonElement;

public class Class172 implements Class170
{
    private static String[] field495;
    private final boolean field496;
    
    public Class172(final boolean field496) {
        this.field496 = field496;
    }
    
    @Override
    public JsonElement method770() {
        return new JsonPrimitive(Boolean.valueOf(this.field496));
    }
    
    @Override
    public boolean test(final Class348 class348) {
        return class348.method1031() == this.field496;
    }
}
