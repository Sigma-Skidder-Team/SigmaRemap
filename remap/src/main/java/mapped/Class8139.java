// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import java.util.HashMap;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonArray;
import com.google.common.collect.Maps;

import java.util.Iterator;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import com.google.gson.JsonElement;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import net.minecraft.entity.Entity;

import java.util.Map;

public class Class8139
{
    public static final Class8139 field33530;
    private final Class8685 field33531;
    private final Class101 field33532;
    private final Map<Class9455<?>, Class8685> field33533;
    private final Object2BooleanMap<Class1932> field33534;
    private final Map<Class1932, Class170> field33535;
    
    private static Class170 method26818(final JsonElement jsonElement) {
        if (!jsonElement.isJsonPrimitive()) {
            final Object2BooleanOpenHashMap object2BooleanOpenHashMap = new Object2BooleanOpenHashMap();
            Class9583.method35913(jsonElement, "criterion data").entrySet().forEach(entry -> object2BooleanMap.put(entry.getKey(), Class9583.method35899((JsonElement)entry.getValue(), "criterion test")));
            return new Class171((Object2BooleanMap<String>)object2BooleanOpenHashMap);
        }
        return new Class172(jsonElement.getAsBoolean());
    }
    
    private Class8139(final Class8685 field33531, final Class101 field33532, final Map<Class9455<?>, Class8685> field33533, final Object2BooleanMap<Class1932> field33534, final Map<Class1932, Class170> field33535) {
        this.field33531 = field33531;
        this.field33532 = field33532;
        this.field33533 = field33533;
        this.field33534 = field33534;
        this.field33535 = field33535;
    }
    
    public boolean method26819(final Entity class399) {
        if (this == Class8139.field33530) {
            return true;
        }
        if (!(class399 instanceof Class513)) {
            return false;
        }
        final Class513 class400 = (Class513)class399;
        if (!this.field33531.method29755(class400.field3026)) {
            return false;
        }
        if (this.field33532 != Class101.field297 && this.field33532 != class400.field3041.method26482()) {
            return false;
        }
        final Class7473 method2947 = class400.method2947();
        for (final Map.Entry entry : this.field33533.entrySet()) {
            if (((Class8685)entry.getValue()).method29755(method2947.method23091((Class9455<?>)entry.getKey()))) {
                continue;
            }
            return false;
        }
        final Class6522 method2948 = class400.method2948();
        for (final Object2BooleanMap$Entry object2BooleanMap$Entry : this.field33534.object2BooleanEntrySet()) {
            if (method2948.method19696((Class1932)object2BooleanMap$Entry.getKey()) == object2BooleanMap$Entry.getBooleanValue()) {
                continue;
            }
            return false;
        }
        if (!this.field33535.isEmpty()) {
            final Class7012 method2949 = class400.method2957();
            final Class1781 method2950 = class400.method1897().method1566();
            for (final Map.Entry<Class1932, V> entry2 : this.field33535.entrySet()) {
                final Class8863 method2951 = method2950.method6398(entry2.getKey());
                if (method2951 != null && ((Class170)entry2.getValue()).test(method2949.method21470(method2951))) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
    
    public static Class8139 method26820(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "player");
            final Class8685 method35914 = Class8685.method29756(method35913.get("level"));
            final Class101 method35915 = Class101.method595(Class9583.method35896(method35913, "gamemode", ""), Class101.field297);
            final HashMap hashMap = Maps.newHashMap();
            final JsonArray method35916 = Class9583.method35918(method35913, "stats", null);
            if (method35916 != null) {
                final Iterator iterator = method35916.iterator();
                while (iterator.hasNext()) {
                    final JsonObject method35917 = Class9583.method35913(iterator.next(), "stats entry");
                    final Class1932 obj = new Class1932(Class9583.method35895(method35917, "type"));
                    final Class2248 class2248 = Class90.field238.method505(obj);
                    if (class2248 == null) {
                        throw new JsonParseException("Invalid stat type: " + obj);
                    }
                    hashMap.put(method26821((Class2248<Object>)class2248, new Class1932(Class9583.method35895(method35917, "stat"))), Class8685.method29756(method35917.get("value")));
                }
            }
            final Object2BooleanOpenHashMap object2BooleanOpenHashMap = new Object2BooleanOpenHashMap();
            for (final Map.Entry<K, JsonElement> entry : Class9583.method35915(method35913, "recipes", new JsonObject()).entrySet()) {
                ((Object2BooleanMap)object2BooleanOpenHashMap).put((Object)new Class1932((String)entry.getKey()), Class9583.method35899(entry.getValue(), "recipe present"));
            }
            final HashMap hashMap2 = Maps.newHashMap();
            for (final Map.Entry<K, JsonElement> entry2 : Class9583.method35915(method35913, "advancements", new JsonObject()).entrySet()) {
                hashMap2.put(new Class1932((String)entry2.getKey()), method26818(entry2.getValue()));
            }
            return new Class8139(method35914, method35915, hashMap, (Object2BooleanMap<Class1932>)object2BooleanOpenHashMap, hashMap2);
        }
        return Class8139.field33530;
    }
    
    private static <T> Class9455<T> method26821(final Class2248<T> class2248, final Class1932 obj) {
        final T method505 = class2248.method8448().method505(obj);
        if (method505 != null) {
            return class2248.method8449(method505);
        }
        throw new JsonParseException("Unknown object " + obj + " for stat type " + Class90.field238.method503(class2248));
    }
    
    private static <T> Class1932 method26822(final Class9455<T> class9455) {
        return class9455.method35134().method8448().method503(class9455.method35135());
    }
    
    public JsonElement method26823() {
        if (this != Class8139.field33530) {
            final JsonObject jsonObject = new JsonObject();
            jsonObject.add("level", this.field33531.method29745());
            if (this.field33532 != Class101.field297) {
                jsonObject.addProperty("gamemode", this.field33532.method586());
            }
            if (!this.field33533.isEmpty()) {
                final JsonArray jsonArray = new JsonArray();
                this.field33533.forEach((class9455, class9456) -> {
                    final JsonObject jsonObject4 = new JsonObject();
                    jsonObject4.addProperty("type", Class90.field238.method503(class9455.method35134()).toString());
                    jsonObject4.addProperty("stat", method26822((Class9455<Object>)class9455).toString());
                    jsonObject4.add("value", class9456.method29745());
                    jsonArray2.add((JsonElement)jsonObject4);
                    return;
                });
                jsonObject.add("stats", (JsonElement)jsonArray);
            }
            if (!this.field33534.isEmpty()) {
                final JsonObject jsonObject2 = new JsonObject();
                this.field33534.forEach((class9457, b) -> jsonObject5.addProperty(class9457.toString(), b));
                jsonObject.add("recipes", (JsonElement)jsonObject2);
            }
            if (!this.field33535.isEmpty()) {
                final JsonObject jsonObject3 = new JsonObject();
                this.field33535.forEach((class9458, class9459) -> jsonObject6.add(class9458.toString(), class9459.method770()));
                jsonObject.add("advancements", (JsonElement)jsonObject3);
            }
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    static {
        field33530 = new Class9371().method34774();
    }
}
