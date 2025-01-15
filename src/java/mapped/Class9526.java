// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.HashBiMap;
import com.google.gson.JsonArray;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import com.google.common.io.CharStreams;
import java.nio.charset.StandardCharsets;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import com.google.common.collect.BiMap;

public class Class9526
{
    public static BiMap<Integer, Integer> field41005;
    public static Map<String, Integer[]> field41006;
    public static Map<String, Integer[]> field41007;
    public static Map<String, Integer[]> field41008;
    public static BiMap<Short, String> field41009;
    public static Map<String, String> field41010;
    public static Map<String, String> field41011;
    public static Class5833 field41012;
    public static Class8746 field41013;
    public static Class8496 field41014;
    
    public static void method35559() {
        final JsonObject method35560 = method35560("mapping-1.12.json");
        final JsonObject method35561 = method35560("mapping-1.13.json");
        Class8563.method28793().method34742().info("Loading 1.12.2 -> 1.13 block mapping...");
        Class9526.field41014 = new Class8497(method35560.getAsJsonObject("blocks"), method35561.getAsJsonObject("blocks"), null);
        Class8563.method28793().method34742().info("Loading 1.12.2 -> 1.13 item mapping...");
        method35561((Map<Integer, Integer>)Class9526.field41005, method35560.getAsJsonObject("items"), method35561.getAsJsonObject("items"));
        Class8563.method28793().method34742().info("Loading new 1.13 tags...");
        method35565(Class9526.field41006, method35561.getAsJsonObject("block_tags"));
        method35565(Class9526.field41007, method35561.getAsJsonObject("item_tags"));
        method35565(Class9526.field41008, method35561.getAsJsonObject("fluid_tags"));
        Class8563.method28793().method34742().info("Loading 1.12.2 -> 1.13 enchantment mapping...");
        method35566((Map<Short, String>)Class9526.field41009, method35560.getAsJsonObject("enchantments"));
        Class9526.field41012 = new Class5834(method35560.getAsJsonObject("enchantments"), method35561.getAsJsonObject("enchantments"), null);
        Class8563.method28793().method34742().info("Loading 1.12.2 -> 1.13 sound mapping...");
        Class9526.field41013 = new Class8745(method35560.getAsJsonArray("sounds"), method35561.getAsJsonArray("sounds"), null);
        Class8563.method28793().method34742().info("Loading translation mapping");
        Class9526.field41010 = new HashMap<String, String>();
        final Map map = (Map)Class8557.method28750().fromJson((Reader)new InputStreamReader(Class9526.class.getClassLoader().getResourceAsStream("assets/viaversion/data/mapping-lang-1.12-1.13.json")), new Class7511().getType());
        try {
            String[] split;
            try (final InputStreamReader inputStreamReader = new InputStreamReader(Class9526.class.getClassLoader().getResourceAsStream("mojang-translations/en_US.properties"), StandardCharsets.UTF_8)) {
                split = CharStreams.toString((Readable)inputStreamReader).split("\n");
            }
            for (final String s : split) {
                if (!s.isEmpty()) {
                    final String[] split2 = s.split("=", 2);
                    if (split2.length == 2) {
                        final String s2 = split2[0];
                        final String replaceAll = split2[1].replaceAll("%(\\d\\$)?d", "%$1s");
                        if (!map.containsKey(s2)) {
                            Class9526.field41010.put(s2, replaceAll);
                        }
                        else {
                            final String s3 = map.get(split2[0]);
                            if (s3 != null) {
                                Class9526.field41010.put(s2, s3);
                            }
                        }
                    }
                }
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static JsonObject method35560(final String str) {
        final InputStreamReader inputStreamReader = new InputStreamReader(Class9526.class.getClassLoader().getResourceAsStream("assets/viaversion/data/" + str));
        try {
            return (JsonObject)Class8557.method28750().fromJson((Reader)inputStreamReader, (Class)JsonObject.class);
        }
        finally {
            try {
                inputStreamReader.close();
            }
            catch (final IOException ex) {}
        }
    }
    
    private static void method35561(final Map<Integer, Integer> map, final JsonObject jsonObject, final JsonObject jsonObject2) {
        for (final Map.Entry<K, JsonElement> entry : jsonObject.entrySet()) {
            final Map.Entry<String, JsonElement> method35567 = method35567(jsonObject2, entry.getValue().getAsString());
            if (method35567 != null) {
                map.put(Integer.parseInt((String)entry.getKey()), Integer.parseInt(method35567.getKey()));
            }
            else {
                if (Class8563.method28792().method23296() && !Class8563.method28794().method33559()) {
                    continue;
                }
                Class8563.method28793().method34742().warning("No key for " + entry.getValue() + " :( ");
            }
        }
    }
    
    private static void method35562(final short[] array, final JsonObject jsonObject, final JsonObject jsonObject2) {
        for (final Map.Entry<K, JsonElement> entry : jsonObject.entrySet()) {
            final Map.Entry<String, JsonElement> method35567 = method35567(jsonObject2, entry.getValue().getAsString());
            if (method35567 != null) {
                array[Integer.parseInt((String)entry.getKey())] = Short.parseShort(method35567.getKey());
            }
            else {
                if (Class8563.method28792().method23296() && !Class8563.method28794().method33559()) {
                    continue;
                }
                Class8563.method28793().method34742().warning("No key for " + entry.getValue() + " :( ");
            }
        }
    }
    
    private static void method35563(final byte[] array, final JsonObject jsonObject, final JsonObject jsonObject2) {
        for (final Map.Entry<K, JsonElement> entry : jsonObject.entrySet()) {
            final Map.Entry<String, JsonElement> method35567 = method35567(jsonObject2, entry.getValue().getAsString());
            if (method35567 != null) {
                array[Integer.parseInt((String)entry.getKey())] = Byte.parseByte(method35567.getKey());
            }
            else {
                Class8563.method28793().method34742().warning("No key for " + entry.getValue() + " :( ");
            }
        }
    }
    
    private static void method35564(final short[] array, final JsonArray jsonArray, final JsonArray jsonArray2) {
        for (int i = 0; i < jsonArray.size(); ++i) {
            final JsonElement value = jsonArray.get(i);
            final Integer method35568 = method35568(jsonArray2, value.getAsString());
            if (method35568 != null) {
                array[i] = method35568.shortValue();
            }
            else if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
                Class8563.method28793().method34742().warning("No key for " + value + " :( ");
            }
        }
    }
    
    private static void method35565(final Map<String, Integer[]> map, final JsonObject jsonObject) {
        for (final Map.Entry<K, JsonElement> entry : jsonObject.entrySet()) {
            final JsonArray asJsonArray = entry.getValue().getAsJsonArray();
            final Integer[] array = new Integer[asJsonArray.size()];
            for (int i = 0; i < asJsonArray.size(); ++i) {
                array[i] = asJsonArray.get(i).getAsInt();
            }
            map.put((String)entry.getKey(), array);
        }
    }
    
    private static void method35566(final Map<Short, String> map, final JsonObject jsonObject) {
        for (final Map.Entry<String, V> entry : jsonObject.entrySet()) {
            map.put(Short.parseShort(entry.getKey()), ((JsonElement)entry.getValue()).getAsString());
        }
    }
    
    private static Map.Entry<String, JsonElement> method35567(final JsonObject jsonObject, final String anObject) {
        for (final Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            if (!entry.getValue().getAsString().equals(anObject)) {
                continue;
            }
            return entry;
        }
        return null;
    }
    
    private static Integer method35568(final JsonArray jsonArray, final String anObject) {
        for (int i = 0; i < jsonArray.size(); ++i) {
            if (jsonArray.get(i).getAsString().equals(anObject)) {
                return i;
            }
        }
        return null;
    }
    
    static {
        Class9526.field41005 = (BiMap<Integer, Integer>)HashBiMap.create();
        Class9526.field41006 = new HashMap<String, Integer[]>();
        Class9526.field41007 = new HashMap<String, Integer[]>();
        Class9526.field41008 = new HashMap<String, Integer[]>();
        Class9526.field41009 = (BiMap<Short, String>)HashBiMap.create();
        Class9526.field41010 = new HashMap<String, String>();
        Class9526.field41011 = new HashMap<String, String>();
    }
}
