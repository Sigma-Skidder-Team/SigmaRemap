package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class class_8734 {
   private float[] field_44745;
   public final int field_44746 = 3;
   private class_9128 field_44747;
   public class_1893 field_44744 = class_1893.method_8510();
   public boolean field_44749;
   public HashMap<class_8145, List<class_9097<class_1343, Long>>> field_44743 = new HashMap<class_8145, List<class_9097<class_1343, Long>>>();

   public class_8734(class_9128 var1) {
      this.field_44747 = var1;
      this.method_40098();
   }

   public boolean method_40094() {
      return this.field_44749;
   }

   public void method_40099(boolean var1) {
      this.field_44749 = var1;
   }

   public void method_40101(class_8145 var1, float var2, float var3) {
      if (this.field_44747.method_42007("Interact autoblock")) {
         class_5631 var6 = class_314.method_1410(
            !this.field_44747.method_42007("Raytrace") ? var1 : null, var2, var3, var0 -> true, (double)this.field_44747.method_42002("Range")
         );
         if (var6 != null) {
            this.field_44744
               .method_8614()
               .method_4813(new class_3398(var6.method_25524(), class_2584.field_12791, var6.method_33993(), this.field_44744.field_9632.method_37252()));
            this.field_44744.method_8614().method_4813(new class_3398(var6.method_25524(), class_2584.field_12791, this.field_44744.field_9632.method_37252()));
         }
      }

      class_314.method_1396();
      this.method_40099(true);
   }

   public void method_40093() {
      class_314.method_1459();
      this.method_40099(false);
   }

   public boolean method_40097() {
      return !this.field_44747.method_42016("Autoblock Mode").equals("None")
         && this.field_44744.field_9632.method_26446().method_27960() instanceof class_2235
         && !this.method_40094();
   }

   public void method_40098() {
      this.field_44745 = new float[3];
      float var3 = 20.0F / this.field_44747.method_42002("Min CPS");
      float var4 = 20.0F / this.field_44747.method_42002("Max CPS");
      if (var3 > var4) {
         float var5 = var3;
         var3 = var4;
         var4 = var5;
      }

      for (int var7 = 0; var7 < 3; var7++) {
         float var6 = var3 + (float)Math.random() * (var4 - var3);
         this.field_44745[var7] = var6;
      }
   }

   public float method_40095(int var1) {
      return var1 >= 0 && var1 < this.field_44745.length ? this.field_44745[var1] : -1.0F;
   }

   public boolean method_40089(int var1) {
      int var4 = (int)this.method_40095(0) - var1;
      boolean var5 = this.field_44747.method_42016("Attack Mode").equals("Pre");
      if (!var5) {
         var4++;
      }

      if (this.field_44744.field_9632.method_3163() > 1.26F && this.field_44747.method_42007("Cooldown")) {
         int var11 = !var5 ? 1 : 2;
         float var12 = this.field_44744.field_9632.method_3163() - (float)this.field_44744.field_9632.field_29620 - (float)var11;
         return var12 <= 0.0F && var12 > -1.0F;
      } else if (var4 != 2) {
         if (var4 < 2) {
            float var6 = this.method_40095(0);
            float var7 = this.method_40095(1);
            float var8 = this.method_40095(1);
            int var9 = (int)(var7 + var6 - (float)((int)var6));
            if (var4 + var9 == 2) {
               return true;
            }

            if (var4 + var9 == 1) {
               float var10 = var6 + var7 + var8 - (float)((int)var6 + (int)var7 + (int)var8);
               return var10 < 1.0F;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public boolean method_40090(int var1) {
      return var1 >= (int)this.field_44745[0];
   }

   public void method_40092() {
      float var3 = 20.0F / this.field_44747.method_42002("Min CPS");
      float var4 = 20.0F / this.field_44747.method_42002("Max CPS");
      if (var3 > var4) {
         float var5 = var3;
         var3 = var4;
         var4 = var5;
      }

      float var8 = this.field_44745[0] - (float)((int)this.field_44745[0]);
      this.field_44745[0] = this.field_44745[1] + var8;

      for (int var6 = 1; var6 < 3; var6++) {
         float var7 = var3 + (float)Math.random() * (var4 - var3);
         this.field_44745[1] = var7;
      }
   }

   public List<class_3357> method_40091(float var1) {
      ArrayList var4 = new ArrayList();

      for (class_8145 var6 : class_314.method_1440()) {
         var4.add(new class_3357(var6));
      }

      Iterator var24 = var4.iterator();
      class_3620 var25 = (class_3620)class_727.method_3328().method_3298().method_847(class_4557.class);
      float var7 = 150.0F;
      if (var25.method_42015() && var25.method_42016("Type").equalsIgnoreCase("PingSpoof")) {
         var7 += var25.method_16864().method_42002("Lag");
      }

      while (var24.hasNext()) {
         class_3357 var8 = (class_3357)var24.next();
         class_8145 var9 = var8.method_15377();
         if (var9 == this.field_44744.field_9632 || var9 == class_5477.field_27898) {
            var24.remove();
         } else if (class_727.method_3328().method_3307().method_14460(var9)) {
            var24.remove();
         } else if (!(var9 instanceof class_5834)) {
            var24.remove();
         } else if (((class_5834)var9).method_26551() == 0.0F) {
            var24.remove();
         } else if (!this.field_44744.field_9632.method_26608((class_5834)var9)) {
            var24.remove();
         } else if (var9 instanceof class_9399) {
            var24.remove();
         } else if (!this.field_44747.method_42007("Players") && var9 instanceof class_704) {
            var24.remove();
         } else if (var9 instanceof class_704 && class_727.method_3328().method_3331().method_20495(var9)) {
            var24.remove();
         } else if (!this.field_44747.method_42007("Invisible") && var9.method_37109()) {
            var24.remove();
         } else if (!this.field_44747.method_42007("Animals") && (var9 instanceof class_5467 || var9 instanceof class_7666)) {
            var24.remove();
         } else if (!this.field_44747.method_42007("Monsters") && var9 instanceof class_1173) {
            var24.remove();
         } else if (this.field_44744.field_9632.method_37243() != null && this.field_44744.field_9632.method_37243().equals(var9)) {
            var24.remove();
         } else if (var9.method_37367()) {
            var24.remove();
         } else if (!(var9 instanceof class_704)
            || !class_5876.method_26760((class_704)var9)
            || !class_727.method_3328().method_3298().method_847(class_3595.class).method_42015()) {
            class_1343 var10 = class_314.method_1429(var9);
            if (!(this.field_44744.field_9632.method_37175(var9) < 40.0F)) {
               if (this.field_44743.containsKey(var9)) {
                  this.field_44743.remove(var9);
               }
            } else if (!this.field_44743.containsKey(var9)) {
               this.field_44743.put(var9, new ArrayList<class_9097<class_1343, Long>>());
            } else {
               for (List var12 : this.field_44743.values()) {
                  int var13 = var12.size();

                  for (int var14 = 0; var14 < var13; var14++) {
                     class_9097 var15 = (class_9097)var12.get(var14);
                     if (var15 != null) {
                        Long var16 = (Long)var15.method_41934();
                        long var17 = System.currentTimeMillis() - var16;
                        if ((float)var17 > var7) {
                           var12.remove(var14);
                           var13--;
                        }
                     }
                  }
               }
            }

            if (!(class_314.method_1419(var10) > 8.0)) {
               boolean var26 = true;
               if (this.field_44747.method_42007("Smart Reach")) {
                  List var27 = this.field_44743.get(var9);
                  if (var27 != null) {
                     for (class_9097 var30 : var27) {
                        class_1343 var31 = (class_1343)var30.method_41933();
                        double var19 = 0.15;
                        class_4092 var21 = new class_4092(
                           var31.field_7336 - var19,
                           var31.field_7333,
                           var31.field_7334 - var19,
                           var31.field_7336 + var19,
                           var31.field_7333 + this.field_44744.field_9632.field_41712.method_18901(),
                           var31.field_7334 + var19
                        );
                        double var22 = class_314.method_1420(var21);
                        if (var22 < (double)var1) {
                           var26 = false;
                        }
                     }
                  }
               }

               if (var26 && class_314.method_1419(var10) > (double)var1) {
                  var24.remove();
               } else if (!this.field_44747.method_42007("Through walls")) {
                  class_1988 var28 = class_7211.method_33010(var9, true);
                  if (var28 == null) {
                     var24.remove();
                  }
               }
            } else {
               var24.remove();
            }
         } else {
            var24.remove();
         }
      }

      Collections.sort(var4, new class_3330(this));
      return var4;
   }

   public List<class_3357> method_40100(List<class_3357> var1) {
      String var4 = this.field_44747.method_42016("Sort Mode");
      switch (var4) {
         case "Range":
            Collections.sort(var1, new class_6917(this));
            break;
         case "Health":
            Collections.sort(var1, new class_1244(this));
            break;
         case "Angle":
            Collections.sort(var1, new class_858(this));
            break;
         case "Prev Range":
            Collections.sort(var1, new class_7631(this));
            break;
         case "Armor":
            Collections.sort(var1, new class_4493(this));
      }

      Collections.sort(var1, new class_8219(this));
      return var1;
   }
}
