// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class8940
{
    private final Class8685 field37616;
    private final Class8685 field37617;
    private final Boolean field37618;
    private final Boolean field37619;
    
    public Class8940(final Class8685 field37616, final Class8685 field37617, final Boolean field37618, final Boolean field37619) {
        this.field37616 = field37616;
        this.field37617 = field37617;
        this.field37618 = field37618;
        this.field37619 = field37619;
    }
    
    public Class8940() {
        this(Class8685.field36500, Class8685.field36500, null, null);
    }
    
    public boolean method31708(final Class1948 class1948) {
        return class1948 != null && this.field37616.method29755(class1948.method7908()) && this.field37617.method29755(class1948.method7907()) && (this.field37618 == null || this.field37618 == class1948.method7909()) && (this.field37619 == null || this.field37619 == class1948.method7910());
    }
    
    public JsonElement method31709() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("amplifier", this.field37616.method29745());
        jsonObject.add("duration", this.field37617.method29745());
        jsonObject.addProperty("ambient", this.field37618);
        jsonObject.addProperty("visible", this.field37619);
        return (JsonElement)jsonObject;
    }
    
    public static Class8940 method31710(final JsonObject jsonObject) {
        return new Class8940(Class8685.method29756(jsonObject.get("amplifier")), Class8685.method29756(jsonObject.get("duration")), jsonObject.has("ambient") ? Boolean.valueOf(Class9583.method35900(jsonObject, "ambient")) : null, jsonObject.has("visible") ? Boolean.valueOf(Class9583.method35900(jsonObject, "visible")) : null);
    }
}
