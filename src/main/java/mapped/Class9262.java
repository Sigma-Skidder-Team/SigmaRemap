// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.HashBiMap;
import com.google.gson.JsonObject;
import java.util.Map;
import com.google.common.collect.BiMap;

public class Class9262
{
    public static BiMap<Integer, Integer> field39729;
    public static Class6745 field39730;
    public static Class6745 field39731;
    public static Class6307 field39732;
    
    public static void method34169() {
        final JsonObject method23405 = Class7504.method23405("mapping-1.14.4.json");
        final JsonObject method23406 = Class7504.method23405("mapping-1.15.json");
        Class8563.method28793().method34742().info("Loading 1.14.4 -> 1.15 blockstate mapping...");
        Class9262.field39731 = new Class6744(method23405.getAsJsonObject("blockstates"), method23406.getAsJsonObject("blockstates"));
        Class8563.method28793().method34742().info("Loading 1.14.4 -> 1.15 block mapping...");
        Class9262.field39730 = new Class6744(method23405.getAsJsonObject("blocks"), method23406.getAsJsonObject("blocks"));
        Class8563.method28793().method34742().info("Loading 1.14.4 -> 1.15 item mapping...");
        Class7504.method23406((Map<Integer, Integer>)Class9262.field39729, method23405.getAsJsonObject("items"), method23406.getAsJsonObject("items"));
        Class8563.method28793().method34742().info("Loading 1.14.4 -> 1.15 sound mapping...");
        Class9262.field39732 = new Class6308(method23405.getAsJsonArray("sounds"), method23406.getAsJsonArray("sounds"), false);
    }
    
    static {
        Class9262.field39729 = (BiMap<Integer, Integer>)HashBiMap.create();
    }
}
