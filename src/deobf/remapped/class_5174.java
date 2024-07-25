package remapped;

import java.util.ArrayList;

public class class_5174 extends class_367 {
   public static int field_26632 = 36;
   public static int field_26635 = 37;
   public static int field_26631 = 38;
   public static int field_26634 = 39;
   private class_3223 field_26629 = new class_3223();
   private boolean field_26630;
   private boolean field_26637;
   public ArrayList<Integer> field_26636 = new ArrayList<Integer>();

   public class_5174() {
      super("InvManager", "Drops all useless items from your inventory", class_5664.field_28712);
      this.method_42010(new class_2826("Mode", "The way it will move items in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
      this.method_42010(new class_2748<Float>("Delay", "Inventory clicks delay", 0.3F, Float.class, 0.01F, 1.0F, 0.01F));
      this.method_42010(new class_2748<Float>("Block Cap", "Maximum blocks.", 150.0F, Float.class, 0.0F, 256.0F, 10.0F));
      this.method_42010(new class_2826("Clean Type", "Clean type", 0, "Skywars", "All"));
      this.method_42010(new class_8563("Fake Items", "Bypass for fake items (AAC).", false));
      this.method_42010(new class_8563("Cleaner", "Cleans your inventory.", true));
      this.method_42010(new class_8563("Sword", "Keeps only sword as weapon.", true));
      this.method_42010(new class_2826("Tools", "How tools are handled.", 0, "Keep", "Organize", "Throw"));
      this.method_42010(new class_8563("Archery", "Cleans bows and arrows.", true));
      this.method_42010(new class_8563("Food", "Cleans food. Keeps Golden Apples.", false));
      this.method_42010(new class_8563("Heads", "Cleans Heads.", false));
      this.method_42010(new class_8563("Auto Shield", "Automatically equip shields for 1.9+.", false));
   }

   @Override
   public void method_42006() {
      this.field_26630 = field_46692.field_9623 instanceof class_3431;
      this.field_26637 = false;
   }

   @class_9148
   public void method_23709(class_5596 var1) {
      if (!this.field_26629.method_14771()) {
         this.field_26629.method_14776();
      }

      if (this.method_42015() && !class_1853.field_9392) {
         String var4 = this.method_42016("Mode");
         if (!this.method_42016("Mode").equals("OpenInv") || field_46692.field_9623 instanceof class_3431) {
            long var5 = (long)(this.method_42002("Delay") * 20.0F);
            if (field_46692.field_9623 instanceof class_3431) {
               this.field_26630 = false;
            }

            if (this.field_26637 && (long)class_727.method_3328().method_3310().method_25303() >= var5) {
               this.field_26637 = !this.field_26637;
               this.method_23712(this.field_26630);
               class_2740.method_12356(field_46692.field_9632.field_3869.field_19925, 45, 0, class_6269.field_32027, field_46692.field_9632, true);
               this.field_26629.method_14773();
            } else {
               if (field_46692.field_9623 == null || field_46692.field_9623 instanceof class_3431 || field_46692.field_9623 instanceof class_5766) {
                  if (this.field_26629.method_14772() > var5 && field_26632 >= 36) {
                     if (field_46692.field_9632.field_3869.method_18878(field_26632).method_35884()) {
                        if (!method_23720(field_46692.field_9632.field_3869.method_18878(field_26632).method_35898())) {
                           this.method_23713(field_26632, var4.equals("FakeInv"));
                        }
                     } else {
                        this.method_23713(field_26632, var4.equals("FakeInv"));
                     }
                  }

                  boolean var7 = this.method_42016("Tools").equals("Organize");
                  if ((long)class_727.method_3328().method_3310().method_25303() >= var5 && field_26635 >= 36 && var7) {
                     this.method_23716(field_26635, var4.equals("FakeInv"));
                  }

                  if ((long)class_727.method_3328().method_3310().method_25303() >= var5 && field_26634 >= 36 && var7) {
                     this.method_23724(field_26634, var4.equals("FakeInv"));
                  }

                  if ((long)class_727.method_3328().method_3310().method_25303() >= var5 && field_26631 >= 36 && var7) {
                     this.method_23714(field_26631, var4.equals("FakeInv"));
                  }

                  if ((long)class_727.method_3328().method_3310().method_25303() >= var5 && this.method_42007("Auto Shield")) {
                     this.method_23717(var4.equals("FakeInv"));
                  }

                  if ((long)class_727.method_3328().method_3310().method_25303() >= var5 && this.method_42007("Cleaner")) {
                     for (int var8 = 9; var8 < 45; var8++) {
                        if (field_46692.field_9632.field_3869.method_18878(var8).method_35884()) {
                           class_6098 var9 = field_46692.field_9632.field_3869.method_18878(var8).method_35898();
                           if (this.method_23715(var9, var8)) {
                              this.method_23712(var4.equals("FakeInv"));
                              class_2740.method_12365(var8);
                              this.field_26629.method_14773();
                              if (var5 > 0L) {
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               if (!this.field_26630 && !(field_46692.field_9623 instanceof class_3431) && this.field_26629.method_14772() > 0L && !this.field_26637) {
                  this.field_26630 = true;
                  field_46692.method_8614().method_4813(new class_1194(-1));
               }
            }
         }
      }
   }

   public static boolean method_23720(class_6098 var0) {
      float var3 = method_23718(var0);
      class_9128 var4 = class_727.method_3328().method_3298().method_847(class_5174.class);

      for (int var5 = 9; var5 < 45; var5++) {
         if (field_46692.field_9632.field_3869.method_18878(var5).method_35884()) {
            class_6098 var6 = field_46692.field_9632.field_3869.method_18878(var5).method_35898();
            if (method_23718(var6) > var3 && (var6.method_27960() instanceof class_2235 || !var4.method_42007("Sword"))) {
               return false;
            }
         }
      }

      return var0.method_27960() instanceof class_2235 || !var4.method_42007("Sword");
   }

   public void method_23713(int var1, boolean var2) {
      for (int var5 = 9; var5 < 45; var5++) {
         if (field_46692.field_9632.field_3869.method_18878(var5).method_35884()) {
            class_6098 var6 = field_46692.field_9632.field_3869.method_18878(var5).method_35898();
            if (method_23720(var6) && method_23718(var6) > 0.0F && (var6.method_27960() instanceof class_2235 || !this.method_42007("Sword"))) {
               this.method_23712(var2);
               class_2740.method_12312(var5, var1 - 36);
               this.field_26629.method_14773();
               break;
            }
         }
      }
   }

   public static float method_23718(class_6098 var0) {
      float var3 = 0.0F;
      class_2451 var4 = var0.method_27960();
      if (var4 instanceof class_3077) {
         class_3077 var5 = (class_3077)var4;
         var3 += (float)var5.method_11234();
      }

      if (var4 instanceof class_2235) {
         class_2235 var6 = (class_2235)var4;
         var3 += var6.method_10287();
      }

      return var3 + (float)class_2931.method_13423(class_3668.field_17864, var0) * 1.25F + (float)class_2931.method_13423(class_3668.field_17868, var0) * 0.01F;
   }

   public boolean method_23715(class_6098 var1, int var2) {
      class_2451 var5 = var1.method_27960();
      if (var1.method_28008().getString().toLowerCase().contains("(right click)")
         || var1.method_28008().getString().toLowerCase().contains("(clique direito)")
         || var1.method_28008().getString().toLowerCase().contains("(click derecho)")) {
         return false;
      } else if (var1.method_28008().getString().toLowerCase().contains("§k||")) {
         return false;
      } else if (var2 == field_26632 && method_23720(field_46692.field_9632.field_3869.method_18878(var2).method_35898())) {
         return false;
      } else if (var5 instanceof class_8440 && this.method_42007("Auto Shield")) {
         return false;
      } else if (this.method_42016("Tools").equals("Throw")
         || (
               var2 != field_26635 && !this.method_42016("Tools").equals("Keep")
                  || !method_23722(field_46692.field_9632.field_3869.method_18878(var2).method_35898())
                  || field_26635 < 0
            )
            && (
               var2 != field_26631 && !this.method_42016("Tools").equals("Keep")
                  || !method_23711(field_46692.field_9632.field_3869.method_18878(var2).method_35898())
                  || field_26631 < 0
            )
            && (
               var2 != field_26634 && !this.method_42016("Tools").equals("Keep")
                  || !method_23719(field_46692.field_9632.field_3869.method_18878(var2).method_35898())
                  || field_26634 < 0
            )) {
         if (var5 instanceof class_8228) {
            if (class_2740.method_12361(var2)) {
               return false;
            }

            for (class_6943 var9 : class_6943.values()) {
               if (field_46692.field_9632.field_3869.method_18878(8 - var9.method_31767()).method_35884()) {
                  class_6098 var10 = field_46692.field_9632.field_3869.method_18878(8 - var9.method_31767()).method_35898();
                  if (!class_2740.method_12364(var10)) {
                  }
               }
            }
         }

         if (var5 instanceof class_6201
            && (this.method_23721() > (int)this.method_42002("Block Cap") || class_3709.field_18195.contains(((class_6201)var5).method_28392()))) {
            return true;
         } else if (var5 == class_4897.field_24999 && class_727.method_3328().method_3298().method_847(class_3588.class).method_42015()) {
            return method_23723(class_4897.field_24999) > 1;
         } else if (var5 == class_4897.field_24548 && class_727.method_3328().method_3298().method_847(class_3588.class).method_42015()) {
            return method_23723(class_4897.field_24548) > 1;
         } else if (var5 instanceof class_5518 && class_2740.method_12360(var1)) {
            return true;
         } else if (var5 == class_4897.field_24966) {
            return false;
         } else if (var5.method_11247() && this.method_42007("Food") && var5.method_11227() != class_5465.field_27849) {
            return true;
         } else if (var5 instanceof class_4220 || var5 instanceof class_3077 || var5 instanceof class_2235 || var5 instanceof class_8228) {
            return true;
         } else if ((var5 instanceof class_2100 || var5 instanceof class_603) && this.method_42007("Archery")) {
            return true;
         } else {
            return var5 instanceof class_3571 && this.method_42007("Heads")
               ? true
               : var5.method_11219().getString().toLowerCase().contains("tnt")
                  || var5.method_11219().getString().toLowerCase().contains("stick")
                  || var5.method_11219().getString().toLowerCase().contains("egg")
                  || var5.method_11219().getString().toLowerCase().contains("string")
                  || var5.method_11219().getString().toLowerCase().contains("cake")
                  || var5.method_11219().getString().toLowerCase().contains("mushroom")
                  || var5.method_11219().getString().toLowerCase().contains("flint")
                  || var5.method_11219().getString().toLowerCase().contains("dyePowder")
                  || var5.method_11219().getString().toLowerCase().contains("feather")
                  || var5.method_11219().getString().toLowerCase().contains("bucket")
                  || var5.method_11219().getString().toLowerCase().contains("chest") && !var1.method_28008().getString().toLowerCase().contains("collect")
                  || var5.method_11219().getString().toLowerCase().contains("snow")
                  || var5.method_11219().getString().toLowerCase().contains("fish")
                  || var5.method_11219().getString().toLowerCase().contains("enchant")
                  || var5.method_11219().getString().toLowerCase().contains("exp")
                  || var5.method_11219().getString().toLowerCase().contains("shears")
                  || var5.method_11219().getString().toLowerCase().contains("anvil")
                  || var5.method_11219().getString().toLowerCase().contains("torch")
                  || var5.method_11219().getString().toLowerCase().contains("seeds")
                  || var5.method_11219().getString().toLowerCase().contains("leather")
                  || var5.method_11219().getString().toLowerCase().contains("reeds")
                  || var5.method_11219().getString().toLowerCase().contains("record")
                  || var5.method_11219().getString().toLowerCase().contains("snowball")
                  || var5 instanceof class_5336
                  || var5 == class_4897.field_24592
                  || var5 == class_4897.field_24581
                  || var5.method_11219().getString().toLowerCase().contains("piston");
         }
      } else {
         return false;
      }
   }

   public ArrayList<Integer> method_23725() {
      return this.field_26636;
   }

   private int method_23721() {
      int var3 = 0;

      for (int var4 = 0; var4 < 45; var4++) {
         if (field_46692.field_9632.field_3869.method_18878(var4).method_35884()) {
            class_6098 var5 = field_46692.field_9632.field_3869.method_18878(var4).method_35898();
            class_2451 var6 = var5.method_27960();
            if (var5.method_27960() instanceof class_6201 && !class_3709.field_18195.contains(((class_6201)var6).method_28392())) {
               var3 += var5.field_31206;
            }
         }
      }

      return var3;
   }

   public static int method_23723(class_2451 var0) {
      int var3 = 0;

      for (int var4 = 0; var4 < 45; var4++) {
         if (field_46692.field_9632.field_3869.method_18878(var4).method_35884()) {
            class_6098 var5 = field_46692.field_9632.field_3869.method_18878(var4).method_35898();
            if (var5.method_27960() == var0) {
               var3 += var5.field_31206;
            }
         }
      }

      return var3;
   }

   private void method_23716(int var1, boolean var2) {
      for (int var5 = 9; var5 < 45; var5++) {
         if (field_46692.field_9632.field_3869.method_18878(var5).method_35884()) {
            class_6098 var6 = field_46692.field_9632.field_3869.method_18878(var5).method_35898();
            if (method_23722(var6) && field_26635 != var5 && !method_23720(var6)) {
               if (field_46692.field_9632.field_3869.method_18878(field_26635).method_35884()) {
                  if (!method_23722(field_46692.field_9632.field_3869.method_18878(field_26635).method_35898())) {
                     this.method_23712(var2);
                     class_2740.method_12312(var5, field_26635 - 36);
                     this.field_26629.method_14773();
                     if (this.method_42002("Delay") > 0.0F) {
                        return;
                     }
                  }
               } else {
                  this.method_23712(var2);
                  class_2740.method_12312(var5, field_26635 - 36);
                  this.field_26629.method_14773();
                  if (this.method_42002("Delay") > 0.0F) {
                     return;
                  }
               }
            }
         }
      }
   }

   private void method_23724(int var1, boolean var2) {
      for (int var5 = 9; var5 < 45; var5++) {
         if (field_46692.field_9632.field_3869.method_18878(var5).method_35884()) {
            class_6098 var6 = field_46692.field_9632.field_3869.method_18878(var5).method_35898();
            if (method_23719(var6) && field_26634 != var5 && !method_23720(var6)) {
               if (field_46692.field_9632.field_3869.method_18878(field_26634).method_35884()) {
                  if (!method_23719(field_46692.field_9632.field_3869.method_18878(field_26634).method_35898())) {
                     this.method_23712(var2);
                     class_2740.method_12312(var5, field_26634 - 36);
                     this.field_26629.method_14773();
                     if (this.method_42002("Delay") > 0.0F) {
                        return;
                     }
                  }
               } else {
                  this.method_23712(var2);
                  class_2740.method_12312(var5, field_26634 - 36);
                  this.field_26629.method_14773();
                  if (this.method_42002("Delay") > 0.0F) {
                     return;
                  }
               }
            }
         }
      }
   }

   private void method_23714(int var1, boolean var2) {
      for (int var5 = 9; var5 < 45; var5++) {
         if (field_46692.field_9632.field_3869.method_18878(var5).method_35884()) {
            class_6098 var6 = field_46692.field_9632.field_3869.method_18878(var5).method_35898();
            if (method_23711(var6) && field_26631 != var5 && !method_23720(var6)) {
               if (field_46692.field_9632.field_3869.method_18878(field_26631).method_35884()) {
                  if (!method_23711(field_46692.field_9632.field_3869.method_18878(field_26631).method_35898())) {
                     this.method_23712(var2);
                     class_2740.method_12312(var5, field_26631 - 36);
                     this.field_26629.method_14773();
                     if (this.method_42002("Delay") > 0.0F) {
                        return;
                     }
                  }
               } else {
                  this.method_23712(var2);
                  class_2740.method_12312(var5, field_26631 - 36);
                  this.field_26629.method_14773();
                  if (this.method_42002("Delay") > 0.0F) {
                     return;
                  }
               }
            }
         }
      }
   }

   private void method_23717(boolean var1) {
      if (!field_46692.field_9632.field_3869.method_18878(45).method_35884()) {
         for (int var4 = 9; var4 < 45; var4++) {
            class_6098 var5 = field_46692.field_9632.field_3869.method_18878(var4).method_35898();
            if (var5.method_27960() instanceof class_8440) {
               this.method_23712(var1);
               this.field_26629.method_14773();
               class_2740.method_12356(field_46692.field_9632.field_3869.field_19925, var4, 0, class_6269.field_32027, field_46692.field_9632, true);
               this.field_26637 = true;
               return;
            }
         }
      }
   }

   public static boolean method_23722(class_6098 var0) {
      class_2451 var3 = var0.method_27960();
      if (var3 instanceof class_670) {
         float var4 = method_23710(var0);

         for (int var5 = 9; var5 < 45; var5++) {
            if (field_46692.field_9632.field_3869.method_18878(var5).method_35884()) {
               class_6098 var6 = field_46692.field_9632.field_3869.method_18878(var5).method_35898();
               if (method_23710(var6) > var4 && var6.method_27960() instanceof class_670) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean method_23719(class_6098 var0) {
      class_2451 var3 = var0.method_27960();
      if (var3 instanceof class_9406) {
         float var4 = method_23710(var0);

         for (int var5 = 9; var5 < 45; var5++) {
            if (field_46692.field_9632.field_3869.method_18878(var5).method_35884()) {
               class_6098 var6 = field_46692.field_9632.field_3869.method_18878(var5).method_35898();
               if (method_23710(var6) > var4 && var6.method_27960() instanceof class_9406) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean method_23711(class_6098 var0) {
      class_2451 var3 = var0.method_27960();
      if (var3 instanceof class_7938) {
         float var4 = method_23710(var0);

         for (int var5 = 9; var5 < 45; var5++) {
            if (field_46692.field_9632.field_3869.method_18878(var5).method_35884()) {
               class_6098 var6 = field_46692.field_9632.field_3869.method_18878(var5).method_35898();
               if (method_23710(var6) > var4 && var6.method_27960() instanceof class_7938 && !method_23720(var0)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static float method_23710(class_6098 var0) {
      class_2451 var3 = var0.method_27960();
      if (var3 instanceof class_3077) {
         String var4 = var3.method_11219().getString().toLowerCase();
         class_3077 var5 = (class_3077)var3;
         float var6 = 1.0F;
         if (!(var3 instanceof class_670)) {
            if (!(var3 instanceof class_9406)) {
               if (!(var3 instanceof class_7938)) {
                  return 1.0F;
               }

               var6 = var5.method_11235(var0, class_4783.field_23365.method_29260());
               if (var4.toLowerCase().contains("gold")) {
                  var6 -= 5.0F;
               }
            } else {
               var6 = var5.method_11235(var0, class_4783.field_23592.method_29260());
               if (var4.toLowerCase().contains("gold")) {
                  var6 -= 5.0F;
               }
            }
         } else {
            var6 = var5.method_11235(var0, class_4783.field_23644.method_29260());
            if (var4.toLowerCase().contains("gold")) {
               var6 -= 5.0F;
            }
         }

         var6 = (float)((double)var6 + (double)class_2931.method_13423(class_3668.field_17879, var0) * 0.0075);
         return (float)((double)var6 + (double)class_2931.method_13423(class_3668.field_17860, var0) / 100.0);
      } else {
         return 0.0F;
      }
   }

   private void method_23712(boolean var1) {
      if (var1 && this.field_26630 && !(field_46692.field_9623 instanceof class_3431) && class_3347.method_15349() <= class_412.field_1752.method_2055()) {
         field_46692.method_8614().method_4813(new class_8559(class_2105.field_10551));
         this.field_26630 = false;
      }
   }
}
