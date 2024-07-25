package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import org.lwjgl.opengl.GL11;

public class class_3580 {
   public String field_17529 = null;
   public String field_17545 = null;
   public int field_17541 = 1;
   public int[] field_17549 = null;
   public String field_17547 = null;
   public Map<String, String> field_17536 = null;
   public String field_17519 = null;
   public Map<String, String> field_17516 = null;
   public class_8750 field_17542 = null;
   public boolean field_17550 = false;
   public int field_17555 = 0;
   public class_8750 field_17523 = null;
   public int[] field_17525 = null;
   public class_8750 field_17515 = null;
   public class_1719[] field_17522 = null;
   public int field_17526 = 0;
   public int field_17548 = 1;
   public float field_17539 = 0.0F;
   public float field_17517 = 0.0F;
   public int field_17535 = 0;
   public float field_17528 = 1.0F;
   public int field_17553 = 0;
   public class_4639 field_17524 = null;
   public Map field_17514 = null;
   public class_5155 field_17533 = null;
   public Map field_17544 = null;
   public class_7373 field_17538 = null;
   public Map<String, class_7373> field_17531 = null;
   public class_7373 field_17521 = null;
   public Map<String, class_7373> field_17552 = null;
   private int field_17543 = 0;
   private int field_17537 = 0;
   public static final int field_17551 = 0;
   public static final int field_17518 = 1;
   public static final int field_17546 = 2;
   public static final int field_17527 = 3;
   public static final int field_17532 = 4;
   public static final int field_17520 = 0;
   public static final int field_17554 = 1;
   public static final int field_17534 = 2;
   public static final String field_17540 = "inventory";

   public class_3580(Properties var1, String var2) {
      this.field_17529 = method_16668(var2);
      this.field_17545 = method_16652(var2);
      this.field_17541 = this.method_16642(var1.getProperty("type"));
      this.field_17549 = this.method_16644(var1.getProperty("items"), var1.getProperty("matchItems"));
      this.field_17516 = method_16658(var1, this.field_17545);
      this.field_17519 = method_16667(var1.getProperty("model"), var2, this.field_17545, this.field_17541, this.field_17516);
      this.field_17536 = method_16651(var1, this.field_17545);
      boolean var5 = this.field_17516 == null && this.field_17519 == null;
      this.field_17547 = method_16650(
         var1.getProperty("texture"), var1.getProperty("tile"), var1.getProperty("source"), var2, this.field_17545, this.field_17541, this.field_17536, var5
      );
      String var6 = var1.getProperty("damage");
      if (var6 != null) {
         this.field_17550 = var6.contains("%");
         var6 = var6.replace("%", "");
         this.field_17542 = this.method_16675(var6);
         this.field_17555 = this.method_16673(var1.getProperty("damageMask"), 0);
      }

      this.field_17523 = this.method_16675(var1.getProperty("stackSize"));
      this.field_17525 = this.method_16677(method_16640(var1, "enchantmentIDs", "enchantments"), new class_3960());
      this.field_17515 = this.method_16675(var1.getProperty("enchantmentLevels"));
      this.field_17522 = this.method_16649(var1);
      this.field_17526 = this.method_16646(var1.getProperty("hand"));
      this.field_17548 = class_1240.method_5532(var1.getProperty("blend"));
      this.field_17539 = this.method_16641(var1.getProperty("speed"), 0.0F);
      this.field_17517 = this.method_16641(var1.getProperty("rotation"), 0.0F);
      this.field_17535 = this.method_16673(var1.getProperty("layer"), 0);
      this.field_17553 = this.method_16673(var1.getProperty("weight"), 0);
      this.field_17528 = this.method_16641(var1.getProperty("duration"), 1.0F);
   }

   private static String method_16640(Properties var0, String... var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];
         String var6 = var0.getProperty(var5);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   private static String method_16668(String var0) {
      String var3 = var0;
      int var4 = var0.lastIndexOf(47);
      if (var4 >= 0) {
         var3 = var0.substring(var4 + 1);
      }

      int var5 = var3.lastIndexOf(46);
      if (var5 >= 0) {
         var3 = var3.substring(0, var5);
      }

      return var3;
   }

