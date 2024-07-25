package remapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class class_7593 {
   private static BiMap<String, String> field_38668 = HashBiMap.create();

   private static void method_34499(String var0, String var1) {
      field_38668.put(var0, "minecraft:" + var1);
   }

   public static BiMap<String, String> method_34498() {
      return field_38668.inverse();
   }

   public static String method_34500(String var0) {
      String var3 = (String)field_38668.get(var0);
      return var3 == null ? var0 : var3;
   }

   static {
      method_34499("Furnace", "furnace");
      method_34499("Chest", "chest");
      method_34499("EnderChest", "ender_chest");
      method_34499("RecordPlayer", "jukebox");
      method_34499("Trap", "dispenser");
      method_34499("Dropper", "dropper");
      method_34499("Sign", "sign");
      method_34499("MobSpawner", "mob_spawner");
      method_34499("Music", "noteblock");
      method_34499("Piston", "piston");
      method_34499("Cauldron", "brewing_stand");
      method_34499("EnchantTable", "enchanting_table");
      method_34499("Airportal", "end_portal");
      method_34499("Beacon", "beacon");
      method_34499("Skull", "skull");
      method_34499("DLDetector", "daylight_detector");
      method_34499("Hopper", "hopper");
      method_34499("Comparator", "comparator");
      method_34499("FlowerPot", "flower_pot");
      method_34499("Banner", "banner");
      method_34499("Structure", "structure_block");
      method_34499("EndGateway", "end_gateway");
      method_34499("Control", "command_block");
   }
}
