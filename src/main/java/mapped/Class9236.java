package mapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class Class9236 {
   private static BiMap<String, String> field42513 = HashBiMap.create();

   private static void method34741(String var0, String var1) {
      field42513.put(var0, "minecraft:" + var1);
   }

   public static BiMap<String, String> method34742() {
      return field42513.inverse();
   }

   public static String method34743(String var0) {
      String var3 = (String)field42513.get(var0);
      return var3 == null ? var0 : var3;
   }

   static {
      method34741("Furnace", "furnace");
      method34741("Chest", "chest");
      method34741("EnderChest", "ender_chest");
      method34741("RecordPlayer", "jukebox");
      method34741("Trap", "dispenser");
      method34741("Dropper", "dropper");
      method34741("Sign", "sign");
      method34741("MobSpawner", "mob_spawner");
      method34741("Music", "noteblock");
      method34741("Piston", "piston");
      method34741("Cauldron", "brewing_stand");
      method34741("EnchantTable", "enchanting_table");
      method34741("Airportal", "end_portal");
      method34741("Beacon", "beacon");
      method34741("Skull", "skull");
      method34741("DLDetector", "daylight_detector");
      method34741("Hopper", "hopper");
      method34741("Comparator", "comparator");
      method34741("FlowerPot", "flower_pot");
      method34741("Banner", "banner");
      method34741("Structure", "structure_block");
      method34741("EndGateway", "end_gateway");
      method34741("Control", "command_block");
   }
}
