package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import net.minecraft.util.text.ITextComponent;

public class class_3739 {
   private String field_18298 = null;
   private String field_18288 = null;
   private class_1614 field_18293 = null;
   private Map<class_4639, class_4639> field_18305 = null;
   private class_1719 field_18295 = null;
   private class_4859[] field_18301 = null;
   private class_8750 field_18284 = null;
   private Boolean field_18279 = null;
   private Boolean field_18299 = null;
   private Boolean field_18297 = null;
   private Boolean field_18281 = null;
   private class_8750 field_18282 = null;
   private class_9438[] field_18303 = null;
   private class_5469[] field_18287 = null;
   private class_9077[] field_18292 = null;
   private static final class_5469[] field_18277 = new class_5469[]{
      class_5469.field_27883, class_5469.field_27885, class_5469.field_27879, class_5469.field_27881
   };
   private static final class_5469[] field_18290 = new class_5469[]{class_5469.field_27886, class_5469.field_27882};
   private static final class_5469[] field_18300 = new class_5469[0];
   private static final class_9077[] field_18289 = new class_9077[0];
   private static final class_4639 field_18294 = new class_4639("textures/gui/container/anvil.png");
   private static final class_4639 field_18283 = new class_4639("textures/gui/container/beacon.png");
   private static final class_4639 field_18286 = new class_4639("textures/gui/container/brewing_stand.png");
   private static final class_4639 field_18296 = new class_4639("textures/gui/container/generic_54.png");
   private static final class_4639 field_18291 = new class_4639("textures/gui/container/crafting_table.png");
   private static final class_4639 field_18276 = new class_4639("textures/gui/container/horse.png");
   private static final class_4639 field_18285 = new class_4639("textures/gui/container/dispenser.png");
   private static final class_4639 field_18275 = new class_4639("textures/gui/container/enchanting_table.png");
   private static final class_4639 field_18304 = new class_4639("textures/gui/container/furnace.png");
   private static final class_4639 field_18302 = new class_4639("textures/gui/container/hopper.png");
   private static final class_4639 field_18274 = new class_4639("textures/gui/container/inventory.png");
   private static final class_4639 field_18273 = new class_4639("textures/gui/container/shulker_box.png");
   private static final class_4639 field_18280 = new class_4639("textures/gui/container/villager2.png");

   public class_3739(Properties var1, String var2) {
      class_6284 var5 = new class_6284("CustomGuis");
      this.field_18298 = var5.method_28678(var2);
      this.field_18288 = var5.method_28649(var2);
      this.field_18293 = (class_1614)var5.method_28652(var1.getProperty("container"), class_1614.values(), "container");
      this.field_18305 = method_17321(var1, "texture", this.field_18293, "textures/gui/", this.field_18288);
      this.field_18295 = var5.method_28665("name", var1.getProperty("name"));
      this.field_18301 = var5.method_28644(var1.getProperty("biomes"));
      this.field_18284 = var5.method_28653(var1.getProperty("heights"));
      this.field_18279 = var5.method_28666(var1.getProperty("large"));
      this.field_18299 = var5.method_28666(var1.getProperty("trapped"));
      this.field_18297 = var5.method_28666(var1.getProperty("christmas"));
      this.field_18281 = var5.method_28666(var1.getProperty("ender"));
      this.field_18282 = var5.method_28653(var1.getProperty("levels"));
      this.field_18303 = var5.method_28662(var1.getProperty("professions"));
      class_5469[] var6 = method_17336(this.field_18293);
      this.field_18287 = (class_5469[])var5.method_28675(var1.getProperty("variants"), var6, "variants", field_18300);
      this.field_18292 = method_17334(var1.getProperty("colors"));
   }

   private static class_5469[] method_17336(class_1614 var0) {
      if (var0 != class_1614.field_8386) {
         return var0 != class_1614.field_8387 ? new class_5469[0] : field_18290;
      } else {
         return field_18277;
      }
   }

