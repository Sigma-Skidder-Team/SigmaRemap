// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Class8052
{
    private static Map<String, String> field33139;
    
    private static void method26426(final String str, final String str2) {
        Class8052.field33139.put("minecraft:" + str, "minecraft:" + str2);
    }
    
    public static String method26427(final String str) {
        final String s = Class8052.field33139.get(str);
        if (s != null) {
            return s;
        }
        final String s2 = Class8052.field33139.get("minecraft:" + str);
        if (s2 == null) {
            return str;
        }
        return s2;
    }
    
    static {
        Class8052.field33139 = new ConcurrentHashMap<String, String>();
        method26426("commandblock_minecart", "command_block_minecart");
        method26426("ender_crystal", "end_crystal");
        method26426("evocation_fangs", "evoker_fangs");
        method26426("evocation_illager", "evoker");
        method26426("eye_of_ender_signal", "eye_of_ender");
        method26426("fireworks_rocket", "firework_rocket");
        method26426("illusion_illager", "illusioner");
        method26426("snowman", "snow_golem");
        method26426("villager_golem", "iron_golem");
        method26426("vindication_illager", "vindicator");
        method26426("xp_bottle", "experience_bottle");
        method26426("xp_orb", "experience_orb");
    }
}
