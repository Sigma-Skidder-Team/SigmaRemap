// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.HashMap;
import com.google.gson.JsonElement;
import com.google.common.collect.Maps;
import java.util.Map;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class8832
{
    private final Class4220 field37130;
    
    public Class8832(final Class4220 field37130) {
        this.field37130 = field37130;
    }
    
    public Class8832() {
        this.field37130 = null;
    }
    
    public void method30838(final PacketBuffer class8654) {
    }
    
    public static Class8832 method30839(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        final ResourceLocation obj = new ResourceLocation(Class9583.method35895(jsonObject, "trigger"));
        final Class4640<Class4220> method24878 = Class7770.method24878(obj);
        if (method24878 != null) {
            return new Class8832(method24878.method13720(Class9583.method35915(jsonObject, "conditions", new JsonObject()), jsonDeserializationContext));
        }
        throw new JsonSyntaxException("Invalid criterion trigger: " + obj);
    }
    
    public static Class8832 method30840(final PacketBuffer class8654) {
        return new Class8832();
    }
    
    public static Map<String, Class8832> method30841(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        final HashMap hashMap = Maps.newHashMap();
        for (final Map.Entry<Object, V> entry : jsonObject.entrySet()) {
            hashMap.put(entry.getKey(), method30839(Class9583.method35913((JsonElement)entry.getValue(), "criterion"), jsonDeserializationContext));
        }
        return hashMap;
    }
    
    public static Map<String, Class8832> method30842(final PacketBuffer class8654) {
        final HashMap hashMap = Maps.newHashMap();
        for (int method29501 = class8654.readVarInt(), i = 0; i < method29501; ++i) {
            hashMap.put(class8654.readString(32767), method30840(class8654));
        }
        return hashMap;
    }
    
    public static void method30843(final Map<String, Class8832> map, final PacketBuffer class8654) {
        class8654.writeVarInt(map.size());
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            class8654.writeString(entry.getKey());
            ((Class8832)entry.getValue()).method30838(class8654);
        }
    }
    
    @Nullable
    public Class4220 method30844() {
        return this.field37130;
    }
    
    public JsonElement method30845() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("trigger", this.field37130.method12683().toString());
        jsonObject.add("conditions", this.field37130.method12682());
        return jsonObject;
    }
}
