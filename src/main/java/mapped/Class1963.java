package mapped;

import java.util.HashMap;
import java.util.Map;

public enum Class1963 {
   field12772(1, 298, "minecraft:leather_helmet"),
   field12773(3, 299, "minecraft:leather_chestplate"),
   field12774(2, 300, "minecraft:leather_leggings"),
   field12775(1, 301, "minecraft:leather_boots"),
   field12776(2, 302, "minecraft:chainmail_helmet"),
   field12777(5, 303, "minecraft:chainmail_chestplate"),
   field12778(4, 304, "minecraft:chainmail_leggings"),
   field12779(1, 305, "minecraft:chainmail_boots"),
   field12780(2, 306, "minecraft:iron_helmet"),
   field12781(6, 307, "minecraft:iron_chestplate"),
   field12782(5, 308, "minecraft:iron_leggings"),
   field12783(2, 309, "minecraft:iron_boots"),
   field12784(3, 310, "minecraft:diamond_helmet"),
   field12785(8, 311, "minecraft:diamond_chestplate"),
   field12786(6, 312, "minecraft:diamond_leggings"),
   field12787(3, 313, "minecraft:diamond_boots"),
   field12788(2, 314, "minecraft:gold_helmet"),
   field12789(5, 315, "minecraft:gold_chestplate"),
   field12790(3, 316, "minecraft:gold_leggings"),
   field12791(1, 317, "minecraft:gold_boots"),
   field12792(0, 0, "none");

   private static final Map<Integer, Class1963> field12793 = new HashMap<Integer, Class1963>();
   private final int field12794;
   private final int field12795;
   private final String field12796;
   private static final Class1963[] field12797 = new Class1963[]{
      field12772,
      field12773,
      field12774,
      field12775,
      field12776,
      field12777,
      field12778,
      field12779,
      field12780,
      field12781,
      field12782,
      field12783,
      field12784,
      field12785,
      field12786,
      field12787,
      field12788,
      field12789,
      field12790,
      field12791,
      field12792
   };

   private Class1963(int var3, int var4, String var5) {
      this.field12794 = var3;
      this.field12795 = var4;
      this.field12796 = var5;
   }

   public int method8230() {
      return this.field12794;
   }

   public String method8231() {
      return this.field12796;
   }

   public static Class1963 method8232(int var0) {
      Class1963 var3 = field12793.get(var0);
      return var3 != null ? var3 : field12792;
   }

   public static Class1963 method8233(String var0) {
      for (Class1963 var6 : values()) {
         if (var6.method8231().equals(var0)) {
            return var6;
         }
      }

      return field12792;
   }

   public static boolean method8234(int var0) {
      return field12793.containsKey(var0);
   }

   public static boolean method8235(String var0) {
      for (Class1963 var6 : values()) {
         if (var6.method8231().equals(var0)) {
            return true;
         }
      }

      return false;
   }

   public int method8236() {
      return this.field12795;
   }

   static {
      for (Class1963 var9 : values()) {
         field12793.put(var9.method8236(), var9);
      }
   }
}
