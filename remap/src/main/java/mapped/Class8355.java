// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class8355
{
    public static final Class8355 field34288;
    private final Class8685 field34289;
    
    private Class8355(final Class8685 field34289) {
        this.field34289 = field34289;
    }
    
    public boolean method27890(final Class1849 class1849, final BlockPos class1850) {
        return this == Class8355.field34288 || (class1849.method6731(class1850) && this.field34289.method29755(class1849.method6969(class1850)));
    }
    
    public JsonElement method27891() {
        if (this != Class8355.field34288) {
            final JsonObject jsonObject = new JsonObject();
            jsonObject.add("light", this.field34289.method29745());
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    public static Class8355 method27892(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            return new Class8355(Class8685.method29756(Class9583.method35913(jsonElement, "light").get("light")));
        }
        return Class8355.field34288;
    }
    
    static {
        field34288 = new Class8355(Class8685.field36500);
    }
}
