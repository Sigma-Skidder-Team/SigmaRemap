// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonElement;

public class Class7854
{
    public static final Class7854 field32229;
    private final Class7909<Class3833> field32230;
    private final Class3833 field32231;
    private final Class9357 field32232;
    private final Class7103 field32233;
    
    public Class7854(final Class7909<Class3833> field32230, final Class3833 field32231, final Class9357 field32232, final Class7103 field32233) {
        this.field32230 = field32230;
        this.field32231 = field32231;
        this.field32232 = field32232;
        this.field32233 = field32233;
    }
    
    public boolean method25398(final Class1849 class1849, final BlockPos class1850) {
        if (this == Class7854.field32229) {
            return true;
        }
        if (!class1849.method6731(class1850)) {
            return false;
        }
        final Class7096 method6701 = class1849.method6701(class1850);
        final Class3833 method6702 = method6701.method21696();
        if (this.field32230 != null && !this.field32230.method25618(method6702)) {
            return false;
        }
        if (this.field32231 != null && method6702 != this.field32231) {
            return false;
        }
        if (this.field32232.method34689(method6701)) {
            if (this.field32233 != Class7103.field27707) {
                final Class436 method6703 = class1849.method6727(class1850);
                if (method6703 == null || !this.field32233.method21805(method6703.method2180(new Class51()))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static Class7854 method25399(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "block");
            final Class7103 method35914 = Class7103.method21807(method35913.get("nbt"));
            Class3833 class3833 = null;
            if (method35913.has("block")) {
                class3833 = Class90.field208.method505(new Class1932(Class9583.method35895(method35913, "block")));
            }
            Class7909<Class3833> method35915 = null;
            if (method35913.has("tag")) {
                final Class1932 obj = new Class1932(Class9583.method35895(method35913, "tag"));
                method35915 = Class7188.method22057().method18460(obj);
                if (method35915 == null) {
                    throw new JsonSyntaxException("Unknown block tag '" + obj + "'");
                }
            }
            return new Class7854(method35915, class3833, Class9357.method34692(method35913.get("state")), method35914);
        }
        return Class7854.field32229;
    }
    
    public JsonElement method25400() {
        if (this != Class7854.field32229) {
            final JsonObject jsonObject = new JsonObject();
            if (this.field32231 != null) {
                jsonObject.addProperty("block", Class90.field208.method503(this.field32231).toString());
            }
            if (this.field32230 != null) {
                jsonObject.addProperty("tag", this.field32230.method25621().toString());
            }
            jsonObject.add("nbt", this.field32233.method21806());
            jsonObject.add("state", this.field32232.method34693());
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    static {
        field32229 = new Class7854(null, null, Class9357.field40141, Class7103.field27707);
    }
}
