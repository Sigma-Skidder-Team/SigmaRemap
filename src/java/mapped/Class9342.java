// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonElement;
import java.util.Map;

public class Class9342
{
    public static final Class9342 field40107;
    private final Class7909<Class3820> field40108;
    private final Class3820 field40109;
    private final Class8685 field40110;
    private final Class8685 field40111;
    private final Class9167[] field40112;
    private final Class9167[] field40113;
    private final Class8061 field40114;
    private final Class7103 field40115;
    
    public Class9342() {
        this.field40108 = null;
        this.field40109 = null;
        this.field40114 = null;
        this.field40110 = Class8685.field36500;
        this.field40111 = Class8685.field36500;
        this.field40112 = Class9167.field38835;
        this.field40113 = Class9167.field38835;
        this.field40115 = Class7103.field27707;
    }
    
    public Class9342(final Class7909<Class3820> field40108, final Class3820 field40109, final Class8685 field40110, final Class8685 field40111, final Class9167[] field40112, final Class9167[] field40113, final Class8061 field40114, final Class7103 field40115) {
        this.field40108 = field40108;
        this.field40109 = field40109;
        this.field40110 = field40110;
        this.field40111 = field40111;
        this.field40112 = field40112;
        this.field40113 = field40113;
        this.field40114 = field40114;
        this.field40115 = field40115;
    }
    
    public boolean method34627(final Class8321 class8321) {
        if (this == Class9342.field40107) {
            return true;
        }
        if (this.field40108 != null && !this.field40108.method25618(class8321.method27622())) {
            return false;
        }
        if (this.field40109 != null && class8321.method27622() != this.field40109) {
            return false;
        }
        if (!this.field40110.method29755(class8321.method27690())) {
            return false;
        }
        if (!this.field40111.method29744() && !class8321.method27630()) {
            return false;
        }
        if (!this.field40111.method29755(class8321.method27634() - class8321.method27632())) {
            return false;
        }
        if (this.field40115.method21803(class8321)) {
            if (this.field40112.length > 0) {
                final Map<Class6257, Integer> method30197 = Class8742.method30197(class8321.method27662());
                final Class9167[] field40112 = this.field40112;
                for (int length = field40112.length, i = 0; i < length; ++i) {
                    if (!field40112[i].method33464(method30197)) {
                        return false;
                    }
                }
            }
            if (this.field40113.length > 0) {
                final Map<Class6257, Integer> method30198 = Class8742.method30197(Class4034.method12225(class8321));
                final Class9167[] field40113 = this.field40113;
                for (int length2 = field40113.length, j = 0; j < length2; ++j) {
                    if (!field40113[j].method33464(method30198)) {
                        return false;
                    }
                }
            }
            final Class8061 method30199 = Class5333.method16474(class8321);
            return this.field40114 == null || this.field40114 == method30199;
        }
        return false;
    }
    
    public static Class9342 method34628(final JsonElement jsonElement) {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return Class9342.field40107;
        }
        final JsonObject method35913 = Class9583.method35913(jsonElement, "item");
        final Class8685 method35914 = Class8685.method29756(method35913.get("count"));
        final Class8685 method35915 = Class8685.method29756(method35913.get("durability"));
        if (!method35913.has("data")) {
            final Class7103 method35916 = Class7103.method21807(method35913.get("nbt"));
            Class3820 class3820 = null;
            if (method35913.has("item")) {
                class3820 = Class90.field211.method506(new Class1932(Class9583.method35895(method35913, "item"))).orElseThrow(() -> {
                    new JsonSyntaxException("Unknown item id '" + obj2 + "'");
                    return;
                });
            }
            Class7909<Class3820> method35917 = null;
            if (method35913.has("tag")) {
                final Class1932 obj = new Class1932(Class9583.method35895(method35913, "tag"));
                method35917 = Class7855.method25402().method18460(obj);
                if (method35917 == null) {
                    throw new JsonSyntaxException("Unknown item tag '" + obj + "'");
                }
            }
            Class8061 class3821 = null;
            if (method35913.has("potion")) {
                class3821 = Class90.field212.method506(new Class1932(Class9583.method35895(method35913, "potion"))).orElseThrow(() -> {
                    new JsonSyntaxException("Unknown potion '" + obj3 + "'");
                    return;
                });
            }
            return new Class9342(method35917, class3820, method35914, method35915, Class9167.method33467(method35913.get("enchantments")), Class9167.method33467(method35913.get("stored_enchantments")), class3821, method35916);
        }
        throw new JsonParseException("Disallowed data tag found");
    }
    
    public JsonElement method34629() {
        if (this != Class9342.field40107) {
            final JsonObject jsonObject = new JsonObject();
            if (this.field40109 != null) {
                jsonObject.addProperty("item", Class90.field211.method503(this.field40109).toString());
            }
            if (this.field40108 != null) {
                jsonObject.addProperty("tag", this.field40108.method25621().toString());
            }
            jsonObject.add("count", this.field40110.method29745());
            jsonObject.add("durability", this.field40111.method29745());
            jsonObject.add("nbt", this.field40115.method21806());
            if (this.field40112.length > 0) {
                final JsonArray jsonArray = new JsonArray();
                final Class9167[] field40112 = this.field40112;
                for (int length = field40112.length, i = 0; i < length; ++i) {
                    jsonArray.add(field40112[i].method33465());
                }
                jsonObject.add("enchantments", (JsonElement)jsonArray);
            }
            if (this.field40113.length > 0) {
                final JsonArray jsonArray2 = new JsonArray();
                final Class9167[] field40113 = this.field40113;
                for (int length2 = field40113.length, j = 0; j < length2; ++j) {
                    jsonArray2.add(field40113[j].method33465());
                }
                jsonObject.add("stored_enchantments", (JsonElement)jsonArray2);
            }
            if (this.field40114 != null) {
                jsonObject.addProperty("potion", Class90.field212.method503(this.field40114).toString());
            }
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    public static Class9342[] method34630(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonArray method35916 = Class9583.method35916(jsonElement, "items");
            final Class9342[] array = new Class9342[method35916.size()];
            for (int i = 0; i < array.length; ++i) {
                array[i] = method34628(method35916.get(i));
            }
            return array;
        }
        return new Class9342[0];
    }
    
    static {
        field40107 = new Class9342();
    }
}
