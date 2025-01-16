// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonElement;

public class Class8744
{
    public static final Class8744 field36724;
    private final Class7909<Class7255> field36725;
    private final Class7255 field36726;
    private final Class9357 field36727;
    
    public Class8744(final Class7909<Class7255> field36725, final Class7255 field36726, final Class9357 field36727) {
        this.field36725 = field36725;
        this.field36726 = field36726;
        this.field36727 = field36727;
    }
    
    public boolean method30235(final Class1849 class1849, final BlockPos class1850) {
        if (this == Class8744.field36724) {
            return true;
        }
        if (class1849.method6731(class1850)) {
            final Class7099 method6702 = class1849.method6702(class1850);
            final Class7255 method6703 = method6702.method21779();
            return (this.field36725 == null || this.field36725.method25618(method6703)) && (this.field36726 == null || method6703 == this.field36726) && this.field36727.method34690(method6702);
        }
        return false;
    }
    
    public static Class8744 method30236(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "fluid");
            Class7255 class7255 = null;
            if (method35913.has("fluid")) {
                class7255 = Registry.field206.getOrDefault(new ResourceLocation(Class9583.method35895(method35913, "fluid")));
            }
            Class7909<Class7255> method35914 = null;
            if (method35913.has("tag")) {
                final ResourceLocation obj = new ResourceLocation(Class9583.method35895(method35913, "tag"));
                method35914 = Class7324.method22478().method18460(obj);
                if (method35914 == null) {
                    throw new JsonSyntaxException("Unknown fluid tag '" + obj + "'");
                }
            }
            return new Class8744(method35914, class7255, Class9357.method34692(method35913.get("state")));
        }
        return Class8744.field36724;
    }
    
    public JsonElement method30237() {
        if (this != Class8744.field36724) {
            final JsonObject jsonObject = new JsonObject();
            if (this.field36726 != null) {
                jsonObject.addProperty("fluid", Registry.field206.getKey(this.field36726).toString());
            }
            if (this.field36725 != null) {
                jsonObject.addProperty("tag", this.field36725.method25621().toString());
            }
            jsonObject.add("state", this.field36727.method34693());
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    static {
        field36724 = new Class8744(null, null, Class9357.field40141);
    }
}