   private static class_9077[] method_17334(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.toLowerCase();
         String[] var3 = class_3111.method_14302(var0, " ");
         class_9077[] var4 = new class_9077[var3.length];

         for (int var5 = 0; var5 < var3.length; var5++) {
            String var6 = var3[var5];
            class_9077 var7 = method_17322(var6);
            if (var7 == null) {
               method_17331("Invalid color: " + var6);
               return field_18289;
            }

            var4[var5] = var7;
         }

         return var4;
      }
   }

   private static class_9077 method_17322(String var0) {
      if (var0 == null) {
         return null;
      } else {
         class_9077[] var3 = class_9077.values();

         for (int var4 = 0; var4 < var3.length; var4++) {
            class_9077 var5 = var3[var4];
            if (var5.method_21049().equals(var0)) {
               return var5;
            }

            if (var5.method_41796().equals(var0)) {
               return var5;
            }
         }

         return null;
      }
   }

   private static class_4639 method_17338(String var0, String var1) {
      if (var0 != null) {
         var0 = var0.trim();
         String var4 = class_5525.method_25096(var0, var1);
         if (!var4.endsWith(".png")) {
            var4 = var4 + ".png";
         }

         return new class_4639(var1 + "/" + var4);
      } else {
         return null;
      }
   }

   private static Map<class_4639, class_4639> method_17321(Properties var0, String var1, class_1614 var2, String var3, String var4) {
      HashMap var7 = new HashMap();
      String var8 = var0.getProperty(var1);
      if (var8 != null) {
         class_4639 var9 = method_17323(var2);
         class_4639 var10 = method_17338(var8, var4);
         if (var9 != null && var10 != null) {
            var7.put(var9, var10);
         }
      }

      String var17 = var1 + ".";

      for (String var11 : var0.keySet()) {
         if (var11.startsWith(var17)) {
            String var12 = var11.substring(var17.length());
            var12 = var12.replace('\\', '/');
            var12 = class_8251.method_37819(var12, "/", ".png");
            String var13 = var3 + var12 + ".png";
            String var14 = var0.getProperty(var11);
            class_4639 var15 = new class_4639(var13);
            class_4639 var16 = method_17338(var14, var4);
            var7.put(var15, var16);
         }
      }

      return var7;
   }

   private static class_4639 method_17323(class_1614 var0) {
      if (var0 == null) {
         return null;
      } else {
         switch (var0) {
            case field_8384:
               return field_18294;
            case field_8379:
               return field_18283;
            case field_8374:
               return field_18286;
            case field_8377:
               return field_18296;
            case field_8373:
               return field_18291;
            case field_8385:
               return null;
            case field_8387:
               return field_18285;
            case field_8383:
               return field_18275;
            case field_8378:
               return field_18304;
            case field_8376:
               return field_18302;
            case field_8386:
               return field_18276;
            case field_8382:
               return field_18274;
            case field_8380:
               return field_18273;
            case field_8372:
               return field_18280;
            default:
               return null;
         }
      }
   }

   public boolean method_17313(String var1) {
      if (this.field_18298 == null || this.field_18298.length() <= 0) {
         method_17331("No name found: " + var1);
         return false;
      } else if (this.field_18288 == null) {
         method_17331("No base path found: " + var1);
         return false;
      } else if (this.field_18293 == null) {
         method_17331("No container found: " + var1);
         return false;
      } else if (this.field_18305.isEmpty()) {
         method_17331("No texture found: " + var1);
         return false;
      } else if (this.field_18303 == class_6284.field_32117) {
         method_17331("Invalid professions or careers: " + var1);
         return false;
      } else if (this.field_18287 == field_18300) {
         method_17331("Invalid variants: " + var1);
         return false;
      } else if (this.field_18292 != field_18289) {
         return true;
      } else {
         method_17331("Invalid colors: " + var1);
         return false;
      }
   }

   private static void method_17331(String var0) {
      class_3111.method_14317("[CustomGuis] " + var0);
   }

   private boolean method_17332(class_1614 var1, class_1331 var2, class_4924 var3) {
      if (this.field_18293 == var1) {
         if (this.field_18301 != null) {
            class_6325 var6 = var3.method_22561(var2);
            if (!class_2164.method_10062(var6, this.field_18301)) {
               return false;
            }
         }

         return this.field_18284 == null || this.field_18284.method_40164(var2.method_12165());
      } else {
         return false;
      }
   }

   public boolean method_17316(class_1614 var1, class_1331 var2, class_4924 var3, class_266 var4) {
      if (!this.method_17332(var1, var2, var3)) {
         return false;
      } else {
         if (this.field_18295 != null) {
            String var7 = method_17337(var4);
            if (!this.field_18295.method_7706(var7)) {
               return false;
            }
         }

         switch (var1) {
            case field_8379:
               return this.method_17328(var2, var3);
            case field_8377:
               return this.method_17318(var2, var3);
            case field_8387:
               return this.method_17330(var2, var3);
            case field_8380:
               return this.method_17314(var2, var3);
            default:
               return true;
         }
      }
   }

   public static String method_17337(class_266 var0) {
      ITextComponent var3 = var0.method_1168();
      return var3 != null ? var3.getUnformattedComponentText() : null;
   }

   private boolean method_17328(class_1331 var1, class_5561 var2) {
      class_3757 var5 = var2.method_28260(var1);
      if (var5 instanceof class_1100) {
         class_1100 var6 = (class_1100)var5;
         if (this.field_18282 != null) {
            int var7 = var6.method_4880();
            if (!this.field_18282.method_40164(var7)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method_17318(class_1331 var1, class_5561 var2) {
      class_3757 var5 = var2.method_28260(var1);
      if (!(var5 instanceof class_7099)) {
         if (!(var5 instanceof class_9180)) {
            return false;
         } else {
            class_9180 var7 = (class_9180)var5;
            return this.method_17327(var7, var1, var2);
         }
      } else {
         class_7099 var6 = (class_7099)var5;
         return this.method_17319(var6, var1, var2);
      }
   }

   private boolean method_17319(class_7099 var1, class_1331 var2, class_5561 var3) {
      class_2522 var6 = var3.method_28262(var2);
      class_9264 var7 = !var6.method_10307(class_6942.field_35695) ? class_9264.field_47274 : var6.<class_9264>method_10313(class_6942.field_35695);
      boolean var8 = var7 == class_9264.field_47274;
      boolean var9 = var1 instanceof class_1962;
      boolean var10 = class_1322.field_7282;
      boolean var11 = false;
      return this.method_17320(var8, var9, var10, var11);
   }

   private boolean method_17327(class_9180 var1, class_1331 var2, class_5561 var3) {
      return this.method_17320(false, false, false, true);
   }

   private boolean method_17320(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (this.field_18279 != null && this.field_18279 != var1) {
         return false;
      } else if (this.field_18299 != null && this.field_18299 != var2) {
         return false;
      } else {
         return this.field_18297 != null && this.field_18297 != var3 ? false : this.field_18281 == null || this.field_18281 == var4;
      }
   }

   private boolean method_17330(class_1331 var1, class_5561 var2) {
      class_3757 var5 = var2.method_28260(var1);
      if (var5 instanceof class_7434) {
         class_7434 var6 = (class_7434)var5;
         if (this.field_18287 != null) {
            class_5469 var7 = this.method_17324(var6);
            if (!class_3111.method_14254(var7, this.field_18287)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private class_5469 method_17324(class_7434 var1) {
      return !(var1 instanceof class_5705) ? class_5469.field_27886 : class_5469.field_27882;
   }

   private boolean method_17314(class_1331 var1, class_5561 var2) {
      class_3757 var5 = var2.method_28260(var1);
      if (var5 instanceof class_4816) {
         class_4816 var6 = (class_4816)var5;
         if (this.field_18292 != null) {
            class_9077 var7 = var6.method_22192();
            if (!class_3111.method_14254(var7, this.field_18292)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean method_17317(class_1614 var1, class_8145 var2, class_4924 var3) {
      if (!this.method_17332(var1, var2.method_37075(), var3)) {
         return false;
      } else {
         if (this.field_18295 != null) {
            String var6 = var2.method_37206();
            if (!this.field_18295.method_7706(var6)) {
               return false;
            }
         }

         switch (var1) {
            case field_8386:
               return this.method_17333(var2, var3);
            case field_8372:
               return this.method_17326(var2, var3);
            default:
               return true;
         }
      }
   }

   private boolean method_17326(class_8145 var1, class_5561 var2) {
      if (var1 instanceof class_7666) {
         class_7666 var5 = (class_7666)var1;
         if (this.field_18303 != null) {
            class_3047 var6 = var5.method_15891();
            class_4466 var7 = var6.method_13910();
            int var8 = var6.method_13906();
            if (!class_9438.method_43664(var7, var8, this.field_18303)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method_17333(class_8145 var1, class_5561 var2) {
      if (var1 instanceof class_4109) {
         class_4109 var5 = (class_4109)var1;
         if (this.field_18287 != null) {
            class_5469 var6 = this.method_17325(var5);
            if (!class_3111.method_14254(var6, this.field_18287)) {
               return false;
            }
         }

         if (this.field_18292 != null && var5 instanceof class_9310) {
            class_9310 var8 = (class_9310)var5;
            class_9077 var7 = var8.method_42989();
            if (!class_3111.method_14254(var7, this.field_18292)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private class_5469 method_17325(class_4109 var1) {
      if (!(var1 instanceof class_3551)) {
         if (!(var1 instanceof class_141)) {
            if (!(var1 instanceof class_5720)) {
               return !(var1 instanceof class_9310) ? null : class_5469.field_27881;
            } else {
               return class_5469.field_27879;
            }
         } else {
            return class_5469.field_27885;
         }
      } else {
         return class_5469.field_27883;
      }
   }

   public class_1614 method_17335() {
      return this.field_18293;
   }

   public class_4639 method_17329(class_4639 var1) {
      class_4639 var4 = this.field_18305.get(var1);
      return var4 != null ? var4 : var1;
   }

   @Override
   public String toString() {
      return "name: " + this.field_18298 + ", container: " + this.field_18293 + ", textures: " + this.field_18305;
   }
}
