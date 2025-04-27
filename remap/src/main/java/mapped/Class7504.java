// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.HashBiMap;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import com.google.gson.JsonArray;
import java.util.Iterator;
import com.google.gson.JsonObject;
import java.util.HashSet;
import com.google.gson.JsonElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.BiMap;

public class Class7504
{
    public static BiMap<Integer, Integer> field29088;
    public static Class6745 field29089;
    public static Class6745 field29090;
    public static Class6307 field29091;
    public static Set<Integer> field29092;
    public static Set<Integer> field29093;
    
    public static void method23404() {
        final JsonObject method23405 = method23405("mapping-1.13.2.json");
        final JsonObject method23406 = method23405("mapping-1.14.json");
        Class8563.method28793().method34742().info("Loading 1.13.2 -> 1.14 blockstate mapping...");
        Class7504.field29089 = new Class6744(method23405.getAsJsonObject("blockstates"), method23406.getAsJsonObject("blockstates"));
        Class8563.method28793().method34742().info("Loading 1.13.2 -> 1.14 block mapping...");
        Class7504.field29090 = new Class6744(method23405.getAsJsonObject("blocks"), method23406.getAsJsonObject("blocks"));
        Class8563.method28793().method34742().info("Loading 1.13.2 -> 1.14 item mapping...");
        method23406(Class7504.field29088, method23405.getAsJsonObject("items"), method23406.getAsJsonObject("items"));
        Class8563.method28793().method34742().info("Loading 1.13.2 -> 1.14 sound mapping...");
        Class7504.field29091 = new Class6308(method23405.getAsJsonArray("sounds"), method23406.getAsJsonArray("sounds"));
        Class8563.method28793().method34742().info("Loading 1.14 blockstates...");
        final JsonObject asJsonObject = method23406.getAsJsonObject("blockstates");
        final HashMap hashMap = new HashMap(asJsonObject.entrySet().size());
        for (final Map.Entry<K, JsonElement> entry : asJsonObject.entrySet()) {
            hashMap.put(entry.getValue().getAsString(), Integer.parseInt((String)entry.getKey()));
        }
        Class8563.method28793().method34742().info("Loading 1.14 heightmap data...");
        final JsonArray asJsonArray = method23405("heightMapData-1.14.json").getAsJsonArray("MOTION_BLOCKING");
        Class7504.field29092 = new HashSet<Integer>(asJsonArray.size());
        final Iterator iterator2 = asJsonArray.iterator();
        while (iterator2.hasNext()) {
            final String asString = iterator2.next().getAsString();
            final Integer n = (Integer)hashMap.get(asString);
            if (n != null) {
                Class7504.field29092.add(n);
            }
            else {
                Class8563.method28793().method34742().warning("Unknown blockstate " + asString + " :(");
            }
        }
        if (Class8563.method28792().method23310()) {
            Class7504.field29093 = new HashSet<Integer>();
            for (final Map.Entry<K, JsonElement> entry2 : method23405.getAsJsonObject("blockstates").entrySet()) {
                final String asString2 = entry2.getValue().getAsString();
                if (!asString2.contains("_slab")) {
                    if (!asString2.contains("_stairs")) {
                        if (!asString2.contains("_wall[")) {
                            continue;
                        }
                    }
                }
                Class7504.field29093.add(Class7504.field29089.method20533(Integer.parseInt((String)entry2.getKey())));
            }
            Class7504.field29093.add(Class7504.field29089.method20533(8163));
            for (int i = 3060; i <= 3067; ++i) {
                Class7504.field29093.add(Class7504.field29089.method20533(i));
            }
        }
    }
    
    public static JsonObject method23405(final String str) {
        final InputStreamReader inputStreamReader = new InputStreamReader(Class7504.class.getClassLoader().getResourceAsStream("assets/viaversion/data/" + str));
        try {
            return (JsonObject)Class8557.method28750().fromJson(inputStreamReader, (Class)JsonObject.class);
        }
        finally {
            try {
                inputStreamReader.close();
            }
            catch (final IOException ex) {}
        }
    }
    
    public static void method23406(final Map<Integer, Integer> map, final JsonObject jsonObject, final JsonObject jsonObject2) {
        for (final Map.Entry<K, JsonElement> entry : jsonObject.entrySet()) {
            final Map.Entry<String, JsonElement> method23410 = method23410(jsonObject2, entry.getValue().getAsString());
            if (method23410 != null) {
                map.put(Integer.parseInt((String)entry.getKey()), Integer.parseInt(method23410.getKey()));
            }
            else {
                if (Class8563.method28792().method23296() && !Class8563.method28794().method33559()) {
                    continue;
                }
                Class8563.method28793().method34742().warning("No key for " + entry.getValue() + " :( ");
            }
        }
    }
    
    private static void method23407(final short[] array, final JsonObject jsonObject, final JsonObject jsonObject2) {
        for (final Map.Entry<K, JsonElement> entry : jsonObject.entrySet()) {
            final Map.Entry<String, JsonElement> method23410 = method23410(jsonObject2, entry.getValue().getAsString());
            if (method23410 != null) {
                array[Integer.parseInt((String)entry.getKey())] = Short.parseShort(method23410.getKey());
            }
            else {
                if (Class8563.method28792().method23296() && !Class8563.method28794().method33559()) {
                    continue;
                }
                Class8563.method28793().method34742().warning("No key for " + entry.getValue() + " :( ");
            }
        }
    }
    
    private static void method23408(final short[] array, final JsonArray jsonArray, final JsonArray jsonArray2) {
        method23409(array, jsonArray, jsonArray2, true);
    }
    
    private static void method23409(final short[] array, final JsonArray jsonArray, final JsonArray jsonArray2, final boolean b) {
        for (int i = 0; i < jsonArray.size(); ++i) {
            final JsonElement value = jsonArray.get(i);
            final Integer method23411 = method23411(jsonArray2, value.getAsString());
            if (method23411 != null) {
                array[i] = method23411.shortValue();
            }
            else if ((b && !Class8563.method28792().method23296()) || Class8563.method28794().method33559()) {
                Class8563.method28793().method34742().warning("No key for " + value + " :( ");
            }
        }
    }
    
    private static Map.Entry<String, JsonElement> method23410(final JsonObject jsonObject, final String anObject) {
        for (final Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            if (!entry.getValue().getAsString().equals(anObject)) {
                continue;
            }
            return entry;
        }
        return null;
    }
    
    private static Integer method23411(final JsonArray jsonArray, final String anObject) {
        for (int i = 0; i < jsonArray.size(); ++i) {
            if (jsonArray.get(i).getAsString().equals(anObject)) {
                return i;
            }
        }
        return null;
    }
    
    static {
        Class7504.field29088 = HashBiMap.create();
    }
}
