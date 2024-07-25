package remapped;

import java.util.HashMap;
import java.util.Map;

public enum class_7304 {
   field_37351(1, 298, "minecraft:leather_helmet"),
   field_37330(3, 299, "minecraft:leather_chestplate"),
   field_37342(2, 300, "minecraft:leather_leggings"),
   field_37333(1, 301, "minecraft:leather_boots"),
   field_37352(2, 302, "minecraft:chainmail_helmet"),
   field_37355(5, 303, "minecraft:chainmail_chestplate"),
   field_37337(4, 304, "minecraft:chainmail_leggings"),
   field_37338(1, 305, "minecraft:chainmail_boots"),
   field_37343(2, 306, "minecraft:iron_helmet"),
   field_37345(6, 307, "minecraft:iron_chestplate"),
   field_37332(5, 308, "minecraft:iron_leggings"),
   field_37335(2, 309, "minecraft:iron_boots"),
   field_37349(3, 310, "minecraft:diamond_helmet"),
   field_37339(8, 311, "minecraft:diamond_chestplate"),
   field_37344(6, 312, "minecraft:diamond_leggings"),
   field_37350(3, 313, "minecraft:diamond_boots"),
   field_37341(2, 314, "minecraft:gold_helmet"),
   field_37354(5, 315, "minecraft:gold_chestplate"),
   field_37331(3, 316, "minecraft:gold_leggings"),
   field_37348(1, 317, "minecraft:gold_boots"),
   field_37356(0, 0, "none");

   private static final Map<Integer, class_7304> field_37336 = new HashMap<Integer, class_7304>();
   private final int field_37353;
   private final int field_37334;
   private final String field_37346;

   private class_7304(int var3, int var4, String var5) {
      this.field_37353 = var3;
      this.field_37334 = var4;
      this.field_37346 = var5;
   }

   public int method_33307() {
      return this.field_37353;
   }

   public String method_33308() {
      return this.field_37346;
   }

   public static class_7304 method_33312(int var0) {
      class_7304 var3 = field_37336.get(var0);
      return var3 != null ? var3 : field_37356;
   }

   public static class_7304 method_33305(String var0) {
      for (class_7304 var6 : values()) {
         if (var6.method_33308().equals(var0)) {
            return var6;
         }
      }

      return field_37356;
   }

   public static boolean method_33310(int var0) {
      return field_37336.containsKey(var0);
   }

   public static boolean method_33311(String var0) {
      for (class_7304 var6 : values()) {
         if (var6.method_33308().equals(var0)) {
            return true;
         }
      }

      return false;
   }

   public int method_33309() {
      return this.field_37334;
   }

   static {
      for (class_7304 var9 : values()) {
         field_37336.put(var9.method_33309(), var9);
      }
   }
}
