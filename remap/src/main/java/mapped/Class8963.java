// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;

public class Class8963
{
    private static BiMap<String, String> field37668;
    
    private static void method31799(final String s, final String str) {
        Class8963.field37668.put((Object)s, (Object)("minecraft:" + str));
    }
    
    public static BiMap<String, String> method31800() {
        return (BiMap<String, String>)Class8963.field37668.inverse();
    }
    
    public static String method31801(final String s) {
        final String s2 = (String)Class8963.field37668.get((Object)s);
        if (s2 == null) {
            return s;
        }
        return s2;
    }
    
    static {
        Class8963.field37668 = (BiMap<String, String>)HashBiMap.create();
        method31799("Furnace", "furnace");
        method31799("Chest", "chest");
        method31799("EnderChest", "ender_chest");
        method31799("RecordPlayer", "jukebox");
        method31799("Trap", "dispenser");
        method31799("Dropper", "dropper");
        method31799("Sign", "sign");
        method31799("MobSpawner", "mob_spawner");
        method31799("Music", "noteblock");
        method31799("Piston", "piston");
        method31799("Cauldron", "brewing_stand");
        method31799("EnchantTable", "enchanting_table");
        method31799("Airportal", "end_portal");
        method31799("Beacon", "beacon");
        method31799("Skull", "skull");
        method31799("DLDetector", "daylight_detector");
        method31799("Hopper", "hopper");
        method31799("Comparator", "comparator");
        method31799("FlowerPot", "flower_pot");
        method31799("Banner", "banner");
        method31799("Structure", "structure_block");
        method31799("EndGateway", "end_gateway");
        method31799("Control", "command_block");
    }
}