   private static String method_16652(String var0) {
      int var3 = var0.lastIndexOf(47);
      return var3 >= 0 ? var0.substring(0, var3) : "";
   }

   private int method_16642(String var1) {
      if (var1 != null) {
         if (!var1.equals("item")) {
            if (!var1.equals("enchantment")) {
               if (!var1.equals("armor")) {
                  if (!var1.equals("elytra")) {
                     class_3111.method_14317("Unknown method: " + var1);
                     return 0;
                  } else {
                     return 4;
                  }
               } else {
                  return 3;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 1;
      }
   }

   private int[] method_16644(String var1, String var2) {
      if (var1 == null) {
         var1 = var2;
      }

      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         TreeSet var5 = new TreeSet();
         String[] var6 = class_3111.method_14302(var1, " ");

         for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            class_2451 var9 = this.method_16655(var8);
            if (var9 != null) {
               int var10 = class_2451.method_11244(var9);
               if (var10 >= 0) {
                  var5.add(new Integer(var10));
               } else {
                  class_3111.method_14317("Item ID not found: " + var8);
               }
            } else {
               class_3111.method_14317("Item not found: " + var8);
            }
         }

         Integer[] var12 = var5.<Integer>toArray(new Integer[var5.size()]);
         int[] var13 = new int[var12.length];

         for (int var14 = 0; var14 < var13.length; var14++) {
            var13[var14] = var12[var14];
         }

         return var13;
      }
   }

   private class_2451 method_16655(String var1) {
      class_4639 var4 = new class_4639(var1);
      return class_8669.field_44382.method_39814(var4) ? class_8669.field_44382.method_39806(var4) : null;
   }

   private static String method_16650(String var0, String var1, String var2, String var3, String var4, int var5, Map<String, String> var6, boolean var7) {
      if (var0 == null) {
         var0 = var1;
      }

      if (var0 == null) {
         var0 = var2;
      }

      if (var0 == null) {
         if (var5 != 3) {
            if (var6 != null) {
               String var13 = (String)var6.get("texture.bow_standby");
               if (var13 != null) {
                  return var13;
               }
            }

            if (var7) {
               String var14 = var3;
               int var11 = var3.lastIndexOf(47);
               if (var11 >= 0) {
                  var14 = var3.substring(var11 + 1);
               }

               int var12 = var14.lastIndexOf(46);
               if (var12 >= 0) {
                  var14 = var14.substring(0, var12);
               }

               return method_16659(var14, var4);
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         String var10 = ".png";
         if (var0.endsWith(var10)) {
            var0 = var0.substring(0, var0.length() - var10.length());
         }

         return method_16659(var0, var4);
      }
   }

   private static Map method_16651(Properties var0, String var1) {
      String var4 = "texture.";
      Map var5 = method_16672(var0, var4);
      if (var5.size() <= 0) {
         return null;
      } else {
         Set var6 = var5.keySet();
         LinkedHashMap var7 = new LinkedHashMap();

         for (String var9 : var6) {
            String var10 = (String)var5.get(var9);
            var10 = method_16659(var10, var1);
            var7.put(var9, var10);
         }

         return var7;
      }
   }

   private static String method_16659(String var0, String var1) {
      var0 = class_5525.method_25096(var0, var1);
      if (!var0.startsWith(var1) && !var0.startsWith("textures/") && !var0.startsWith("optifine/")) {
         var0 = var1 + "/" + var0;
      }

      if (var0.endsWith(".png")) {
         var0 = var0.substring(0, var0.length() - 4);
      }

      if (var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private static String method_16667(String var0, String var1, String var2, int var3, Map<String, String> var4) {
      if (var0 == null) {
         if (var3 != 3) {
            if (var4 != null) {
               String var8 = (String)var4.get("model.bow_standby");
               if (var8 != null) {
                  return var8;
               }
            }

            return var0;
         } else {
            return null;
         }
      } else {
         String var7 = ".json";
         if (var0.endsWith(var7)) {
            var0 = var0.substring(0, var0.length() - var7.length());
         }

         return method_16674(var0, var2);
      }
   }

   private static Map method_16658(Properties var0, String var1) {
      String var4 = "model.";
      Map var5 = method_16672(var0, var4);
      if (var5.size() <= 0) {
         return null;
      } else {
         Set var6 = var5.keySet();
         LinkedHashMap var7 = new LinkedHashMap();

         for (String var9 : var6) {
            String var10 = (String)var5.get(var9);
            var10 = method_16674(var10, var1);
            var7.put(var9, var10);
         }

         return var7;
      }
   }

   private static String method_16674(String var0, String var1) {
      var0 = class_5525.method_25096(var0, var1);
      boolean var4 = var0.startsWith("block/") || var0.startsWith("item/");
      if (!var0.startsWith(var1) && !var4 && !var0.startsWith("optifine/")) {
         var0 = var1 + "/" + var0;
      }

      String var5 = ".json";
      if (var0.endsWith(var5)) {
         var0 = var0.substring(0, var0.length() - var5.length());
      }

      if (var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private int method_16673(String var1, int var2) {
      if (var1 != null) {
         var1 = var1.trim();
         int var5 = class_3111.method_14361(var1, Integer.MIN_VALUE);
         if (var5 != Integer.MIN_VALUE) {
            return var5;
         } else {
            class_3111.method_14317("Invalid integer: " + var1);
            return var2;
         }
      } else {
         return var2;
      }
   }

   private float method_16641(String var1, float var2) {
      if (var1 != null) {
         var1 = var1.trim();
         float var5 = class_3111.method_14445(var1, Float.MIN_VALUE);
         if (var5 != Float.MIN_VALUE) {
            return var5;
         } else {
            class_3111.method_14317("Invalid float: " + var1);
            return var2;
         }
      } else {
         return var2;
      }
   }

   private int[] method_16677(String var1, class_8630 var2) {
      if (var1 != null) {
         String[] var5 = class_3111.method_14302(var1, " ");
         ArrayList var6 = new ArrayList();

         for (int var7 = 0; var7 < var5.length; var7++) {
            String var8 = var5[var7];
            int var9 = var2.method_39626(var8, Integer.MIN_VALUE);
            if (var9 != Integer.MIN_VALUE) {
               var6.add(var9);
            } else {
               class_3111.method_14317("Invalid value: " + var8);
            }
         }

         Integer[] var10 = var6.<Integer>toArray(new Integer[var6.size()]);
         return class_3111.method_14267(var10);
      } else {
         return null;
      }
   }

   private class_8750 method_16675(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String[] var4 = class_3111.method_14302(var1, " ");
         class_8750 var5 = new class_8750();

         for (int var6 = 0; var6 < var4.length; var6++) {
            String var7 = var4[var6];
            class_2279 var8 = this.method_16656(var7);
            if (var8 == null) {
               class_3111.method_14317("Invalid range list: " + var1);
               return null;
            }

            var5.method_40162(var8);
         }

         return var5;
      }
   }

   private class_2279 method_16656(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         int var4 = var1.length() - var1.replace("-", "").length();
         if (var4 > 1) {
            class_3111.method_14317("Invalid range: " + var1);
            return null;
         } else {
            String[] var5 = class_3111.method_14302(var1, "- ");
            int[] var6 = new int[var5.length];

            for (int var7 = 0; var7 < var5.length; var7++) {
               String var8 = var5[var7];
               int var9 = class_3111.method_14361(var8, -1);
               if (var9 < 0) {
                  class_3111.method_14317("Invalid range: " + var1);
                  return null;
               }

               var6[var7] = var9;
            }

            if (var6.length != 1) {
               if (var6.length != 2) {
                  class_3111.method_14317("Invalid range: " + var1);
                  return null;
               } else {
                  int var12 = Math.min(var6[0], var6[1]);
                  int var13 = Math.max(var6[0], var6[1]);
                  return new class_2279(var12, var13);
               }
            } else {
               int var11 = var6[0];
               if (!var1.startsWith("-")) {
                  return !var1.endsWith("-") ? new class_2279(var11, var11) : new class_2279(var11, 65535);
               } else {
                  return new class_2279(0, var11);
               }
            }
         }
      }
   }

   private class_1719[] method_16649(Properties var1) {
      String var4 = "nbt.";
      Map var5 = method_16672(var1, var4);
      if (var5.size() <= 0) {
         return null;
      } else {
         ArrayList var6 = new ArrayList();

         for (String var8 : var5.keySet()) {
            String var9 = (String)var5.get(var8);
            String var10 = var8.substring(var4.length());
            class_1719 var11 = new class_1719(var10, var9);
            var6.add(var11);
         }

         return var6.<class_1719>toArray(new class_1719[var6.size()]);
      }
   }

   private static Map method_16672(Properties var0, String var1) {
      LinkedHashMap var4 = new LinkedHashMap();

      for (String var6 : var0.keySet()) {
         String var7 = var0.getProperty(var6);
         if (var6.startsWith(var1)) {
            var4.put(var6, var7);
         }
      }

      return var4;
   }

   private int method_16646(String var1) {
      if (var1 != null) {
         var1 = var1.toLowerCase();
         if (!var1.equals("any")) {
            if (!var1.equals("main")) {
               if (!var1.equals("off")) {
                  class_3111.method_14317("Invalid hand: " + var1);
                  return 0;
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public boolean method_16665(String var1) {
      if (this.field_17529 == null || this.field_17529.length() <= 0) {
         class_3111.method_14317("No name found: " + var1);
         return false;
      } else if (this.field_17545 == null) {
         class_3111.method_14317("No base path found: " + var1);
         return false;
      } else if (this.field_17541 != 0) {
         if (this.field_17541 == 4 && this.field_17549 == null) {
            this.field_17549 = new int[]{class_2451.method_11244(class_4897.field_24503)};
         }

         if (this.field_17541 == 1 || this.field_17541 == 3 || this.field_17541 == 4) {
            if (this.field_17549 == null) {
               this.field_17549 = this.method_16661();
            }

            if (this.field_17549 == null) {
               class_3111.method_14317("No items defined: " + var1);
               return false;
            }
         }

         if (this.field_17547 == null && this.field_17536 == null && this.field_17519 == null && this.field_17516 == null) {
            class_3111.method_14317("No texture or model specified: " + var1);
            return false;
         } else if (this.field_17541 == 2 && this.field_17525 == null) {
            class_3111.method_14317("No enchantmentIDs specified: " + var1);
            return false;
         } else {
            return true;
         }
      } else {
         class_3111.method_14317("No type defined: " + var1);
         return false;
      }
   }

   private int[] method_16661() {
      class_2451 var3 = this.method_16655(this.field_17529);
      if (var3 != null) {
         int var4 = class_2451.method_11244(var3);
         return var4 >= 0 ? new int[]{var4} : null;
      } else {
         return null;
      }
   }

   public void method_16638(class_8359 var1) {
      if (this.field_17547 != null) {
         this.field_17524 = this.method_16653(this.field_17547);
         if (this.field_17541 == 1) {
            class_4639 var4 = this.method_16662(this.field_17524);
            this.field_17533 = var1.method_38515(var4);
         }
      }

      if (this.field_17536 != null) {
         this.field_17514 = new HashMap();
         this.field_17544 = new HashMap();

         for (String var5 : this.field_17536.keySet()) {
            String var6 = this.field_17536.get(var5);
            class_4639 var7 = this.method_16653(var6);
            this.field_17514.put(var5, var7);
            if (this.field_17541 == 1) {
               class_4639 var8 = this.method_16662(var7);
               class_5155 var9 = var1.method_38515(var8);
               this.field_17544.put(var5, var9);
            }
         }
      }
   }

   public void method_16647(class_8359 var1) {
      if (this.field_17533 != null) {
         this.field_17533 = var1.method_38528(this.field_17533.method_23644());
      }

      if (this.field_17544 != null) {
         for (String var5 : this.field_17544.keySet()) {
            class_5155 var6 = (class_5155)this.field_17544.get(var5);
            if (var6 != null) {
               class_4639 var7 = var6.method_23644();
               class_5155 var8 = var1.method_38528(var7);
               if (var8 == null || var8 instanceof class_2008) {
                  class_3111.method_14317("Missing CIT sprite: " + var7 + ", properties: " + this.field_17545);
               }

               this.field_17544.put(var5, var8);
            }
         }
      }
   }

   private class_4639 method_16653(String var1) {
      if (var1 != null) {
         class_4639 var4 = new class_4639(var1);
         String var5 = var4.method_21461();
         String var6 = var4.method_21456();
         if (!var6.contains("/")) {
            var6 = "textures/item/" + var6;
         }

         String var7 = var6 + ".png";
         class_4639 var8 = new class_4639(var5, var7);
         boolean var9 = class_3111.method_14362(var8);
         if (!var9) {
            class_3111.method_14317("File not found: " + var7);
         }

         return var8;
      } else {
         return null;
      }
   }

   private class_4639 method_16662(class_4639 var1) {
      String var4 = var1.method_21456();
      var4 = class_8251.method_37832(var4, "textures/");
      var4 = class_8251.method_37822(var4, ".png");
      return new class_4639(var1.method_21461(), var4);
   }

   public void method_16676(class_8359 var1, class_4644 var2) {
      if (this.field_17547 != null || this.field_17536 != null) {
         String[] var5 = this.method_16645();
         boolean var6 = this.method_16657();
         this.field_17538 = method_16669(var1, var2, var5, var6);
         if (this.field_17541 == 1 && this.field_17536 != null) {
            for (String var8 : this.field_17536.keySet()) {
               String var9 = this.field_17536.get(var8);
               String var10 = class_8251.method_37832(var8, "texture.");
               if (this.method_16663(var10)) {
                  String[] var11 = new String[]{var9};
                  class_7373 var12 = method_16669(var1, var2, var11, var6);
                  if (this.field_17531 == null) {
                     this.field_17531 = new HashMap<String, class_7373>();
                  }

                  String var13 = "item/" + var10;
                  this.field_17531.put(var13, var12);
               }
            }
         }
      }
   }

   private boolean method_16663(String var1) {
      return var1.startsWith("bow") || var1.startsWith("crossbow") || var1.startsWith("fishing_rod") || var1.startsWith("shield");
   }

   private boolean method_16657() {
      return true;
   }

   private static class_7373 method_16669(class_8359 var0, class_4644 var1, String[] var2, boolean var3) {
      String[] var6 = new String[var2.length];

      for (int var7 = 0; var7 < var6.length; var7++) {
         String var8 = var2[var7];
         var6[var7] = class_8251.method_37832(var8, "textures/");
      }

      class_9403 var9 = method_16671(var6);
      class_9403 var10 = var1.method_21483(class_3580::method_16666, var9);
      return method_16648(var0, var10, var3);
   }

   public static class_5155 method_16666(class_2843 var0) {
      class_8359 var3 = class_1893.method_8510().method_8535().method_33947(var0.method_12946());
      return var3.method_38528(var0.method_12948());
   }

   private String[] method_16645() {
      if (this.field_17541 == 1 && this.field_17549.length == 1) {
         class_2451 var3 = class_2451.method_11220(this.field_17549[0]);
         boolean var4 = var3 == class_4897.field_25157 || var3 == class_4897.field_25226 || var3 == class_4897.field_24444;
         if (var4 && this.field_17542 != null && this.field_17542.method_40163() > 0) {
            class_2279 var12 = this.field_17542.method_40161(0);
            int var13 = var12.method_10502();
            boolean var14 = (var13 & 16384) != 0;
            String var15 = this.method_16643(this.field_17536, "texture.potion_overlay", "item/potion_overlay");
            Object var16 = null;
            if (!var14) {
               var16 = this.method_16643(this.field_17536, "texture.potion_bottle_drinkable", "item/potion_bottle_drinkable");
            } else {
               var16 = this.method_16643(this.field_17536, "texture.potion_bottle_splash", "item/potion_bottle_splash");
            }

            return new String[]{var15, (String)var16};
         }

         if (var3 instanceof class_8228) {
            class_8228 var5 = (class_8228)var3;
            if (var5.method_37667() == class_5667.field_28740) {
               String var6 = "leather";
               String var7 = "helmet";
               class_6943 var8 = var5.method_37669();
               if (var8 == class_6943.field_35704) {
                  var7 = "helmet";
               }

               if (var8 == class_6943.field_35708) {
                  var7 = "chestplate";
               }

               if (var8 == class_6943.field_35698) {
                  var7 = "leggings";
               }

               if (var8 == class_6943.field_35700) {
                  var7 = "boots";
               }

               String var9 = var6 + "_" + var7;
               String var10 = this.method_16643(this.field_17536, "texture." + var9, "item/" + var9);
               String var11 = this.method_16643(this.field_17536, "texture." + var9 + "_overlay", "item/" + var9 + "_overlay");
               return new String[]{var10, var11};
            }
         }
      }

      return new String[]{this.field_17547};
   }

   private String method_16643(Map<String, String> var1, String var2, String var3) {
      if (var1 != null) {
         String var6 = (String)var1.get(var2);
         return var6 != null ? var6 : var3;
      } else {
         return var3;
      }
   }

   private static class_9403 method_16671(String[] var0) {
      StringBuffer var3 = new StringBuffer();
      var3.append("{\"parent\": \"builtin/generated\",\"textures\": {");

      for (int var4 = 0; var4 < var0.length; var4++) {
         String var5 = var0[var4];
         if (var4 > 0) {
            var3.append(", ");
         }

         var3.append("\"layer" + var4 + "\": \"" + var5 + "\"");
      }

      var3.append("}}");
      String var6 = var3.toString();
      return class_9403.method_43560(var6);
   }

   private static class_7373 method_16648(class_8359 var0, class_9403 var1, boolean var2) {
      class_7507 var5 = class_7507.field_38322;
      class_2843 var6 = var1.method_43564("particle");
      class_5155 var7 = var6.method_12947();
      class_6911 var8 = new class_6911(var1, class_602.field_3453, false).method_31664(var7);

      for (class_9487 var10 : var1.method_43566()) {
         for (class_240 var12 : var10.field_48353.keySet()) {
            class_7300 var13 = var10.field_48353.get(var12);
            if (!var2) {
               var13 = new class_7300(var13.field_37318, -1, var13.field_37317, var13.field_37314);
            }

            class_2843 var14 = var1.method_43564(var13.field_37317);
            class_5155 var15 = var14.method_12947();
            class_5024 var16 = method_16654(var10, var13, var15, var12, var5);
            if (var13.field_37318 != null) {
               var8.method_31667(class_240.method_1048(var5.method_25403().method_5410(), var13.field_37318), var16);
            } else {
               var8.method_31666(var16);
            }
         }
      }

      return var8.method_31665();
   }

   private static class_5024 method_16654(class_9487 var0, class_7300 var1, class_5155 var2, class_240 var3, class_7507 var4) {
      class_7265 var7 = new class_7265();
      return var7.method_33202(var0.field_48352, var0.field_48350, var1, var2, var3, var4, var0.field_48351, var0.field_48348, var2.method_23644());
   }

   @Override
   public String toString() {
      return ""
         + this.field_17545
         + "/"
         + this.field_17529
         + ", type: "
         + this.field_17541
         + ", items: ["
         + class_3111.method_14287(this.field_17549)
         + "], textture: "
         + this.field_17547;
   }

   public float method_16680(class_7889 var1) {
      if (this.field_17543 <= 0) {
         if (this.field_17524 != null) {
            class_8143 var4 = var1.method_35679(this.field_17524);
            int var5 = var4.method_37055();
            int var6 = class_1920.method_8841();
            class_1920.method_8791(var5);
            this.field_17543 = GL11.glGetTexLevelParameteri(3553, 0, 4096);
            class_1920.method_8791(var6);
         }

         if (this.field_17543 <= 0) {
            this.field_17543 = 16;
         }
      }

      return (float)this.field_17543;
   }

   public float method_16679(class_7889 var1) {
      if (this.field_17537 <= 0) {
         if (this.field_17524 != null) {
            class_8143 var4 = var1.method_35679(this.field_17524);
            int var5 = var4.method_37055();
            int var6 = class_1920.method_8841();
            class_1920.method_8791(var5);
            this.field_17537 = GL11.glGetTexLevelParameteri(3553, 0, 4097);
            class_1920.method_8791(var6);
         }

         if (this.field_17537 <= 0) {
            this.field_17537 = 16;
         }
      }

      return (float)this.field_17537;
   }

   public class_7373 method_16678(class_4639 var1, boolean var2) {
      class_7373 var5;
      Map var6;
      if (!var2) {
         var5 = this.field_17538;
         var6 = this.field_17531;
      } else {
         var5 = this.field_17521;
         var6 = this.field_17552;
      }

      if (var1 != null && var6 != null) {
         String var7 = var1.method_21456();
         class_7373 var8 = (class_7373)var6.get(var7);
         if (var8 != null) {
            return var8;
         }
      }

      return var5;
   }

   public void method_16660(class_6560 var1) {
      if (this.field_17519 != null) {
         method_16681(var1, this.field_17519);
      }

      if (this.field_17541 == 1 && this.field_17516 != null) {
         for (String var5 : this.field_17516.keySet()) {
            String var6 = this.field_17516.get(var5);
            String var7 = class_8251.method_37832(var5, "model.");
            if (this.method_16663(var7)) {
               method_16681(var1, var6);
            }
         }
      }
   }

   public void method_16664() {
      class_7458 var3 = class_3111.method_14346();
      class_7373 var4 = var3.method_33942();
      if (this.field_17519 != null) {
         class_4639 var5 = method_16670(this.field_17519);
         class_454 var6 = new class_454(var5, "inventory");
         this.field_17521 = var3.method_33943(var6);
         if (this.field_17521 == var4) {
            class_3111.method_14317("Custom Items: Model not found " + var6.method_21456());
            this.field_17521 = null;
         }
      }

      if (this.field_17541 == 1 && this.field_17516 != null) {
         for (String var14 : this.field_17516.keySet()) {
            String var7 = this.field_17516.get(var14);
            String var8 = class_8251.method_37832(var14, "model.");
            if (this.method_16663(var8)) {
               class_4639 var9 = method_16670(var7);
               class_454 var10 = new class_454(var9, "inventory");
               class_7373 var11 = var3.method_33943(var10);
               if (var11 != var4) {
                  if (this.field_17552 == null) {
                     this.field_17552 = new HashMap<String, class_7373>();
                  }

                  String var12 = "item/" + var8;
                  this.field_17552.put(var12, var11);
               } else {
                  class_3111.method_14317("Custom Items: Model not found " + var10.method_21456());
               }
            }
         }
      }
   }

   private static void method_16681(class_6560 var0, String var1) {
      class_4639 var4 = method_16670(var1);
      class_454 var5 = new class_454(var4, "inventory");
      var0.method_29953(var5);
   }

   private static class_4639 method_16670(String var0) {
      return new class_4639(var0);
   }
}
