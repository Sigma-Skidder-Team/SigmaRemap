// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import com.google.gson.JsonNull;
import java.util.HashMap;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonElement;
import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.Map;

public class Class8003
{
    public static final Class8003 field32963;
    private final Map<Class5328, Class8940> field32964;
    
    public Class8003(final Map<Class5328, Class8940> field32964) {
        this.field32964 = field32964;
    }
    
    public static Class8003 method26191() {
        return new Class8003(Maps.newHashMap());
    }
    
    public Class8003 method26192(final Class5328 class5328) {
        this.field32964.put(class5328, new Class8940());
        return this;
    }
    
    public boolean method26193(final Entity class399) {
        return this == Class8003.field32963 || (class399 instanceof LivingEntity && this.method26195(((LivingEntity)class399).method2652()));
    }
    
    public boolean method26194(final LivingEntity class511) {
        return this == Class8003.field32963 || this.method26195(class511.method2652());
    }
    
    public boolean method26195(final Map<Class5328, Class1948> map) {
        if (this != Class8003.field32963) {
            for (final Map.Entry entry : this.field32964.entrySet()) {
                if (((Class8940)entry.getValue()).method31708(map.get(entry.getKey()))) {
                    continue;
                }
                return false;
            }
            return true;
        }
        return true;
    }
    
    public static Class8003 method26196(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "effects");
            final HashMap hashMap = Maps.newHashMap();
            for (final Map.Entry<K, JsonElement> entry : method35913.entrySet()) {
                hashMap.put(Registry.field207.method506(new ResourceLocation((String)entry.getKey())).orElseThrow(() -> {
                    new JsonSyntaxException("Unknown effect '" + obj + "'");
                    return;
                }), Class8940.method31710(Class9583.method35913(entry.getValue(), (String)entry.getKey())));
            }
            return new Class8003(hashMap);
        }
        return Class8003.field32963;
    }
    
    public JsonElement method26197() {
        if (this != Class8003.field32963) {
            final JsonObject jsonObject = new JsonObject();
            for (final Map.Entry<Class5328, V> entry : this.field32964.entrySet()) {
                jsonObject.add(Registry.field207.getKey(entry.getKey()).toString(), ((Class8940)entry.getValue()).method31709());
            }
            return jsonObject;
        }
        return JsonNull.INSTANCE;
    }
    
    static {
        field32963 = new Class8003(Collections.emptyMap());
    }
}
