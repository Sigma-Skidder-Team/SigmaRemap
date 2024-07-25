package remapped;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class class_3290 {
   private static class_3580[][] field_16293 = (class_3580[][])null;
   private static class_3580[][] field_16287 = (class_3580[][])null;
   private static Map field_16291 = null;
   private static class_4644 field_16286 = new class_4644();
   private static boolean field_16282 = true;
   private static boolean field_16275 = false;
   public static final int field_16288 = 16384;
   public static final int field_16273 = 63;
   public static final int field_16283 = 64;
   public static final String field_16292 = "texture.potion_overlay";
   public static final String field_16281 = "texture.potion_bottle_splash";
   public static final String field_16289 = "texture.potion_bottle_drinkable";
   public static final String field_16277 = "item/potion_overlay";
   public static final String field_16278 = "item/potion_bottle_splash";
   public static final String field_16280 = "item/potion_bottle_drinkable";
   private static final int[][] field_16279 = new int[0][];
   private static final Map<String, Integer> field_16290 = method_15072();
   private static final String field_16274 = "normal";
   private static final String field_16285 = "splash";
   private static final String field_16284 = "linger";

   public static void method_15073() {
      field_16293 = (class_3580[][])null;
      field_16287 = (class_3580[][])null;
      field_16282 = true;
      if (Config.method_14390()) {
         method_15093("optifine/cit.properties");
         class_8169[] var2 = Config.method_14347();

         for (int var3 = var2.length - 1; var3 >= 0; var3--) {
            class_8169 var4 = var2[var3];
            method_15074(var4);
         }

         method_15074(Config.method_14415());
         if (field_16293.length <= 0) {
            field_16293 = (class_3580[][])null;
         }

         if (field_16287.length <= 0) {
            field_16287 = (class_3580[][])null;
         }
      }
   }

   private static void method_15093(String var0) {
      try {
         Identifier var3 = new Identifier(var0);
         InputStream var4 = Config.method_14374(var3);
         if (var4 == null) {
            return;
         }

         Config.method_14277("CustomItems: Loading " + var0);
         class_8407 var5 = new class_8407();
         var5.load(var4);
         var4.close();
         field_16282 = Config.method_14257(var5.getProperty("useGlint"), true);
      } catch (FileNotFoundException var6) {
         return;
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   private static void method_15074(class_8169 var0) {
      String[] var3 = class_9654.method_44543(var0, "optifine/cit/", ".properties", (String[])null);
      Map var4 = method_15068(var0);
      if (var4.size() > 0) {
         Set var5 = var4.keySet();
         String[] var6 = var5.<String>toArray(new String[var5.size()]);
         var3 = (String[]) Config.method_14357(var3, var6);
      }

      Arrays.sort(var3);
      List var15 = method_15099(field_16293);
      List var16 = method_15099(field_16287);

      for (int var7 = 0; var7 < var3.length; var7++) {
         String var8 = var3[var7];
         Config.method_14277("CustomItems: " + var8);

         try {
            class_3580 var9 = null;
            if (var4.containsKey(var8)) {
               var9 = (class_3580)var4.get(var8);
            }

            if (var9 == null) {
               Identifier var10 = new Identifier(var8);
               InputStream var11 = var0.method_37466(class_3168.field_15844, var10);
               if (var11 == null) {
                  Config.method_14317("CustomItems file not found: " + var8);
                  continue;
               }

               class_8407 var12 = new class_8407();
               var12.load(var11);
               var11.close();
               var9 = new class_3580(var12, var8);
            }

            if (var9.method_16665(var8)) {
               method_15077(var9, var15);
               method_15079(var9, var16);
            }
         } catch (FileNotFoundException var13) {
            Config.method_14317("CustomItems file not found: " + var8);
         } catch (Exception var14) {
            var14.printStackTrace();
         }
      }

      field_16293 = method_15096(var15);
      field_16287 = method_15096(var16);
      Comparator var17 = method_15088();

      for (int var18 = 0; var18 < field_16293.length; var18++) {
         class_3580[] var20 = field_16293[var18];
         if (var20 != null) {
            Arrays.sort(var20, var17);
         }
      }

      for (int var19 = 0; var19 < field_16287.length; var19++) {
         class_3580[] var21 = field_16287[var19];
         if (var21 != null) {
            Arrays.sort(var21, var17);
         }
      }
   }

   private static Comparator method_15088() {
      return new class_6257();
   }

   public static void method_15082(class_8359 var0) {
      for (class_3580 var4 : method_15105()) {
         var4.method_16638(var0);
      }
   }

   public static void method_15103(class_8359 var0) {
      for (class_3580 var4 : method_15105()) {
         var4.method_16647(var0);
      }
   }

   public static void method_15076(class_6560 var0) {
      for (class_3580 var4 : method_15105()) {
         var4.method_16660(var0);
      }
   }

   public static void method_15101() {
      for (class_3580 var3 : method_15105()) {
         if (var3.field_17541 == 1) {
            class_8359 var4 = Config.method_14295();
            var3.method_16676(var4, field_16286);
            var3.method_16664();
         }
      }
   }

   private static List<class_3580> method_15105() {
      ArrayList var2 = new ArrayList();
      method_15092(field_16293, var2);
      method_15092(field_16287, var2);
      return var2;
   }

   private static void method_15092(class_3580[][] var0, List<class_3580> var1) {
      if (var0 != null) {
         for (int var4 = 0; var4 < var0.length; var4++) {
            class_3580[] var5 = var0[var4];
            if (var5 != null) {
               for (int var6 = 0; var6 < var5.length; var6++) {
                  class_3580 var7 = var5[var6];
                  if (var7 != null) {
                     var1.add(var7);
                  }
               }
            }
         }
      }
   }

   private static Map<String, class_3580> method_15068(class_8169 var0) {
      HashMap var3 = new HashMap();
      var3.putAll(method_15095(var0, "normal", class_8669.field_44382.method_39797(class_4897.field_25157)));
      var3.putAll(method_15095(var0, "splash", class_8669.field_44382.method_39797(class_4897.field_25226)));
      var3.putAll(method_15095(var0, "linger", class_8669.field_44382.method_39797(class_4897.field_24444)));
      return var3;
   }

   private static Map<String, class_3580> method_15095(class_8169 var0, String var1, Identifier var2) {
      HashMap var5 = new HashMap();
      String var6 = var1 + "/";
      String[] var7 = new String[]{"optifine/cit/potion/" + var6, "optifine/cit/Potion/" + var6};
      String[] var8 = new String[]{".png"};
      String[] var9 = class_9654.method_44544(var0, var7, var8);

      for (int var10 = 0; var10 < var9.length; var10++) {
         String var11 = var9[var10];
         String var12 = class_8251.method_37820(var11, var7, var8);
         Properties var13 = method_15086(var12, var1, var2, var11);
         if (var13 != null) {
            String var14 = class_8251.method_37823(var11, var8) + ".properties";
            class_3580 var15 = new class_3580(var13, var14);
            var5.put(var14, var15);
         }
      }

      return var5;
   }

   private static Properties method_15086(String var0, String var1, Identifier var2, String var3) {
      if (class_8251.method_37815(var0, new String[]{"_n", "_s"})) {
         return null;
      } else if (var0.equals("empty") && var1.equals("normal")) {
         var2 = class_8669.field_44382.method_39797(class_4897.field_24812);
         class_8407 var11 = new class_8407();
         var11.put("type", "item");
         var11.put("items", var2.toString());
         return var11;
      } else {
         int[] var6 = (int[])method_15083().get(var0);
         if (var6 == null) {
            Config.method_14317("Potion not found for image: " + var3);
            return null;
         } else {
            StringBuffer var7 = new StringBuffer();

            for (int var8 = 0; var8 < var6.length; var8++) {
               int var9 = var6[var8];
               if (var1.equals("splash")) {
                  var9 |= 16384;
               }

               if (var8 > 0) {
                  var7.append(" ");
               }

               var7.append(var9);
            }

            int var12 = 16447;
            if (var0.equals("water") || var0.equals("mundane")) {
               var12 |= 64;
            }

            class_8407 var13 = new class_8407();
            var13.put("type", "item");
            var13.put("items", var2.toString());
            var13.put("damage", var7.toString());
            var13.put("damageMask", "" + var12);
            if (!var1.equals("splash")) {
               var13.put("texture.potion_bottle_drinkable", var0);
            } else {
               var13.put("texture.potion_bottle_splash", var0);
            }

            return var13;
         }
      }
   }

   private static Map method_15083() {
      if (field_16291 == null) {
         field_16291 = new LinkedHashMap();
         field_16291.put("water", method_15090(0, 0));
         field_16291.put("awkward", method_15090(0, 1));
         field_16291.put("thick", method_15090(0, 2));
         field_16291.put("potent", method_15090(0, 3));
         field_16291.put("regeneration", method_15070(1));
         field_16291.put("movespeed", method_15070(2));
         field_16291.put("fireresistance", method_15070(3));
         field_16291.put("poison", method_15070(4));
         field_16291.put("heal", method_15070(5));
         field_16291.put("nightvision", method_15070(6));
         field_16291.put("clear", method_15090(7, 0));
         field_16291.put("bungling", method_15090(7, 1));
         field_16291.put("charming", method_15090(7, 2));
         field_16291.put("rank", method_15090(7, 3));
         field_16291.put("weakness", method_15070(8));
         field_16291.put("damageboost", method_15070(9));
         field_16291.put("moveslowdown", method_15070(10));
         field_16291.put("leaping", method_15070(11));
         field_16291.put("harm", method_15070(12));
         field_16291.put("waterbreathing", method_15070(13));
         field_16291.put("invisibility", method_15070(14));
         field_16291.put("thin", method_15090(15, 0));
         field_16291.put("debonair", method_15090(15, 1));
         field_16291.put("sparkling", method_15090(15, 2));
         field_16291.put("stinky", method_15090(15, 3));
         field_16291.put("mundane", method_15090(0, 4));
         field_16291.put("speed", field_16291.get("movespeed"));
         field_16291.put("fire_resistance", field_16291.get("fireresistance"));
         field_16291.put("instant_health", field_16291.get("heal"));
         field_16291.put("night_vision", field_16291.get("nightvision"));
         field_16291.put("strength", field_16291.get("damageboost"));
         field_16291.put("slowness", field_16291.get("moveslowdown"));
         field_16291.put("instant_damage", field_16291.get("harm"));
         field_16291.put("water_breathing", field_16291.get("waterbreathing"));
      }

      return field_16291;
   }

   private static int[] method_15070(int var0) {
      return new int[]{var0, var0 + 16, var0 + 32, var0 + 48};
   }

   private static int[] method_15090(int var0, int var1) {
      return new int[]{var0 + var1 * 16};
   }

   private static int method_15085(String var0) {
      String var3 = "effect." + var0;

      for (Identifier var5 : class_8669.field_44436.method_39805()) {
         if (class_8669.field_44436.method_39814(var5)) {
            class_1425 var6 = class_8669.field_44436.method_39806(var5);
            String var7 = var6.method_6540();
            if (var3.equals(var7)) {
               return class_1425.method_6536(var6);
            }
         }
      }

      return -1;
   }

   private static List<List<class_3580>> method_15099(class_3580[][] var0) {
      ArrayList var3 = new ArrayList();
      if (var0 != null) {
         for (int var4 = 0; var4 < var0.length; var4++) {
            class_3580[] var5 = var0[var4];
            ArrayList var6 = null;
            if (var5 != null) {
               var6 = new ArrayList<class_3580>(Arrays.asList(var5));
            }

            var3.add(var6);
         }
      }

      return var3;
   }

   private static class_3580[][] method_15096(List var0) {
      class_3580[][] var3 = new class_3580[var0.size()][];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         List var5 = (List)var0.get(var4);
         if (var5 != null) {
            class_3580[] var6 = var5.<class_3580>toArray(new class_3580[var5.size()]);
            Arrays.sort(var6, new class_8632());
            var3[var4] = var6;
         }
      }

      return var3;
   }

   private static void method_15077(class_3580 var0, List<List<class_3580>> var1) {
      if (var0.field_17549 != null) {
         for (int var4 = 0; var4 < var0.field_17549.length; var4++) {
            int var5 = var0.field_17549[var4];
            if (var5 > 0) {
               method_15087(var0, var1, var5);
            } else {
               Config.method_14317("Invalid item ID: " + var5);
            }
         }
      }
   }

   private static void method_15079(class_3580 var0, List<List<class_3580>> var1) {
      if (var0.field_17541 == 2 && var0.field_17525 != null) {
         int var4 = method_15084() + 1;

         for (int var5 = 0; var5 < var4; var5++) {
            if (Config.method_14253(var5, var0.field_17525)) {
               method_15087(var0, var1, var5);
            }
         }
      }
   }

   private static int method_15084() {
      int var2 = 0;

      while (true) {
         class_4382 var3 = class_8669.field_44445.method_14040(var2);
         if (var3 == null) {
            return var2;
         }

         var2++;
      }
   }

   private static void method_15087(class_3580 var0, List<List<class_3580>> var1, int var2) {
      while (var2 >= var1.size()) {
         var1.add((List)null);
      }

      Object var5 = (List)var1.get(var2);
      if (var5 == null) {
         var5 = new ArrayList();
         var1.set(var2, var5);
      }

      var5.add(var0);
   }

   public static class_7373 method_15078(ItemStack var0, class_7373 var1, Identifier var2, boolean var3) {
      if (!var3 && var1.method_33583()) {
         return var1;
      } else if (field_16293 != null) {
         class_3580 var6 = method_15069(var0, 1);
         if (var6 != null) {
            class_7373 var7 = var6.method_16678(var2, var3);
            return var7 == null ? var1 : var7;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public static Identifier method_15106(ItemStack var0, class_6943 var1, String var2, Identifier var3) {
      if (field_16293 != null) {
         Identifier var6 = method_15097(var0, var1, var2);
         return var6 != null ? var6 : var3;
      } else {
         return var3;
      }
   }

   private static Identifier method_15097(ItemStack var0, class_6943 var1, String var2) {
      class_3580 var5 = method_15069(var0, 3);
      if (var5 != null) {
         if (var5.field_17514 != null) {
            class_2451 var6 = var0.method_27960();
            if (var6 instanceof class_8228) {
               class_8228 var7 = (class_8228)var6;
               String var8 = var7.method_37667().method_22186();
               int var9 = var1 != class_6943.field_35698 ? 1 : 2;
               StringBuffer var10 = new StringBuffer();
               var10.append("texture.");
               var10.append(var8);
               var10.append("_layer_");
               var10.append(var9);
               if (var2 != null) {
                  var10.append("_");
                  var10.append(var2);
               }

               String var11 = var10.toString();
               Identifier var12 = (Identifier)var5.field_17514.get(var11);
               return var12 != null ? var12 : var5.field_17524;
            } else {
               return null;
            }
         } else {
            return var5.field_17524;
         }
      } else {
         return null;
      }
   }

   public static Identifier method_15089(ItemStack var0, Identifier var1) {
      if (field_16293 != null) {
         class_3580 var4 = method_15069(var0, 4);
         if (var4 != null) {
            return var4.field_17524 != null ? var4.field_17524 : var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static class_3580 method_15069(ItemStack var0, int var1) {
      if (field_16293 != null) {
         if (var0 == null) {
            return null;
         } else {
            class_2451 var4 = var0.method_27960();
            int var5 = class_2451.method_11244(var4);
            if (var5 >= 0 && var5 < field_16293.length) {
               class_3580[] var6 = field_16293[var5];
               if (var6 != null) {
                  for (int var7 = 0; var7 < var6.length; var7++) {
                     class_3580 var8 = var6[var7];
                     if (var8.field_17541 == var1 && method_15075(var8, var0, (int[][])null)) {
                        return var8;
                     }
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private static boolean method_15075(class_3580 var0, ItemStack var1, int[][] var2) {
      class_2451 var5 = var1.method_27960();
      if (var0.field_17542 != null) {
         int var6 = method_15091(var1);
         if (var6 < 0) {
            return false;
         }

         if (var0.field_17555 != 0) {
            var6 &= var0.field_17555;
         }

         if (var0.field_17550) {
            int var7 = var5.method_11234();
            var6 = (int)((double)(var6 * 100) / (double)var7);
         }

         if (!var0.field_17542.method_40164(var6)) {
            return false;
         }
      }

      if (var0.field_17523 != null && !var0.field_17523.method_40164(var1.method_27997())) {
         return false;
      } else {
         int[][] var10 = var2;
         if (var0.field_17525 != null) {
            if (var2 == null) {
               var10 = method_15094(var1);
            }

            boolean var11 = false;

            for (int var8 = 0; var8 < var10.length; var8++) {
               int var9 = var10[var8][0];
               if (Config.method_14253(var9, var0.field_17525)) {
                  var11 = true;
                  break;
               }
            }

            if (!var11) {
               return false;
            }
         }

         if (var0.field_17515 != null) {
            if (var10 == null) {
               var10 = method_15094(var1);
            }

            boolean var12 = false;

            for (int var14 = 0; var14 < var10.length; var14++) {
               int var16 = var10[var14][1];
               if (var0.field_17515.method_40164(var16)) {
                  var12 = true;
                  break;
               }
            }

            if (!var12) {
               return false;
            }
         }

         if (var0.field_17522 != null) {
            CompoundNBT var13 = var1.method_27990();

            for (int var15 = 0; var15 < var0.field_17522.length; var15++) {
               class_1719 var17 = var0.field_17522[var15];
               if (!var17.method_7705(var13)) {
                  return false;
               }
            }
         }

         if (var0.field_17526 != 0) {
            if (var0.field_17526 == 1 && field_16275) {
               return false;
            }

            if (var0.field_17526 == 2 && !field_16275) {
               return false;
            }
         }

         return true;
      }
   }

   private static int method_15091(ItemStack var0) {
      class_2451 var3 = var0.method_27960();
      return !(var3 instanceof class_5518) ? var0.method_28026() : method_15081(var0);
   }

   private static int method_15081(ItemStack var0) {
      CompoundNBT var3 = var0.method_27990();
      if (var3 != null) {
         String var4 = var3.method_25965("Potion");
         if (var4 != null && !var4.equals("")) {
            Integer var5 = field_16290.get(var4);
            if (var5 != null) {
               int var6 = var5;
               if (var0.method_27960() == class_4897.field_25226) {
                  var6 |= 16384;
               }

               return var6;
            } else {
               return -1;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private static Map<String, Integer> method_15072() {
      HashMap var2 = new HashMap();
      method_15071("water", 0, false, var2);
      method_15071("awkward", 16, false, var2);
      method_15071("thick", 32, false, var2);
      method_15071("mundane", 64, false, var2);
      method_15071("regeneration", 1, true, var2);
      method_15071("swiftness", 2, true, var2);
      method_15071("fire_resistance", 3, true, var2);
      method_15071("poison", 4, true, var2);
      method_15071("healing", 5, true, var2);
      method_15071("night_vision", 6, true, var2);
      method_15071("weakness", 8, true, var2);
      method_15071("strength", 9, true, var2);
      method_15071("slowness", 10, true, var2);
      method_15071("leaping", 11, true, var2);
      method_15071("harming", 12, true, var2);
      method_15071("water_breathing", 13, true, var2);
      method_15071("invisibility", 14, true, var2);
      return var2;
   }

   private static void method_15071(String var0, int var1, boolean var2, Map<String, Integer> var3) {
      if (var2) {
         var1 |= 8192;
      }

      var3.put("minecraft:" + var0, var1);
      if (var2) {
         int var6 = var1 | 32;
         var3.put("minecraft:strong_" + var0, var6);
         int var7 = var1 | 64;
         var3.put("minecraft:long_" + var0, var7);
      }
   }

   private static int[][] method_15094(ItemStack var0) {
      class_2451 var3 = var0.method_27960();
      class_3416 var4;
      if (var3 != class_4897.field_24879) {
         var4 = var0.method_27983();
      } else {
         class_7597 var5 = (class_7597)class_4897.field_24879;
         var4 = class_7597.method_34501(var0);
      }

      class_3416 var13 = var4;
      if (var4 != null && var4.size() > 0) {
         int[][] var6 = new int[var4.size()][2];

         for (int var7 = 0; var7 < var13.size(); var7++) {
            CompoundNBT var8 = var13.method_15764(var7);
            String var9 = var8.method_25965("id");
            int var10 = var8.method_25947("lvl");
            class_4382 var11 = class_2919.method_13357(var9);
            if (var11 != null) {
               int var12 = class_8669.field_44445.method_14041(var11);
               var6[var7][0] = var12;
               var6[var7][1] = var10;
            }
         }

         return var6;
      } else {
         return field_16279;
      }
   }

   public static boolean method_15102(ItemRenderer var0, ItemStack var1, class_7373 var2) {
      if (field_16287 == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         int[][] var5 = method_15094(var1);
         if (var5.length <= 0) {
            return false;
         } else {
            HashSet var6 = null;
            boolean var7 = false;
            TextureManager var8 = Config.method_14266();

            for (int var9 = 0; var9 < var5.length; var9++) {
               int var10 = var5[var9][0];
               if (var10 >= 0 && var10 < field_16287.length) {
                  class_3580[] var11 = field_16287[var10];
                  if (var11 != null) {
                     for (int var12 = 0; var12 < var11.length; var12++) {
                        class_3580 var13 = var11[var12];
                        if (var6 == null) {
                           var6 = new HashSet();
                        }

                        if (var6.add(var10) && method_15075(var13, var1, var5) && var13.field_17524 != null) {
                           var8.bindTexture(var13.field_17524);
                           float var14 = var13.method_16680(var8);
                           if (!var7) {
                              var7 = true;
                              GlStateManager.method_8867(false);
                              GlStateManager.method_8862(514);
                              GlStateManager.method_8912();
                              GlStateManager.method_8842(5890);
                           }

                           class_1240.method_5531(var13.field_17548, 1.0F);
                           GlStateManager.method_8757();
                           GlStateManager.method_8854(var14, var14, var14);
                           float var15 = var13.field_17539 * (float)(Util.getMeasuringTimeMs() % 3000L) / 3000.0F / 8.0F;
                           GlStateManager.method_8897(var15, 0.0F, 0.0F);
                           GlStateManager.method_8824(var13.field_17517, 0.0F, 0.0F, 1.0F);
                           GlStateManager.method_8761();
                        }
                     }
                  }
               }
            }

            if (var7) {
               GlStateManager.enableAlphaTest();
               GlStateManager.method_8829();
               GlStateManager.method_8787(770, 771);
               GlStateManager.method_8789(1.0F, 1.0F, 1.0F, 1.0F);
               GlStateManager.method_8842(5888);
               GlStateManager.method_8927();
               GlStateManager.method_8862(515);
               GlStateManager.method_8867(true);
               var8.bindTexture(class_8359.field_42824);
            }

            return var7;
         }
      }
   }

   public static boolean method_15098(
           class_5834 var0, ItemStack var1, class_6521 var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9
   ) {
      if (field_16287 == null) {
         return false;
      } else if (Config.method_14424() && class_6588.field_33945) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         int[][] var12 = method_15094(var1);
         if (var12.length <= 0) {
            return false;
         } else {
            HashSet var13 = null;
            boolean var14 = false;
            TextureManager var15 = Config.method_14266();

            for (int var16 = 0; var16 < var12.length; var16++) {
               int var17 = var12[var16][0];
               if (var17 >= 0 && var17 < field_16287.length) {
                  class_3580[] var18 = field_16287[var17];
                  if (var18 != null) {
                     for (int var19 = 0; var19 < var18.length; var19++) {
                        class_3580 var20 = var18[var19];
                        if (var13 == null) {
                           var13 = new HashSet();
                        }

                        if (var13.add(var17) && method_15075(var20, var1, var12) && var20.field_17524 != null) {
                           var15.bindTexture(var20.field_17524);
                           float var21 = var20.method_16680(var15);
                           if (!var14) {
                              var14 = true;
                              if (Config.method_14424()) {
                                 class_293.method_1302();
                              }

                              GlStateManager.method_8829();
                              GlStateManager.method_8862(514);
                              GlStateManager.method_8867(false);
                           }

                           class_1240.method_5531(var20.field_17548, 1.0F);
                           GlStateManager.method_8912();
                           GlStateManager.method_8842(5890);
                           GlStateManager.method_8865();
                           GlStateManager.method_8824(var20.field_17517, 0.0F, 0.0F, 1.0F);
                           float var22 = var21 / 8.0F;
                           GlStateManager.method_8854(var22, var22 / 2.0F, var22);
                           float var23 = var20.field_17539 * (float)(Util.getMeasuringTimeMs() % 3000L) / 3000.0F / 8.0F;
                           GlStateManager.method_8897(0.0F, var23, 0.0F);
                           GlStateManager.method_8842(5888);
                        }
                     }
                  }
               }
            }

            if (var14) {
               GlStateManager.enableAlphaTest();
               GlStateManager.method_8829();
               GlStateManager.method_8787(770, 771);
               GlStateManager.method_8789(1.0F, 1.0F, 1.0F, 1.0F);
               GlStateManager.method_8842(5890);
               GlStateManager.method_8865();
               GlStateManager.method_8842(5888);
               GlStateManager.method_8927();
               GlStateManager.method_8867(true);
               GlStateManager.method_8862(515);
               GlStateManager.method_8775();
               if (Config.method_14424()) {
                  class_293.method_1315();
               }
            }

            return var14;
         }
      }
   }

   public static boolean method_15100() {
      return field_16282;
   }

   public static void method_15104(boolean var0) {
      field_16275 = var0;
   }
}
